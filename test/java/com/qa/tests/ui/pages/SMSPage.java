package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.tests.ui.common.BasePage;

public class SMSPage extends BasePage{

	public SMSPage(WebDriver driver) {
		
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public String receivedSMSTabLocator = "//a[text()='Received SMS']";
	public String getReceivedSMSTabLocator()
	{
		return receivedSMSTabLocator;
	}
	
	public String sentSMSTabLocator = "//a[text()='Sent SMS']";
	public String getSentSMSTabLocator()
	{
		return sentSMSTabLocator;
	}
	
	public String pendingSMSTabLocator = "//a[text()='Pending SMS']";
	public String getPendingSMSTabLocator()
	{
		return pendingSMSTabLocator;
	}
	
	public String failedSMSTabLocator = "//a[text()='Failed SMS']";
	public String getFailedSMSTabLocator()
	{
		return failedSMSTabLocator;
	}
	
	public String sendBulkSMSTabLocator = "//a[text()='Send Bulk SMS']";
	public String getSendBulkSMSTabLocator()
	{
		return sendBulkSMSTabLocator;
	}
	
	
	public String approveBulkSMSTabLocator = "//a[text()='Appprove Bulk SMS']";
	public String getApproveBulkSMSTabLocator()
	{
		return approveBulkSMSTabLocator;
	}
	
	public String appFeedbackTabLocator = "//a[text()='App Feedback']";
	public String getAppFeedbackTabLocator()
	{
		return appFeedbackTabLocator;
	}
	
	public String downloadCSVButtonLocator = "//input[contains(@value,'Download CSV')]";
	public String getDownloadCSVButtonLocator()
	{
		return downloadCSVButtonLocator;
	}
	
	public String searchButtonLocator = "//button[contains(text(),'Search')]";
	public String getSearchButtonLocator()
	{
		return searchButtonLocator;
	}
	
	public String searchTextBoxLocator = "//input[contains(@id,'search')]";
	public String getSearchTextBoxLocator()
	{
		return searchTextBoxLocator;
	}
	
	public String dateFilterLocator = "//div[contains(@class,'date-filter')]";
	public String getDateFilterLocator()
	{
		return dateFilterLocator;
	}
	
	public String statusFilterLocator = "//select[contains(@id,'filter')]";
	public String getStatusFilterLocator()
	{
		return statusFilterLocator;
	}
	
	public String typeFilterLocator = "//select[contains(@id,'typeFilter')]";
	public String getTypeFilterLocator()
	{
		return typeFilterLocator;
	}
	
	public String openFilterLocator = "//td/a[text(),'Open')]";
	public String getOpenFilterLocator()
	{
		return openFilterLocator;
	}
	
	public String closeFilterLocator = "//td/a[text(),'Close')]";
	public String getCloseFilterLocator()
	{
		return closeFilterLocator;
	}
	
	public String replyButtonLocator = "//td/a[text(),'Reply')]";
	public String getReplyButtonLocator()
	{
		return replyButtonLocator;
	}
	public String nameTableColOnRecievedSMSTabLocator = "//th[text()='Name']";
	public String getNameTableColOnRecievedSMSTabLocator()
	{
		return nameTableColOnRecievedSMSTabLocator;
	}
	
	public String typeTableColOnRecievedSMSTabLocator = "//th[text()='Type']";
	public String getTypeTableColOnRecievedSMSTabLocator()
	{
		return typeTableColOnRecievedSMSTabLocator;
	}
	
	public String mobileNoTableColOnRecievedSMSTabLocator = "//th[text()='Mobile No.']";
	public String getMobileNoTableColOnRecievedSMSTabLocator()
	{
		return mobileNoTableColOnRecievedSMSTabLocator;
	}
	
	
	public String messageTableColOnRecievedSMSTabLocator = "//th[text()='Message']";
	public String getMessageTableColOnRecievedSMSTabLocator()
	{
		return messageTableColOnRecievedSMSTabLocator;
	}
	
	
	public String cityTableColOnRecievedSMSTabLocator = "//th[text()='City']";
	public String getCityTableColOnRecievedSMSTabLocator()
	{
		return cityTableColOnRecievedSMSTabLocator;
	}
	
	
	public String receivedOnTableColOnRecievedSMSTabLocator = "//th[text()='Received On']";
	public String getReceivedOnTableColOnRecievedSMSTabLocator()
	{
		return receivedOnTableColOnRecievedSMSTabLocator;
	}
	
	public String updatedOnTableColOnRecievedSMSTabLocator = "//th[text()='Updated On']";
	public String getUpdatedOnTableColOnRecievedSMSTabLocator()
	{
		return updatedOnTableColOnRecievedSMSTabLocator;
	}
	
	public String updatedByTableColOnRecievedSMSTabLocator = "//th[text()='Updated By']";
	public String getUpdatedByTableColOnRecievedSMSTabLocator()
	{
		return updatedByTableColOnRecievedSMSTabLocator;
	}
	
	public String statusTableColOnRecievedSMSTabLocator = "//th[text()='Status']";
	public String getStatusTableColOnRecievedSMSTabLocator()
	{
		return statusTableColOnRecievedSMSTabLocator;
	}
	
	public String actionTakenTableColOnRecievedSMSTabLocator = "//th[text()='Action Taken']";
	public String getActiontakenTableColOnRecievedSMSTabLocator()
	{
		return actionTakenTableColOnRecievedSMSTabLocator;
	}
	
	public String replyTableColOnRecievedSMSTabLocator = "//th[text()='Reply']";
	public String getReplyTableColOnRecievedSMSTabLocator()
	{
		return replyTableColOnRecievedSMSTabLocator;
	}
	
	//functions
	
	public void openRecievedSMSTab()
	{
		driver.findElement(By.xpath(receivedSMSTabLocator)).click();
	}
	
	
	public void openSentSMSTab()
	{
		driver.findElement(By.xpath(sentSMSTabLocator)).click();
	}
	
	
	public void openPendingSMSTab()
	{
		driver.findElement(By.xpath(pendingSMSTabLocator)).click();
	}
	
	
	public void openSendBulkSMSTab()
	{
		driver.findElement(By.xpath(sendBulkSMSTabLocator)).click();
	}
	
	public void openApproveBulkSMSTab()
	{
		driver.findElement(By.xpath(approveBulkSMSTabLocator)).click();
	}
	
	public void openFailedSMSTab()
	{
		driver.findElement(By.xpath(failedSMSTabLocator)).click();
	}
	
	public void searchByPatientName()
	{
		driver.findElement(By.xpath(searchTextBoxLocator)).sendKeys("test");
		driver.findElement(By.xpath(searchButtonLocator)).click();
	}
	
	public void statusFilterByAll()
	{
		System.out.println("Select option Open from drop down");
		Select open = new Select(driver.findElement(By.xpath(statusFilterLocator)));
		open.selectByVisibleText("All");
	}
	
	public void statusFilterByOpen()
	{
		System.out.println("Select option Open from drop down");
		Select open = new Select(driver.findElement(By.xpath(statusFilterLocator)));
		open.selectByVisibleText("Open");
	}
			
	public void statusFilterByClose()
	{
		System.out.println("Select option Open from drop down");
		Select open = new Select(driver.findElement(By.xpath(statusFilterLocator)));
		open.selectByVisibleText("Closed");
	}
	
	public void checkPendingSMSforFilterFirstAppointmentFeedbackSMS()
	{
		System.out.println("Check SMS on pending SMS tab");
		openPendingSMSTab();
		Select type = new Select(driver.findElement(By.xpath("//select[contains(@id,'smsTypeFilter')]")));
	    type.selectByVisibleText("First Appointment Feedback Sms");

	    
	    
		
		
	
	}
	
	
}
