package com.qa.tests.ui.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;







import com.qa.tests.common.GlobalConstants.AREA;
import com.qa.tests.common.GlobalConstants.BRAND;
import com.qa.tests.common.GlobalConstants.GENDER;
import com.qa.tests.common.GlobalConstants.LOCALITY;
import com.qa.tests.common.GlobalConstants.SALUTATION;
import com.qa.tests.common.GlobalConstants.SERVICE;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.common.RandomUtil;
import com.qa.tests.ui.common.AppointmentModal;
import com.qa.tests.ui.common.FindClinicianModal;
import com.qa.tests.ui.common.PatientModal;
//import com.qa.tests.ui.common.ServiceModal;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.AppointmentPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.PatientProfile;
import com.qa.tests.ui.pages.PatientsPage;
import com.qa.tests.ui.pages.ProfessionalPage;



public class AppointmentTest extends TestBase {

	AppointmentPage appointmentpage;
	LoginPage loginpage;
	HomePage homepage;
	PatientsPage patientpage;
	ProfessionalPage professionalpage;
	PatientProfile patientprofilepage;
	public String patientname ="testPreferences";
	public String appointmentID = "35955";
	public final String userName = "qatest@test.com";
	public final String passWord ="flower";
	String fromTime ="";
	String toTime = "";

