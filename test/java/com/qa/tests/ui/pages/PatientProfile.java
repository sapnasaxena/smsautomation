package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.BasePage;


public class PatientProfile extends BasePage {

	public PatientProfile(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public String patientNameLocator ="//tr[1]/td[1]";
	public String getPatientNameLocator()
	{
		return patientNameLocator;
	}
	
	public String overviewTab = "//a[contains(text(),'Overview')]";
	public String getOverviewTab()
	{
		return overviewTab;
	}
	
	public String appointmentsTab = "//a[contains(text(),'Appointments')]";
	public String getappointmentsTab()
	{
		return appointmentsTab;
	}
	
	public String casesTab = "//a[contains(text(),'Cases')]";
	public String getCasesTab()
	{
		return casesTab;
	}
	
	public String paymentsTab = "//a[contains(text(),'Payments')]";
	public String getPaymentsTab()
	{
		return paymentsTab;
	}
	
	public String notesTab = "//a[contains(text(),'Notes')]";
	public String getNotesTab()
	{
		return notesTab;
	}
	
	public String smsTab = "//a[contains(text(),'Sms')]";
	public String getSMSTab()
	{
		return smsTab;
	}
	
	public String vitalsTab = "//a[contains(text(),'Vitals')]";
	public String getVitalsTab()
	{
		return vitalsTab;
	}
	
	public String familyTab = "//a[contains(text(),'Family')]";
	public String getFamilyTab()
	{
		return familyTab;
	}
	
	public String ticketTab = "//a[contains(text(),'Ticket')]";
	public String getTicketTab()
	{
		return ticketTab;
	}
	
	public String requestPaymentTab = "//a[contains(text(),'Request Payment')]";
	public String getrequestPaymentTab()
	{
		return requestPaymentTab;
	}
	
	public String ordersTab = "//a[contains(text(),'Orders')]";
	public String getOrdersTab()
	{
		return ordersTab;
	}
	
	public String searchBoxLocator = "//input[contains(@id,'search')]";
	public String getSearchBoxLocator()
	{
		return searchBoxLocator;
	}
	
	public String searchBtnLocator = "//button[contains(text(),'Search')]";
	public String getSearchBtnLocator()
	{
		return searchBtnLocator;
	}
	
	public String settingsLinkLocator = "//li/a[text()='Settings']";
	public String getSettingsLinkLocator()
	{
		return settingsLinkLocator;
	}
	
	public String statusLocator = "//select[contains(@name,'status')]";
	public String getStatusLocator()
	{
		return statusLocator;
	}
	
	public String doNotCallOptionLocator = "//input[contains(@id,'canCallCustomer')]";
	public String getDoNotCallOptionLocator()
	{
		return doNotCallOptionLocator;
	}
	
	public String doNotSendSMSOptionLocator = "//input[contains(@id,'sendSmsAlert')]";
	public String getDoNotSendSMSOptionLocator()
	{
		return doNotSendSMSOptionLocator;
	}
	
	public String doNotSendEmailOptionLocator = "//input[contains(@id,'sendEmail')]";
	public String getDoNotSendEmailOptionLocator()
	{
		return doNotSendEmailOptionLocator;
	}
	
	public String paymentNotifiViaSMSOptionLocator ="//input[contains(@id,'paymentNotificationSms')]";
	public String getPaymentNotifiViaSMSOptionLocator()
	{
		return paymentNotifiViaSMSOptionLocator;
	}
	
	public String paymentNotifiViaEmailOptionLocator ="//input[contains(@id,'paymentNotificationEmail')]";
	public String getPaymentNotifiViaEmailOptionLocator()
	{
		return paymentNotifiViaEmailOptionLocator;
	}
	public String saveButtonLocator = "//button[contains(text(),'Save')]";
	public String getSaveButtonLocator()
	{
		return saveButtonLocator;
	}
	
	public String reasonOptionLocator = "//select[contains(@name,'reason')]";
	public String getReasonOptionLocator()
	{
		return reasonOptionLocator;
	}
	//**Functions
	
	public void onClickPatientName()
	{
	    WebElement searchbox = driver.findElement(By.xpath(searchBoxLocator));
	    searchbox.sendKeys("30594");
	    GlobalUtil.wait(5);
	    WebElement searchbtn = driver.findElement(By.xpath(searchBtnLocator));
	    searchbtn.click();
	    GlobalUtil.wait(5);
		WebElement name = driver.findElement(By.xpath(patientNameLocator));
		name.click();
	}
	
	
	
	public void doNotCallSetting()
	{
		WebElement settings = driver.findElement(By.xpath(settingsLinkLocator));
		settings.click();
		WebElement doNotCall = driver.findElement(By.xpath(doNotCallOptionLocator));
		doNotCall.click();
		WebElement savebtn = driver.findElement(By.xpath(saveButtonLocator));
		savebtn.click();
	}
	
	public void doNotSendSMSAlert()
	{
		WebElement settings = driver.findElement(By.xpath(settingsLinkLocator));
		settings.click();
		WebElement doNotSendSMSAlert = driver.findElement(By.xpath(doNotSendSMSOptionLocator));
		doNotSendSMSAlert.click();
		WebElement savebtn = driver.findElement(By.xpath(saveButtonLocator));
		savebtn.click();
	}
	
	public void doNotSendEmail()
	{
		WebElement settings = driver.findElement(By.xpath(settingsLinkLocator));
		settings.click();
		WebElement doNotSendEmail = driver.findElement(By.xpath(doNotSendEmailOptionLocator));
		doNotSendEmail.click();
		WebElement savebtn = driver.findElement(By.xpath(saveButtonLocator));
		savebtn.click();
	}
	
	public void activeStatusOnSettings()
	{
		WebElement settings = driver.findElement(By.xpath(settingsLinkLocator));
		settings.click();
		WebElement st = driver.findElement(By.xpath(statusLocator));
		Select status = new Select(st);
		status.selectByVisibleText("active");
		WebElement savebtn = driver.findElement(By.xpath(saveButtonLocator));
		savebtn.click();
	}
	
	public void inactiveStatusOnSettings()
	{
		WebElement settings = driver.findElement(By.xpath(settingsLinkLocator));
		settings.click();
		WebElement st = driver.findElement(By.xpath(statusLocator));
		Select status = new Select(st);
		status.selectByVisibleText("inactive");
		WebElement savebtn = driver.findElement(By.xpath(saveButtonLocator));
		savebtn.click();
	}
	
	public void paymentNotificationSendViaSMS()
	{
		WebElement settings = driver.findElement(By.xpath(settingsLinkLocator));
		settings.click();
		WebElement paymentNotifiSendViaSMS = driver.findElement(By.xpath(paymentNotifiViaSMSOptionLocator));
		paymentNotifiSendViaSMS.click();
		WebElement savebtn = driver.findElement(By.xpath(saveButtonLocator));
		savebtn.click();
	}
	
	public void paymentNotificationSendViaEmail()
	{
		WebElement settings = driver.findElement(By.xpath(settingsLinkLocator));
		settings.click();
		WebElement paymentNotifiSendViaSMS = driver.findElement(By.xpath(paymentNotifiViaSMSOptionLocator));
		paymentNotifiSendViaSMS.click();
		WebElement savebtn = driver.findElement(By.xpath(saveButtonLocator));
		savebtn.click();
	}
	
	public void addFamilyMember()
	{
		WebElement addFamilyLnk = driver.findElement(By.xpath(""));
		addFamilyLnk.click();
		GlobalUtil.wait(5);
		WebElement enterPatientID = driver.findElement(By.xpath(""));
		enterPatientID.sendKeys("");
		GlobalUtil.wait(5);
		WebElement searchBtn = driver.findElement(By.xpath(""));
		searchBtn.click();
		GlobalUtil.wait(5);
		WebElement addBtn = driver.findElement(By.xpath(""));
		addBtn.click();
	}
	
	public void setPreferences(String type, String preferences, String profession, String priority)
	{
		WebElement setPreferenceLink = driver.findElement(By.xpath(""));
		setPreferenceLink.click();
		GlobalUtil.wait(5);
		WebElement addPreferencesBtn = driver.findElement(By.xpath(""));
		addPreferencesBtn.click();
		GlobalUtil.wait(5);
		WebElement typ = driver.findElement(By.xpath(""));
		Select ty = new Select(typ);
		ty.selectByVisibleText(type);
		GlobalUtil.wait(5);
		WebElement prefValue = driver.findElement(By.xpath(""));
		Select val = new Select(prefValue);
		val.selectByVisibleText(preferences);
		WebElement profes = driver.findElement(By.xpath(""));
		Select prof = new Select(profes);
		prof.selectByVisibleText(profession);
		WebElement prior= driver.findElement(By.xpath(""));
		prior.sendKeys(priority);
		
	}
	
	public void addRecurringServices()
	{
		
	}
	
	public void addFixedServices()
	{
		
	}
	
	public void addPackage()
	{
		
		
	}
	
	public void addCustomPackage()
	{
		
	}
	
	public void editProfile()
	{
		
	}
	
	public void createOrder()
	{
		
	}
	
	public void addAppointments()
	{
		
	}
}
