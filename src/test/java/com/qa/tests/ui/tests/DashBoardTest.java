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
import com.qa.tests.ui.pages.DashBoardPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;

public class DashBoardTest extends TestBase {

	
	LoginPage loginpage;
	HomePage homepage;
	DashBoardPage dashboardpage;
	public static String username = "qatest@test.com";
	public static String password ="flower";

	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		dashboardpage = PageFactory.initElements(driver, DashBoardPage.class);
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	
	@Test
	public void testVerifyDashboardApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Appt Summary tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.dashBoardNavBarLocator)).click();
		Assert.assertTrue(dashboardpage.getApptSummaryTabLocator(), true);
	}
	
	@Test
	public void testVerifyDashboardApptReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Appt Report tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.dashBoardNavBarLocator)).click();
		Assert.assertTrue(dashboardpage.getApptReportTabLocator(), true);
	}
	
	@Test
	public void testVerifyDashboardPatientReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Patient Report tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.dashBoardNavBarLocator)).click();
		Assert.assertTrue(dashboardpage.getPatientReportTabLocator(), true);
	}
	
	@Test
	public void testVerifyDashboardRevByReferrerServicesTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Rev By Referrer/Services tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.dashBoardNavBarLocator)).click();
		Assert.assertTrue(dashboardpage.getRevByReferrerServiceTabLocator(), true);
	}
	
	@Test
	public void testVerifyDashboardRevByClinicianTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Rev By Clinician tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.dashBoardNavBarLocator)).click();
		Assert.assertTrue(dashboardpage.getRevByClinicianTabLocator(), true);
	}
	
	@Test
	public void testVerifyDashboardPaymentCollectionTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Payment Collection tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.dashBoardNavBarLocator)).click();
		Assert.assertTrue(dashboardpage.getPaymentCollectionTabLocator(), true);
	}
	
	@Test
	public void testVerifyDashboardPendingPaymentTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Pending Payment tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.dashBoardNavBarLocator)).click();
		Assert.assertTrue(dashboardpage.getPendingPaymentTabLocator(), true);
	}
	
	@Test
	public void testVerifyDashboardCancellationReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Cancellation Report tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.dashBoardNavBarLocator)).click();
		Assert.assertTrue(dashboardpage.getCancellationReportTabLocator(), true);
	}
	
	@Test
	public void testVerifyDashboardCallReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Call Report tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.dashBoardNavBarLocator)).click();
		Assert.assertTrue(dashboardpage.getCallReportTabLocator(), true);
	}
	
	
	@Test
	public void testVerifyAreaFilterOnApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Area filter on Appt Summary tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.dashBoardNavBarLocator)).click();
		Assert.assertTrue(dashboardpage.getDashboardAreaFilterLocator(), true);
	}
	
	@Test
	public void testVerifyReferredByFilterOnApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see the ReferredBy filter on Appt Summary tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		Assert.assertTrue(dashboardpage.getDashboardReferredByFilterLocator(), true);
	}
	
	@Test
	public void testVerifyReferrerTypeFilterOnApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Referrer Type filter on Appt Summary tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		Assert.assertTrue(dashboardpage.getDashboardReferredTypeFilterLocator(), true);
	}
	
	@Test
	public void testVerifyStatusFilterOnApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Status filter on Appt Summary tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		Assert.assertTrue(dashboardpage.getDashboardStatusFilterLocator(), true);
	}
	
	@Test
	public void testVerifyAndroidFilterOnApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Android filter on Appt Summary tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		Assert.assertTrue(dashboardpage.getDashboardAndroidFilterLocator(), true);
	}
	
	@Test
	public void testVerifyDateFilterOnApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Date filter on Appt Summary tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		Assert.assertTrue(dashboardpage.getDateFilterLocator(), true);
	}
	
	@Test
	public void testVerifyShowColumnsOnApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Show Column field on Appt Summary tab in DashBoard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		Assert.assertTrue(dashboardpage.getShowAreaColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowDateColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowClinicianColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowReferredByColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowReferredTypeColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowStatusColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowReferrerDoctorColumnLocator(), true);
		
	}
	

	@Test
	public void testVerifyDownLoadCSVButton()
	{
		System.out.println("DEBUG: To verify user is able to see the Download CSV button in all tabs of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		Assert.assertTrue(dashboardpage.getDownloadCSVLocator(), true);
	}
	
	@Test
	public void testVerifyAreaFilterOnApptReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Area Filter on Appt Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.apptReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getApptReportTabAreaFilterLocator(), true);
	}
	
	
	@Test
	public void testVerifyReferrerNameFilterOnApptReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Referrer Name Filter on Appt Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.apptReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getApptReportTabReferrerNameFilterLocator(), true);
	}
	
	@Test
	public void testVerifyReferrerTypeFilterOnApptReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Referrer Type Filter on Appt Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.apptReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getApptReportTabReferrerTypeFilterLocator(), true);
	}
	
	@Test
	public void testVerifyStatusFilterOnApptReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Status Filter on Appt Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.apptReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getApptReportTabStatusFilterLocator(), true);
	}
	
	
	@Test
	public void testVerifyServiceFilterOnPatientReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Service Filter on Patient Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.patientReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getPatientReportTabServiceFilterLocator(), true);
	}
	
	@Test
	public void testVerifyPackageFilterOnPatientReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Package Filter on Patient Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.patientReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getPatientReportTabPackageFilterLocator(), true);
	}
	
	@Test
	public void testVerifyAreaFilterOnPatientReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Area Filter on Patient Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.patientReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getDashboardAreaFilterLocator(), true);
	}
	
	
	@Test
	public void testVerifyReferrerNameFilterOnPatientReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Referrer Name Filter on Patient Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.patientReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getApptReportTabReferrerNameFilterLocator(), true);
	}
	
	@Test
	public void testVerifyReferrerTypeFilterOnPatientReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Referrer Type Filter on Patient Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin("test123@test.com", "flower");
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.patientReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getDashboardReferredTypeFilterLocator(), true);
	}
	
	@Test
	public void testVerifyAreaFilterOnRevByReferrerServiceTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Area Filter on Rev By Referrer Service Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabLocator)).click();
		Assert.assertTrue(dashboardpage.getRevByReferrerServiceTabAreaFilterLocator(), true);
	}
	
	@Test
	public void testVerifyReferredByFilterOnRevByReferrerServiceTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Referred By Filter on Rev By Referrer Service Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabLocator)).click();
		Assert.assertTrue(dashboardpage.getRevByReferrerServiceTabReferredByFilterLocator(), true);
	}
	
	@Test
	public void testVerifyReferrerTypeFilterOnRevByReferrerServiceTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Referrer Type Filter on Rev By Referrer Service Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabLocator)).click();
		Assert.assertTrue(dashboardpage.getRevByReferrerServiceTabReferrerTypeFilterLocator(), true);
	}
	
	
	@Test
	public void testVerifyClinicianTypeFilterOnRevByReferrerServiceTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Clinician Type Filter on Rev By Referrer Service Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabLocator)).click();
		Assert.assertTrue(dashboardpage.getRevByReferrerServiceTabClinicianTypeFilterLocator(), true);
	}
	
	@Test
	public void testVerifyShowColumnsOnRevByReferrerServiceTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Referrer Type Filter on Rev By Referrer Service Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabLocator)).click();
		Assert.assertTrue(dashboardpage.getShowAreaColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowDateColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowReferredByColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowReferredTypeColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowClinicianColumnLocator(), true);
	}
	
	
	@Test
	public void testVerifyDownloadCSVButtonOnRevByReferrerServiceTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Referrer Type Filter on Rev By Referrer Service Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabLocator)).click();
		Assert.assertTrue(dashboardpage.getDownloadCSVLocator(), true);
	}
	
	@Test
	public void testVerifyDateFilterOnRevByReferrerServiceTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Date Filter on Rev By Referrer Service Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabLocator)).click();
		Assert.assertTrue(dashboardpage.getDateFilterLocator(), true);
	}
	
	@Test
	public void testVerifyAreaFilterOnRevByClinicianTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Area Filter on Rev By Clinician tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.revByClinicianTabLocator)).click();
		Assert.assertTrue(dashboardpage.getRevByClinicianTabAreaFilterLocator(), true);
	}
	
	@Test
	public void testVerifyDateFilterOnRevByClinicianTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Date Filter on Rev By Clinician tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.revByClinicianTabLocator)).click();
		Assert.assertTrue(dashboardpage.getDateFilterLocator(), true);
	}
	
	@Test
	public void testVerifyShowColumnsOnRevByClinicianTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Show Column Area, Date, Clinician and Patient  on Rev By Clinician tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.revByClinicianTabLocator)).click();
		Assert.assertTrue(dashboardpage.getShowDateColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowAreaColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowClinicianColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowColumnPatientLocator(), true);
	}
	
	

	@Test
	public void testVerifyShowColumnsOnPaymentCollectionTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Show Column Area, Date, Clinician and Patient  on Payment Collection tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.paymentCollectionTabLocator)).click();
		Assert.assertTrue(dashboardpage.getShowDateColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowAreaColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowClinicianColumnLocator(), true);
		Assert.assertTrue(dashboardpage.getShowColumnPatientLocator(), true);
	}
	
	@Test
	public void testVerifyAreaFilterOnPaymentCollectionTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Area filter on Payment Collection tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.paymentCollectionTabLocator)).click();
		Assert.assertTrue(dashboardpage.getPaymentCollectionTabAreaFilterLocator(), true);
	}
	
	@Test
	public void testVerifyDateFilterOnPaymentCollectionTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Date filter on Payment Collection tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.paymentCollectionTabLocator)).click();
		Assert.assertTrue(dashboardpage.getDateFilterLocator(), true);
	}
	
	@Test
	public void testVerifyDownloadCSVButtonOnPaymentCollectionTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Download CSV button on Payment Collection tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.paymentCollectionTabLocator)).click();
		Assert.assertTrue(dashboardpage.getDownloadCSVLocator(), true);
	}
	
	@Test
	public void testVerifyAreaFilterOnPendingPaymentTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Download CSV button on Payment Collection tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.pendingPaymentTabLocator)).click();
		Assert.assertTrue(dashboardpage.getDownloadCSVLocator(), true);
	}
	
	@Test
	public void testVerifySelectViewOnCancellationReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Select View field on Cancellation Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.cancellationReportTabLocator)).click();
		//Assert.assertTrue(dashboardpage.get, true);
		
	}
	

	@Test
	public void testVerifyResponsibleFilterOnCancellationReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Responsible filter on Cancellation Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.cancellationReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getCancellationReportTabResponsibleFilterLocator(), true);
		
	}
	
	@Test
	public void testVerifyReasonFilterOnCancellationReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Reason filter on Cancellation Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.cancellationReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getCancellationReportTabReasonFilterLocator(), true);
		
	}
	
	@Test
	public void testVerifyAreaFilterOnCancellationReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Area filter on Cancellation Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.cancellationReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getDashboardAreaFilterLocator(), true);
		
	}
	
	@Test
	public void testVerifyReferrerFilterOnCancellationReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Referrer filter on Cancellation Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.cancellationReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getDashboardReferredByFilterLocator(), true);
		
	}
	
	@Test
	public void testVerifyReferredTypeFilterOnCancellationReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Referred Type filter on Cancellation Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.cancellationReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getDashboardReferredTypeFilterLocator(), true);
		
	}
	
	@Test
	public void testVerifyClinicianTypeFilterOnCancellationReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Clinician Type filter on Cancellation Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.cancellationReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getCancellationReportTabClinicianTypeFilterLocator(), true);
		
	}
	
	@Test
	public void testVerifyDateFilterOnCancellationReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Date filter on Cancellation Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.cancellationReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getDateFilterLocator(), true);
		
	}
	
	@Test
	public void testVerifyDownloadCSVOnCancellationReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Download CSV button on Cancellation Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.cancellationReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getDownloadCSVLocator(), true);
		
	}
	
	
	@Test
	public void testVerifyDateFilterOnCallReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Date filter on Call Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.callReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getDateFilterLocator(), true);
		
	}
	
	@Test
	public void testVerifyCallStatusFilterOnCallReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Call Status filter on Call Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.callReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getCallReportTabCallStatusFilterLocator(), true);
		
	}
	
	@Test
	public void testVerifyClinicianTypeFilterOnCallReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Clinician Type filter on Call Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.callReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getCallReportTabClinicianTypeFilterLocator(), true);
		
	}
	
	@Test
	public void testVerifyAllCallsViewOnCallReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the View All Calls field on Call Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		driver.findElement(By.xpath(dashboardpage.callReportTabLocator)).click();
		Assert.assertTrue(dashboardpage.getCallReportTabViewAllCallsLocator(), true);
		
	}
	
	@Test
	public void testVerifyIncomingCallsViewOnCallReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the View Incoming Calls field on Call Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		dashboardpage.onClickCallReportTab();
		Assert.assertTrue(dashboardpage.getCallReportTabViewAllIncomingsLocator(), true);
		
	}
	
	
	
	@Test
	public void testVerifyOutgoingCallsViewOnCallReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the View Outgoing Calls field on Call Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
	    dashboardpage.onClickCallReportTab();
		Assert.assertTrue(dashboardpage.getCallReportTabViewAllOutgoingsLocator(), true);
		
	}
	
	@Test
	public void testVerifyDownloadCSVOnCallReportTab()
	{
		System.out.println("DEBUG: To verify user is able to see the Download CSV on Call Report tab of Dashboard ");
		System.out.println("Login to the application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		dashboardpage.onClickCallReportTab();
		Assert.assertTrue(dashboardpage.getDownloadCSVLocator(), true);
		
	}
	
	@Test
	public void testVerifyAreaColumnVisiblityOnTableOfApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see Area column on table on selecting area checkbox from Show Column field");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Appt Summary tab ");
		driver.findElement(By.xpath(dashboardpage.apptSummaryTabLocator)).click();
		System.out.println("Select Checkbox Area Name");
		driver.findElement(By.xpath(dashboardpage.showAreaColumnLocator)).click();
		Assert.assertTrue(dashboardpage.getAreaNameOnTableApptSummaryTab(), true);
	}
	
	@Test
	public void testVerifyDateColumnVisiblityOnTableOfApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see Report Date column on table on selecting area checkbox from Show Column field");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(homepage.dashBoardNavBarLocator)).click();
		System.out.println("Click on Appt Summary tab ");
		driver.findElement(By.xpath(dashboardpage.apptSummaryTabLocator)).click();
		System.out.println("Select Checkbox Area Name");
		driver.findElement(By.xpath(dashboardpage.showDateColumnLocator)).click();
		Assert.assertTrue(dashboardpage.getReportDateColumnOnTableApptSummaryTab(), true);
	}
	
	
	
	@Test
	public void testVerifyReferredByColumnVisiblityOnTableOfApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see Referrerd By column on table on selecting area checkbox from Show Column field");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Appt Summary tab ");
		driver.findElement(By.xpath(dashboardpage.apptSummaryTabLocator)).click();
		System.out.println("Select Checkbox Referred By check box from show field");
		driver.findElement(By.xpath(dashboardpage.showReferredByColumnLocator)).click();
		Assert.assertTrue(dashboardpage.getRefferredByColumnOnTableApptSummaryTab(), true);
	}
	
	
	@Test
	public void testVerifyReferrerTypeColumnVisiblityOnTableOfApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see Referrer Type column on table on selecting area checkbox from Show Column field");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Appt Summary tab ");
		driver.findElement(By.xpath(dashboardpage.apptSummaryTabLocator)).click();
		System.out.println("Select Checkbox Referrer type check box from show field");
		driver.findElement(By.xpath(dashboardpage.showReferredTypeColumnLocator)).click();
		Assert.assertTrue(dashboardpage.getReferrerTypeColumnOnTableApptSummaryTab(), true);
	}
	
	@Test
	public void testVerifyClincianColumnVisiblityOnTableOfApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see Clincian column on table on selecting area checkbox from Show Column field");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Appt Summary tab ");
		driver.findElement(By.xpath(dashboardpage.apptSummaryTabLocator)).click();
		System.out.println("Select Checkbox Clinician check box from show field");
		driver.findElement(By.xpath(dashboardpage.showClinicianColumnLocator)).click();
		Assert.assertTrue(dashboardpage.getClinicianColumnOnTableApptSummaryTab(), true);
	}
	
	@Test
	public void testVerifyStatusColumnVisiblityOnTableOfApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see Status column on table on selecting area checkbox from Show Column field");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Appt Summary tab ");
		driver.findElement(By.xpath(dashboardpage.apptSummaryTabLocator)).click();
		System.out.println("Select Checkbox Clinician check box from show field");
		driver.findElement(By.xpath(dashboardpage.showClinicianColumnLocator)).click();
		Assert.assertTrue(dashboardpage.getClinicianColumnOnTableApptSummaryTab(), true);
	}
	
	
	@Test
	public void testVerifyReferrerDoctorColumnVisiblityOnTableOfApptSummaryTab()
	{
		System.out.println("DEBUG: To verify user is able to see Referrer Doctor column on table on selecting area checkbox from Show Column field");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Appt Summary tab ");
		driver.findElement(By.xpath(dashboardpage.apptSummaryTabLocator)).click();
		System.out.println("Select Checkbox Referrer Doctor check box from show field");
		driver.findElement(By.xpath(dashboardpage.showReferrerDoctorColumnLocator)).click();
		Assert.assertTrue(dashboardpage.getReferrerDoctorColumnOnTableApptSummaryTab(), true);
	}
	
	@Test
	public void testVerifyAreaColumnVisiblityOnTableOfRevByReferrerServiceTab()
	{
		System.out.println("DEBUG: To verify user is able to see Area column on table on selecting area checkbox from Show Column field on Rev By Referrer/Service tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Rev By Referrer/Services tab ");
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabLocator)).click();
		System.out.println("Select Checkbox Area check box from show field");
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabAreaFilterLocator)).click();
		Assert.assertTrue(dashboardpage.getAreaNameOnTableApptSummaryTab(), true);
	}
	
	
	@Test
	public void testVerifyDateColumnVisiblityOnTableOfRevByReferrerServiceTab()
	{
		System.out.println("DEBUG: To verify user is able to see Date column on table on selecting area checkbox from Show Column field on Rev By Referrer/Service tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Rev By Referrer/Services tab ");
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabLocator)).click();
		System.out.println("Select Checkbox Date check box from show field");
		driver.findElement(By.xpath(dashboardpage.showDateColumnLocator)).click();
		Assert.assertTrue(dashboardpage.getReportDateColumnOnTableApptSummaryTab(), true);
	}
	
	@Test
	public void testVerifyReferredByColumnVisiblityOnTableOfRevByReferrerServiceTab()
	{
		System.out.println("DEBUG: To verify user is able to see Referred By column on table on selecting area checkbox from Show Column field on Rev By Referrer/Service tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Rev By Referrer/Services tab ");
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabLocator)).click();
		System.out.println("Select Checkbox Referred By check box from show field");
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabReferredByFilterLocator)).click();
		Assert.assertTrue(dashboardpage.getRefferredByColumnOnTableApptSummaryTab(), true);
	}
	
	@Test
	public void testVerifyReferrerTypeColumnVisiblityOnTableOfRevByReferrerServiceTab()
	{
		System.out.println("DEBUG: To verify user is able to see Referrer Type column on table on selecting area checkbox from Show Column field on Rev By Referrer/Service tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Rev By Referrer/Service tab ");
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabLocator)).click();
		System.out.println("Select Checkbox Referrer Typecheck box from show field");
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabReferrerTypeFilterLocator)).click();
		Assert.assertTrue(dashboardpage.getReferrerTypeColumnOnTableApptSummaryTab(), true);
	}
	
	
	
	@Test
	public void testVerifyClinicianTypeColumnVisiblityOnTableOfRevByReferrerServiceTab()
	{
		System.out.println("DEBUG: To verify user is able to see Clinician column on table on selecting area checkbox from Show Column field on Rev By Referrer/Service tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Rev by Referrer/Services tab ");
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabLocator)).click();
		System.out.println("Select Checkbox Clinician check box from show field");
		driver.findElement(By.xpath(dashboardpage.revByReferrerServiceTabClinicianTypeFilterLocator)).click();
		Assert.assertTrue(dashboardpage.getClinicianTypeColumnOnTableApptSummaryTab(), true);
	}
	
	
	@Test
	public void testVerifyAreaColumnVisiblityOnTableOfRevByClinician()
	{
		System.out.println("DEBUG: To verify user is able to see Area column on table on selecting area checkbox from Show Column field on Rev By Clinician tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Rev By Clinician tab ");
		dashboardpage.onClickRevByClinicianTab();
		System.out.println("Select Checkbox Clinician check box from show field");
		driver.findElement(By.xpath(dashboardpage.revByClinicianTabAreaFilterLocator)).click();
		Assert.assertTrue(dashboardpage.getAreaNameOnTableApptSummaryTab(), true);
	}
	
	@Test
	public void testVerifyDateColumnVisiblityOnTableOfRevByClinicianTab()
	{
		System.out.println("DEBUG: To verify user is able to see Date column on table on selecting area checkbox from Show Column field on Rev By Clinician tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Rev By CLinician tab ");
		dashboardpage.onClickRevByClinicianTab();
		System.out.println("Select Date check box from show field");
		driver.findElement(By.xpath(dashboardpage.showDateColumnLocator)).click();
		Assert.assertTrue(dashboardpage.getReportDateColumnOnTableApptSummaryTab(), true);
	}
	
	
	@Test
	public void testVerifyClincianColumnVisiblityOnTableOfRevByClinicianTab()
	{
		System.out.println("DEBUG: To verify user is able to see Clinician column on table on selecting area checkbox from Show Column field on Rev By Clinician tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Rev By CLinician tab ");
		dashboardpage.onClickRevByClinicianTab();
		System.out.println("Select Date check box from show field");
		driver.findElement(By.xpath(dashboardpage.showClinicianColumnLocator)).click();
		Assert.assertTrue(dashboardpage.getClinicianColumnOnTableApptSummaryTab(), true);
	}
	
	
	@Test
	public void testVerifyPatientColumnVisiblityOnTableOfRevByClinicianTab()
	{
		System.out.println("DEBUG: To verify user is able to see Patient column on table on selecting area checkbox from Show Column field on Rev By Clinician tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Rev By CLinician tab ");
		dashboardpage.onClickRevByClinicianTab();
		System.out.println("Select Patient check box from show field");
	     dashboardpage.onClickShowColumnPateintOption();
		Assert.assertTrue(dashboardpage.getPatientColumnOnTable(), true);
	}
	
	@Test
	public void testVerifyAreaFilterVisiblityOnRevByClinicianTab()
	{
		System.out.println("DEBUG: To verify user is able to see Area Filter on Rev By Clinician tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Rev By CLinician tab ");
		dashboardpage.onClickRevByClinicianTab();
		Assert.assertTrue(dashboardpage.getRevByClinicianTabAreaFilterLocator(), true);
	}
	
	@Test
	public void testVerifyDownloadCSVButtonVisiblityOnRevByClinicianTab()
	{
		System.out.println("DEBUG: To verify user is able to see Download CSV button on Rev By Clinician tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Rev By CLinician tab ");
		dashboardpage.onClickRevByClinicianTab();
		Assert.assertTrue(dashboardpage.getDownloadCSVLocator(), true);
	}
	
	@Test
	public void testVerifyDateFilterVisiblityOnRevByClinicianTab()
	{
		System.out.println("DEBUG: To verify user is able to see Date Filter on Rev By Clinician tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Rev By CLinician tab ");
		dashboardpage.onClickRevByClinicianTab();
		Assert.assertTrue(dashboardpage.getDateFilterLocator(), true);
	}
	

	@Test
	public void testVerifyDateFilterVisiblityOnPaymentCollectionTab()
	{
		System.out.println("DEBUG: To verify user is able to see Date filter on Payment Collection tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Payment Collection tab ");
		dashboardpage.onClickPaymentCollectionTab();
		Assert.assertTrue(dashboardpage.getDateFilterLocator(), true);
	}
	

	@Test
	public void testVerifyAreaFilterVisiblityOnPaymentCollectionTab()
	{
		System.out.println("DEBUG: To verify user is able to see Area filter on Payment Collection tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Payment Collection tab ");
		dashboardpage.onClickPaymentCollectionTab();
		Assert.assertTrue(dashboardpage.getPaymentCollectionTabAreaFilterLocator(), true);
	}
	

	@Test
	public void testVerifyShowDateColumnVisiblityOnPaymentCollectionTab()
	{
		System.out.println("DEBUG: To verify user is able to see Show Date Column on Payment Collection tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Payment Collection tab ");
		dashboardpage.onClickPaymentCollectionTab();
		Assert.assertTrue(dashboardpage.getReportDateColumnOnTableApptSummaryTab(), true);
	}
	
	@Test
	public void testVerifyShowAreaColumnVisiblityOnPaymentCollectionTab()
	{
		System.out.println("DEBUG: To verify user is able to see Show Area Column on Payment Collection tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Payment Collection tab ");
		dashboardpage.onClickPaymentCollectionTab();
		Assert.assertTrue(dashboardpage.getShowAreaColumnLocator(), true);
	}
	
	@Test
	public void testVerifyClinicianColumnVisiblityOnPaymentCollectionTab()
	{
		System.out.println("DEBUG: To verify user is able to see Clinician Column on Payment Collection tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Payment Collection tab ");
		dashboardpage.onClickPaymentCollectionTab();
		Assert.assertTrue(dashboardpage.getShowClinicianColumnLocator(), true);
	}
	
	
	@Test
	public void testVerifyShowPatientColumnVisiblityOnPaymentCollectionTab()
	{
		System.out.println("DEBUG: To verify user is able to see Show Patient Column on Payment Collection tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Payment Collection tab ");
		dashboardpage.onClickPaymentCollectionTab();
		dashboardpage.onClickShowColumnPateintOption();
		Assert.assertNotNull(dashboardpage.getPatientColumnOnTable());
	}
	
	@Test
	public void testVerifyDownloadCSVButtonVisiblityOnPaymentCollectionTab()
	{
		System.out.println("DEBUG: To verify user is able to see Show Area Column on Payment Collection tab");
		System.out.println("Login to application");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(2);
		homepage.openDashBoardPage();
		System.out.println("Click on Payment Collection tab ");
		dashboardpage.onClickPaymentCollectionTab();
		Assert.assertNotNull(dashboardpage.getDownloadCSVLocator());
	}
	
}
