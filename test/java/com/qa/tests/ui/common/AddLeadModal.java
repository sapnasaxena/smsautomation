package com.qa.tests.ui.common;

import com.qa.tests.common.GlobalConstants.BRAND;
import com.qa.tests.common.GlobalConstants.GENDER;
import com.qa.tests.common.GlobalConstants.LOCALITY;

public class AddLeadModal {
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String email;
	private String pinCode;
	private String patientAge;
	private LOCALITY locality;

	

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public GENDER getGender() {
		return gender;
	}
	public void setGender(GENDER gender) {
		this.gender = gender;
	}
	private GENDER gender;
	private BRAND brand;

	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getpatientAge() {
		return patientAge;
	}
	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}
	public LOCALITY getLocality() {
		return locality;
	}
	public void setLocality(LOCALITY locality) {
		this.locality = locality;
	}
	
	public void setBrand(BRAND brand) {
		
		this.brand=brand;
	}

	public BRAND getbrand() {
		return brand;
	}
}
