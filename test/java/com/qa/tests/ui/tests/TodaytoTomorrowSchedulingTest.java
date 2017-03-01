package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.TodaytoTomorrowSchedulingPage;

public class TodaytoTomorrowSchedulingTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TodaytoTomorrowSchedulingPage tomopage;
	public static final String username = "qatest@test.com";
	public static final String password ="flower";
	String patientName="sravani";
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		tomopage=PageFactory.initElements(driver, TodaytoTomorrowSchedulingPage.class);
		
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
	System.out.println("navigating to patients tab");
	homepage.openPatientListPage();
	 System.out.println("search and select for patient");
	  tomopage.getpatientNameLocator().sendKeys(patientName);
	  tomopage.getsearchLocator().click();
	  tomopage.getpatientTableLocator().click();
	  tomopage.getdateandTimeLocator().click();
	  System.out.println("changing Appointment to current date");
	  tomopage.getcurrentDateLocator().click();
	  System.out.println("entering duration and notes and saving the appointment for current date and time");
	  tomopage.durationEnter();
	  tomopage.savingApptPostpone();
	  System.out.println("scheduling Appointment to tomorrow date ");
	  tomopage.getdateandTimeLocator().click();
	  tomopage.schedulingTodaytoTomorrow();
	}
	

}
