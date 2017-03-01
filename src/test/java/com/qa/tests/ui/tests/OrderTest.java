package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.OrderPage;

public class OrderTest extends TestBase {

	
	LoginPage loginpage;
	HomePage homepage;
	OrderPage orderpage;
	
	public OrderTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		orderpage = PageFactory.initElements(driver, OrderPage.class);
	}

	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	
	@Test
	public void testVerifyOrderTabVisibility()
	{
		System.out.println("DEBUG: To verify that order tab is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		GlobalUtil.wait(2);
		Assert.assertTrue(orderpage.getOrderTabLocator(), true);
		
	}
	
	@Test
	public void testVerifyEquipmentRentalTabVisibility()
	{
		System.out.println("DEBUG: To verify that Equipment Rental tab is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		GlobalUtil.wait(2);
		Assert.assertTrue(orderpage.getEquipmentRentalTabLocator(), true);
	}
	
	@Test
	public void testVerifyMedicineListTabVisibility()
	{
		System.out.println("DEBUG: To verify that Medicine List tab is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		GlobalUtil.wait(2);
		Assert.assertTrue(orderpage.getMedicineListTabLocator(), true);
	}
	
	@Test
	public void testVerifyLabTestTabVisibility()
	{
		System.out.println("DEBUG: To verify that Lab test tab is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		Assert.assertTrue(orderpage.getLabTestTabLocator(), true);
	}
	
	@Test
	public void testSearchBoxVisibility()
	{
		System.out.println("DEBUG: To verify that Search Box  is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		Assert.assertTrue(orderpage.getSearchBoxLocator(), true);
	}
	
	@Test
	public void testSearchButtonVisibility()
	{
		System.out.println("DEBUG: To verify that Search Button is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		Assert.assertTrue(orderpage.getSearchBoxLocator(), true);
	}
	
	@Test
	public void testDownloadCSVButtonVisibilityonOrderTab()
	{
		System.out.println("DEBUG: To verify that Download CSV Button is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		Assert.assertTrue(orderpage.getDownloadCSVButtonLocator(), true);
	}
	
	
	@Test
	public void testImportCSVButtonVisibilityonEquipmentRentalTab()
	{
		System.out.println("DEBUG: To verify that Import CSV Button is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		orderpage.openEquipmentRentalTab();
		Assert.assertTrue(orderpage.getImportCSVButtonLocator(), true);
	}
	
	@Test
	public void testDateFilterVisibilityonOrderTab()
	{
		System.out.println("DEBUG: To verify that Date Filter is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		orderpage.openOrderTab();
		Assert.assertTrue(orderpage.getDateFilterLocator(), true);
	}
	
	//@Test
	public void testImportCSVButtonVisibilityonMedicineListTab()
	{
		System.out.println("DEBUG: To verify that Import CSV Button is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		orderpage.openMedicineListTab();
		Assert.assertTrue(orderpage.getImportCSVButtonLocator(), true);
	}
	
	@Test
	public void testImportCSVButtonVisibilityonLabTestTab()
	{
		System.out.println("DEBUG: To verify that Import CSV Button is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		orderpage.openLabTestTab();
		Assert.assertTrue(orderpage.getImportCSVButtonLocator(), true);
	}
	
	@Test
	public void testDownloadCSVButtonVisibilityonEquipmentRentalTab()
	{
		System.out.println("DEBUG: To verify that Download CSV Button is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		orderpage.openEquipmentRentalTab();
		Assert.assertTrue(orderpage.getDownloadCSVButtonLocator(), true);
	}
	
	@Test
	public void testDownloadCSVButtonVisibilityonMedicineListTab()
	{
		System.out.println("DEBUG: To verify that Download CSV Button is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		orderpage.openMedicineListTab();
		Assert.assertTrue(orderpage.getDownloadCSVButtonLocator(), true);
	}
	
	@Test
	public void testDownloadCSVButtonVisibilityonLabTestTab()
	{
		System.out.println("DEBUG: To verify that Download CSV Button is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		orderpage.openLabTestTab();
		Assert.assertTrue(orderpage.getDownloadCSVButtonLocator(), true);
	}
	
	@Test
	public void testSearchItemOnOrderTab()
	{
		System.out.println("DEBUG: To verify that user is able to search any item in Order list");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		orderpage.searchItemByOrderId("E0100018");
		Assert.assertTrue(orderpage.getOrderNameLocator(), true);
	}
	
	@Test
	public void testVerifyDownloadCSVonOrderTab()
	{
		System.out.println("DEBUG: To verify that Download CSV Button is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		orderpage.downloadCSV();
		Assert.assertTrue(orderpage.getDownloadCSVButtonLocator(), true);
	}
	
	@Test
	public void testVerifyDownloadCSVFileOnLocation()
	{
		System.out.println("DEBUG: To verify that Import CSV Button is visible to user");
		loginpage.doLogin("qatest@test.com","flower");
		homepage.openOrderPage();
		orderpage.openEquipmentRentalTab();
		orderpage.downloadCSV();
		orderpage.downloadCSVLocation("order_report_2014-09-11.csv");
		Assert.assertTrue(orderpage.getDownloadCSVLocation(), true);
	}
	
}
