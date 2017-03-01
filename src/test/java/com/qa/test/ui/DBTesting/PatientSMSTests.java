package com.qa.test.ui.DBTesting;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mysql.jdbc.ResultSetRow;
import com.qa.tests.common.GlobalConstants.BRAND;
import com.qa.tests.common.GlobalConstants.LOCALITY;
import com.qa.tests.common.GlobalConstants.SALUTATION;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.PatientModal;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.AppointmentPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.PatientsPage;

public class PatientSMSTests extends TestBase{

	
	   private static final String uname="sapna.saxena@porteamedical.com";
	   private static final String passwd="123456";
//	   private static final String firstName = "test";
//	   private static final String lastName = "rrr";
//	   private static final String loginEmail = "rrr@rr.com";
//	   private static final String mobileNumber = "7788557754";
//	   private static final String pinCode = "560071";
	   private static final String url="jdbc:mysql://portea-test.c6wevl4fx9j5.ap-southeast-1.rds.amazonaws.com:3306/portea_crm?user=toor&password=23NP6w68P353";
	   
	   
	   LoginPage loginpage; 
	   PatientsPage patientpage; 
	   HomePage homepage;
	   AppointmentPage appointmentpage;
	   PatientSMSPage patientsmspage;
	   CheckSMSQueue  chkSmsQueue; 
	   
	   @BeforeMethod
		public void setUp() throws Exception
		{
			super.setUp();
			driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
			loginpage = PageFactory.initElements(driver, LoginPage.class);
			homepage = PageFactory.initElements(driver, HomePage.class);
			patientpage = PageFactory.initElements(driver, PatientsPage.class);
			appointmentpage = PageFactory.initElements(driver, AppointmentPage.class);
			patientsmspage =PageFactory.initElements(driver, PatientSMSPage.class);
			chkSmsQueue= PageFactory.initElements(driver, CheckSMSQueue.class);

		}

		@AfterMethod
		public void tearDown() throws Exception
		{
			super.tearDown();
		}
		
		/*
		 * *****************************************************************************************************************************************************
		 * Author : Sapna Saxena
		 * Automation Functionality:  SMS Automation for Batch 1 
		 * Batch 1: Appointment Successful, Appointment Cancel, Appointment Reschedule, Reminder, Successful Payment, Invoice generated, Online Payment Request
		********************************************************************************************************************************************************
		*/
		
		
		//@Test
		
	   
	  //@Test
	   public void testVerifySMSAppointmentSuccessfulForPorteaPatient()
	   {
		   System.out.println("Verify that Patient should recieve SMS on appointment successful");
		   loginpage.doLogin(uname, passwd);
		   GlobalUtil.wait(2);
		   homepage.openPatientListPage();
		   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
		   searchPatient.sendKeys("POR035079");
		   GlobalUtil.wait(1);
		   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		   searchBtn.click();
		   GlobalUtil.wait(1);
		   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/35079')]"));
		   selectPatient.click();
		   GlobalUtil.wait(2);
		   //appointmentpage.addAppointmentForAlreadyAddedService(GlobalUtil.getCurrentDate(),"9:30AM");
		   appointmentpage.addAppointmentForAlreadyAddedService("");
		   GlobalUtil.wait(2);
		   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
		   GlobalUtil.wait(2);
		   appointmentpage.changeAppointmentStatus("Confirmed", "Successful");
		   //patientsmspage.fetchSmsQueue();
	   }
	  
	  //@Test
	   public void testVerifySMSAppointmentSuccessfulForManipalPatient()
	   {
		   System.out.println("Verify that Manipal Patient should recieve SMS on appointment successful");
		   loginpage.doLogin(uname, passwd);
		   GlobalUtil.wait(2);
		   homepage.openPatientListPage();
		   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
		   searchPatient.sendKeys("MAN101144");
		   GlobalUtil.wait(1);
		   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		   searchBtn.click();
		   GlobalUtil.wait(1);
		   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/35079')]"));
		   selectPatient.click();
		   GlobalUtil.wait(2);
		   //appointmentpage.addAppointmentForAlreadyAddedService(GlobalUtil.getCurrentDate(),"9:30AM");
		   appointmentpage.addAppointmentForAlreadyAddedService("");
		   GlobalUtil.wait(2);
		   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
		   GlobalUtil.wait(2);
		   appointmentpage.changeAppointmentStatus("Confirmed", "Successful");
		  // patientsmspage.fetchSmsQueue();
	   }
	   
