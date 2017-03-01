package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.EmailStatusCheckingPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;

public class EmailStatusCheckingTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	EmailStatusCheckingPage emailpage;
	public static final String username = "qatest@test.com";
	public static final String password ="flower";
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		emailpage=PageFactory.initElements(driver, EmailStatusCheckingPage.class);
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	@Test
	public void testEmailStatusChecking()
	{
	loginpage.doLogin(username, password);
	System.out.println("navigating to Emails tab");
	homepage.openEmailPage();
	 emailpage.getsendBulkEmailLocator().click();
	 emailpage.selectedTemplate();
	 emailpage.getselectedTemplateProceed().click();
	 emailpage.statusVerifyingforNonPorteaBrand();
	}
	
}
