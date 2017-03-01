package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.ClinicianNonWorkingHoursPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;

public class ClinicianNonWorkingHoursTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	ClinicianNonWorkingHoursPage nonworkinghourspage;
	public static final String username = "qatest@test.com";
	public static final String password ="flower";
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		nonworkinghourspage=PageFactory.initElements(driver, ClinicianNonWorkingHoursPage.class);
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	@Test
	public void testEmailStatusChecking() throws InterruptedException
	{
	loginpage.doLogin(username, password);
	 System.out.println("navigating to Appointments tab");
	homepage.openAppointmentPage();
	 System.out.println("confirmed status selecting");
	  nonworkinghourspage.pendingSelection();
	  nonworkinghourspage.getdateandTimeLocator().click();
	  System.out.println("Selecting Clinician non working hours");
	 nonworkinghourspage.nonWorkingTimingsClinician();
	 
	}
	
}
