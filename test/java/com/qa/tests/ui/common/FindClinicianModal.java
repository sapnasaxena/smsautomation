package com.qa.tests.ui.common;

import com.qa.tests.common.GlobalConstants.AREA;
import com.qa.tests.common.GlobalConstants.GENDER;
import com.qa.tests.common.GlobalConstants.LOCALITY;
import com.qa.tests.common.GlobalConstants.SERVICE;

public class FindClinicianModal {

	private String appointmentDate;
	private String duration;
	private String pinCode;
	private LOCALITY Locality;
	private AREA area;
	private String location;
	private GENDER gender;
	private SERVICE service;
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public LOCALITY getLocality() {
		return Locality;
	}
	public void setLocality(LOCALITY locality) {
		Locality = locality;
	}
	public AREA getArea() {
		return area;
	}
	public void setArea(AREA area) {
		this.area = area;
	}
	public String getLocation() {
		return location;
	}
//	public LOCALITY setLocation(LOCALITY location) {
//		//this.location = location;
//	}
	public GENDER getGender() {
		return gender;
	}
	public void setGender(GENDER gender) {
		this.gender = gender;
	}
	public SERVICE getService() {
		return service;
	}
	public void setService(SERVICE service) {
		this.service = service;
	}
}
