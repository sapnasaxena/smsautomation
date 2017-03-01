package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalConstants.AREA;
import com.qa.tests.common.GlobalConstants.SERVICE;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.PackageModal;

import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.AppointmentPage;
import com.qa.tests.ui.pages.ConfigurationPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;

public class ConfigurationTest extends TestBase {

	
	AppointmentPage appointmentpage;
	LoginPage loginpage;
	HomePage homepage;
	ConfigurationPage configurationpage;
	
	public final String userName ="qatest@test.com";
	public final String passWord ="flower";
	
	
	public ConfigurationTest() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		appointmentpage = PageFactory.initElements(driver, AppointmentPage.class);
		configurationpage = PageFactory.initElements(driver, ConfigurationPage.class);
	}

	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}

	
	//@Test 
	public void testVerifyPackagetabVisibility()
	{
		System.out.println("DEBUG: To Verify that user is able to see Package tab on Configuration screen");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(userName, passWord);
		
		System.out.println("DEBUG: Click on Configuration navigation bar");
		driver.findElement((By.xpath(homepage.configurationNavBarLocator))).click();
		
		System.out.println("DEBUG: Check Package tab on Configuration Screen");
		Assert.assertTrue(configurationpage.getPackageTabLocator(), true);
	}
	
	
	//@Test 
	public void testVerifyServicetabVisibility()
	{
        System.out.println("DEBUG: To Verify that user is able to see Service tab on Configuration screen");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(userName, passWord);
		
		System.out.println("DEBUG: Click on Configuration navigation bar");
		driver.findElement((By.xpath(homepage.configurationNavBarLocator))).click();
		
		System.out.println("DEBUG: Check Service tab on Configuration Screen");
		Assert.assertTrue(configurationpage.getServicesTabLocator(), true);
	}
	
	//@Test 
	public void testVerifyAreatabVisibility()
	{
        System.out.println("DEBUG: To Verify that user is able to see Area tab on Configuration screen");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(userName, passWord);
		
		System.out.println("DEBUG: Click on Configuration navigation bar");
		driver.findElement((By.xpath(homepage.configurationNavBarLocator))).click();
		
		System.out.println("DEBUG: Check Area tab on Configuration Screen");
		Assert.assertTrue(configurationpage.getAreasTabLocator(), true);
	}
	
	//@Test 
	public void testVerifySubscriptionstabVisibility()
	{
        System.out.println("DEBUG: To Verify that user is able to see Subscriptions tab on Configuration screen");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(userName, passWord);
		
		System.out.println("DEBUG: Click on Configuration navigation bar");
		driver.findElement((By.xpath(homepage.configurationNavBarLocator))).click();
		
		System.out.println("DEBUG: Check Subscriptions tab on Configuration Screen");
		Assert.assertTrue(configurationpage.getSubscriptionsTabLocator(), true);
	}
	
	//@Test 
	public void testVerifyReferrertabVisibility()
	{
        System.out.println("DEBUG: To Verify that user is able to see Referrer tab on Configuration screen");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(userName, passWord);
		
		System.out.println("DEBUG: Click on Configuration navigation bar");
		homepage.openConfigurationPage();
		
		System.out.println("DEBUG: Check Referrer tab on Configuration Screen");
		Assert.assertTrue(configurationpage.getReferrerTabLocator(), true);
	}
	
	//@Test 
	public void testVerifyReferrerDoctortabVisibility()
	{
       System.out.println("DEBUG: To Verify that user is able to see Referrer Doctor tab on Configuration screen");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(userName, passWord);
		
		System.out.println("DEBUG: Click on Configuration navigation bar");
		driver.findElement((By.xpath(homepage.configurationNavBarLocator))).click();
		
		System.out.println("DEBUG: Check Referrer Doctor tab on Configuration Screen");
		Assert.assertTrue(configurationpage.getReferrerDoctorTabLocator(), true);
	}
	
	//@Test 
	public void testVerifyPriceListtabVisibility()
	{
        System.out.println("DEBUG: To Verify that user is able to see Price List tab on Configuration screen");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(userName, passWord);
		
		System.out.println("DEBUG: Click on Configuration navigation bar");
		driver.findElement((By.xpath(homepage.configurationNavBarLocator))).click();
		
		System.out.println("DEBUG: Check Price List tab on Configuration Screen");
		Assert.assertTrue(configurationpage.getPriceListTabLocator(), true);
	}
	
	//@Test
	public void testVerifyAddSubArea()
	{
      System.out.println("DEBUG: To Verify that user is able to add new Area or subarea");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(userName, passWord);
		
		System.out.println("DEBUG: Click on Configuration navigation bar");
		driver.findElement((By.xpath(homepage.configurationNavBarLocator))).click();
		
		System.out.println("DEBUG: Click on Areas tab");
		driver.findElement(By.xpath(configurationpage.areasTabLocator)).click();
		
		System.out.println("DEBUG: Add Area");
		configurationpage.addArea("testAddSubArea", "Bangalore", "state","testArr", "9123456780", "080", "000000000");
		
		System.out.println("Check new area is added successfully..");
		Assert.assertTrue(configurationpage.addedNewAreaLocator, true);
		
		
	}
	
	
	//@Test
	public void testVerifyAddArea()
	{
        System.out.println("DEBUG: To Verify that user is able to add new Area or subarea");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(userName, passWord);
		
		System.out.println("DEBUG: Click on Configuration navigation bar");
		driver.findElement((By.xpath(homepage.configurationNavBarLocator))).click();
		
		System.out.println("DEBUG: Click on Areas tab");
		driver.findElement(By.xpath(configurationpage.areasTabLocator)).click();
		
		System.out.println("DEBUG: Add Area");
		configurationpage.addArea("testAddArea", "None", "region","testArr", "9123456780", "080", "000000000");
		
		System.out.println("Check new area is added successfully..");
		Assert.assertTrue(configurationpage.getAddedNewAreaLocator(), true);
		
		
	}
	
	//@Test
	public void testVerifyEditArea()
	{
        System.out.println("DEBUG: To Verify that user is able to add new Area or subarea");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(userName, passWord);
		
		System.out.println("DEBUG: Click on Configuration navigation bar");
		driver.findElement((By.xpath(homepage.configurationNavBarLocator))).click();
		
		System.out.println("DEBUG: Click on Areas tab");
		driver.findElement(By.xpath(configurationpage.areasTabLocator)).click();
		
		System.out.println("DEBUG: Edit Area");
		if(configurationpage.addedNewAreaLocator.contentEquals("testAddArea"))
		{
		configurationpage.editArea("testEditArea");
		}
		
		System.out.println("Check edit area is updated successfully..");
		Assert.assertTrue(configurationpage.getAddedNewAreaLocator(), true);
		
	}
	
	
	@Test
	public void testVerifyAddPackage()
	{
        System.out.println("DEBUG: To Verify that user is able to add new Package");

        loginpage.doLogin(userName, passWord);
		homepage.openConfigurationPage();
		
		System.out.println("DEBUG: Click on Packages tab");
		driver.findElement(By.xpath(configurationpage.packageTabLocator)).click();
		
		System.out.println("DEBUG: Add Package");
		PackageModal packageModal = getPackageDetails();
		packageModal.setPackageName(packageModal.getPackageName());
		packageModal.setPackageDescription(packageModal.getPackageDescription());
		packageModal.setPackageCost("1000");
	    packageModal.setMaxDiscount("500");
	    packageModal.setSelectService(SERVICE.Nursing);
	    packageModal.setIntervalInDays("4");
	    packageModal.setArea(AREA.Bangalore);
	    packageModal.setCost("1000");
		configurationpage.addPackage(packageModal);
		
		System.out.println("Check Package is added successfully..");
		Assert.assertTrue(configurationpage.addedNewPackageLocator, true);
		
	}
	
	//@Test
	public void testVerifyEditPackage()
	{
        System.out.println("DEBUG: To Verify that user is able to add new Package");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(userName, passWord);
		
		System.out.println("DEBUG: Click on Configuration navigation bar");
		driver.findElement((By.xpath(homepage.configurationNavBarLocator))).click();
		
		System.out.println("DEBUG: Edit Package");
		WebElement packageEle = driver.findElement(By.xpath(configurationpage.addedNewPackageLocator));
		if(packageEle.isDisplayed())
		{
			configurationpage.editPackage("packagetest", "uppackagetest");
		}else
		{
			System.out.println("Package not found");
		}
			
		System.out.println("Check edit area is updated successfully..");
		Assert.assertTrue(configurationpage.addedNewAreaLocator, true);
		
	}
	
	
	//@Test
	public void testVerifyDeletePackage()
	{
        System.out.println("DEBUG: To Verify that user is able to add new Package");
		
		System.out.println("DEBUG: Login to application");
		loginpage.doLogin(userName, passWord);
		
		System.out.println("DEBUG: Click on Configuration navigation bar");
		driver.findElement((By.xpath(homepage.configurationNavBarLocator))).click();
	
		System.out.println("DEBUG: Add New Package");
		PackageModal packageModal = getPackageDetails();
		configurationpage.addPackage(packageModal);
		
		System.out.println("DEBUG: Delete Package");
//		WebElement packageEle = driver.findElement(By.xpath(configurationpage.addedNewPackageLocator));
//		if(packageEle.isDisplayed())
//		{
//		configurationpage.deletePackage();
//		}else
//		{
//			System.out.println("Package not found");
//		}
			
		
		System.out.println("Check package is deleted successfully..");
		Assert.assertFalse(configurationpage.addedNewPackageLocator, true);
		
	}
	
	  private PackageModal getPackageDetails(){
		PackageModal packageModal = new PackageModal();
		packageModal.setPackageName(GlobalUtil.generateRandomString());
		packageModal.setPackageDescription(GlobalUtil.generateRandomString());
		packageModal.setIntervalInDays(packageModal.getIntervalInDays());
		packageModal.setMaxDiscount(packageModal.getMaxDiscount());
		packageModal.setSelectService(packageModal.getSelectService());
		packageModal.setSelectFrequency("2");
		packageModal.setServiceStartDay("2");
	
		return packageModal;
	}
	
	
}
