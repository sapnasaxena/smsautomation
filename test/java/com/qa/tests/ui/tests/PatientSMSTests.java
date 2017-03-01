package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.AppointmentModal;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.AppointmentPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.PatientProfile;
import com.qa.tests.ui.pages.PatientsPage;
import com.qa.tests.ui.pages.ProfessionalPage;

public class PatientSMSTests  extends TestBase{
	
	
	   private static final String URL="http://stageops.portea.com/adminer.php?server=db.portea.internal&username=porteauser&db=portea_crm";
	   private static final String PASSWORD="p0rteaCrm2013";
	   AppointmentPage appointmentpage;
	   LoginPage loginpage;
	   HomePage homepage;
	   PatientsPage patientpage;
	   PatientProfile patientprofilepage;
	   
	   
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
			
		}

		@AfterMethod
		public void tearDown() throws Exception
		{
			super.tearDown();
		}
		
	   @Test
	   public void testVerifySMSAppointmentSuccessful()
	   {
		   System.out.println("Verify SMS in SMSEN Queue for Appointment Successful");
		     AppointmentModal appointmentModal = getAppointmentDetails();
			 patientpage.addAppointment(appointmentModal);
	   }
	   
	   @Test
	   public void testVerifySMSAppointmentCancel()
	   {
		   System.out.println("Verify SMS for appointment cancellation");
		   
	   }
	   
	   @Test
	   public void testVerifySMSAppointmentReSchedule()
	   {
		   
	   }
	   
	   @Test
	   public void testVerifySMSPatientReminder()
	   {
		   
	   }
	   
	   @Test
	   public void testVerifySMSPatientPayment()
	   {
		   
	   }
	   
	   @Test
	   public void testVerifySMSInvoiceGenerator()
	   {
		   
	   }
	   
	   @Test
	   public void testVerifySMSOnlinePaymentRequest()
	   {
		   
	   }
	   @Test
	   public void testVerifySMSLinkWallet()
	   {
		   
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

}
