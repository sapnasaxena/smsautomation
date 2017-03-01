package com.qa.tests.ui.pages;


import org.openqa.selenium.*;

import com.qa.tests.ui.common.BasePage;

public class HomePage extends BasePage{

	
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String dashBoardNavBarLocator = "//a[contains(@href,'dashboard/appointmentSummary')]";
	public String getDashBoardNavigationBarLocator()
	{
		return dashBoardNavBarLocator;
	}
	

	public String appointmentNavBarLocator = "//a[contains(@href,'appointment/all')]";
			//"//a[contains(@href,'http://stageops.portea.com/appointment')";
	public String getAppointmentNavigationBarLocator()
	{
		return appointmentNavBarLocator;
	}
	
	
	public String professionalsNavBarLocator = "//a[contains(@href,'professionals/all')]";
	public String getProfessionalNavigationBarLocator()
	{
		return professionalsNavBarLocator;
	}
	
	public String patientsNavBarLocator = "//a[contains(@href,'patient/all')]";
	public String getPatientsNavigationBarLocator()
	{
		return patientsNavBarLocator;
	}
	

	public String casesNavBarLocator = "//a[contains(@href,'cases/casefiles')]";
	public String getCasesNavigationBarLocator()
	{
		return casesNavBarLocator;
	}
	
	
	public String paymentsNavBarLocator = "//a[contains(@href,'payment/all')]";
	public String getPaymentsNavigationBarLocator()
	{
		return paymentsNavBarLocator;
	}
	
	
	public String orderNavBarLocator = "//a[contains(@href,'orders/all')]";
	public String getOrderNavigationBarLocator()
	{
		return orderNavBarLocator;
	}
	

	public String smsNavBarLocator = "//a[contains(@href,'sms/received')]";
	public String getSMSNavigationBarLocator()
	{
		return smsNavBarLocator;
	}
	
	public String emailNavBarLocator = "//a[contains(@href,'email')]";
	public String getEmailNavigationBarLocator()
	{
		return emailNavBarLocator;
	}
	
	public String callsNavBarLocator = "//a[contains(@href,'missedCall/clinicianMissedcall')]";
	public String getCallsNavigationBarLocator()
	{
		return callsNavBarLocator;
	}
	
	public String analyticsNavBarLocator = "//a[contains(@href,'analytics')]";
	public String getAnalyticsNavigationBarLocator()
	{
		return analyticsNavBarLocator;
	}
	
	public String leadsNavBarLocator = "//a[contains(@href,'lead/all')]";
	public String getLeadsNavigationBarLocator()
	{
		return leadsNavBarLocator;
	}
	
	public String ticketNavBarLocator = "//a[contains(@href,'ticket/all')]";
	public String getTicketNavigationBarLocator()
	{
		return ticketNavBarLocator;
	}
	
	public String configurationNavBarLocator = "//a[contains(@href,'configuration')]";
	public String getConfigurationNavigationBarLocator()
	{
		return configurationNavBarLocator;
	}
	
	
	public String settingsNavBarLocator = "//a[contains(@href,'settings')]";
	public String getSettingsNavigationBarLocator()
	{
		return settingsNavBarLocator;
	}
	
	
	public String notificationsLocator =  "//a[contains(@class,'notification-text')]";
	public String getNotificationsLocator()
	{
		return notificationsLocator;
	}
	
	
   public String editProfileLocator = "//a[contains(@href,'http://stageops.portea.com/authenticate/change')]";
   public String getEditProfileLocator()
	{
		return editProfileLocator;
	}
	

	public String logoutLinkLocator = "//input[contains(@name,'remember')]";
	public String getLogoutLinkLocator()
	{
		return logoutLinkLocator;
	}
	

    public String userEmailIdLocator = "//div[contains(@class,'user-dropdown')]";
    public String getUserEmailIdLocator()
	{
		return userEmailIdLocator;
	}
	
    public String leadNavBarLocator = "//div[contains(@class,'user-dropdown')]";
    public String getLeadNavBarLocator()
	{
		return leadNavBarLocator;
	}
   public String allareasFilterLocator = "//div[contains(@class,'area-dropdown')]";
   public String getAllAreasFilterLocator()
	{
		return allareasFilterLocator;
	}
	
   
   public String allbrandsFilterLocator ="//div[contains(@class,'brand-dropdown')]";
   public String getAllBrandsFilterLocator()
	{
		return allbrandsFilterLocator;
	}
	
	
	public void openDashBoardPage()
	{
		driver.findElement(By.xpath(dashBoardNavBarLocator)).click();
	}
	
	
	public void openPatientListPage()
	{
		driver.findElement(By.xpath(patientsNavBarLocator)).click();
	}
	
	public void openAppointmentPage()
	{
		driver.findElement(By.xpath(appointmentNavBarLocator)).click();
	}
	
	public void openProfessionalPage()
	{
		driver.findElement(By.xpath(professionalsNavBarLocator)).click();
	}
	
	public void openOrderPage()
	{
		driver.findElement(By.xpath(orderNavBarLocator)).click();
	}
	public void openConfigurationPage()
	{
		driver.findElement(By.xpath(configurationNavBarLocator)).click();
	}
	
	public void openSMSPage()
	{
		driver.findElement(By.xpath(smsNavBarLocator)).click();
	}
	
	public void openPaymentPage()
	{
		driver.findElement(By.xpath(paymentsNavBarLocator)).click();
	}
	
	public void openSettingsPage()
	{
		driver.findElement(By.xpath(settingsNavBarLocator)).click();
	}
	
	public void openEmailPage()
	{
		driver.findElement(By.xpath(emailNavBarLocator)).click();
	}
	
	public void openLeadsPage()
	{
		driver.findElement(By.xpath(leadsNavBarLocator)).click();
	}
	
	public void openTicketsPage()
	{
		driver.findElement(By.xpath(ticketNavBarLocator)).click();
	}
}
