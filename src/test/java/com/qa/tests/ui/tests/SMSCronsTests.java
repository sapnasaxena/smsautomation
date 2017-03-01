package com.qa.tests.ui.tests;

import junit.framework.Assert;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalConstants.BRAND;
import com.qa.tests.common.GlobalConstants.GENDER;
import com.qa.tests.common.GlobalConstants.SALUTATION;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.common.RandomUtil;
import com.qa.tests.common.GlobalConstants.LOCALITY;
import com.qa.tests.ui.common.AppointmentModal;
import com.qa.tests.ui.common.CalendarModal;
import com.qa.tests.ui.common.FindClinicianModal;
import com.qa.tests.ui.common.PatientModal;
import com.qa.tests.ui.common.ServiceModal;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.AppointmentPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.PatientsPage;
import com.qa.tests.ui.pages.SMSPage;
//import com.thoughtworks.selenium.webdriven.commands.GetLocation;

public class SMSCronsTests extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	SMSPage smspage;
	AppointmentPage appointmentpage;
	PatientsPage patientpage;
	
	public String userName ="sapna.saxena@porteamedical.com";
	public String password ="123456";
	
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		smspage = PageFactory.initElements(driver, SMSPage.class);
		appointmentpage = PageFactory.initElements(driver, AppointmentPage.class);
		patientpage = PageFactory.initElements(driver, PatientsPage.class);
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	//@Test
	public void testVerifyLeadSMSByCallVisibilityForPorteaPatient()
	{
	System.out.println("Verify that portea patient receive SMS on contacting via call");
	
	}
	
	//@Test
	public void testVerifyLeadSMSByContactFormVisibilityForPorteaPatient()
	{
	System.out.println("Verify that portea patient receive SMS on contacting via contact form");
	
	
	}
	
	//@Test
	public void testVerifyLeadSMSByCallVisibilityForSpecificBrandPatient()
	{
	System.out.println("Verify that Specific brand Patient receive SMS on contacting via call ");
	}
	
	//@Test
	public void testVerifyLeadSMSByContactFormVisibilityForSpecificBrandPatient()
	{
	System.out.println("Verify that Specific brand Patient receive SMS on contacting via call ");
	}
	
	//@Test
	public void testVerifyCustomerFirstVisitServiceSMSVisibilityForPorteaPatient()
	{
	System.out.println("Verify that Portea patient is receiving SMS for first visit of service");
	loginpage.doLogin(userName, password);
	homepage.openPatientListPage();
	PatientModal patientModal = getPatientDetails();
	patientModal.setSalutation(SALUTATION.Mr);
	patientModal.setGender(GENDER.Male);
	patientModal.setBrand(BRAND.Portea);
	patientModal.setLocation(LOCALITY.DomlurBusStand);
	
	patientpage.addPatient(patientModal);
	
	AppointmentModal appointmentModal = getAppointmentDetails();
	appointmentpage.addAppointments("");
	appointmentpage.assignProfessional();
	patientpage.changeStatusFromPendingToSuccessful();
	
	//run cron
	driver.get("http://stageops.portea.com/croncontroller/firstAppointmentFeedback");
	
	//Check SMS on StageOps portal
	driver.get("http://stageops.portea.com");
	loginpage.doLogin(userName, password);
	homepage.openSMSPage();
	smspage.openPendingSMSTab();
	Assert.assertNotNull("");
	
	
	}
	
	//@Test
	public void testVerifyCustomerFirstVisitServiceSMSVisibilityForSpecificBrandPatient()
	{
	System.out.println("Verify that Specific Brand patient is receiving SMS for first visit of service");
	}
	
	//@Test
	public void testVerifyCustomerFirstVisitPackageSMSVisibilityForPorteaPatient()
	{
		System.out.println("Verify that Portea patient is receiving SMS for first visit of package");
		
	}
	
	
	//@Test
	public void testVerifyCustomerFirstVisitPackageSMSVisibilityForSpecificBrandPatient()
	{
	System.out.println("Verify that Specific Brand patient is receiving SMS for first visit of package");
	}
	
	
	//@Test
	public void testVerifyAppointmentScheduleConfirmationSMSVisiblity()
	{
		System.out.println("Verify that Portea patient is receiving SMS for first visit of service");
	}
	
	//@Test
	public void testVerifyAppointmentScheduleConfirmationSMSVisiblityForSpecificBrand()
	{
		System.out.println("Verify that Specific Brand patient is receiving SMS for first visit of service");
	}
	
	//@Test
	public void testVerifySMSSignatureForPortea()
	{
		System.out.println("Verify that Portea patient is receiving SMS with Portea Signature with proper format");
	}
	
	//@Test
	public void testVerifySMSSignatureForSpecificBrand()
	{
		System.out.println("Verify that Specific Brand patient is receiving SMS with Brand name Signature with proper format");
	}
	
	
	
	//@Test
	public void testVerifyAppointmentReScheduleTodayConfirmationSMSVisiblity()
	{
		System.out.println("Verify that professional and patients are receiving SMS on Appointment Reschedule for today.");
	}
	
	
	//@Test
	public void testVerifyAppointmentReScheduleTomorrowConfirmationSMSVisiblity()
	{
		System.out.println("Verify that professional and patients are receiving SMS on Appointment Reschedule for tomorrow.");
	}
	
	//@Test
	public void testVerifyAppointmentReScheduleFutureConfirmationSMSVisiblity()
	{
		System.out.println("Verify that professional and patients are receiving SMS on Appointment Reschedule for future.");
	}
	
	//@Test
	public void testVerifyAppointmentCancellationByPatientSMSVisiblity()
	{
		System.out.println("Verify that professional and patients are receiving SMS on cancellation of Appointment by Patient.");
	}
	
