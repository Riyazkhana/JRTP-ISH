package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="CITIZEN_APPLICATION")
public class CitizenAppRegistrationEntity {
   @Id
   @SequenceGenerator(name="gen1_seq",sequenceName = "app_id_seq",
   initialValue = 1000,allocationSize = 1)
   @GeneratedValue(generator = "gen1_seq",strategy = GenerationType.SEQUENCE)
	private Integer appId;
   @Column(length = 30)
   private String fullName;
   @Column(length = 30)
   private String email;
   @Column(length = 1)
   private String gender;
   private Long phoneNumber;
   private Long ssn;
   @Column(length = 30)
   private String stateName;
   private LocalDate dob;
   @Column(length = 30)
   private String createdBy; 
   @Column(length = 30)
   private String updatedBy;
   @CreationTimestamp
   @Column(updatable = false)
   private LocalDate creationDate;
   @UpdateTimestamp
   @Column(insertable = false)
   private LocalDate updationDate;
public Integer getAppId() {
	return appId;
}
public void setAppId(Integer appId) {
	this.appId = appId;
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
public String getStateName() {
	return stateName;
}
public void setStateName(String stateName) {
	this.stateName = stateName;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public String getUpdatedBy() {
	return updatedBy;
}
public void setUpdatedBy(String updatedBy) {
	this.updatedBy = updatedBy;
}
public LocalDate getCreationDate() {
	return creationDate;
}
public void setCreationDate(LocalDate creationDate) {
	this.creationDate = creationDate;
}
public LocalDate getUpdationDate() {
	return updationDate;
}
public void setUpdationDate(LocalDate updationDate) {
	this.updationDate = updationDate;
}
public CitizenAppRegistrationEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public CitizenAppRegistrationEntity(Integer appId, String fullName, String email, String gender, Long phoneNumber,
		Long ssn, String stateName, LocalDate dob, String createdBy, String updatedBy, LocalDate creationDate,
		LocalDate updationDate) {
	super();
	this.appId = appId;
	this.fullName = fullName;
	this.email = email;
	this.gender = gender;
	this.phoneNumber = phoneNumber;
	this.ssn = ssn;
	this.stateName = stateName;
	this.dob = dob;
	this.createdBy = createdBy;
	this.updatedBy = updatedBy;
	this.creationDate = creationDate;
	this.updationDate = updationDate;
}
   
   
    
   
}
