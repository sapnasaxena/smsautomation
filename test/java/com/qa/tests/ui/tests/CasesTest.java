package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.CasesPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.PatientProfile;

public class CasesTest extends TestBase{

	
	LoginPage loginpage;
	HomePage homepage;
	CasesPage casespage;
	PatientProfile patientprofilepage;
	
	public CasesTest() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		casespage = PageFactory.initElements(driver, CasesPage.class);
		patientprofilepage = PageFactory.initElements(driver, PatientProfile.class);
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	@Test
	public void testVerifyCasesTabVisibility()
	{
		System.out.println("DEBUG: To Verify user is able to see the Cases Tab on Cases Screen");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		
		System.out.println("DEBUG: Click on Cases navigation bar");
		driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
		
		System.out.println("DEBUG: Verify visibility of Cases tab");
		Assert.assertTrue(casespage.getCasesTabLocator(), true);
	}
	
	@Test
	public void testVerifyCasesFilesTabVisibility()
	{
		System.out.println("DEBUG: To Verify user is able to see the Cases Files Tab on Cases Screen");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		
		System.out.println("DEBUG: Click on Cases navigation bar");
		driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
		
		System.out.println("DEBUG: Verify visibility of Cases Files tab");
		Assert.assertTrue(casespage.getCasefileTabLocator(), true);
	}
	
	@Test
	public void testVerifyDocumentsTabVisibility()
	{
       System.out.println("DEBUG: To Verify user is able to see the Documents Tab on Cases Screen");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		
		System.out.println("DEBUG: Click on Cases navigation bar");
		driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
		
		System.out.println("DEBUG: Verify visibility of Documents tab");
		Assert.assertTrue(casespage.getDocumentTabLocator(), true);
	}
	
	
	@Test
	public void testVerifySearchTabVisibility()
	{
        System.out.println("DEBUG: To Verify user is able to see the Search Tab on Cases Screen");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		
		System.out.println("DEBUG: Click on Cases navigation bar");
		driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
		
		System.out.println("DEBUG: Verify visibility of Search tab....");
		Assert.assertTrue(casespage.getSearchTabLocator(), true);
	}
	
	@Test
	public void testVerifyRatingReportsTabVisibility()
	{
		   System.out.println("DEBUG: To Verify user is able to see the Rating Reports Tab on Cases Screen");
			
			System.out.println("DEBUG: Login to application");
			loginpage.doLogin("test123@test.com", "flower");
			
			System.out.println("DEBUG: Click on Cases navigation bar");
			driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
			
			System.out.println("DEBUG: Verify visibility of Rating Report tab....");
			Assert.assertTrue(casespage.getRatingReportTabLocator(), true);
	}
	
	@Test
	public void testVerifyCasesReportsTabVisibility()
	{
		    System.out.println("DEBUG: To Verify user is able to see the Cases Reports Tab on Cases Screen");
			
			System.out.println("DEBUG: Login to application");
			loginpage.doLogin("test123@test.com", "flower");
			
			System.out.println("DEBUG: Click on Cases navigation bar");
			driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
			
			System.out.println("DEBUG: Verify visibility of Cases Report tab....");
			Assert.assertTrue(casespage.getCasesReportTabLocator(), true);
	}
	
	//*** Test Functionalities of Case Tab ***
	
	@Test
	public void testVerifyDateFilterVisibility()
	{
		    System.out.println("DEBUG: To Verify user is able to see the date filter on Cases Tab");
			
			System.out.println("DEBUG: Login to application");
			loginpage.doLogin("test123@test.com", "flower");
			
			System.out.println("DEBUG: Click on Cases navigation bar");
			driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
			
			System.out.println("DEBUG: Verify visibility of Date Filter on Cases Tab....");
			Assert.assertTrue(casespage.getDateFilterLocator(), true);
	}
	
	
	@Test
	public void testVerifyStatusFilterVisibility()
	{
		System.out.println("DEBUG: To Verify user is able to see the Status filter on Cases Tab");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		
		System.out.println("DEBUG: Click on Cases navigation bar");
		driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
		
		System.out.println("DEBUG: Verify visibility of Status Filter on Cases Tab....");
		Assert.assertTrue(casespage.getStatusFilterLocator(), true);
	}