	public AppointmentTest() {
		super();
		// TODO Auto-generated constructor stub
	}


	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		appointmentpage = PageFactory.initElements(driver, AppointmentPage.class);
		patientpage = PageFactory.initElements(driver, PatientsPage.class);
		patientprofilepage = PageFactory.initElements(driver, PatientProfile.class);
		professionalpage = PageFactory.initElements(driver, ProfessionalPage.class);
	}

	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}

	@Test
	public void testVerifyOnClickAppointmentOptionsAppointmentScreenVisibility()
	{
		System.out.println("To Verify Appointment screen will display");
		System.out.println("DEBUG: Login to the application");
		loginpage.doLogin(userName, passWord);
		GlobalUtil.wait(3);
		System.out.println("DEBUG: Click on Appointment navigation bar");
		homepage.openAppointmentPage();
		Assert.assertTrue(appointmentpage.getAppointmentMainScreen(),true);
	}
	
	@Test
	public void testVerifyAppointmentScreen()
	{
		System.out.println("To Verify Appointment screen will display");
		System.out.println("DEBUG: Login to the application");
		loginpage.doLogin(userName, passWord);
		GlobalUtil.wait(3);
		System.out.println("DEBUG: Click on Appointment navigation bar");
		homepage.openAppointmentPage();
		Assert.assertTrue(appointmentpage.getAppointmentMainScreen(),true);

	}

	@Test
	public void testVerifyAllTabAppointments()
	{
		System.out.println("To Verify All Tab on Appointment screen");
		loginpage.doLogin(userName, passWord);
		GlobalUtil.wait(3);
		homepage.openAppointmentPage();
		GlobalUtil.wait(5);
		appointmentpage.onClickAllTab();
		Assert.assertTrue(appointmentpage.getAllTab(),true);

	}
	

	@Test
	public void testVerifyUpcomingTabAppointments()
	{
		System.out.println("To Verify Upcoming Tab on Appointment screen");
		loginpage.doLogin(userName, passWord);
		GlobalUtil.wait(3);
		homepage.openAppointmentPage();
		GlobalUtil.wait(5);
		appointmentpage.onClickUpcomingTabs();
		Assert.assertTrue(appointmentpage.getUpcomingTab(),true);
	}


	@Test
	public void testVerifyFirstVisitTabAppointments()
	{
		System.out.println("To Verify First Visit Tab visibility on Appointment screen");
		System.out.println("DEBUG: Login to the application");
		loginpage.doLogin(userName, passWord);
		GlobalUtil.wait(3);
		homepage.openAppointmentPage();
		GlobalUtil.wait(5);
		appointmentpage.onClickFirstVisitTab();
		Assert.assertTrue(appointmentpage.getFirstVisitTab(),true);

	}

	@Test
	public void testVerifyFindClinicianAvailabilityTabAppointments()
	{
		System.out.println("To Verify Find Clinician Availability Tab on Appointment screen");
		loginpage.doLogin(userName, passWord);
		GlobalUtil.wait(3);
		homepage.openAppointmentPage();
		GlobalUtil.wait(5);
		appointmentpage.onClickFindAvailableClinicianTab();
		Assert.assertTrue(appointmentpage.getFindAvailableClinicianTab(),true);
	}

	@Test
	public void testVerifyMyTeamAppointmentScreenVisibility()
	{

		System.out.println("To Verify My Team Appointment Screen visiblity on Appointment screen");
		loginpage.doLogin(userName, passWord);
		GlobalUtil.wait(3);
		homepage.openAppointmentPage();
		GlobalUtil.wait(5);
		appointmentpage.onClickMyAppointmentTabs();
		Assert.assertNotNull(appointmentpage.getMyTeamsAppointmentTab());
	}
	
	@Test
	public void testVerifySMEVisitScreenVisibility()
	{
		System.out.println("To Verify SME Visit Screen visiblity on Appointment screen");
		loginpage.doLogin(userName, passWord);
		GlobalUtil.wait(3);
		homepage.openAppointmentPage();
		GlobalUtil.wait(5);
		appointmentpage.onClickSMEVisitTab();
		Assert.assertNotNull(appointmentpage.getSMEVisitTabLocator());
	}

	//@Test
	public void testVerifyAppointmentsForToday()
	{
		System.out.println("DEBUG: To Verify user is able to see all the appointmenst for current date");
		System.out.println("DEBUG: Login to the application");
		loginpage.doLogin(userName, passWord);
		GlobalUtil.wait(3);
		System.out.println("DEBUG: Click on Appointment navigation bar");
		driver.findElement(By.xpath(homepage.appointmentNavBarLocator)).click();
		appointmentpage.searchbyTodayDateFilter();


	}

	//@Test
	public void testVerifyAppointmentsForTomorrrow()
	{
		System.out.println("DEBUG: To Verify user is able to see all the appointmenst for current date");
		System.out.println("DEBUG: Login to the application");
		loginpage.doLogin(userName, passWord);
		GlobalUtil.wait(3);
		System.out.println("DEBUG: Click on Appointment navigation bar");
		driver.findElement(By.xpath(homepage.appointmentNavBarLocator)).click();
		appointmentpage.searchbyTomorrowDateFilter();
	}

	//@Test
	public void testVerifyAppointmentsForYesterday()
	{
		System.out.println("DEBUG: To Verify user is able to see all the appointmenst for current date");
		System.out.println("DEBUG: Login to the application");
		loginpage.doLogin(userName, passWord);
		GlobalUtil.wait(3);
		System.out.println("DEBUG: Click on Appointment navigation bar");
		driver.findElement(By.xpath(homepage.appointmentNavBarLocator)).click();
		appointmentpage.searchbyYesterdayDateFilter();
	}

	//@Test
	public void testVerifyUpcomingAppointments()
	{
		System.out.println("DEBUG: To Verify user is able to see all the appointmenst for current date");
		System.out.println("DEBUG: Login to the application");
		loginpage.doLogin(userName, passWord);
		GlobalUtil.wait(3);
		System.out.println("DEBUG: Click on Appointment navigation bar");
		driver.findElement(By.xpath(homepage.appointmentNavBarLocator)).click();
		appointmentpage.searchbyUpcomingDateFilter();
	}

	

	@Test
	public void testVerifyProfessionFieldsOptions()
	{

	System.out.println("DEBUG: To Verify options available in Profession filter");
	System.out.println("DEBUG: Login to the application");
	loginpage.doLogin(userName, passWord);
	GlobalUtil.wait(3);
	System.out.println("DEBUG: Click on Appointment navigation bar");
	driver.findElement(By.xpath(homepage.appointmentNavBarLocator)).click();
	System.out.println("DEBUG: Check Options for Profession field");
	WebElement dropDown = driver.findElement(By.xpath(appointmentpage.professionalFilter));
	Select sel = new Select(dropDown);
	List<WebElement> values = sel.getOptions();
	for(int i = 0; i < values.size(); i++)
	{
	   System.out.println(values.get(i).getText());
	}
	}

	@Test
	public void testVerifyReferrerFieldsOptions()
	{

	System.out.println("DEBUG: To Verify options available in Referrer filter");
	System.out.println("DEBUG: Login to the application");
	loginpage.doLogin(userName, passWord);
	GlobalUtil.wait(3);
	System.out.println("DEBUG: Click on Appointment navigation bar");
	driver.findElement(By.xpath(homepage.appointmentNavBarLocator)).click();
	System.out.println("DEBUG: Check Options for Referrer field");
	WebElement dropDown = driver.findElement(By.xpath(appointmentpage.referrerFilter));
	Select sel = new Select(dropDown);
	List<WebElement> values = sel.getOptions();
	for(int i = 0; i < values.size(); i++)
	{
	   System.out.println(values.get(i).getText());
	}
	}

	 @Test
	 public void testVerifySearchByPatientName()
	 {
		 System.out.println("DEBUG: To Verify that user is able to search the appointments by Patient name");
		 System.out.println("DEBUG: Login to the application");
		 loginpage.doLogin(userName, passWord);
		 GlobalUtil.wait(3);
		 System.out.println("DEBUG: Click on Appointment navigation bar");
		 driver.findElement(By.xpath(homepage.appointmentNavBarLocator)).click();
		 appointmentpage.searchPatientByName(patientname);
		 System.out.println("DEBUG: Verify Patient details searched..");
		 Assert.assertTrue(appointmentpage.patientnameLocator, true);


	 }


	 @Test
	 public void testVerifySearchByAppointmentID()
	 {
		 System.out.println("DEBUG: To Verify that user is able to search the appointments by appointment ID");
		 System.out.println("DEBUG: Login to the application");
		 loginpage.doLogin(userName, passWord);
		 GlobalUtil.wait(3);
		 System.out.println("DEBUG: Click on Appointment navigation bar");
		 driver.findElement(By.xpath(homepage.appointmentNavBarLocator)).click();
		 appointmentpage.searchPatientByID(appointmentID);
		 System.out.println("DEBUG: Verify Patient details searched..");
		 Assert.assertTrue(appointmentpage.appointmentIDLocator, true);

	 }


	 //@Test
	 public void testVerifyFindClinicianAvailable()
	 {
		 System.out.println("DEBUG: Verify that user is able to get the Find Available Clinician details");
		 loginpage.doLogin(userName, passWord);
		 homepage.openAppointmentPage();
		 FindClinicianModal findClinicianModal = getClinicianAvailablityDetails();
		 findClinicianModal.setService(SERVICE.DoctorVisit);
		 findClinicianModal.setGender(GENDER.Male);
		 findClinicianModal.setArea(AREA.Bangalore);
		 findClinicianModal.setPinCode("560076");
		 findClinicianModal.setLocality(LOCALITY.Bilekahalli);
		 appointmentpage.getClinicianAvailableDetails(findClinicianModal);
		 System.out.println("Read data from table");
		 //appointmentpage.readDataFromFindClinicianTable();
		 appointmentpage.availableClinicianTabledata();
		// Assert.assertTrue(message, condition);
		 
		 
	 }
	
	// @Test
	 public void testVerifyAssignProfessional()
	 {
		 System.out.println("DEBUG: Verify that user is able to assign the Professional to Patient");
		 loginpage.doLogin(userName, passWord);
		 homepage.openPatientListPage();
		 GlobalUtil.wait(5);
		 System.out.println("Assign Professional");
		 appointmentpage.getAssignProfessional();
		 GlobalUtil.wait(5);
		 System.out.println("Read Data");
		 appointmentpage.assignprofessionaltabledata();
	 }
	 
	 //@Test
	 public void testVerifySameDataAvailibiltyOnAssignProfTableAndFindAvailableTable()
	 {
		 System.out.println("DEBUG: Verify that Find Available Clinician Table and Assign Professional table both have same data");
		 loginpage.doLogin(userName, passWord);
		 appointmentpage.getAssignProfessional();
		 appointmentpage.readDataFromAssignProfesssionalScreen();
		 appointmentpage.assignprofessionaltabledata();
		 appointmentpage.getAvailableClinicianOnFindAvailableTab();
		 appointmentpage.availableClinicianTabledata();
		
		 //compare data table
		 if(appointmentpage.readDataFromAssignProfesssionalScreen().equals(appointmentpage.readDataFromFindClinicianTable()))
		 {
			 System.out.println("All the data is same");
		 }
		 else 
		 {
			System.out.println("Check your data...Data is not same in both tables!");
		 }
		
		 
		 
	 }
	 
	 
	// @Test
	 @SuppressWarnings("static-access")
	public void testVerifyAddAppointment()
	 {
		 System.out.println("Add Appointment..");
		 loginpage.doLogin(userName, passWord);
		 homepage.openPatientListPage();
		 GlobalUtil.wait(5);
		 PatientModal patientModal = new PatientModal();
	    // patientModal.getPatientDetails(BRAND.Portea,GENDER.Male,SALUTATION.Mr);
		 GlobalUtil.wait(5);
		 patientpage.addPatient(patientModal);
		 GlobalUtil.wait(10);
		 patientpage.getAddedPatient(patientModal);
		 GlobalUtil.wait(10);
		 
		 System.out.println("Add Services");
		 appointmentpage.subscribeServices();
		 
		 System.out.println("Confirm Services Info");
		 appointmentpage.confirmServiceInfo();
		 
		 System.out.println("Add dates to Calendar");
		 appointmentpage.addAppointmentDatesFromCalendar();
		 
		 Assert.assertNotNull(driver.findElement(By.xpath("//td[contains(text(),'None Assigned' )]")));
		 
	 }
	 
	 @SuppressWarnings("static-access")
	@Test
	 public void testVerifyAddAppointmentForManipalPatient()
	 {
		 System.out.println("Add Appointment..");
		 loginpage.doLogin(userName, passWord);
		 homepage.openPatientListPage();
		 GlobalUtil.wait(5);
		 PatientModal patientModal = new PatientModal();
	     //patientModal.getPatientDetails(BRAND.Portea,GENDER.Male,SALUTATION.Mr);
		 GlobalUtil.wait(5);
		 patientpage.getAddedPatient(patientModal);
		 GlobalUtil.wait(10);
		 
		 System.out.println("Add Services");
		 appointmentpage.subscribeServices();
		 
		 System.out.println("Confirm Services Info");
		 appointmentpage.confirmServiceInfo();
		 
		 System.out.println("Add dates to Calendar");
		 appointmentpage.addAppointmentDatesFromCalendar();
		 
		 Assert.assertNotNull(driver.findElement(By.xpath("//td[contains(text(),'None Assigned' )]")));
		 
	 }
	 
	// @Test
		public void testVerifyAppointmentForOvertime()
		{
			
		}
		
	//@Test
		public void testVerifyAppointmentForChangeWorkTime()
		{
			
		}
		
		
	// @Test 
	 public void testVerifyErrorOnAddingAppointmentOutOfWorkingTime()
	 {
		 
	 }
	 
	// @Test 
	 public void testVerifyErrorOnAddingAppointmentOnHoliday()
	 {
		 
	 }
	 
	// @Test 
	 public void testVerifyErrorOnChangingWorktimeOnApppointmentTime()
	 {
		 
	 }
	 
	// @Test 
	 public void testVerifyErrorOnApplyingLeaveOnApppointmentDay()
	 {
		 
	 }
	 //@Test
	 @SuppressWarnings("static-access")
	public void testVerifyAddAppointmentOnChangeTime()
	 {
		 System.out.println("Verify that user is able to make an appointment for Change time");
		 loginpage.doLogin(userName, passWord);
		 System.out.println("Add Professional");
		 //professionalpage.addedProfessionalNameLocator;
		 professionalpage.addChangeTime(fromTime, toTime);
		 System.out.println("Add patient");
		 PatientModal patientModal = new PatientModal();
	    patientModal.getPatientDetails(BRAND.Portea,GENDER.Male,SALUTATION.Mr,LOCALITY.DomlurBusStand);
		 System.out.println("Add Appointment ");
		 AppointmentModal appointmentModal = getAppointmentDetails();
		 patientpage.addAppointment(appointmentModal);
		 
	 }
	 
	 //@Test
	 @SuppressWarnings("static-access")
	public void testVerifyAddAppointmentForOverTime()
	 {
		 System.out.println("Verify that user is able to make an appointment for Over time");
		 loginpage.doLogin(userName, passWord);
		 System.out.println("Add Professional");
		 //professionalpage.addedProfessionalNameLocator;
		 professionalpage.addOverTime(fromTime, toTime);
		 System.out.println("Add patient");
		 PatientModal patientModal = new PatientModal();
	    patientModal.getPatientDetails(BRAND.Portea,GENDER.Male,SALUTATION.Mr, LOCALITY.DomlurBusStand);
		 System.out.println("Add Appointment ");
		 AppointmentModal appointmentModal = getAppointmentDetails();
		 patientpage.addAppointment(appointmentModal);
	 }
	 
	 //Modals
