package com.qa.tests.ui.tests;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.common.RandomUtil;
import com.qa.tests.common.GlobalConstants.BRAND;
import com.qa.tests.common.GlobalConstants.GENDER;
import com.qa.tests.common.GlobalConstants.LOCALITY;
import com.qa.tests.common.GlobalConstants.SALUTATION;
import com.qa.tests.ui.common.PatientModal;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.AppointmentPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.PatientsPage;

public class PatientDetailsCreation extends TestBase
{
	PatientsPage patientpage;
	LoginPage loginpage;
	HomePage homepage;
	AppointmentPage appointmentpage;
	String pname = "porteauser"+ GlobalUtil.getRandomName(10);
	public static String username = "qatest@test.com";
	public static String password ="flower";
	
	@Test
	public void testVerifyAddPatient()
	{
		 System.out.println("Add Appointment..");
		 loginpage.doLogin(username, password);
		 homepage.openPatientListPage();
		 GlobalUtil.wait(5);
		 PatientModal patientModal = getPatientDetails();
		 patientModal.setSalutation(SALUTATION.Mr);
		 patientModal.setGender(GENDER.Male);
		 patientModal.setLocality(LOCALITY.Hulimavu);
		 patientModal.setBrand(BRAND.Portea);
		 GlobalUtil.wait(5);
		 patientpage.addPatient(patientModal);
		 GlobalUtil.wait(10);
		 patientpage.getAddedPatient(patientModal);
		 Assert.assertNotNull("");
	}
	
	@Test
	public void testVerifyEditPatient()
	{
		 System.out.println("Add Appointment..");
		 loginpage.doLogin(username, password);
		 homepage.openPatientListPage();
		 GlobalUtil.wait(5);
		 PatientModal patientModal = getPatientDetails();
		 patientModal.setSalutation(SALUTATION.Mr);
		 patientModal.setGender(GENDER.Male);
		 patientModal.setLocality(LOCALITY.Hulimavu);
		 patientModal.setBrand(BRAND.Portea);
		 GlobalUtil.wait(5);
		 patientpage.addPatient(patientModal);
		 GlobalUtil.wait(10);
		 patientpage.getAddedPatient(patientModal);
	}
	
	@Test
	public void testVerifyAddedPatientnameMatchesInPatientListingAndOverview()
	{
		 System.out.println("Add Appointment..");
		 loginpage.doLogin(username, password);
		 homepage.openPatientListPage();
		 GlobalUtil.wait(5);
		 PatientModal patientModal = getPatientDetails();
		 patientModal.setSalutation(SALUTATION.Mr);
		 patientModal.setGender(GENDER.Male);
		 patientModal.setLocality(LOCALITY.Hulimavu);
		 patientModal.setBrand(BRAND.Portea);
		 GlobalUtil.wait(5);
		 patientpage.addPatient(patientModal);
		 GlobalUtil.wait(5);
		patientpage.getAddedPatient(patientModal);
		homepage.openPatientListPage();
	
		 
	}
	
	@Test
	public void testVerifyAddServices()
	{
		
	}
	
	@Test
	public void testVerifyAddCarePlan()
	{
		
	}
	
	@Test
	public void testVerifyAddAppointment()
	{
		 System.out.println("Add Appointment..");
		 loginpage.doLogin(username, password);
		 homepage.openPatientListPage();
		 GlobalUtil.wait(5);
		 PatientModal patientModal = getPatientDetails();
		 patientModal.setSalutation(SALUTATION.Mr);
		 patientModal.setGender(GENDER.Male);
		 patientModal.setLocality(LOCALITY.Hulimavu);
		 patientModal.setBrand(BRAND.Portea);
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
	
	
	@Test
	public void testVerifyAssignAppointment()
	{
		
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
			patientModal.setLocality(patientModal.getlocation());
			return patientModal;
		}
	 
	
}
