package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.AddTicketPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;

public class AddTicketTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	AddTicketPage addticket;
	public static final String username = "sapna.saxena@porteamedical.com";
	public static final String password ="123456";
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		addticket=PageFactory.initElements(driver, AddTicketPage.class);
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	@Test
	public void testTicket()
	{
	loginpage.doLogin(username, password);
	homepage.openLeadsPage();
	GlobalUtil.wait(5);
	addticket.leadSelection();
		}
}
