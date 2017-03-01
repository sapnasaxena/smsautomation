package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.SendSMSandVerifySMSPage;

public class SendSMSandVerifySMSTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	SendSMSandVerifySMSPage smspage;
	public static final String username = "qatest@test.com";
	public static final String password ="flower";
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		smspage=PageFactory.initElements(driver,SendSMSandVerifySMSPage.class);
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	@Test
	public void testSendSMS()
	{
	loginpage.doLogin(username, password);
	 System.out.println("navigating to Appointment screen");
	  homepage.openAppointmentPage();
	  System.out.println("filtering confirmed status");
	  smspage.pendingSelection();
	  smspage.getsendSMSLocator().click();
	  System.out.println("sending SMS");
	  smspage.smsMessage();
	  smspage.getsendLocator().click();
	  GlobalUtil.wait(5);
	}
	@Test
	public void testVerifyingSMS()
	{
	loginpage.doLogin(username, password);
	System.out.println("navigating to sms tab");
	homepage.openSMSPage();
	 System.out.println("navigating to pending SMS tab");
	  smspage.getpendingSMSLocator().click();
	  System.out.println("verifying SMS on Pending SMS screen");
	  smspage.visibleTextComparision();
		}

}
