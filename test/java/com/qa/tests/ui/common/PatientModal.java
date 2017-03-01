package com.qa.tests.ui.common;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.common.RandomUtil;
import com.qa.tests.common.GlobalConstants.BRAND;
import com.qa.tests.common.GlobalConstants.GENDER;
import com.qa.tests.common.GlobalConstants.LOCALITY;
import com.qa.tests.common.GlobalConstants.SALUTATION;

public class PatientModal {
	
	private String firstName;
	private String middleName;
	private String lastName;
	//private LOCALITY locality;
	private String mobileNumber;
	private String pinCode;
	private BRAND brand;
	private String loginEmail;
	private LOCALITY location;
	private String locate;
	private SALUTATION salutation;
	private GENDER gender;
	private String area;
	
	
	
	public static PatientModal getDefaultPatientDetails(){
		PatientModal patientModal = new PatientModal();
		patientModal.setSalutation(patientModal.getSalutation());
		patientModal.setFirstName(GlobalUtil.getRandomName(8));
		patientModal.setLastName(GlobalUtil.getRandomName(8));
		patientModal.setMobileNumber(RandomUtil.generateRandomMobileNo());
		patientModal.setLoginEmail(GlobalUtil.getRandomName(4) + "@portea.qa");
		patientModal.setLocate("Domlur, Bengaluru, Karnataka, India");
		patientModal.setArea(patientModal.getArea());
		
		//patientModal.setPinCode("560076");
		patientModal.setGender(patientModal.getGender());
		patientModal.setBrand(patientModal.getBrand());
		//patientModal.setLocality(LOCALITY.Domlur);
		return patientModal;
	}

	

	public static PatientModal getPatientDetails(BRAND brand, GENDER gender, SALUTATION salutation, LOCALITY location)
	{
		PatientModal patientModal = getDefaultPatientDetails();
		patientModal.setBrand(brand);
		patientModal.setGender(gender);
		patientModal.setLocation(location);
		return patientModal;
		
	}
	
	public SALUTATION getSalutation() {
		return salutation;
	}
	public void setSalutation(SALUTATION salutation) {
		this.salutation = salutation;
	}
	public GENDER getGender() {
		return gender;
	}
	public void setGender(GENDER gender) {
		this.gender = gender;
	}
	
	public void setLocation(LOCALITY location) {
		this.location= location;
	}
	public LOCALITY getlocation()
	{
		return location;
	}


	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
//	public LOCALITY getLocality() {
//		return locality;
//	}
//	public LOCALITY setLocality() {
//		this.locality = locality;
//	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	public BRAND getBrand() {
		return brand;
	}
	public void setBrand(BRAND brand) {
		this.brand = brand;
	}
	
	
	public String getLoginEmail() {
		return loginEmail;
	}
	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}



	public void setLocality(LOCALITY getlocation) {
		// TODO Auto-generated method stub
		
	}



	public String getLocate() {
		return locate;
	}



	public void setLocate(String locate) {
		this.locate = locate;
	}



	public String getArea() {
		return area;
	}



	public void setArea(String area) {
		this.area = area;
	}




}
