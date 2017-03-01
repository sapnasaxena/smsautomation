package com.qa.tests.ui.common;

import com.qa.tests.common.GlobalConstants.AREA;
import com.qa.tests.common.GlobalConstants.BRAND;
import com.qa.tests.common.GlobalConstants.SERVICE;

public class PackageModal {

	private String packageName;
	private String packageDescription;
	private String packageCost;
	private String maxDiscount;
	private BRAND brand;

	private AREA area;
	private String cost;
	private SERVICE selectService;
	private String selectFrequency;
	private String serviceStartDay;
	private String intervalInDays;
	
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getPackageDescription() {
		return packageDescription;
	}
	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}
	public String getPackageCost() {
		return packageCost;
	}
	public void setPackageCost(String packageCost) {
		this.packageCost = packageCost;
	}
	public String getMaxDiscount() {
		return maxDiscount;
	}
	public void setMaxDiscount(String maxDiscount) {
		this.maxDiscount = maxDiscount;
	}
	public AREA getArea() {
		return area;
	}
	public void setArea(AREA area) {
		this.area = area;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public SERVICE getSelectService() {
		return selectService;
	}
	public void setSelectService(SERVICE selectService) {
		this.selectService = selectService;
	}
	public String getSelectFrequency() {
		return selectFrequency;
	}
	public void setSelectFrequency(String selectFrequency) {
		this.selectFrequency = selectFrequency;
	}
	public String getServiceStartDay() {
		return serviceStartDay;
	}
	public void setServiceStartDay(String serviceStartDay) {
		this.serviceStartDay = serviceStartDay;
	}
	public String getIntervalInDays() {
		return intervalInDays;
	}
	public void setIntervalInDays(String intervalInDays) {
		this.intervalInDays = intervalInDays;
	}
	public BRAND getBrand() {
		return brand;
	}
	public void setBrand(BRAND brand) {
		this.brand = brand;
	}
	
	
	
	
	
}
