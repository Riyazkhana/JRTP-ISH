package com.nt.service;



import java.net.http.HttpResponse.ResponseInfo;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nt.bindings.CitizenAppRegistrationInput;
import com.nt.entity.CitizenAppRegistrationEntity;
import com.nt.repository.IApplicationRegistrationRepository;
@Service
public class CitizenApplicationRegistrationServiceImpl  implements ICitizenApplicationRegistrationService{
    @Autowired
	private IApplicationRegistrationRepository citizenRepo;
   @Autowired
    private RestTemplate template;
   @Value("${ar.ssa-web.url}")
   private String endPointUrl;
   @Value("${ar.state}")
   private String targetState;
	@Override
	public Integer registerCitizenApplication(CitizenAppRegistrationInput inputs) {
		
		//perform web service call to check whether the SSN is valid or not and to get the state name
        
         ResponseEntity<String> response=template.exchange(endPointUrl,HttpMethod.GET, null,String.class,inputs.getSsn());
		   //get stateName
         String stateName=response.getBody();
         //register citizen if he belongs to california state
         if(stateName.equalsIgnoreCase(targetState)) {
        	 //prepare the entity object
        	 CitizenAppRegistrationEntity entity=new CitizenAppRegistrationEntity();
        	 BeanUtils.copyProperties(inputs, entity);
        	 entity.setStateName(stateName);
        	 //save the object
        	 int appId=citizenRepo.save(entity).getAppId();
        	 return appId;
         }
         
         return 0;
	}

}
