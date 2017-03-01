package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.TicketEditingfromTicketstabPage;

public class TicketEditingfromTicketstabTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	TicketEditingfromTicketstabPage ticketpage;
	public static final String username = "qatest@test.com";
	public static final String password ="flower";
		
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		ticketpage=PageFactory.initElements(driver, TicketEditingfromTicketstabPage.class);
		
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
	System.out.println("navigating to Tickets tab");
	homepage.openTicketsPage();
	  System.out.println("selecting ticket to edit from Ticket Listings");
	  ticketpage.getselectingTickettoEditLocator().click();
	  ticketpage.editTicket();
	  System.out.println(" comparing ticket edit details");
	  ticketpage.visibleTextComparision();
	}
}
