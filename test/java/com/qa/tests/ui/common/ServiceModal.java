package com.qa.tests.ui.common;

import com.qa.tests.common.GlobalConstants.APPOINTMENTTYPE;
import com.qa.tests.common.GlobalConstants.PREFERENCES;
import com.qa.tests.common.GlobalConstants.SERVICE;
import com.qa.tests.common.GlobalConstants.SUBSERVICE;

public class ServiceModal {
	private SERVICE serviceName;
	private String serviceComesUnder;
	private String requiredProfession;
	private SUBSERVICE subservice;
	private PREFERENCES preferences;
	private String instructions;
	private String healthProfessionTerm;
	private APPOINTMENTTYPE appointmentType;
	private String noOfVisits;
	private String offeredPrice;
	private String maxPrice;
	private String minprice;
	private String costPerUnit;
	private String maxDiscount;
	private String assessmentPrice;
	private String duration;
	private String isDurationFixed;
	private String firstVisitPrice;
	private String secondVisitPrice;
	
	public static ServiceModal getDefaultServiceDetails(){
		ServiceModal serviceModal = new ServiceModal();
		serviceModal.setServiceName(serviceModal.getServiceName());
		serviceModal.setAppointmentType(serviceModal.getAppointmentType());
		serviceModal.setFirstVisitPrice(serviceModal.getFirstVisitPrice());
		serviceModal.setSecondVisitPrice(serviceModal.getSecondVisitPrice());
		serviceModal.setNoOfVisits(serviceModal.getNoOfVisits());
		serviceModal.setOfferedPrice(serviceModal.getOfferedPrice());
		return serviceModal;
	}
	
	public static ServiceModal getServiceDetails(SERVICE serviceName, String firstVisitCost, String secondVisitCost){
		ServiceModal serviceModal = ServiceModal.getDefaultServiceDetails();
		serviceModal.setServiceName(serviceName);
		serviceModal.setFirstVisitPrice("200");
		serviceModal.setSecondVisitPrice("400");
		serviceModal.setAppointmentType(APPOINTMENTTYPE.Recurring);
		return serviceModal;
	}
	
	public void setSubservice(SUBSERVICE subservice) {
		this.subservice = subservice;
	}
	public void setPreferences(PREFERENCES preferences) {
		this.preferences = preferences;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public SUBSERVICE getSubservice() {
		return subservice;
	}
	public PREFERENCES getPreferences() {
		return preferences;
	}
	public String getInstructions() {
		return instructions;
	}
	public SERVICE getServiceName() {
		return serviceName;
	}
	public void setServiceName(SERVICE doctorvisit) {
		this.serviceName = doctorvisit;
	}
	public String getServiceComesUnder() {
		return serviceComesUnder;
	}
	public void setServiceComesUnder(String serviceComesUnder) {
		this.serviceComesUnder = serviceComesUnder;
	}
	public String getRequiredProfession() {
		return requiredProfession;
	}
	public void setRequiredProfession(String requiredProfession) {
		this.requiredProfession = requiredProfession;
	}
	public String getHealthProfessionTerm() {
		return healthProfessionTerm;
	}
	public void setHealthProfessionTerm(String healthProfessionTerm) {
		this.healthProfessionTerm = healthProfessionTerm;
	}
	public String getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(String costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public String getMaxDiscount() {
		return maxDiscount;
	}
	public void setMaxDiscount(String maxDiscount) {
		this.maxDiscount = maxDiscount;
	}
	public String getAssessmentPrice() {
		return assessmentPrice;
	}
	public void setAssessmentPrice(String assessmentPrice) {
		this.assessmentPrice = assessmentPrice;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getIsDurationFixed() {
		return isDurationFixed;
	}
	public void setIsDurationFixed(String isDurationFixed) {
		this.isDurationFixed = isDurationFixed;
	}
	public String getFirstVisitPrice() {
		return firstVisitPrice;
	}
	public void setFirstVisitPrice(String firstVisitPrice) {
		this.firstVisitPrice = firstVisitPrice;
	}
	public String getSecondVisitPrice() {
		return secondVisitPrice;
	}
	public void setSecondVisitPrice(String secondVisitPrice) {
		this.secondVisitPrice = secondVisitPrice;
	}
	
	public APPOINTMENTTYPE getAppointmentType() {
		return appointmentType;
	}
	public void setAppointmentType(APPOINTMENTTYPE appointmentType) {
		this.appointmentType = appointmentType;
	}
	public String getNoOfVisits() {
		return noOfVisits;
	}
	public void setNoOfVisits(String noOfVisits) {
		this.noOfVisits = noOfVisits;
	}
	public String getOfferedPrice() {
		return offeredPrice;
	}
	public void setOfferedPrice(String offeredPrice) {
		this.offeredPrice = offeredPrice;
	}
	public String getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}
	public String getMinprice() {
		return minprice;
	}
	public void setMinprice(String minprice) {
		this.minprice = minprice;
	}
	
	
}
