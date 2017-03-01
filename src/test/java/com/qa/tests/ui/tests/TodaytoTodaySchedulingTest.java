package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.TodaytoTodaySchedulingPage;

public class TodaytoTodaySchedulingTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TodaytoTodaySchedulingPage todaypage;
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
		todaypage=PageFactory.initElements(driver, TodaytoTodaySchedulingPage.class);
		
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
	  todaypage.getpatientNameLocator().sendKeys(patientName);
	  todaypage.getsearchLocator().click();
	  todaypage.getpatientTableLocator().click();
	  todaypage.getdateandTimeLocator().click();
	  System.out.println("changing Appointment to current date");
	  todaypage.getcurrentDateLocator().click();
	  todaypage.durationEnter();
	  todaypage.savingApptPostpone();
	  todaypage.getdateandTimeLocator().click();
	  System.out.println("changing Appointment to current date and future time");
	  todaypage.schedulingTodaytoToday();
	}
	

}
