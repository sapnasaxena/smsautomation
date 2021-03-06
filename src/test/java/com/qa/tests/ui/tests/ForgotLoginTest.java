package com.qa.tests.ui.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.ForgotLoginPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;

public class ForgotLoginTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	ForgotLoginPage forgotpage;
	public static final String username = "qatest@test.com";
	public static final String password ="flower";

	 @Test(priority=1)
	  public void testForgotLogin() throws Exception {
		 super.setUp();
		  loginpage = PageFactory.initElements(driver, LoginPage.class);
			homepage = PageFactory.initElements(driver, HomePage.class);
			forgotpage=PageFactory.initElements(driver, ForgotLoginPage.class);
			forgotpage.driver();
	 }
	  @Test(priority=2)
	  public void testLogintoOpsporteaandVerfiyingSms() throws Exception{
		  super.setUp();
		  loginpage = PageFactory.initElements(driver, LoginPage.class);
			homepage = PageFactory.initElements(driver, HomePage.class);
			forgotpage=PageFactory.initElements(driver, ForgotLoginPage.class);
		  System.out.println("log to stageops.portea.com");
		  loginpage.doLogin(username, password);
		  forgotpage.navigatingtoSMSScreen();
		  System.out.println("verifying SMS on Pending SMS screen");
		  forgotpage.visibleTextComparision();
		  }
	
}
