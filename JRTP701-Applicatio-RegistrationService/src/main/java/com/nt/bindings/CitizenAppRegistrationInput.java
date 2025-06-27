package com.nt.bindings;

import java.time.LocalDate;

public class CitizenAppRegistrationInput {
  
   private String fullName;
   private String email;
   private String gender;
   private Long phoneNumber;
   private Long ssn;
   private LocalDate dob;
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(Long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public Long getSsn() {
	return ssn;
}
public void setSsn(Long ssn) {
	this.ssn = ssn;
}
   
   
   
}