	   //@Test
	   public void testVerifySMSAppointmentRescheduleForPorteaPatient()
	   {
		   System.out.println("Verify that Manipal Patient should recieve SMS on appointment successful");
		   loginpage.doLogin(uname, passwd);
		   GlobalUtil.wait(2);
		   homepage.openPatientListPage();
		   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
		   searchPatient.sendKeys("POR035079");
		   GlobalUtil.wait(1);
		   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		   searchBtn.click();
		   GlobalUtil.wait(1);
		   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details')]"));
		   selectPatient.click();
		   GlobalUtil.wait(2);
		   //appointmentpage.addAppointmentForAlreadyAddedService(GlobalUtil.getCurrentDate(),"9:30AM");
		   appointmentpage.addAppointmentForAlreadyAddedService("");
		   GlobalUtil.wait(2);
		   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
		   GlobalUtil.wait(2);
	       WebElement clickDate = driver.findElement(By.xpath("//a[contains(@id,'appointment_dateTime')]"));
	       clickDate.click();
	       driver.switchTo().window("Reschedule Appointment");
	       WebElement clickOnSelectTime = driver.findElement(By.xpath("//input[contains(@id,'timePicker')]"));
	       clickOnSelectTime.click();
	       WebElement selectTime = driver.findElement(By.xpath("//ul[contains(@class,'ui-timePicker-list')]"));
	       selectTime.click();
	       Select responsible = new Select(driver.findElement(By.xpath("//input[contains(@id,'responsible_schedule')]")));
	       responsible.selectByVisibleText("Operations");
	       Select reason = new Select(driver.findElement(By.xpath("//input[contains(@id,'reason_schedule')]")));
	       reason.selectByVisibleText("NO Update");
	       WebElement notes = driver.findElement(By.xpath("//textarea[contains(@id,'post_notes')]"));
	       notes.sendKeys("test");
	       WebElement btn = driver.findElement(By.xpath("//button[contains(@class,'ui-button-text') and contains(.,'Reschedule')]"));
	       btn.click();
	       driver.switchTo().alert().accept();
	       
		  // patientsmspage.fetchSmsQueue();
	   }
	   //@Test
	   public void testVerifySMSAppointmentRescheduleForManipalPatient()
	   {
		   System.out.println("Verify that Manipal Patient should recieve SMS on appointment successful");
		   loginpage.doLogin(uname, passwd);
		   GlobalUtil.wait(2);
		   homepage.openPatientListPage();
		   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
		   searchPatient.sendKeys("MAN101144");
		   GlobalUtil.wait(1);
		   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		   searchBtn.click();
		   GlobalUtil.wait(1);
		   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details')]"));
		   selectPatient.click();
		   GlobalUtil.wait(2);
		   //appointmentpage.addAppointmentForAlreadyAddedService(GlobalUtil.getCurrentDate(),"9:30AM");
		   appointmentpage.addAppointmentForAlreadyAddedService("");
		   GlobalUtil.wait(2);
		   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
		   GlobalUtil.wait(2);
	       WebElement clickDate = driver.findElement(By.xpath("//a[contains(@id,'appointment_dateTime')]"));
	       clickDate.click();
	       driver.switchTo().window("Reschedule Appointment");
	       WebElement clickOnSelectTime = driver.findElement(By.xpath("//input[contains(@id,'timePicker')]"));
	       clickOnSelectTime.click();
	       WebElement selectTime = driver.findElement(By.xpath("//ul[contains(@class,'ui-timePicker-list')]"));
	       selectTime.click();
	       Select responsible = new Select(driver.findElement(By.xpath("//input[contains(@id,'responsible_schedule')]")));
	       responsible.selectByVisibleText("Operations");
	       Select reason = new Select(driver.findElement(By.xpath("//input[contains(@id,'reason_schedule')]")));
	       reason.selectByVisibleText("NO Update");
	       WebElement notes = driver.findElement(By.xpath("//textarea[contains(@id,'post_notes')]"));
	       notes.sendKeys("test");
	       WebElement btn = driver.findElement(By.xpath("//button[contains(@class,'ui-button-text') and contains(.,'Reschedule')]"));
	       btn.click();
	       driver.switchTo().alert().accept();
	       
		  // patientsmspage.fetchSmsQueue();
	   }
	  
