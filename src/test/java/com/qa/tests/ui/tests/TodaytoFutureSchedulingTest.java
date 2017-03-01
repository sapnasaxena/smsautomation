package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.TodaytoFutureSchedulingPage;


public class TodaytoFutureSchedulingTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TodaytoFutureSchedulingPage futurepage;
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
		futurepage=PageFactory.initElements(driver, TodaytoFutureSchedulingPage.class);
		
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
	 futurepage.getpatientLocator().click();
	  System.out.println("search and select for patient");
	 futurepage.getpatientNameLocator().sendKeys(patientName);
	  futurepage.getsearchLocator().click();
	  futurepage.getpatientTableLocator().click();
	  futurepage.getdateandTimeLocator().click();
	  System.out.println("changing Appointment to current date");
	  futurepage.getcurrentDateLocator().click();
	  System.out.println("entering duration and notes and saving the appointment for current date and time");
	  futurepage.durationEnter();
	  futurepage.savingApptPostpone();
	  System.out.println("scheduling Appointment to current date and future time");
	 futurepage.getdateandTimeLocator().click();
	  futurepage.schedulingTodaytoTomorrow();

  }
}
