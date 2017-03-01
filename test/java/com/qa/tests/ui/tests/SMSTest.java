package com.qa.tests.ui.tests;

import junit.framework.Assert;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.SMSPage;

public class SMSTest extends TestBase {

	
	LoginPage loginpage;
	HomePage homepage;
	SMSPage smspage;
	public static final String username ="sapna.saxena@porteamedical.com";
	public static final String password ="123456";
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		smspage = PageFactory.initElements(driver, SMSPage.class);
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	@Test
	public void testVerifyReceivedSMSTabVisibility()
	{
		System.out.println("DEBUG: To Verify that Received SMS tab is visible to user");
		loginpage.doLogin(username, password);
		homepage.openSMSPage();
		Assert.assertTrue(smspage.getReceivedSMSTabLocator(), true);
	}
	
	@Test
	public void testVerifyPendingSMSTabVisibility()
	{
		System.out.println("DEBUG: To Verify that Pending SMS tab is visible to user");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openSMSPage();
		Assert.assertTrue(smspage.getPendingSMSTabLocator(), true);
	}
	
	@Test
	public void testVerifySentSMSTabVisibility()
	{
		System.out.println("DEBUG: To Verify that Sent SMS tab is visible to user");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openSMSPage();
		Assert.assertTrue(smspage.getSentSMSTabLocator(), true);
	}
	
	@Test
	public void testVerifyFailedSMSTabVisibility()
	{
		System.out.println("DEBUG: To Verify that Failed SMS tab is visible to user");
		loginpage.doLogin("qatest@test.com", "flower");
		GlobalUtil.wait(2);
		homepage.openSMSPage();
		Assert.assertTrue(smspage.getFailedSMSTabLocator(), true);
	}
	
	@Test
	public void testVerifySendBulkSMSTabVisibility()
	{
		System.out.println("DEBUG: To Verify that Send Bulk SMS tab is visible to user");
		loginpage.doLogin(username, password);
		homepage.openSMSPage();
		Assert.assertTrue(smspage.getSendBulkSMSTabLocator(), true);
	}
	
	@Test
	public void testVerifyApproveBulkSMSTabVisibility()
	{
		System.out.println("DEBUG: To Verify that Approve Bulk SMS tab is visible to user");
		loginpage.doLogin(username, password);
		homepage.openSMSPage();
		Assert.assertTrue(smspage.getApproveBulkSMSTabLocator(), true);
	}

	@Test
	public void testVerifyAppFeedbackTabVisibility()
	{
		System.out.println("DEBUG: To Verify that App Feedback tab is visible to user");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openSMSPage();
		Assert.assertTrue(smspage.getAppFeedbackTabLocator(), true);
	}
	
	@Test
	public void testVerifySearchTextBoxVisibilityOnReceivedSMSTab()
	{
		System.out.println("DEBUG: To Verify that Search Text box is visible to user");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openSMSPage();
		Assert.assertTrue(smspage.getSearchTextBoxLocator(), true);
	}
	
	@Test
	public void testVerifySearchButtonVisibilityOnReceivedSMSTab()
	{
		System.out.println("DEBUG: To Verify that Search Button is visible to user");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openSMSPage();
		Assert.assertTrue(smspage.getSearchButtonLocator(), true);
	}
	
	@Test
	public void testVerifyStatusFilterVisibilityOnReceivedSMSTab()
	{
		System.out.println("DEBUG: To Verify that Status Filter is visible to user");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openSMSPage();
		Assert.assertTrue(smspage.getStatusFilterLocator(), true);
	}
	
	@Test
	public void testVerifyTypeFilterVisibilityOnReceivedSMSTab()
	{
		System.out.println("DEBUG: To Verify that Type Filter is visible to user");
		loginpage.doLogin(username, password);
		homepage.openSMSPage();
		Assert.assertTrue(smspage.getTypeFilterLocator(), true);
	}
	
	@Test
	public void testVerifyDateFilterVisibilityOnReceivedSMSTab()
	{
		System.out.println("DEBUG: To Verify that date filter is visible to user");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openSMSPage();
		GlobalUtil.wait(2);
		Assert.assertTrue(smspage.getDateFilterLocator(), true);
	}
	
	@Test
	public void testVerifyDownloadCSVButtonVisibilityOnReceivedSMSTab()
	{
		System.out.println("DEBUG: To Verify that download CSV button is visible to user");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openSMSPage();
		Assert.assertTrue(smspage.getDownloadCSVButtonLocator(), true);
	}
	

	@Test
	public void testVerifyReceivedSMSTabTableColsVisibility()
	{
		System.out.println("DEBUG: To Verify that table columns on Received SMS tab is visible to user");
		loginpage.doLogin(username, password);
		homepage.openSMSPage();
	    Assert.assertTrue(smspage.getNameTableColOnRecievedSMSTabLocator(),true);
	    Assert.assertTrue(smspage.getTypeTableColOnRecievedSMSTabLocator(),true);
	    Assert.assertTrue(smspage.getMobileNoTableColOnRecievedSMSTabLocator(),true);
	    Assert.assertTrue(smspage.getMessageTableColOnRecievedSMSTabLocator(),true);
	    Assert.assertTrue(smspage.getCityTableColOnRecievedSMSTabLocator(),true);
	    Assert.assertTrue(smspage.getActiontakenTableColOnRecievedSMSTabLocator(),true);
	    Assert.assertTrue(smspage.getUpdatedByTableColOnRecievedSMSTabLocator(),true);
	    Assert.assertTrue(smspage.getUpdatedOnTableColOnRecievedSMSTabLocator(),true);
	    Assert.assertTrue(smspage.getReceivedOnTableColOnRecievedSMSTabLocator(),true);
	    Assert.assertTrue(smspage.getReplyTableColOnRecievedSMSTabLocator(),true);
	}
	
	
	@Test
	public void testVerifyStatusFilterOpenOnReceivedSMSTab()
	{
		System.out.println("DEBUG: To Verify that all the Open Status records are visible to user");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openSMSPage();
		GlobalUtil.wait(2);
		smspage.openRecievedSMSTab();
		GlobalUtil.wait(2);
		smspage.statusFilterByOpen();
		Assert.assertTrue(smspage.getStatusTableColOnRecievedSMSTabLocator(), true);
	}
	
	
	@Test
	public void testVerifyStatusFilterCloseOnReceivedSMSTab()
	{
		System.out.println("DEBUG: To Verify that all the Close Status records are visible to user");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openSMSPage();
		GlobalUtil.wait(2);
		smspage.openRecievedSMSTab();
		GlobalUtil.wait(2);
		smspage.statusFilterByClose();
		Assert.assertTrue(smspage.getStatusTableColOnRecievedSMSTabLocator(), true);
	}
	
}