	  //@Test
	   public void testVerifySMSAppointmentCancelForPorteaPatient()
	   {
		   System.out.println("Verify that Patient should recieve SMS on appointment cancel");
		   loginpage.doLogin(uname, passwd);
		   GlobalUtil.wait(2);
		   homepage.openPatientListPage();
		   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
		   searchPatient.sendKeys("POR035079");
		   GlobalUtil.wait(1);
		   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		   searchBtn.click();
		   GlobalUtil.wait(1);
		   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/35079')]"));
		   selectPatient.click();
		   GlobalUtil.wait(2);
		   appointmentpage.addAppointmentForAlreadyAddedService("");
		   GlobalUtil.wait(2);
		   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
		   GlobalUtil.wait(2);
		   appointmentpage.changeAppointmentStatus("Confirmed", "Cancelled");
		   //patientsmspage.fetchSmsQueue();
		   
	   }
	   
	   //@Test
	   public void testVerifySMSAppointmentCancelForManipalPatient()
	   {
		   System.out.println("Verify that Manipal Patient should recieve SMS on appointment cancel");
		   loginpage.doLogin(uname, passwd);
		   GlobalUtil.wait(2);
		   homepage.openPatientListPage();
		   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
		   searchPatient.sendKeys("MAN101144");
		   GlobalUtil.wait(1);
		   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		   searchBtn.click();
		   GlobalUtil.wait(1);
		   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/35079')]"));
		   selectPatient.click();
		   GlobalUtil.wait(2);
		   appointmentpage.addAppointmentForAlreadyAddedService("");
		   GlobalUtil.wait(2);
		   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
		   GlobalUtil.wait(2);
		   appointmentpage.changeAppointmentStatus("Confirmed", "Cancelled");
		   //patientsmspage.fetchSmsQueue();
		   
	   }
	   //@Test
	   public void testVerifySMSForRequestPaymentURLForPorteaPatient()
	   {
		   System.out.println("Verify that Portea Patient should recieve SMS on appointment successful");
		   loginpage.doLogin(uname, passwd);
		   GlobalUtil.wait(2);
		   homepage.openPatientListPage();
		   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
		   searchPatient.sendKeys("POR035079");
		   GlobalUtil.wait(1);
		   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		   searchBtn.click();
		   GlobalUtil.wait(1);
		   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/35079')]"));
		   selectPatient.click();
		   GlobalUtil.wait(1);
		   WebElement requestPayment = driver.findElement(By.xpath("//a[contains(@href,'onlinePayment')]"));
		   requestPayment.click();
		   GlobalUtil.wait(1);
		   WebElement newRequestBtn= driver.findElement(By.xpath("//div/a[contains(@class,'edit-label')]"));
		   newRequestBtn.click();
		   GlobalUtil.wait(1);
		   Select selectPackage = new Select(driver.findElement(By.xpath("//select[contains(@id,'packageSelect')]")));
		   selectPackage.selectByIndex(1);
		   GlobalUtil.wait(1);
		   WebElement details = driver.findElement(By.xpath("//textarea[contains(@id,'payment_description')]"));
		   details.sendKeys("test");
		   GlobalUtil.wait(1);
		   WebElement enterAmount = driver.findElement(By.xpath("//input[contains(@id,'amount')]"));
		   enterAmount.sendKeys("1");
		   GlobalUtil.wait(2);
		   WebElement saveBtn=driver.findElement(By.xpath("//input[contains(@name,'submit')]"));
		   saveBtn.click();
		   WebElement sendURL=driver.findElement(By.xpath("//td/a[contains(@class,'edit-label') and contains(@onclick,'http://stage.portea.com/pay')]"));
		   sendURL.click();
		   //chkSmsQueue.fetchSmsQueue(); 
	   }
	   
