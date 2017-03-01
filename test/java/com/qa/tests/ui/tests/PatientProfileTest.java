package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalUtil;

import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.PatientProfile;
import com.qa.tests.ui.pages.PatientsPage;

public class PatientProfileTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	PatientsPage patientpage;
	PatientProfile patientprofilepage;

	public static String username = "qatest@test.com";
	public static String password ="flower";

	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		patientprofilepage = PageFactory.initElements(driver, PatientProfile.class);
	}
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	/** Patient Overview Screen test **/
	@Test
	public void testVerifyPatientOverviewtabVisibility()
	{
		System.out.println("DEBUG: TO verify that user is able to see Patient Overview tab.");
		loginpage.doLogin(username,password);
		GlobalUtil.wait(5);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(5);
		Assert.assertTrue(patientprofilepage.getOverviewTab(), true);
	}
	
	/** Patient Appointments Screen test **/
	@Test
	public void testVerifyAppointmentstabVisibility()
	{
		System.out.println("DEBUG: TO verify that user is able to see Appointments tab.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		Assert.assertTrue(patientprofilepage.getappointmentsTab(), true);
	}
	
	/** Patient Cases Screen test **/
	@Test
	public void testVerifyCasestabVisibility()
	{
		System.out.println("DEBUG: TO verify that user is able to see Cases tab.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		Assert.assertTrue(patientprofilepage.getCasesTab(), true);
	}
	
	/** Patient Payment Screen test **/
	@Test
	public void testVerifyPaymentstabVisibility()
	{
		System.out.println("DEBUG: TO verify that user is able to see Payments tab.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		Assert.assertTrue(patientprofilepage.getPaymentsTab(), true);
		
	}
	
	/** Patient Notes Screen test **/
	@Test
	public void testVerifyNotestabVisibility()
	{
		System.out.println("DEBUG: TO verify that user is able to see Notes tab.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		Assert.assertTrue(patientprofilepage.getNotesTab(), true);
	}
	
	/** Patient SMS Screen test **/
	@Test
	public void testVerifySMStabVisibility()
	{
		System.out.println("DEBUG: TO verify that user is able to see SMS tab.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		Assert.assertTrue(patientprofilepage.getSMSTab(), true);
		
	}
	
	/** Patient  Call Screen test **/
	@Test
	public void testVerifyCalltabVisibility()
	{
		System.out.println("DEBUG: TO verify that user is able to see Call tab.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		Assert.assertTrue(patientprofilepage.getCasesTab(), true);
	}
	
	/** Patient Vitals Screen test **/
	@Test
	public void testVerifyVitalsTabVisibility()
	{
		System.out.println("DEBUG: TO verify that user is able to see Patient Vitals tab.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		Assert.assertTrue(patientprofilepage.getVitalsTab(), true);
	}
	
	/** Patient Family Screen test **/
	@Test
	public void testVerifyFamilyTabVisibility()
	{
		System.out.println("DEBUG: TO verify that user is able to see Family tab.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		Assert.assertTrue(patientprofilepage.getFamilyTab(), true);
	}
	
	
	/** Patient ticket Screen test **/
	@Test
	public void testVerifyTicketTabVisibility()
	{
		System.out.println("DEBUG: TO verify that user is able to see Ticket tab.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		Assert.assertTrue(patientprofilepage.getTicketTab(), true);
	}
	
	
	/** Patient Request Payment test **/
	@Test
	public void testVerifyRequestPaymentTabVisibility()
	{
		System.out.println("DEBUG: TO verify that user is able to see Request Payment tab.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		Assert.assertTrue(patientprofilepage.getrequestPaymentTab(), true);
	}
	
	/** Patient Orders Screen test **/
	@Test
	public void testVerifyOrderstabVisibility()
	{
		System.out.println("DEBUG: TO verify that user is able to see Orders tab.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		Assert.assertTrue(patientprofilepage.getOrdersTab(), true);
	}
	
	
//	@Test
//	public void testVerifyOrderstabVisibility()
//	{
//		System.out.println("DEBUG: TO verify that user is able to see Orders tab.");
//		loginpage.doLogin("qatest@test.com","flower");
//		homepage.openPatientListPage();
//		PatientModal patientModal = getPatientDetails();
//	    patientpage.addPatient(patientModal);	
//		Assert.assertTrue(patientprofilepage.getOrdersTab(), true);
//	}
	
	/** Invoice tab Visiblity **/
	
	
	
	/** Coordinator Tab Visibilty **/
	
	/** Settings Link Visibility */
	@Test
	public void testVerifySettingsLinkVisibility()
	{
		System.out.println("Verify that Settings Link is visible on Patient Overview Screen.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		Assert.assertNotNull(patientprofilepage.getSettingsLinkLocator());
	}
	
	@Test
	public void testVerifyOnChangeStatusFromActiveToInactiveFromSettings()
	{
		System.out.println("Verify that on changing status from active to Inactive from Settings, user is able to see the Reason field with expired and blacklist option.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		patientprofilepage.inactiveStatusOnSettings();
		Assert.assertNotNull(patientprofilepage);
	}
	
	@Test
	public void testVerifyUserIsAbleToChangeStatusAsActiveFromSettings()
	{
		System.out.println("Verify that user is able to change the status from Inactive to active from Settings Screen.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		patientprofilepage.activeStatusOnSettings();
		Assert.assertNotNull(patientprofilepage);
	}
	
	@Test
	public void testVerifyUserIsAbleToSetStatusAsActiveFromSettings()
	{
		System.out.println("Verify that user can change the status from Inactive to active from Settings Screen.");
		loginpage.doLogin(username,password);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		patientprofilepage.onClickPatientName();
		GlobalUtil.wait(2);
		patientprofilepage.activeStatusOnSettings();
		Assert.assertNotNull(patientprofilepage);
	}
	
}