//	 private PatientModal getPatientDetails(){
//			PatientModal patientModal = new PatientModal();
//			patientModal.setSalutation(patientModal.getSalutation());
//			patientModal.setFirstName(GlobalUtil.getRandomName(8));
//			patientModal.setLastName(GlobalUtil.getRandomName(8));
//			patientModal.setMobileNumber(RandomUtil.generateRandomMobileNo());
//			patientModal.setLoginEmail(GlobalUtil.getRandomName(4) + "@portea.qa");
//			patientModal.setPinCode("560076");
//			patientModal.setGender(patientModal.getGender());
//			patientModal.setBrand(patientModal.getBrand());
//			patientModal.setLocality(patientModal.getLocality());
//			return patientModal;
//		}
//	 
	
	 private AppointmentModal getAppointmentDetails(){
			AppointmentModal appointmentModal = new AppointmentModal();
			appointmentModal.setSelectPackage(appointmentModal.getSelectPackage());
			appointmentModal.setClinicianPref(appointmentModal.getClinicianPref());
			appointmentModal.setViewCalendar(appointmentModal.getViewCalendar());
			appointmentModal.setTimings(appointmentModal.getTimings());
			appointmentModal.setDuration(appointmentModal.getDuration());
			appointmentModal.setDayContent(GlobalUtil.getCurrentDate());
			return appointmentModal;
		}
	 
	 
	 private FindClinicianModal getClinicianAvailablityDetails(){
		 FindClinicianModal findClinicianModal = new FindClinicianModal();
		 findClinicianModal.setService(findClinicianModal.getService());
		 findClinicianModal.setGender(findClinicianModal.getGender());
		 findClinicianModal.setAppointmentDate("2014-10-25 19:30:00");
		 findClinicianModal.setDuration("60");
		 findClinicianModal.setPinCode(findClinicianModal.getPinCode());
		 findClinicianModal.setLocality(findClinicianModal.getLocality());
		 findClinicianModal.setArea(findClinicianModal.getArea());
		// findClinicianModal.setLocation(findClinicianModal.getLocation());
			
			return findClinicianModal;
		}
	
//	 private ServiceModal getServiceDetails(){
//			ServiceModal serviceModal = new ServiceModal();
//			serviceModal.setServiceName(serviceModal.getServiceName());
//			serviceModal.setAppointmentType(serviceModal.getAppointmentType());
//			serviceModal.setFirstVisitPrice(serviceModal.getFirstVisitPrice());
//			serviceModal.setSecondVisitPrice(serviceModal.getSecondVisitPrice());
//			serviceModal.setNoOfVisits(serviceModal.getNoOfVisits());
//			serviceModal.setOfferedPrice(serviceModal.getOfferedPrice());
//			return serviceModal;
//		}
//		
	


}
