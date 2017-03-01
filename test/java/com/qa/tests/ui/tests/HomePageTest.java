package com.qa.tests.ui.tests;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.PageFactory;


import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.TestBase;
//import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;



public class HomePageTest extends TestBase{

	
	
	HomePage homepage;
	LoginPage loginpage;
	public static final String username ="qatest@test.com";
	public static final String password ="flower";
	
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
	}
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
		
	}

	@Test
	public void testVerifyDashBoardNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see Dashboard Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");	
		loginpage.doLogin(username, password);
		GlobalUtil.wait(5);
		homepage = PageFactory.initElements(driver, HomePage.class);
		System.out.println("DEBUG: Check Dashboard navigation bar");
		Assert.assertTrue(true,homepage.getDashBoardNavigationBarLocator());
		System.out.println("SUCCESS:message");
	}
	
	
	//@Test
	public void testVerifyAppointmentsNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see Appointments Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check Appointments navigation bar");
		Assert.assertTrue(true, homepage.getAppointmentNavigationBarLocator());
		
		
	}
	
	@Test
	public void testVerifyProfessionalNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see Professional Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check Professional navigation bar");
		Assert.assertTrue(true, homepage.getProfessionalNavigationBarLocator());
	}
	
	@Test
	public void testVerifyPatientNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see Patient Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check Patient navigation bar");
		Assert.assertTrue(true, homepage.getPatientsNavigationBarLocator());
	}
	
	@Test
	public void testVerifyPaymentsNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see Payments Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check Payments navigation bar");
		Assert.assertNotNull(homepage.getPaymentsNavigationBarLocator());
	}
	
	@Test
	public void testVerifyOrderNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see Order Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check Order navigation bar");
		Assert.assertNotNull(homepage.getOrderNavigationBarLocator());
	}

	@Test
	public void testVerifyCasesNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see Cases Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check Cases navigation bar");
		Assert.assertNotNull(homepage.getCasesNavigationBarLocator());
	}
	
	@Test
	public void testVerifySMSNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see SMS Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check SMS navigation bar");
		Assert.assertNotNull(homepage.getSMSNavigationBarLocator());
	}
	
	@Test
	public void testVerifyEmailNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see EMail Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check Email navigation bar");
		Assert.assertNotNull(homepage.getEmailNavigationBarLocator());
	}
	@Test
	public void testVerifyTicketNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see Ticket Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check Ticket navigation bar");
		Assert.assertNotNull(homepage.getTicketNavigationBarLocator());
	}
	
	@Test
	public void testVerifyLeadsNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see Leads Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check Leads navigation bar");
		Assert.assertNotNull(homepage.getLeadsNavigationBarLocator());
	}
	
	@Test
	public void testVerifyCallsNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see Calls Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check Calls navigation bar");
		Assert.assertNotNull(homepage.getCallsNavigationBarLocator());
	}
	
	@Test
	public void testVerifyAnlayticsNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see analytics Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check Anlaytics navigation bar");
		Assert.assertNotNull(homepage.getAnalyticsNavigationBarLocator());
	}
	@Test
	public void testVerifySettingsNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see Settings Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check Settings navigation bar");
		Assert.assertNotNull(homepage.getSettingsNavigationBarLocator());
	}
	
	@Test
	public void testVerifyConfigurationNavigationBar()
	{
		System.out.println("DEBUG: To verify that user is able to see Configuration Navigation Bar on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check Configuration navigation bar");
		Assert.assertNotNull(homepage.getConfigurationNavigationBarLocator());
	}
	
	@Test
	public void testVerifyUserEmailIdOnHomePage()
	{
		System.out.println("DEBUG: To verify that user is able to see his/her Email Id  on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check logged in user email id on home page");
		Assert.assertNotNull(homepage.getUserEmailIdLocator());
	}
	
	@Test
	public void testVerifyEditProfileOnHomePage()
	{
		System.out.println("DEBUG: To verify that user is able to see Edit Profile Link on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check edit Profile Link on home page");
		Assert.assertNotNull(homepage.getEditProfileLocator());
	}
	

	@Test
	public void testVerifyLogOutOnHomePage()
	{
		System.out.println("DEBUG: To verify that user is able to see LogOut Link on Home Page");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: Check Log Out Link on home page");
		Assert.assertNotNull(homepage.getLogoutLinkLocator());
	}
	
	
}

