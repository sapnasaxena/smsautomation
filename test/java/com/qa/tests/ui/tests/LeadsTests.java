package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LeadPage;
import com.qa.tests.ui.pages.LoginPage;

public class LeadsTests extends TestBase{
	
	HomePage homepage;
	LoginPage loginpage;
	LeadPage leadpage;
	public static final String username ="sapna.saxena@porteamedical.com";
	public static final String password ="123456";
	
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		leadpage = PageFactory.initElements(driver, LeadPage.class);
	}
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
		
	}

	//UI Test Scenarios for Lead Listing Screen
	@Test
	public void testVerifyUserIsAbleToSeeLeadsOptionOnHomePage()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator));
		Assert.assertTrue(homepage.getLeadsNavigationBarLocator(), true);
	}
	
	@Test
	public void testVerifyLeadsListingScreenIsVisible()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		Assert.assertTrue(leadpage.getLeadListingsScreenLocator(), true);
	}
	
	@Test
	public void testVerifyCreatedOnDateFilterVisibleOnLeadsListingScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.createdOnFieldLocator));
		Assert.assertTrue(leadpage.getCreatedOnFieldLocator(), true);
	}
	
	@Test
	public void testVerifyDispositionFilterVisibleOnLeadsListingScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.dispositionFieldLocator));
		Assert.assertTrue(leadpage.getDispositionFieldLocator(), true);
	}
	
	@Test
	public void testVerifyDispositionFilterFieldsVisibilityOnLeadsListingScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		Select disposition = new Select(driver.findElement(By.xpath(leadpage.dispositionFieldLocator)));
		disposition.getOptions();
		Assert.assertEquals(disposition.getOptions(), true);
	}
	
	@Test
	public void testVerifyDownloadCSVButtonVisibilityOnLeadsListingScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.downloadCSVButtonLocator));
		Assert.assertTrue(leadpage.getDownloadCSVButtonLocator(), true);
	}
	
	@Test
	public void testVerifySearchBoxVisibilityOnLeadsListingScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.searchBoxLocator));
		Assert.assertTrue(leadpage.getSearchBoxLocator(), true);
	}
	
	@Test
	public void testVerifySearchButtonVisibilityOnLeadsListingScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.searchButtonLocator));
		Assert.assertTrue(leadpage.getSearchButtonLocator(), true);
	}
	
	@Test
	public void testVerifyAddLeadButtonVisibilityOnLeadsListingScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.addLeadButtonLocator));
		Assert.assertTrue(leadpage.getAddLeadButtonLocator(), true);
	}
	//UI Test Scenarios for Lead -> Call Details Screen
	@Test
	public void testVerifyCallDetailsTabVisibilityOnLeadsScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.callDetailsTabLocator));
		Assert.assertTrue(leadpage.getCallDetailsTabLocator(), true);
	}
	
	@Test
	public void testVerifyDateFilterVisibilityOnCallDetailsScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.callDetailsTabLocator)).click();
		GlobalUtil.wait(2);
		Assert.assertTrue(leadpage.getCreatedOnFieldLocator(), true);
	}
	
	@Test
	public void testVerifyIVRStatusFilterVisibilityOnCallDetailsScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.callDetailsTabLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.ivrStatusFieldLocator));
		Assert.assertTrue(leadpage.getivrStatusFieldLocator(), true);
	}
	
	@Test
	public void testVerifyPurposeOfCallFilterVisibilityOnCallDetailsScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.callDetailsTabLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.purposeOfCallFieldLocator));
		Assert.assertTrue(leadpage.getpurposeOfCallFieldLocator(), true);
	}
	@Test
	public void testVerifyDownloadCSVButtonVisibilityOnCallDetailsScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.callDetailsTabLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.downloadCSVButtonLocator));
		Assert.assertTrue(leadpage.getDownloadCSVButtonLocator(), true);
	}
	//UI Test Scenarios for Lead -> Advance Search Screen
	
	@Test
	public void testVerifyAdvanceSearchTabVisibilityOnLeadScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.advanceSearchTabLocator));
		Assert.assertTrue(leadpage.getAdvanceSearchTabLocator(), true);
	}
	@Test
	public void testVerifySearchBoxVisibilityOnAdvanceScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.advanceSearchTabLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.searchBoxLocator));
		Assert.assertTrue(leadpage.getSearchBoxLocator(), true);
	}
	@Test
	public void testVerifySearchButtonVisibilityOnAdvanceScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.advanceSearchTabLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.searchButtonLocator));
		Assert.assertTrue(leadpage.getSearchButtonLocator(), true);
	}
	@Test
	public void testVerifyAddLeadButtonVisibilityOnAdvanceScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.advanceSearchTabLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.addLeadButtonLocator));
		Assert.assertTrue(leadpage.getAddLeadButtonLocator(), true);
	}
	
	//UI Test Scenarios for Lead -> Lead Referrer Screen
	@Test
	public void testVerifyLeadReferrerTabVisibilityOnLeadScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.leadReferrerTabLocator));
		Assert.assertTrue(leadpage.getLeadReferrerTabLocator(), true);
	}
	
	@Test
	public void testVerifyDateFilterVisibilityOnLeadReferrerScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.leadReferrerTabLocator));
		Assert.assertTrue(leadpage.getLeadReferrerTabLocator(), true);
	}
	
	@Test
	public void testVerifyReferrerFieldVisibilityOnLeadReferrerScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.leadReferrerTabLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.referrerTypeFieldLocator));
		Assert.assertTrue(leadpage.getReferrerTypeFieldLocator(), true);
	}
	
	@Test
	public void testVerifyServiceFieldVisibilityOnLeadReferrerScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.leadReferrerTabLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.servicesFieldLocator));
		Assert.assertTrue(leadpage.getServicesFieldLocator(), true);
	}
	
	@Test
	public void testVerifyDownloadCSVButtonVisibilityOnLeadReferrerScreen()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.leadReferrerTabLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.downloadCSVButtonLocator));
		Assert.assertTrue(leadpage.getDownloadCSVButtonLocator(), true);
	}
	
	//Add Lead
	@Test
	public void testVerifyAddLeadScreenVisibilty()
	{
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.leadsNavBarLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.addLeadButtonLocator)).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(leadpage.downloadCSVButtonLocator));
		Assert.assertTrue(leadpage.getDownloadCSVButtonLocator(), true);
	}
	
	}


