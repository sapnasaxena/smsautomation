package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalConstants.APPOINTMENTTYPE;
import com.qa.tests.common.GlobalConstants.BRAND;
import com.qa.tests.common.GlobalConstants.GENDER;
import com.qa.tests.common.GlobalConstants.LOCALITY;
import com.qa.tests.common.GlobalConstants.SALUTATION;
import com.qa.tests.common.GlobalConstants.SERVICE;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.common.RandomUtil;
import com.qa.tests.ui.common.AppointmentModal;
import com.qa.tests.ui.common.CalendarModal;
import com.qa.tests.ui.common.PatientModal;
import com.qa.tests.ui.common.ServiceModal;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.AppointmentPage;

import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.MissedCallPage;
import com.qa.tests.ui.pages.PatientsPage;
import com.qa.tests.ui.pages.SMSPage;


public class MissedCallTest extends TestBase {

	
	LoginPage loginpage;
	PatientsPage patientpage;
	HomePage homepage;
	SMSPage smspage;
	AppointmentPage appointmentpage;
	MissedCallPage missedcallpage;
	public static String username = "qatest@test.com";
	public static String password ="flower";
    public static String expected_message ="Dear Customer,We have received a payment of Rs 100 .Your Patient Id is POR030670, use this in all your communication with Portea";
  
	
	
	
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		patientpage = PageFactory.initElements(driver, PatientsPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		appointmentpage = PageFactory.initElements(driver, AppointmentPage.class);
		smspage = PageFactory.initElements(driver, SMSPage.class);
		missedcallpage = PageFactory.initElements(driver, MissedCallPage.class);
	}
	
 
    @AfterMethod
    public void tearDown() throws Exception
    {
	super.tearDown();
     }
    
    
    @Test
    public void testVerifyPatientMissedCallSMS()
    {
    	System.out.println("Verify that Patient is getting SMS on missed call");
    	loginpage.doLogin(username, password);
    	GlobalUtil.wait(10);
    	System.out.println("Click on Patient Nav bar");
    	homepage.openPatientListPage();
    	GlobalUtil.wait(10);
    	
    	System.out.println("Add Patient..");
    	PatientModal patientModal = getPatientDetails();
    	patientModal.setSalutation(SALUTATION.Mr);
    	patientModal.setGender(GENDER.Male);
    	patientModal.setBrand(BRAND.Portea);
    	patientModal.setPinCode("560076");
    	patientModal.setLocality(LOCALITY.Bilekahalli);
    	patientpage.addPatient(patientModal);
    	
    	System.out.println("Subscribe Services");
    	ServiceModal serviceModal = getServiceDetails();
    	serviceModal.setServiceName(SERVICE.Nursing);
    	serviceModal.setAppointmentType(APPOINTMENTTYPE.Recurring);
    	serviceModal.setFirstVisitPrice("200");
    	serviceModal.setSecondVisitPrice("400");
    	patientpage.addService(serviceModal);
    	
    	System.out.println("Add Appointment");
    	AppointmentModal appointmentModal = getAppointmentDetails();
    	appointmentModal.setSelectPackage("Nursing Attendant");
    	appointmentModal.setClinicianPref("Best Available");
    	CalendarModal calendarModal = getCalendarDetails();
        calendarModal.setSelectTimeList("8:30pm");
    	calendarModal.setDuration("120");
    	calendarModal.setSelectDay("10");
    	patientpage.viewCalendar(calendarModal);
    	patientpage.addAppointment(appointmentModal);
    	System.out.println("Assign Professional...");
    	appointmentpage.assignProfessional();
    	
    	System.out.println("Make appointment successfull");
    	driver.findElement(By.xpath("//a[contains(@class,'delete-label')]")).click();
    	String popUpStatusChangeWindow = "//div[contains(@id,'dialog-form-status')]";
    	driver.switchTo().window(popUpStatusChangeWindow);
    	Select status = new Select(driver.findElement(By.xpath("//select[contains(@id,'status')]")));
        status.selectByVisibleText("Successful");
       
        System.out.println("Run Cron for Feedback SMS");
        driver.get("http://stageops.portea.com/croncontroller/firstAppointmentFeedback");
        
        GlobalUtil.wait(10);
        loginpage.doLogin(username, password);
        System.out.println("Check SMS");
        homepage.openSMSPage();
        smspage.checkPendingSMSforFilterFirstAppointmentFeedbackSMS();
        //Assert.assertEquals(missedcallpage.getActualMessage(),expected_message, true);
    	
    }
    
    
    
    
    private PatientModal getPatientDetails(){
		PatientModal patientModal = new PatientModal();
		patientModal.setSalutation(patientModal.getSalutation());
		patientModal.setFirstName(GlobalUtil.getRandomName(8));
		patientModal.setLastName(GlobalUtil.getRandomName(8));
		patientModal.setMobileNumber(RandomUtil.generateRandomMobileNo());
		patientModal.setLoginEmail(GlobalUtil.getRandomName(4) + "@portea.qa");
		patientModal.setPinCode(patientModal.getPinCode());
		patientModal.setGender(patientModal.getGender());
		patientModal.setBrand(patientModal.getBrand());
		patientModal.setLocality(patientModal.getlocation());
		return patientModal;
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
    
    private ServiceModal getServiceDetails(){
		ServiceModal serviceModal = new ServiceModal();
		serviceModal.setServiceName(serviceModal.getServiceName());
		serviceModal.setAppointmentType(serviceModal.getAppointmentType());
		serviceModal.setFirstVisitPrice(serviceModal.getFirstVisitPrice());
		serviceModal.setSecondVisitPrice(serviceModal.getSecondVisitPrice());
		serviceModal.setNoOfVisits(serviceModal.getNoOfVisits());
		serviceModal.setOfferedPrice(serviceModal.getOfferedPrice());
		return serviceModal;
	}
    
    private CalendarModal getCalendarDetails(){
    	
		CalendarModal calendarModal = new CalendarModal();
		calendarModal.setSelectTimeList(calendarModal.getSelectTimeList());
		calendarModal.setSelectDay(calendarModal.getSelectDay());
		calendarModal.setDuration(calendarModal.getDuration());
		return calendarModal;
	
	}
}
