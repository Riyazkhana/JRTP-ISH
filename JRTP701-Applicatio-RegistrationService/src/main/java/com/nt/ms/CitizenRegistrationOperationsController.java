package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.bindings.CitizenAppRegistrationInput;
import com.nt.service.ICitizenApplicationRegistrationService;

@RestController
@RequestMapping("CitizenAR-api")
public class CitizenRegistrationOperationsController {
	@Autowired
	private ICitizenApplicationRegistrationService registrationService;
     @PostMapping("/save")  
	public ResponseEntity<String> saveCitizenApplication(@RequestBody CitizenAppRegistrationInput inputs){
        try {
        	//use service
        	int appId=registrationService.registerCitizenApplication(inputs);
             if(appId>0)
            	 return new ResponseEntity<String>("citizen Application registerd with the id::"+ appId,HttpStatus.CREATED);
             else
            	 return new ResponseEntity<String>("invalid ssn or citizen must belong to california state::" ,HttpStatus.OK); 
        
        }catch (Exception e) {
        	return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
        }
}
