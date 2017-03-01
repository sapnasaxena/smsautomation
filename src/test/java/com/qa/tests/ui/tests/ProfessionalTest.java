package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.ProfessionalPage;

public class ProfessionalTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	ProfessionalPage professionalpage;
	public static final String username = "qatest@test.com";
	public static final String password ="flower";
	String fromTime ="";
	String toTime ="";
	
	
	public ProfessionalTest() {
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		professionalpage = PageFactory.initElements(driver, ProfessionalPage.class);
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	
	@Test
	public void testVerifyAllProfessionalTabVisibility()
	{
	System.out.println("To verify that user is able to see 'All Professional' tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getAllProfessionalsTab(), true);
	
	}
	
	@Test
	public void testVerifyProfessionalTrackerTabVisibility()
	{
	System.out.println("To verify that user is able to see 'Professional Tracker' tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getProfessionalTrackerTabLocator(), true);
	}
	
	@Test
	public void testVerifyTravelReportTabVisibility()
	{
	System.out.println("To verify that user is able to see 'Travel Report' tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getTravelReportTab(), true);
	}
	
	@Test
	public void testVerifyMyTeamTabVisibility()
	{
	System.out.println("To verify that user is able to see 'My Team' tab on Professional Screen");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getMyTeamTabLocator(), true);
	}
	
	
	@Test
	public void testVerifyCallRecordTabVisibility()
	{
	System.out.println("To verify that user is able to see 'Call Record' tab on Professional Screen");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getCallRecordTabLocator(), true);
	}
	
	@Test
	public void testVerifyStatusFilterVisibilityOnProfessionalsTab()
	{
	System.out.println("To verify that user is able to see Status filter Professional Screen");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getStatusFilterOnProfessionalTabLocator(), true);
	}
	
	@Test
	public void testVerifyLanguageFilterVisibilityOnProfessionalsTab()
	{
	System.out.println("To verify that user is able to see Language filter Professional Screen");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getLanguageFilterOnProfessionalTabLocator(), true);
	}
	
	@Test
	public void testVerifyAndroidFilterVisibilityOnProfessionalsTab()
	{
	System.out.println("To verify that user is able to see Android filter Professional Screen");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getAndroidFilterOnProfessionalTabLocator(), true);
	}
	
	@Test
	public void testVerifyTypeFilterVisibilityOnProfessionalsTab()
	{
	System.out.println("To verify that user is able to see Type filter Professional Screen");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getTypeFilterOnProfessionalTabLocator(), true);
	}
	
	@Test
	public void testVerifySearchTextBoxVisibilityOnProfessionalsTab()
	{
	System.out.println("To verify that user is able to see Search text box on Professional Screen");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getSearchTextBoxOnProfessionalTabLocator(), true);
	}
	
	@Test
	public void testVerifySearchButtonVisibilityOnProfessionalsTab()
	{
	System.out.println("To verify that user is able to see Search button on Professional Screen");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getSearchButtonOnProfessionalTabLocator(), true);
	}
	
	@Test
	public void testVerifyProfTimingCheckBoxVisibilityOnProfessionalsTab()
	{
	System.out.println("To verify that user is able to see Prof timing Check box on Professional Screen");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getProfTimingCheckBoxOnProfessionalTabLocator(), true);
	}
	
	//Functional Test Scenarios//
	
	@Test
	public void testVerifyOnSelectingProfTimingOnProfessionalsTab()
	{
	System.out.println("To verify that on selecting Prof Timings check box, user is able to see Professionals weekly timings on table on Professional Screen");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.selectProfTimingOnProfessionalsTab();
	Assert.assertTrue(professionalpage.getprofTimingMondayOnProfessionalTabLocator(), true);
	Assert.assertTrue(professionalpage.getprofTimingTuesdayOnProfessionalTabLocator(), true);
	Assert.assertTrue(professionalpage.getprofTimingWednesdayOnProfessionalTabLocator(), true);
	Assert.assertTrue(professionalpage.getprofTimingThursdayOnProfessionalTabLocator(), true);
	Assert.assertTrue(professionalpage.getprofTimingFrisdayOnProfessionalTabLocator(), true);
	Assert.assertTrue(professionalpage.getprofTimingSaturdayOnProfessionalTabLocator(), true);
	Assert.assertTrue(professionalpage.getprofTimingSundayOnProfessionalTabLocator(), true);
	}
	
	@Test
	public void testVerifyOnNotSelectingProfTimingOnProfessionalsTab()
	{
	System.out.println("To verify that on selecting Prof Timings check box, user is able to see Professionals weekly timings on table on Professional Screen");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.unselectProfTimingOnProfessionalsTab();
	Assert.assertFalse(professionalpage.getprofTimingMondayOnProfessionalTabLocator(), true);
	Assert.assertFalse(professionalpage.getprofTimingTuesdayOnProfessionalTabLocator(), true);
	Assert.assertFalse(professionalpage.getprofTimingWednesdayOnProfessionalTabLocator(), true);
	Assert.assertFalse(professionalpage.getprofTimingThursdayOnProfessionalTabLocator(), true);
	Assert.assertFalse(professionalpage.getprofTimingFrisdayOnProfessionalTabLocator(), true);
	Assert.assertFalse(professionalpage.getprofTimingSaturdayOnProfessionalTabLocator(), true);
	Assert.assertFalse(professionalpage.getprofTimingSundayOnProfessionalTabLocator(), true);
	}
	
	@Test
	public void testVerifyOnSelectingStatusUnavailableOnProfessionalsTab()
	{
	System.out.println("To verify that on selecting Status as Unvailable, user is able to see Unvaiable Professionals list on table of Professionals");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getStatusUnavailableColumnLocatorOnProfessionalTab(), true);

	}
	
	
	@Test
	public void testVerifyOnSelectingStatusAvailableOnProfessionalsTab()
	{
	System.out.println("To verify that on selecting Status as Available, user is able to see only available Professionals list on table of Professionals");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getStatusAvailableColumnLocatorOnProfessionalTab(), true);
	}
	
	@Test
	public void testVerifyOnSelectingStatusInactiveOnProfessionalsTab()
	{
	System.out.println("To verify that on selecting Status as Inactive, user is able to see only Inactive Professionals list on table of Professionals");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getStatusInactiveColumnLocatorOnProfessionalTab(), true);

	}
	@Test
	public void testVerifyOnSelectingDoctorTypeOnProfessionalsTab()
	{
	System.out.println("To verify that on selecting type as Doctor, user is able to see only Doctor Professionals records on table of Professionals");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getTypeSelectedDoctorColumnLocatorOnProfessionalTab(), true);

	}
	
	@Test
	public void testVerifyOnSelectingPhysiotherapistTypeOnProfessionalsTab()
	{
	System.out.println("To verify that on selecting type as Physiotherapists, user is able to see only Physiotherapist Professionals records on table of Professionals");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getTypeSelectedPhysiotherapistColumnLocatorOnProfessionalTab(), true);
	}
	
	@Test
	public void testVerifyOnSelectingNursingAttendantTypeOnProfessionalsTab()
	{
	System.out.println("To verify that on selecting type as Nursing Attendant, user is able to see only Nursing Attendant Professionals records on table of Professionals");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getTypeSelectedNursingColumnLocatorOnProfessionalTab(), true);
	}
	
	@Test
	public void testVerifyOnSelectingNOAndroidOnProfessionalsTab()
	{
	System.out.println("To verify that on selecting Android as NO, user is able to see only records of Professionals who don't have Android mobile phone on table of Professionals");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getAndroidSelectedNOColumnLocatorOnProfessionalTab(), true);
	}
	
	@Test
	public void testVerifyOnSelectingYESAndroidOnProfessionalsTab()
	{
	System.out.println("To verify that on selecting Android as YES, user is able to see only records of Professionals who have Android mobile phone on table of Professionals");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	Assert.assertTrue(professionalpage.getAndroidSelectedYESColumnLocatorOnProfessionalTab(), true);
	}
	
	@Test
	public void testVerifySearchFunctionalityOnProfessionalsTab()
	{
	System.out.println("To verify that user is able to search any record by Professionals Name");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.searchRecordByProfName();
	Assert.assertTrue(professionalpage.getSearchedRecordsByProfNameListLocator(), true);
	}
	
	@Test
	public void testVerifyOnClickEditButtonOfProfessionalTabs()
	{
	System.out.println("To verify that user is able to see the Edit Professional Screen on Click Edit button");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.clickOnEditButton();
	Assert.assertTrue(professionalpage.getEditScreenLocator(), true);
	}
	
	@Test
	public void testVerifyOnClickSendSMSButtonOfProfessionalTab()
	{
	System.out.println("To verify that user is able to see the Send Message Screen on Click Send SMS button");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.clickonSendSMSButton();
	driver.switchTo().window(professionalpage.sendSMSScreenLocator);
	Assert.assertTrue(professionalpage.getSendSMSScreenLocator(), true);
	}
	
	
	@Test
	public void testVerifyTableColumnsOnTravelReportTab()
	{
	System.out.println("To verify that user is able to see table on Travel Report tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openTravelReportTab();
	Assert.assertTrue(professionalpage.getTravelReportDateColumnLocator(), true);
	Assert.assertTrue(professionalpage.getTravelReportNameColumnLocator(), true);
	Assert.assertTrue(professionalpage.getTravelReportTotalDistanceTravelledColumnLocator(), true);
	Assert.assertTrue(professionalpage.getTravelReportAvgDistanceColumnLocator(), true);
	Assert.assertTrue(professionalpage.getTravelReportAvgWaitTimeColumnLocator(), true);
	Assert.assertTrue(professionalpage.getTravelReportMaxWaitTimeColumnLocator(), true);
	Assert.assertTrue(professionalpage.getTravelReportNoOfAppointmentsColumnLocator(), true);
	}
	
	
	@Test
	public void testVerifySearchTextBoxOnProfessionalsTrackerTab()
	{
	System.out.println("To verify that user is able to see the search text box on Professional tracker tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openProfessionalTrackerTab();
	Assert.assertTrue(professionalpage.getSearchTextBoxLocatorOnProfTrackerTab(), true);
	}
	
	@Test
	public void testVerifySearchButtonOnProfessionalsTrackerTab()
	{
	System.out.println("To verify that user is able to see the search button on Professional tracker tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openProfessionalTrackerTab();
	Assert.assertTrue(professionalpage.getSearchButtonLocatorOnProfTrackerTab(), true);
	}
	
	
	@Test
	public void testVerifyAndroidAppFilterVisibilityOnProfessionalsTrackerTab()
	{
	System.out.println("To verify that user is able to see the Android app filter on Professional tracker tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openProfessionalTrackerTab();
	Assert.assertTrue(professionalpage.getAndroidAppFilterLocator(), true);
	}
	

	@Test
	public void testVerifyLanguageFilterVisibilityOnMyTeamTab()
	{
	System.out.println("To verify that user is able to see the Language filter on My Team tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openMyTeamTab();;
	Assert.assertTrue(professionalpage.getLanguageFilterOnProfessionalTabLocator(), true);
	}
	
	@Test
	public void testVerifyTypeFilterVisibilityOnMyTeamTab()
	{
	System.out.println("To verify that user is able to see the Type filter on My Team tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openMyTeamTab();;
	Assert.assertTrue(professionalpage.getTypeFilterOnProfessionalTabLocator(), true);
	}
	
	@Test
	public void testVerifyAndroidFilterVisibilityOnMyTeamTab()
	{
	System.out.println("To verify that user is able to see the Android filter on My Team tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openMyTeamTab();;
	Assert.assertTrue(professionalpage.getAndroidFilterOnProfessionalTabLocator(), true);
	}
	
	@Test
	public void testVerifySearchTextBoxVisibilityOnMyTeamTab()
	{
	System.out.println("To verify that user is able to see the Search text box on My Team tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openMyTeamTab();;
	Assert.assertTrue(professionalpage.getSearchTextBoxOnProfessionalTabLocator(), true);
	}
	
	@Test
	public void testVerifySearchButtonVisibilityOnMyTeamTab()
	{
	System.out.println("To verify that user is able to see the Search Button on My Team tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openMyTeamTab();;
	Assert.assertTrue(professionalpage.getSearchButtonOnProfessionalTabLocator(), true);
	}
	
	@Test
	public void testVerifyTableColumnsVisibilityOnMyTeamTab()
	{
	System.out.println("To verify that user is able to see the Table columns as Name, Type, Mobile, Gender, Area, Employee type, Locations, Status, Edit, Send SMS on My Team tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openMyTeamTab();;
	Assert.assertTrue(professionalpage.getNameColumnLocatorOnMyTeamTab(), true);
	Assert.assertTrue(professionalpage.getAreaColumnLocatorOnMyTeamTab(),true);
	Assert.assertTrue(professionalpage.getTypeColumnLocatorOnMyTeamTab(),true);
	Assert.assertTrue(professionalpage.getMobileColumnLocatorOnMyTeamTab(),true);
	Assert.assertTrue(professionalpage.getLocationsColumnLocatorOnMyTeamTab(),true);
	Assert.assertTrue(professionalpage.getGenderColumnLocatorOnMyTeamTab(),true);
	Assert.assertTrue(professionalpage.getEmployeeTypeColumnLocatorOnMyTeamTab(),true);
	Assert.assertTrue(professionalpage.getLocationsColumnLocatorOnMyTeamTab(),true);
	Assert.assertTrue(professionalpage.getStatusColumnLocatorOnMyTeamTab(),true);
	Assert.assertTrue(professionalpage.getEditColumnLocatorOnMyTeamTab(),true);
	Assert.assertTrue(professionalpage.getSendSMSColumnLocatorOnMyTeamTab(),true);
	
	}
	
	@Test
	public void testVerifySearchButtonVisibilityOnCallRecordTab()
	{
	System.out.println("To verify that user is able to see the Search Button on Call Record tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openCallRecordTab();;
	Assert.assertTrue(professionalpage.getSearchButtonLocatorOnCallRecordTab(), true);
	}
	
	
	@Test
	public void testVerifySearchTextBoxVisibilityOnCallRecordTab()
	{
	System.out.println("To verify that user is able to see the Search Text Box on Call Record tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openCallRecordTab();
	Assert.assertTrue(professionalpage.getSearchTextBoxFilterLocatorOnCallRecordTab(), true);
	}
	
	
	@Test
	public void testVerifyCallerTypeFilterVisibilityOnCallRecordTab()
	{
	System.out.println("To verify that user is able to see the Caller type filter on Call Record tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openCallRecordTab();
	Assert.assertTrue(professionalpage.getCallerTypeFilterLocatorOnCallRecordTab(), true);
	}
	
	@Test
	public void testVerifyCallTypeFilterVisibilityOnCallRecordTab()
	{
	System.out.println("To verify that user is able to see the Call type filter on Call Record tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openCallRecordTab();
	Assert.assertTrue(professionalpage.getCallTypeFilterLocatorOnCallRecordTab(), true);
	}
	
	@Test
	public void testVerifyCallStatusFilterVisibilityOnCallRecordTab()
	{
	System.out.println("To verify that user is able to see the Call Status filter on Call Record tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openCallRecordTab();
	Assert.assertTrue(professionalpage.getCallStatusFilterLocatorOnCallRecordTab(), true);
	}
	
	@Test
	public void testVerifyDateFilterVisibilityOnCallRecordTab()
	{
	System.out.println("To verify that user is able to see the Date filter on Call Record tab");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openCallRecordTab();
	Assert.assertTrue(professionalpage.getDateFilterLocatorOnCallRecordTab(), true);
	}
	
	@Test
	public void testVerifyOnClickEditButtonOfMyTeamTabEditProfScreenVisibility()
	{
	System.out.println("To verify that user is able to see the Edit Professional Screen on Click Edit button");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openMyTeamTab();
	professionalpage.clickOnEditButton();
	Assert.assertTrue(professionalpage.getEditScreenLocator(), true);
	}
	
	@Test
	public void testVerifyOnClickSendSMSButtonOfMyTeamTabSendMessageScreenVisibility()
	{
	System.out.println("To verify that user is able to see the Send Message Screen on Click Send SMS button");
	loginpage.doLogin(username, password);
	homepage.openProfessionalPage();
	professionalpage.openMyTeamTab();
	professionalpage.clickonSendSMSButton();
	driver.switchTo().window(professionalpage.sendSMSScreenLocator);
	Assert.assertTrue(professionalpage.getSendSMSScreenLocator(), true);
	}
	
	@Test
	public void testVerifyAddWorkingTimings()
	{
		System.out.println("To verify that user is able to see the Send Message Screen on Click Send SMS button");
		loginpage.doLogin(username, password);
		homepage.openProfessionalPage();
		professionalpage.clickOnProfessionalName();
		professionalpage.openTimingsTab();
		professionalpage.addWorkTimings();
		Assert.assertTrue(professionalpage.getSuccessMessageForSavedTimingsLocator(), true);
	}
	
	@Test
	public void testVerifyAddOvertime()
	{
		System.out.println("To verify that user is able to see the Send Message Screen on Click Send SMS button");
		loginpage.doLogin(username, password);
		homepage.openProfessionalPage();
		professionalpage.clickOnProfessionalName();
		professionalpage.addOverTime(fromTime,toTime);
		Assert.assertTrue(professionalpage.getAddedTimeChangeTableLocator(),true);
	}
	
	@Test
	public void testVerifyAddChangeTime()
	{
		System.out.println("To verify that user is able to see the Send Message Screen on Click Send SMS button");
		loginpage.doLogin(username, password);
		homepage.openProfessionalPage();
		professionalpage.clickOnProfessionalName();
		professionalpage.addChangeTime(fromTime,toTime);
		Assert.assertTrue(professionalpage.getAddedTimeChangeTableLocator(),true);
	}
	
	@Test
	public void testVerifyLeaveApply()
	{
		System.out.println("To verify that user is able to see the Send Message Screen on Click Send SMS button");
		loginpage.doLogin(username, password);
		homepage.openProfessionalPage();
		professionalpage.clickOnProfessionalName();
		professionalpage.addLeave();
		Assert.assertTrue(professionalpage.getAddedTimeChangeTableLocator(),true);
	}
	
	@Test
	public void testVerifyUserCanSaveLocation()
	{
		System.out.println("To verify that user is able to see the Send Message Screen on Click Send SMS button");
		loginpage.doLogin(username, password);
		homepage.openProfessionalPage();
		professionalpage.clickOnProfessionalName();
		professionalpage.addLocation();
		Assert.assertTrue(professionalpage.getAddedLocationLocator(), true);
	}
	
	
	
}