	 //@Test
	   public void testVerifySMSOfRequestPaymentURLForManipalPatient()
	   {
		   System.out.println("Verify that Portea Patient should recieve SMS on appointment successful");
		   loginpage.doLogin(uname, passwd);
		   GlobalUtil.wait(2);
		   homepage.openPatientListPage();
		   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
		   searchPatient.sendKeys("MAN101144");
		   GlobalUtil.wait(1);
		   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		   searchBtn.click();
		   GlobalUtil.wait(1);
		   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/35079')]"));
		   selectPatient.click();
		   GlobalUtil.wait(1);
		   WebElement requestPayment = driver.findElement(By.xpath("//a[contains(@href,'onlinePayment')]"));
		   requestPayment.click();
		   GlobalUtil.wait(1);
		   WebElement newRequestBtn= driver.findElement(By.xpath("//div/a[contains(@class,'edit-label')]"));
		   newRequestBtn.click();
		   GlobalUtil.wait(1);
		   Select selectPackage = new Select(driver.findElement(By.xpath("//select[contains(@id,'packageSelect')]")));
		   selectPackage.selectByIndex(1);
		   GlobalUtil.wait(1);
		   WebElement details = driver.findElement(By.xpath("//textarea[contains(@id,'payment_description')]"));
		   details.sendKeys("test");
		   GlobalUtil.wait(1);
		   WebElement enterAmount = driver.findElement(By.xpath("//input[contains(@id,'amount')]"));
		   enterAmount.sendKeys("1");
		   GlobalUtil.wait(2);
		   WebElement saveBtn=driver.findElement(By.xpath("//input[contains(@name,'submit')]"));
		   saveBtn.click();
		   WebElement sendURL=driver.findElement(By.xpath("//td/a[contains(@class,'edit-label') and contains(@onclick,'http://stage.portea.com/pay')]"));
		   sendURL.click();
		   //chkSmsQueue.fetchSmsQueue();
		  
	   }
	   
	  //@Test
	   public void testVerifySMSForPatientReminder()
	   {
		   System.out.println("Verify that Patient should recieve SMS on appointment successful");
		   loginpage.doLogin(uname, passwd);
		   GlobalUtil.wait(2);
		   homepage.openPatientListPage();
		   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
		   searchPatient.sendKeys("POR035079");
		   GlobalUtil.wait(1);
		   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		   searchBtn.click();
		   GlobalUtil.wait(1);
		   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/35079')]"));
		   selectPatient.click();
		   GlobalUtil.wait(2);
		   //Add Appointment for tomorrow (appt time <= 8AM)
		   appointmentpage.addAppointmentForAlreadyAddedService("");
		   GlobalUtil.wait(2);
		   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
		   GlobalUtil.wait(2);
		   driver.get("https://stageops.portea.com/croncontroller/patientNotificationSmsForNextDay");
		   //verify in DB
		  // chkSmsQueue.fetchSmsQueue();  
	   }
	   
	 //@Test
	   public void testVerifySMSForManipalPatientReminder()
	   {
		   System.out.println("Verify that Manipal Patient should recieve SMS on appointment successful");
		   loginpage.doLogin(uname, passwd);
		   GlobalUtil.wait(2);
		   homepage.openPatientListPage();
		   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
		   searchPatient.sendKeys("MAN101144");
		   GlobalUtil.wait(1);
		   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		   searchBtn.click();
		   GlobalUtil.wait(1);
		   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/35079')]"));
		   selectPatient.click();
		   GlobalUtil.wait(2);
		   //Add Appointment for tomorrow (appt time <= 8AM)
		   appointmentpage.addAppointmentForAlreadyAddedService("");
		   GlobalUtil.wait(2);
		   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
		   GlobalUtil.wait(2);
		   driver.get("https://stageops.portea.com/croncontroller/patientNotificationSmsForNextDay");
		   //verify in DB
		   //chkSmsQueue.fetchSmsQueue("SELECT mobile_number,message,last_updated_on,brand_id FROM `smsen_sms_record` WHERE scheduled_type='Payment' and mobile_number=918553013244 ORDER BY `id` DESC ");  
	   }
	   