	@Test
	public void testVerifySpecialityFilterVisibility()
	{
		System.out.println("DEBUG: To Verify user is able to see the Speciality filter on Cases Tab");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		
		System.out.println("DEBUG: Click on Cases navigation bar");
		driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
		
		System.out.println("DEBUG: Verify visibility of Speciality Filter on Cases Tab....");
		Assert.assertTrue(casespage.getSpecialityFilterLocator(), true);
	}
	
	@Test
	public void testVerifySearchTextBoxVisibility()
	{
		System.out.println("DEBUG: To Verify user is able to see the Search text box on Cases Tab");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		
		System.out.println("DEBUG: Click on Cases navigation bar");
		driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
		
		System.out.println("DEBUG: Verify visibility of Search Text box on Cases Tab....");
		Assert.assertTrue(casespage.getSearchTextBoxLocator(), true);
	}
	
	@Test
	public void testVerifySearchButtonVisibility()
	{
        System.out.println("DEBUG: To Verify user is able to see the Search Button on Cases Tab");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		
		System.out.println("DEBUG: Click on Cases navigation bar");
		driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
		
		System.out.println("DEBUG: Verify visibility of Search Button on Cases Tab....");
		Assert.assertTrue(casespage.getSearchTextBoxLocator(), true);
	}
	
	
	
	@Test
	public void testVerifyOnClickPatientId()
	{
		System.out.println("DEBUG: To Verify that user is able to see Patient Profile on clicking on Patient Id");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		
		System.out.println("DEBUG: Click on Cases navigation bar");
		driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
		
		System.out.println("DEBUG: Check on clicking Patient Id, Patient profile screen is displaying");
		driver.findElement(By.xpath(casespage.patientidColumnLocator));
		Assert.assertTrue(patientprofilepage.getOverviewTab(), true);

	}
	
	@Test
	public void testVerifyOnClickPatientName()
	{
		System.out.println("DEBUG: To Verify that user is able to see Patient Profile on clicking Patient Name");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		
		System.out.println("DEBUG: Click on Cases navigation bar");
		driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
		
		System.out.println("DEBUG: Check on clicking Patient name, patient profile is displaying");
		driver.findElement(By.xpath(casespage.patientNameColumnLocator)).click();
		Assert.assertTrue(patientprofilepage.getOverviewTab(), true);
	}
	
	@Test
	public void testVerifyOnClickId()
	{
		System.out.println("DEBUG: To verify that user is able to see Cases details screen on clicking ID from ID column");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		
		System.out.println("DEBUG: Click on Cases navigation bar");
		driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
		
		System.out.println("DEBUG: Check on clicking Id, Cases tab of Patient is displaying");
		driver.findElement(By.xpath(casespage.idColumnLocator)).click();
		Assert.assertTrue(patientprofilepage.getCasesTab(), true);
	}
	
	@Test 
	public void testVerifySearchCasesbyPatientName()
	{
		System.out.println("DEBUG: To Verify that user is able to search the cases by patient name");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		
		System.out.println("DEBUG: Click on Cases navigation bar");
		driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
		
		casespage.searchPatientByName("Test User10400");
		
		System.out.println("DEBUG: Verify Patient details on Cases tab");
		Assert.assertTrue(casespage.getPatientNameColumnLocator(), true);
	}

	
	@Test
	public void testVerifySearchCasesByPatientID()
	{
        System.out.println("DEBUG: To Verify that user is able to search the cases by patient Id");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		
		System.out.println("DEBUG: Click on Cases navigation bar");
		driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
		
		casespage.searchPatientByName("Test User10400");
		
		System.out.println("DEBUG: Verify Patient details on Cases tab");
		Assert.assertTrue(casespage.getPatientNameColumnLocator(), true);
	}
	
	
	@Test
	public void testVerifyViewCasesByDate()
	{
		System.out.println("To Verify user is able to see the cases by Date");
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		
		System.out.println("DEBUG: Click on Cases navigation bar");
		driver.findElement(By.xpath(homepage.casesNavBarLocator)).click();
		
		System.out.println("DEBUG: Select All option to see the cases of all dates");
	
		
		System.out.println("DEBUG: Select Today option to see the cases of today's date");
		
		System.out.println("DEBUG: Select Tomorrows's date to see the cases");
		
	}
	/*
	@Test
	public void testVerifyViewCasesbyStatus()
	{
		
	}
	
	@Test
	public void testVerifyViewCasesbySpeciality()
	{
		System.out.println("DEBUG: To Verify that user is able to see the Cases by Speciality");
		
	}
	*/
}