//	@Test
	public void testVerifyAppointmentCancellationByProfessionalSMSVisiblity()
	{
		System.out.println("Verify that patient is receiving SMS on cancellation of Appointment by Professional.");
	}
	
	//@Test
	public void testVerifyFirstAppointmentFeedbackSMSVisiblity()
	{
		System.out.println("Verify that user is recieving SMS for providing feedback for the first Appointment.");
	}
	
	//@Test
	public void testVerifyPatientMissedCallFeedbackSMSVisiblity()
	{
		System.out.println("Verify that user is recieving Feedback SMS on making missed call.");
	}
	
	//@Test
	public void testVerifyPaymentByCashSMSVisiblityForPorteaPatient()
	{
		System.out.println("Verify that user is recieving SMS on making Cash payment ");
		loginpage.doLogin(userName, password);
		GlobalUtil.wait(3);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		PatientModal patientModal = getPatientDetails();
		patientModal.setSalutation(SALUTATION.Mr);
		patientModal.setGender(GENDER.Male);
		patientModal.setBrand(BRAND.Portea);
		patientModal.setLocation(LOCALITY.DomlurBusStand);
		patientpage.addPatient(patientModal);
		
		AppointmentModal appointmentModal = getAppointmentDetails();
		appointmentModal.setDayContent("15");
		appointmentModal.setDuration("30");
		appointmentModal.setSelectTimings("10:30am");
		patientpage.addAppointment(appointmentModal);
		
		patientpage.getAddedPatient(patientModal);
		appointmentpage.assignProfessional();
		
		patientpage.changeStatusFromPendingToSuccessful();
		
		
		
		
	}
	
	//@Test
	public void testVerifyPaymentByChequeSMSVisiblity()
	{
		System.out.println("Verify that user is recieving SMS on making Cheque payment");
	}
	
	//@Test
	public void testVerifyPaymentByOnlineSMSVisiblity()
	{
		System.out.println("Verify that user is recieving SMS on making online payment ");
	}
	
	@Test
	public void testVerifyFirstAppointmentSuccessfulSMS()
	{
		loginpage.doLogin(userName, password);
		GlobalUtil.wait(2);
		homepage.openPatientListPage();
		GlobalUtil.wait(2);
		System.out.println("Add Patient");
		PatientModal patientModal = getPatientDetails();
		patientModal.setSalutation(SALUTATION.Mr);
		patientModal.setGender(GENDER.Male);
		patientModal.setBrand(BRAND.Portea);
		patientModal.setLocation(LOCALITY.DomlurBusStand);
		patientpage.addTempPatient(patientModal);
		
		
		System.out.println("Add Appointment for patient");
		patientpage.getAddedPatient(patientModal);
		GlobalUtil.wait(2);
		System.out.println("Add Appointment");

		AppointmentModal appointmentModal = getAppointmentDetails();
		appointmentModal.setDayContent("15");
		appointmentModal.setDuration("30");
		appointmentModal.setSelectTimings("10:30am");
		patientpage.addAppointment(appointmentModal);
		
		patientpage.getAddedPatient(patientModal);
		appointmentpage.assignProfessional();
		
		System.out.println("Change status to successful");
		patientpage.changeStatusFromPendingToSuccessful();
		
		System.out.println("Run cron");
		driver.get("http://stageops.portea.com/croncontroller/sendQueueSms");
		
	}
 
 private CalendarModal getCalendarDetails(){
    	
		CalendarModal calendarModal = new CalendarModal();
		calendarModal.setSelectTimeList(calendarModal.getSelectTimeList());
		calendarModal.setSelectDay(calendarModal.getSelectDay());
		calendarModal.setDuration(calendarModal.getDuration());
		return calendarModal;
	
	}
 
 
 
 
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
	 findClinicianModal.setPinCode("560076");
	// findClinicianModal.setLocation(LOCALITY.DomlurBusStand);
	 findClinicianModal.setArea(findClinicianModal.getArea());
	// findClinicianModal.setLocation(findClinicianModal.getLocation());
		
		return findClinicianModal;
	}

 private ServiceModal getServiceDetails(){
		ServiceModal serviceModal = new ServiceModal();
		serviceModal.setServiceName(serviceModal.getServiceName());
		serviceModal.setSubservice(serviceModal.getSubservice());
		serviceModal.setPreferences(serviceModal.getPreferences());
		serviceModal.setInstructions(serviceModal.getInstructions());
		serviceModal.setAppointmentType(serviceModal.getAppointmentType());
		serviceModal.setFirstVisitPrice(serviceModal.getFirstVisitPrice());
		serviceModal.setSecondVisitPrice(serviceModal.getSecondVisitPrice());
		serviceModal.setNoOfVisits(serviceModal.getNoOfVisits());
		serviceModal.setOfferedPrice(serviceModal.getOfferedPrice());
		return serviceModal;
	}
 
 private PatientModal getPatientDetails(){
		PatientModal patientModal = new PatientModal();
		patientModal.setSalutation(patientModal.getSalutation());
		patientModal.setFirstName(GlobalUtil.getRandomName(8));
		patientModal.setLastName(GlobalUtil.getRandomName(8));
		patientModal.setMobileNumber(RandomUtil.generateRandomMobileNo());
		patientModal.setLoginEmail(GlobalUtil.getRandomName(4) + "@portea.qa");
		patientModal.setPinCode("560076");
		patientModal.setGender(patientModal.getGender());
		patientModal.setBrand(patientModal.getBrand());
		patientModal.setLocation(patientModal.getlocation());
		return patientModal;
	}
}