	  //@Test
	   public void testVerifySMSForPaymentSuccessfulForPorteaPatient()
	   {
		   System.out.println("Verify that Portea Patient should recieve SMS on payment successful");
		   loginpage.doLogin(uname, passwd);
		   GlobalUtil.wait(2);
		   homepage.openPatientListPage();
		   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
		   searchPatient.sendKeys("POR035079");
		   GlobalUtil.wait(1);
		   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		   searchBtn.click();
		   GlobalUtil.wait(1);
		   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/35079')]"));
		   selectPatient.click();
		   GlobalUtil.wait(2);
		   WebElement addApptTab = driver.findElement(By.xpath("//a[contains(@href,'/patient/appointments/') and contains(.,'Appointments')]"));
		   addApptTab.click();
		   GlobalUtil.wait(2);
		   Select filter = new Select(driver.findElement(By.xpath("//select[contains(@id,'filter')]")));
		   filter.selectByVisibleText("Successful");
		   GlobalUtil.wait(2);
		   WebElement filterBtn = driver.findElement(By.xpath("//button[@type='button' and contains(.,'Filter')]"));
		   filterBtn.click();
		   WebElement tableele = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a[contains(@href,'/appointment/details')]"));
		   tableele.click();
		   WebElement paybtn= driver.findElement(By.xpath("//a[contains(@class,'edit-label') and contains(.,'Pay')]"));
		   paybtn.click();
		   WebElement enterAmount = driver.findElement(By.xpath("//input[contains(@id,'amount-received')]"));
		   enterAmount.sendKeys("1");
		   WebElement notes = driver.findElement(By.xpath("//textarea[contains(@id,'payment-notes')]"));
		   notes.sendKeys("test");
		   WebElement save = driver.findElement(By.xpath("//button[contains(@type,'button') and contains(.,'Save')]"));
		   save.click();
		   GlobalUtil.wait(1);
		   driver.switchTo().alert().accept();
		   GlobalUtil.wait(1);
		  if(driver.switchTo().alert()!=null)
		  {
			  driver.switchTo().alert().accept();
		  }
		  if(driver.switchTo().alert()!=null)
		  {
			  driver.switchTo().alert().accept();
		  }
		//patientsmspage.fetchSmsQueue();
		   
	   }
	   
		  @Test
		   public void testVerifySMSForPaymentSuccessfulForManipalPatient()
		   {
			   System.out.println("Verify that Portea Patient should recieve SMS on payment successful");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("MAN101144");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/101144')]"));
			   selectPatient.click();
			   GlobalUtil.wait(2);
			   WebElement addApptTab = driver.findElement(By.xpath("//a[contains(@href,'/patient/appointments/') and contains(.,'Appointments')]"));
			   addApptTab.click();
			   GlobalUtil.wait(2);
			   Select filter = new Select(driver.findElement(By.xpath("//select[contains(@id,'filter')]")));
			   filter.selectByVisibleText("Successful");
			   GlobalUtil.wait(2);
			   WebElement filterBtn = driver.findElement(By.xpath("//button[@type='button' and contains(.,'Filter')]"));
			   filterBtn.click();
			   WebElement tableele = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a[contains(@href,'/appointment/details')]"));
			   tableele.click();
			   WebElement paybtn= driver.findElement(By.xpath("//a[contains(@class,'edit-label') and contains(.,'Pay')]"));
			   paybtn.click();
			   WebElement enterAmount = driver.findElement(By.xpath("//input[contains(@id,'amount-received')]"));
			   enterAmount.sendKeys("1");
			   WebElement notes = driver.findElement(By.xpath("//textarea[contains(@id,'payment-notes')]"));
			   notes.sendKeys("test");
			   WebElement save = driver.findElement(By.xpath("//button[contains(@type,'button') and contains(.,'Save')]"));
			   save.click();
			   GlobalUtil.wait(1);
		       driver.switchTo().alert().accept();
		       GlobalUtil.wait(1);
			   driver.switchTo().alert().accept();
			   GlobalUtil.wait(2);
			   WebElement Ok = driver.findElement(By.xpath("//button[contains(@text,'OK')]"));
			   Ok.click();
			   //GlobalUtil.wait(2);
			    String query ="SELECT mobile_number,message,last_updated_on,brand_id FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number=918553013244 ORDER BY id DESC";
			    //String expectedMessage="Dear Customer, We have received payment of Rs.1, Thank you -- Manipal HomeCare";
			   // patientsmspage.fetchSmsQueue();
			    CheckSMSQueue.fetchSmsQueue();
//			    s
		   }
	   /*
	    * ***********************************************************************************************************************************
	     *Automation Functionality:  SMS Automation for Batch 2 
		 *Batch 2: Manual Template Message, First Appointment Feedback, Customer First Visit, Customer First Service, Patient CSAT Feedback
	    * ***********************************************************************************************************************************
	    * */
	  //BATCH 2 SMS Automation
	  //Customer First Visit SMS
	   //@Test
	   public void testVerifySMSForPorteaCustomerFirstVisit()
	   {
		   System.out.println("Verify that SMS should be displayed in SMSEN_SMS_RECORDS for Customer First Visit for brand Portea");
		   PatientModal patientmodal = PatientModal.getDefaultPatientDetails();
		   patientmodal.setSalutation(SALUTATION.Mr);
		   patientmodal.setLocality(LOCALITY.DomlurBusStand);
		   patientmodal.setBrand(BRAND.Portea);
		   patientpage.addPatient(patientmodal);
		   
	   }
	  
	   

}
