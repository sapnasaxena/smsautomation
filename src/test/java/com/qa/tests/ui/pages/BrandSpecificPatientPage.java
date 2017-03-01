package com.qa.tests.ui.pages;

import org.openqa.selenium.WebDriver;

import com.qa.tests.ui.common.BasePage;

public class BrandSpecificPatientPage extends BasePage {

	public BrandSpecificPatientPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String patientIDLocator = "//tbody/tr/td[1]";
	public String getPatientIDLocator()
	{
		return patientIDLocator;
	}
	
	public String mobileNofieldLocator = "//tbody/tr/td[3]";
	public String getMobileNoFieldLocator()
	{
		return mobileNofieldLocator;
	}
	
	
	public String clickToCallFieldLocator = "//tbody/tr/td[3]";
	public String getClickToCallFieldLocator()
	{
		return clickToCallFieldLocator;
	}
	
	
	public String bulkEmailStatusfieldLocator = "";
	public String getBulkEmailStatusFieldLocator()
	{
		return bulkEmailStatusfieldLocator;
	}
	
}
