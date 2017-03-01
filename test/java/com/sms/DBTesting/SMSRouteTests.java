package com.sms.DBTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Verify;
import com.qa.test.ui.DBTesting.CheckSMSQueue;
import com.qa.test.ui.DBTesting.PatientSMSPage;
import com.qa.tests.common.GlobalConstants.BRAND;
import com.qa.tests.common.GlobalConstants.GENDER;
import com.qa.tests.common.GlobalConstants.LOCALITY;
import com.qa.tests.common.GlobalConstants.SALUTATION;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.PatientModal;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.AppointmentPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LeadPage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.PatientsPage;

import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SMSRouteTests extends TestBase{
	
	   private static final String uname="sapna.saxena@porteamedical.com";
	   private static final String passwd="Portea123456";
	   LoginPage loginpage; 
	   PatientsPage patientpage; 
	   HomePage homepage;
	   LeadPage leadpage;
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
	/*
	   @Test
	    public void TC_Batch1_testVerifyPaymentSMSForManipalPatient() {
	    	System.out.println("Verify that Manipal Patient should recieve SMS on payment successful");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("MAN534869");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/534869')]"));
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
			   GlobalUtil.wait(2);
			   WebElement tableele = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a[contains(@href,'/appointment/details')]"));
			   tableele.click();
			   GlobalUtil.wait(2);
			   WebElement paybtn= driver.findElement(By.xpath("//a[contains(@class,'edit-label') and contains(.,'Pay')]"));
			   paybtn.click();
			   WebElement enterAmount = driver.findElement(By.xpath("//input[contains(@id,'amount-received')]"));
			   enterAmount.sendKeys("1");
			   WebElement notes = driver.findElement(By.xpath("//textarea[contains(@id,'payment-notes')]"));
			   notes.sendKeys("test");
			   GlobalUtil.wait(2);
			   WebElement save = driver.findElement(By.xpath("//div[24]/div[3]/div/button/span[contains(@class,'ui-button-text') and text()='Save']"));
					   //(By.xpath("//div/button/span[contains(text(),'Save')]"));
			   save.click();
			   GlobalUtil.wait(2);
			   if(appointmentpage.isAlertPresent())
			   {
		       driver.switchTo().alert().accept();
		       GlobalUtil.wait(2);
			   driver.switchTo().alert().accept();
			   }
			   else
			   {
				   System.out.println("No alert present..proceed");
			   }
			   GlobalUtil.wait(2);
//			   WebElement Ok = driver.findElement(By.xpath("//button[contains(@text,'OK')]"));
//			   Ok.click();
			   //GlobalUtil.wait(2);
	        String sqlQuery = "SELECT message FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='919901970749' and brand_id='2' GROUP BY mobile_number ORDER BY id DESC LIMIT 1";
	        		//"SELECT message FROM smsen_sms_record WHERE last_updated_on IN(SELECT MAX(last_updated_on)FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='919901970749' and brand_id='2' GROUP BY mobile_number) ORDER BY id ASC , last_updated_on DESC ";
	      // String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='919901970749' and brand_id=2 ORDER BY id DESC";
	        String expectedSMS = "Dear Customer, We have received a payment of Rs1 . Thankyou -- Manipal Homecare";
	        //Getting employee name by Id
	        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
	        GlobalUtil.wait(10);
	        //String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
	        GlobalUtil.wait(10);
	        String actualoutput=actualSMS.replaceAll("\\s","");
	        String expectedoutput=expectedSMS.replaceAll("\\s","");
	        System.out.println("Actual SMS :" +actualoutput);
	        GlobalUtil.wait(10);
	        //System.out.println("Delivery Status :" +deliveryStatus);
	        Assert.assertNotNull(actualSMS);
	        Assert.assertEquals(actualoutput,expectedoutput);
	        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
	    }

	    @Test
	    public void TC_Batch1_testVerifyPaymentSMSForPorteaPatient() {
	    	System.out.println("Verify that Portea Patient should recieve SMS on payment successful");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("POR281442");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/281442')]"));
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
			   WebElement save = driver.findElement(By.xpath("//div[24]/div[3]/div/button/span[contains(@class,'ui-button-text') and text()='Save']"));
			   save.click();
			   GlobalUtil.wait(2);
			   if(appointmentpage.isAlertPresent())
			   {
		       driver.switchTo().alert().accept();
		       GlobalUtil.wait(2);
			   driver.switchTo().alert().accept();
			   }
			   else
			   {
				   System.out.println("No alert present...proceed");
			   }
			   GlobalUtil.wait(2);
	        String sqlQuery = "SELECT message,secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='918553013244' and brand_id='1' ORDER BY id DESC LIMIT 1";
	        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='918553013244' and brand_id=1 ORDER BY id DESC";
	        String expectedSMS = "DearCustomer,WehavereceivedapaymentofRs1.YourPatientIdisPOR035079,usethisinallyourcommunicationwithPortea.PayonlineusingPorteaMobileApp!Downloadathttp://portea.com/downloadAppThankyou--PorteaMedical";
	        //Getting employee name by Id
	        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
	        GlobalUtil.wait(10);
	       String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
	        GlobalUtil.wait(10);
	        String actualoutput=actualSMS.replaceAll("\\s","");
	        String expectedoutput=expectedSMS.replaceAll("\\s","");
	        System.out.println("Actual SMS :" +actualSMS);
	        GlobalUtil.wait(10);
	        System.out.println("Delivery Status :" +deliveryStatus);
	        Assert.assertEquals(actualoutput,expectedoutput);
	        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
	    }
	   
	       @Test
		   public void TC_Batch1_testVerifySMSAppointmentSuccessfulForPorteaPatient()
		   {
			   System.out.println("Verify that Patient should recieve SMS on appointment successful");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("POR281442");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/281442')]"));
			   selectPatient.click();
			   GlobalUtil.wait(2);
			   appointmentpage.addAppointmentForBestAvailableClinician("9:30 AM");
			   //appointmentpage.addAppointmentForAlreadyAddedService("9:30 AM");
			   GlobalUtil.wait(2);
			   appointmentpage.selectProfessionalForNewAppt();
			   GlobalUtil.wait(10);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
			   appointmentpage.changeStatusToSuccessful("Confirmed", "Successful");
			   GlobalUtil.wait(2);
			   //Check on DB for SMS
			    String sqlQuery = "SELECT message,secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Appointment Success' and mobile_number='918553013244' and brand_id='1' ORDER BY id DESC LIMIT 1";
		        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='appointment success' and mobile_number='918553013244' and brand_id='1' ORDER BY id DESC LIMIT 1";
		        String expectedSMS = "Dear Sapna saxena,Your Physiotherapist visit scheduled at 09:30 AM on 23-Sep is completed.Your invoice amount is Rs500.00/-,to make an online payment visit http://stage.portea.com/ap/r2f";
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s","");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(actualSMS);
		        //Assert.assertEquals(actualoutput,expectedoutput);
		        Assert.assertTrue(actualoutput.contains(expectedoutput));
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
		        
		   }
	       */
		  
	      //@Test
	       public void TC_Batch1_testVerifySMSSuccessfulApptLabSampleAppointment()
	       {
	    	   System.out.println("Verify that Patient should recieve SMS on appointment successful");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("POR281442");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/281442')]"));
			   selectPatient.click();
			   GlobalUtil.wait(2);
			   appointmentpage.addAppointmentWithoutSubscriptionforLabs("9:30 AM");
			   //appointmentpage.addAppointmentForBestAvailableClinician("9:30 AM");
			   GlobalUtil.wait(5);
//			   appointmentpage.selectProfessionalForNewAppt();
//			   GlobalUtil.wait(10);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
			   appointmentpage.changeStatusToSuccessful("Confirmed", "Successful");
			   GlobalUtil.wait(2);
			   //Check on DB for SMS
			    String sqlQuery = "SELECT message FROM smsen_sms_record WHERE scheduled_type='Appointment Success' and created_on='"+GlobalUtil.getCreatedDateForDB()+"' and mobile_number='918553013244' and brand_id='1' and last_cr ORDER BY id DESC LIMIT 1";
		        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='appointment success' and created_on='"+GlobalUtil.getCreatedDateForDB()+"' and mobile_number='918553013244' and brand_id='1' ORDER BY id DESC LIMIT 1";
		        String expectedSMS = "Dear Sapna, Your Phlebotomists visit scheduled at 09:30 AM on 28-Feb is completed. For tracking and downloading your reports, please visit http://stage.my.portea.com/labtat?param=MjgyMTA0XzIxODQyNzE= Your invoice amount is Rs 399.00/-, to make an online payment visit http://stage.portea.com/ap/61o8P1ate745 Ignore, if paid. For downloading your invoice please visit http://stage.my.portea.com/invoices?param=TWpneU1UQTBfTkRNdw==Manage your appointments using Portea mobile app! Download at https://www.portea.com/downloadApp or visit our patient portal at http://my.portea.com.Thank,Portea Medical";
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s","");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        System.out.println("Delivery Status :" +deliveryStatus);
		        //Assert.assertNotNull(actualSMS);
		        Verify.verifyNotNull(actualSMS);
		        //Assert.assertEquals(actualoutput,expectedoutput);
		       // Assert.assertTrue(actualoutput.contains(expectedoutput));
		        Verify.verifyNotNull(actualoutput.contains(expectedoutput));
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
		        
	       }
	       
	      // @Test
	       public void TC_Batch1_testVerifySMSSuccessfulLabReportSentToPatient()
	       {
	    	   System.out.println("Verify that Patient should recieve SMS on lab report sent to patient");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("POR281442");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/281442')]"));
			   selectPatient.click();
			   GlobalUtil.wait(2);
			   appointmentpage.addAppointmentWithoutSubscriptionforLabs("11:00 AM");
			   //appointmentpage.addAppointmentForBestAvailableClinician("9:30 AM");
			   GlobalUtil.wait(2);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
			   appointmentpage.changeStatusToSuccessful("Confirmed", "Successful");
			   GlobalUtil.wait(2);
			   //Upload Report for Patient
			   appointmentpage.uploadInvestigationReport();
			   GlobalUtil.wait(2);
			   String sqlQuery = "SELECT message FROM smsen_sms_record WHERE scheduled_type='manual' and created_on='"+GlobalUtil.getCreatedDateForDB()+"' and mobile_number='918553013244' and brand_id='1' ORDER BY id DESC LIMIT 1";
		       String sqlQueryStatus = "SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='manual' and created_on='"+GlobalUtil.getCreatedDateForDB()+"' and created_date='"+GlobalUtil.getCreatedDateForDB()+"' and mobile_number='918553013244' and brand_id='1' ORDER BY id DESC LIMIT 1";
			   String expectedSMS = "Dear Customer,Your Lab reports are ready and sent to your registered email id with Portea. For downloading your reports, please visit http://stage.my.portea.com/labtat?param=MjgyMTA0XzIxODQyNzE=You can access your medical reports anytime by loggin in to http://my.portea.com . Use your Patient ID POR282104 as login, if you dont have a password, click on 'Cant Log In' to generate new password.Or download the Portea mobile app from http://portea.com/downloadApp and login using your mobile number.Now avail a FREE Doctor Teleconsultation for 'Healthy Jodi Package' ONLY. To book, Call on 18001212323 and select 2 or write to us at customersupport@portea.com.Thank you,Portea Medical";
			   String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s","");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        System.out.println("Delivery Status :" +deliveryStatus);
		        //Assert.assertNotNull(actualSMS);
		        Verify.verifyNotNull(actualSMS);
		        //Assert.assertEquals(actualoutput,expectedoutput);
		       // Assert.assertTrue(actualoutput.contains(expectedoutput));
		        Verify.verifyNotNull(actualoutput.contains(expectedoutput));
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
	       }
	       
	       @Test
	       public void TC_Batch1_testVerifyTwoHrsBeforeConfirmationSMSForLabApptToPatient()
	       {
	    	   System.out.println("Verify that Patient should recieve SMS 2 hrs before appointment");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("POR281442");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/281442')]"));
			   selectPatient.click();
			   GlobalUtil.wait(2);
			   appointmentpage.addAppointmentWithoutSubscriptionforCurrentDay2hrsBeforeLabs();
			   GlobalUtil.wait(5);
               appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(5);
			  driver.get("https://stageops.portea.com/croncontroller/patientNotificationSmsForDay");
			  GlobalUtil.wait(10);
			   String sqlQuery="SELECT message FROM smsen_sms_record WHERE correlation_id LIKE '%2017_03_01%' and user_id='285479' and created_on ='"+GlobalUtil.getCreatedDateForDB()+"' and mobile_number='918553013244' and brand_id='1' ORDER BY id DESC LIMIT 1";
		       String sqlQueryStatus="SELECT secondary_processing_status FROM smsen_sms_record WHERE correlation_id LIKE '%2017_03_01%  and created_on='"+GlobalUtil.getCreatedDateForDB()+"' and mobile_number='918553013244' and brand_id='1' ORDER BY id DESC LIMIT 1";
			   String expectedSMS = "Dear Portea customer, Your Phlebotomist, Ms. Nithya (0000000000) will arrive at 04:15 PM.The bill value of your appointment is Rs 173.00/-. To make an online payment, please visit http://stage.portea.com/ap/615uP1atig45 or pay to your Phlebotomist.If you have already made the payment, kindly ignore the payment request. Please call us at 1800 121 2323 for any request. Your Patient Id is POR281442. -- Portea Medical";
			   GlobalUtil.wait(5);
			   String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s","");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        System.out.println("Delivery Status :" +deliveryStatus);
		        //Assert.assertNotNull(actualSMS);
		        Verify.verifyNotNull(actualSMS);
		        //Assert.assertEquals(actualoutput,expectedoutput);
		       // Assert.assertTrue(actualoutput.contains(expectedoutput));
		        Verify.verifyNotNull(actualoutput.contains(expectedoutput));
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
	       }
	       /*
	       @Test
	       public void TC_Batch1_testVerifySMSConfirmApptLabSampleAppointment()
	       {
	    	   System.out.println("Verify that Patient should recieve SMS on appointment successful");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("POR281442");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/281442')]"));
			   selectPatient.click();
			   GlobalUtil.wait(2);
			   appointmentpage.addAppointmentWithoutSubscriptionforLabs("2:00 PM");
			   //appointmentpage.addAppointmentForBestAvailableClinician("9:30 AM");
			   GlobalUtil.wait(2);
			   appointmentpage.selectProfessionalForNewAppt();
			   GlobalUtil.wait(10);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
			   //Check on DB for SMS
			    String sqlQuery = "SELECT message,secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Appointment Success' and mobile_number='918553013244' and brand_id='1' ORDER BY id DESC LIMIT 1";
		        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='appointment success' and mobile_number='918553013244' and brand_id='1' ORDER BY id DESC LIMIT 1";
		        String expectedSMS = "Dear Sapna saxena,Your Lab visit confirmed at 02:00 PM on 25-Feb.Your invoice amount is Rs500.00/-,to make an online payment visit http://stage.portea.com/ap/r2f";
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s","");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(actualSMS);
		        //Assert.assertEquals(actualoutput,expectedoutput);
		        Assert.assertTrue(actualoutput.contains(expectedoutput));
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
		        
	       }
	       
	       @Test
	       public void TC_Batch1_testVerifySMSAddApptForLabSampleAppointment()
	       {
	    	   System.out.println("Verify that Patient should recieve SMS on appointment successful");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("POR281442");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/281442')]"));
			   selectPatient.click();
			   GlobalUtil.wait(2);
			   appointmentpage.addAppointmentWithoutSubscriptionforLabs("2:00 PM");
			   //appointmentpage.addAppointmentForBestAvailableClinician("9:30 AM");
			   //GlobalUtil.wait(2);
			  // appointmentpage.selectProfessionalForNewAppt();
			   GlobalUtil.wait(5);
//			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
//			   GlobalUtil.wait(2);
			   //Check on DB for SMS
			    String sqlQuery = "SELECT message,secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Appointment Success' and mobile_number='918553013244' and brand_id='1' ORDER BY id DESC LIMIT 1";
		        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='appointment success' and mobile_number='918553013244' and brand_id='1' ORDER BY id DESC LIMIT 1";
		        String expectedSMS = "Dear Sapna saxena,Your Lab visit confirmed at 02:00 PM on 25-Feb.Your invoice amount is Rs500.00/-,to make an online payment visit http://stage.portea.com/ap/r2f";
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s","");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(actualSMS);
		        //Assert.assertEquals(actualoutput,expectedoutput);
		        Assert.assertTrue(actualoutput.contains(expectedoutput));
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
		        
	       }
	       
	       
	       @Test
	       public void TC_Batch1_testVerifySampleReportDeliveredSMSForLabSample()
	       {
	    	   System.out.println("Verify that Patient should recieve SMS on appointment successful");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("POR281442");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/281442')]"));
			   selectPatient.click();
			   GlobalUtil.wait(2);
			   appointmentpage.addAppointmentWithoutSubscriptionforLabs("2:00 PM");
			   //appointmentpage.addAppointmentForBestAvailableClinician("9:30 AM");
			   GlobalUtil.wait(2);
			   appointmentpage.selectProfessionalForNewAppt();
			   GlobalUtil.wait(10);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
			   appointmentpage.changeAppointmentStatus("Confirmed", "Successful");
			   GlobalUtil.wait(2);
			   //Check on DB for SMS
			    String sqlQuery = "SELECT message,secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Appointment Success' and mobile_number='918553013244' and brand_id='1' ORDER BY id DESC LIMIT 1";
		        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='appointment success' and mobile_number='918553013244' and brand_id='1' ORDER BY id DESC LIMIT 1";
		        String expectedSMS = "Dear Sapna saxena,Your Lab visit confirmed at 02:00 PM on 25-Feb.Your invoice amount is Rs500.00/-,to make an online payment visit http://stage.portea.com/ap/r2f";
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s","");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(actualSMS);
		        //Assert.assertEquals(actualoutput,expectedoutput);
		        Assert.assertTrue(actualoutput.contains(expectedoutput));
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
		        
	       }
		  /*
		  @Test
		   public void TC_Batch1_testVerifySMSAppointmentSuccessfulForManipalPatient()
		   {
			   System.out.println("Verify that Manipal Patient should recieve SMS on appointment successful");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("MAN534869");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/534869')]"));
			   selectPatient.click();
			   GlobalUtil.wait(2);
			   //appointmentpage.addAppointmentForAlreadyAddedService(GlobalUtil.getCurrentDate(),"9:30AM");
			   appointmentpage.addAppointmentForBestAvailableClinician("9:30 AM");
			   //appointmentpage.addAppointmentForAlreadyAddedService("9:30 AM");
			   GlobalUtil.wait(2);
			   appointmentpage.selectProfessionalForNewAppt();
			   GlobalUtil.wait(10);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
			   appointmentpage.changeStatusToSuccessful("Confirmed", "Successful");
			   GlobalUtil.wait(2);
			   //check on DB
			 //Check on DB for SMS
			    String sqlQuery = "SELECT message FROM smsen_sms_record WHERE scheduled_type='appointment success' and mobile_number='919901970749' and brand_id='2' ORDER BY id DESC LIMIT 1";
		        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='appointment success' and mobile_number='919901970749' and brand_id='2' ORDER BY id DESC LIMIT 1";
		        String expectedSMS = "Dear test Manipal now, Your Physiotherapist visit scheduled at 09:30 AM on 15-Sep is completed. Your invoice amount is Rs 700.00/-.  For downloading your invoice please visit http://goo.gl/hIhoC5.ThanksManipal Homecare";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s","");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(actualSMS);
		        Assert.assertEquals(actualoutput,expectedoutput);
		        Assert.assertTrue(actualoutput.contains(expectedoutput));
  	            //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
		   }
		   
		  
		 @Test
		   public void TC_Batch1_testVerifySMSAppointmentRescheduleForPorteaPatient()
		   {
			   System.out.println("Verify that Portea Patient should recieve SMS on reschedule appointment");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("POR035079");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(2);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/35079')]"));
			   selectPatient.click();
			   GlobalUtil.wait(2);
			   appointmentpage.addAppointmentForBestAvailableClinician("12:30 PM");
			   //appointmentpage.addAppointmentForAlreadyAddedService("9:30 AM");
			   GlobalUtil.wait(2);
			   appointmentpage.selectProfessionalForNewAppt();
			   GlobalUtil.wait(10);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
		       WebElement clickDate = driver.findElement(By.xpath("//a[contains(@id,'appointment_dateTime')]"));
		       clickDate.click();
		       appointmentpage.rescheduleAppointment();
		       driver.get("https://stageops.portea.com/croncontroller/processEventQueueToEventListener");
					   //update table event_queue_listener
			  String query = "Select object_id from event_listener where appointment_id=''";
					   //String updatesqlQuery = "UPDATE event_listener_queue SET event_created_on=now()-'INTERVAL 30 MINUTE' where object_id='SELECT object_id from event_listener' and  event_name ='appointment_status_change' and listener_name='send_cancellation_sms'"; 
			  String updateQuery ="UPDATE event_listener_queue SET event_created_on = now()-'INTERVAL 30 MINUTE'where listener_name='send_cancellation_sms' and event_name ='appointment_status_change'";
			  System.out.println(updateQuery);
			  String upQuery = DBConnector.executeSQLQuery(updateQuery);
			  GlobalUtil.wait(2);
			  driver.get("http://stageops.portea.com/croncontroller/processRescheduleSMSEvent/today");
		     //check on DB
			    String sqlQuery="SELECT message,secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='918553013244' and brand_id=1 ORDER BY id DESC";
		        String sqlQueryStatus="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='918553013244' and brand_id=1 ORDER BY id DESC";
		        String expectedSMS = "Dear Customer,We have received a payment of Rs 1 . Your Patient Id is POR035079, use this in all your communication with Portea.Pay online using Portea Mobile App! Download at http://portea.com/downloadApp Thank you-- Portea Medical";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s","");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertEquals(actualoutput,expectedoutput);
		        Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
		   }
		
		 @Test
		   public void TC_Batch1_testVerifySMSAppointmentRescheduleForManipalPatient()
		   {
			   System.out.println("Verify that Manipal Patient should recieve SMS on appointment successful");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("MAN534869");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/534869')]"));
			   selectPatient.click();
			   GlobalUtil.wait(2);
			   //appointmentpage.addAppointmentForAlreadyAddedService(GlobalUtil.getCurrentDate(),"9:30AM");
			   appointmentpage.addAppointmentForAlreadyAddedService("4:00 PM");
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
		       reason.selectByVisibleText("No Update");
		       WebElement notes = driver.findElement(By.xpath("//textarea[contains(@id,'post_notes')]"));
		       notes.sendKeys("test");
		       WebElement btn = driver.findElement(By.xpath("//button[contains(@class,'ui-button-text') and contains(.,'Reschedule')]"));
		       btn.click();
		       driver.switchTo().alert().accept();
		       GlobalUtil.wait(2);
		       driver.get("https://stageops.portea.com/croncontroller/processEventQueueToEventListener");
			   //update table event_queue_listener
			   String query = "Select object_id from event_listener";
			   //String updatesqlQuery = "UPDATE event_listener_queue SET event_created_on=now()-'INTERVAL 30 MINUTE' where object_id='SELECT object_id from event_listener' and  event_name ='appointment_status_change' and listener_name='send_cancellation_sms'"; 
			   String updateQuery ="UPDATE event_listener_queue SET event_created_on = (NOW()-'INTERVAL 30 MINUTE') where listener_name='send_cancellation_sms' and event_name ='appointment_status_change'";
			   System.out.println(updateQuery);
			   String upQuery = DBConnector.executeSQLQuery(updateQuery);
			   GlobalUtil.wait(2);
			   driver.get("http://stageops.portea.com/croncontroller/processRescheduleSMSEvent/today");
			   GlobalUtil.wait(2);
		     //check on DB
			    String sqlQuery = "SELECT message,secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='919901970749' and brand_id=2 ORDER BY id DESC LIMIT 1";
		        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='919901970749' and brand_id=2 ORDER BY id DESC LIMIT 1";
		        String expectedSMS = "Dear Customer,We have received a payment of Rs1 .Thankyou --Manipal Homecare";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s", "");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertEquals(actualoutput,expectedoutput);
		        Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
		   }
		 
		  @Test
		   public void TC_Batch1_testVerifySMSOnAppointmentCancelledByPorteaPatient()
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
			   //WebElement addApptTab = driver.findElement(By.xpath("//a[contains(@href,'/patient/appointments/') and contains(.,'Appointments')]"));
			  // addApptTab.click();
			   GlobalUtil.wait(2);
			   appointmentpage.addAppointmentForBestAvailableClinician("5:30 PM");
			   //appointmentpage.addAppointmentForAlreadyAddedService("9:30 AM");
			   GlobalUtil.wait(2);
			   appointmentpage.selectProfessionalForNewAppt();
			   GlobalUtil.wait(10);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
			   appointmentpage.changeAppointmentStatus("Confirmed", "Cancelled");
			   GlobalUtil.wait(5);
			   //appointmentpage.cancelAppointment("Patient", "Door Closed");
			   appointmentpage.cancelAppointment();
			 //check on DB
			 //run the cron
			   driver.get("https://stageops.portea.com/croncontroller/processEventQueueToEventListener");
			   //update table event_queue_listener
			   String query = "Select object_id from event_listener";
			   //String updatesqlQuery = "UPDATE event_listener_queue SET event_created_on=now()-'INTERVAL 30 MINUTE' where object_id='SELECT object_id from event_listener' and  event_name ='appointment_status_change' and listener_name='send_cancellation_sms'"; 
			   String updateQuery ="UPDATE event_listener_queue SET event_created_on = now()-'INTERVAL 30 MINUTE'where listener_name='send_cancellation_sms' and event_name ='appointment_status_change'";
			   System.out.println(updateQuery);
			   String upQuery = DBConnector.executeSQLQuery(updateQuery);
			   GlobalUtil.wait(2);
			   driver.get("http://stageops.portea.com/eventcroncontroller/processCancelledSMSEvent");
			   GlobalUtil.wait(2);
			   String sqlQuery = "SELECT message, secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='appointment cancel' and mobile_number='918553013244' and brand_id=1 and receiver_type='patient' ORDER BY id DESC LIMIT 1";
		        //String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='918553013244' and brand_id=2 ORDER BY id DESC";
		        String expectedSMS = "Dear Sapna Saxena,We have received request to cancel the visit for Physiotherapy service at 5:30 pm on 2016-09-15. If you have not requested for the same, please send an SMS to 9980856484 and type NC. You could reach us at 1800 121 2323 to create another appointment. We understand that you may need to cancel your appointment sometimes.Your Patient Id is POR035079.-- Portea Medical";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
//		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
//		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s", "");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        //System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertEquals(actualoutput,expectedoutput);
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
		   }
		   
		   @Test
		   public void TC_Batch1_testVerifySMSAppointmentCancelForManipalPatient()
		   {
			   System.out.println("Verify that Manipal Patient should recieve SMS on appointment cancel");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("MAN534869");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/534869')]"));
			   selectPatient.click();
			   GlobalUtil.wait(2);
			   appointmentpage.addAppointmentForAlreadyAddedService("11:00 AM");
			   GlobalUtil.wait(2);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
			   appointmentpage.changeAppointmentStatus("Confirmed", "Cancelled");
			   //run the cron
			    driver.get("https://stageops.portea.com/croncontroller/processEventQueueToEventListener");
			   //update table event_queue_listener
			   String query = "Select object_id from event_listener";
			   //String updatesqlQuery = "UPDATE event_listener_queue SET event_created_on=now()-'INTERVAL 30 MINUTE' where object_id='SELECT object_id from event_listener' and  event_name ='appointment_status_change' and listener_name='send_cancellation_sms'"; 
			   String updateQuery ="UPDATE event_listener_queue SET event_created_on = now()-'INTERVAL 30 MINUTE'where listener_name='send_cancellation_sms' and event_name ='appointment_status_change'";
			   System.out.println(updateQuery);
			   String upQuery = DBConnector.executeSQLQuery(updateQuery);
			   GlobalUtil.wait(2);
			   driver.get("http://stageops.portea.com/eventcroncontroller/processCancelledSMSEvent");
			   GlobalUtil.wait(2);
			   //update table event_queue_listener
			   //String query = "Select object_id from event_listener";
			   //String updatesqlQuery = "UPDATE event_listener_queue SET event_created_on = 'now()-INTERVAL 30 MINUTE' where object_id='SELECT object_id from event_listener' and  event_name ='appointment_status_change' and listener_name='send_cancellation_sms'"; 
			   
			 //check on DB
			   
			    String sqlQuery = "SELECT message,secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='919901970749' and brand_id=2 ORDER BY id DESC LIMIT 1";
		       // String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='919901970749' and brand_id=2 ORDER BY id DESC";
		        String expectedSMS = "Dear Customer,We have received a payment of Rs1 .Thankyou --Manipal Homecare";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        //String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s", "");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		       // System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertEquals(actualoutput,expectedoutput);
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
		   }
		   
		   @Test
		   public void TC_Batch1_testVerifySMSForRequestPaymentURLForPorteaPatient()
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
			   WebElement sendURL=driver.findElement(By.xpath("//a[text()='Send']"));
			   //td/a[contains(@class,'edit-label') and contains(@onclick,'http://stage.portea.com/pay')]"));
			   sendURL.click();
//			   WebElement send = driver.findElement(By.xpath("//a[text()='Send Email']"));
//			   send.click();
			 //check on DB
			    String sqlQuery = "SELECT message,secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='918553013244' and brand_id=1 ORDER BY id DESC LIMIT 1";
		        //String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='918553013244' and brand_id=2 ORDER BY id DESC";
		        String expectedSMS = "Dear Sapna saxena,We have initiated an online payment request for the payment of Rs 1.00. You can make the payment by visiting www.portea.com/pay/";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		       // String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s", "");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        //System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertTrue(actualoutput.contains(expectedoutput));
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
		   }
		   
		  // @Test (Not applicable for Manipal)
		   public void TC_Batch1_testVerifySMSOfRequestPaymentURLForManipalPatient()
		   {
			   System.out.println("Verify that Manipal Patient should recieve sms for payment url to make payment");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("MAN534869");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/534869')]"));
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
			   WebElement sendURL=driver.findElement(By.xpath("//a[text()='Send']"));
			   		//"//td/a[contains(@class,'edit-label') and contains(@onclick,'http://stage.portea.com/pay')]"));
			   sendURL.click();
//			   WebElement send = driver.findElement(By.xpath("//a[text()='Send Email']"));
//			   send.click();
			 //check on DB
			    String sqlQuery = "SELECT message,secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='919901970749' and brand_id=2 ORDER BY id DESC LIMIT 1";
		        //String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='918553013244' and brand_id=2 ORDER BY id DESC";
		        String expectedSMS = "Dear Sapna saxena,We have initiated an online payment request for the payment of Rs 1.00. You can make the payment by visiting www.portea.com/pay/";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		       // String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s", "");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		       // System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertTrue(actualoutput.contains(expectedoutput));
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
			  
		   }
		   
		  @Test
		   public void TC_Batch1_testVerifySMSForPatientReminder()
		   {
			   System.out.println("Verify that Patient should recieve SMS on appointment reminder");
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
			   appointmentpage.addAppointmentForAlreadyAddedService("7:00 PM");
			   GlobalUtil.wait(2);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
			   driver.get("https://stageops.portea.com/croncontroller/patientNotificationSmsForNextDay");
			 //check on DB
			    String sqlQuery = "SELECT message,secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='918553013244' and brand_id=1 ORDER BY id DESC LIMIT 1";
		        //String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='918553013244' and brand_id=1 ORDER BY id DESC";
		        String expectedSMS = "Dear Customer,Your Physiotherapist visit scheduled at 07:00 PM on 16-Sep is completed. Your invoice amount is Rs 500.00/-, to make an online payment visit http://stage.portea.com/ap/r2fP11zzx35 Ignore, if paid. For downloading your invoice please visit http://stagemy.portea.com/invoices?param=TXpVd056az1fTVRJNE9ESTBPQT09. Manage your appointments using Portea mobile app! Download at http://portea.com/downloadApp or visit our patient portal at http://my.portea.com ThanksPortea Medical";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        //String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s", "");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        //System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertEquals(actualoutput,expectedoutput);
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY"); 
		   }
		   
		 @Test
		   public void TC_Batch1_testVerifySMSForManipalPatientReminder()
		   {
			   System.out.println("Verify that Manipal Patient should recieve SMS on appointment successful");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("MAN534869");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/534869)]"));
			   selectPatient.click();
			   GlobalUtil.wait(2);
			   //Add Appointment for tomorrow (appt time <= 8AM)
			   appointmentpage.addAppointmentForAlreadyAddedService("8:00 AM");
			   GlobalUtil.wait(2);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
			   driver.get("https://stageops.portea.com/croncontroller/patientNotificationSmsForNextDay");
			 //check on DB
			    String sqlQuery = "SELECT message,secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number='919901970749' and brand_id=2 ORDER BY id DESC LIMIT 1";
		  
		        String expectedSMS = "Dear Customer,We have received a payment of Rs1 .Thankyou --Manipal Homecare";
		        //Getting employee name by Id
		        String actualSMS=DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s", "");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        Assert.assertEquals(actualoutput,expectedoutput);
		   }
		   
		 @Test
		   public void TC_Batch1_testVerifySMSInvoiceGeneratedForPorteaPatient()
		   {
			   System.out.println("Verify that Portea Patient should received Invoice generation SMS");
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
			   //Invoice Generation
			   WebElement clickOnInvoiceTab = driver.findElement(By.xpath("//a[contains(@href,'/patient/invoice')]"));
			   clickOnInvoiceTab.click();
			   GlobalUtil.wait(2);
			   WebElement startDate = driver.findElement(By.xpath("//input[contains(@id,'startdate')]"));
			   startDate.click();
			   startDate.sendKeys("2016-06-01");
			   WebElement endDate= driver.findElement(By.xpath("//input[contains(@id,'enddate')]"));
			   endDate.click();
			   endDate.sendKeys("2016-09-22");
			   GlobalUtil.wait(2);
			   WebElement previewBtn = driver.findElement(By.xpath("//button[contains(@id,'previewBtn')]"));
			   previewBtn.click();
			   GlobalUtil.wait(2);
			   WebElement generateBtn = driver.findElement(By.xpath("//input[contains(@type,'button') and contains(@value,'Generate')]"));
			   generateBtn.click();
			   GlobalUtil.wait(2);
			   driver.switchTo().alert().accept();
			   GlobalUtil.wait(5);
			   String pdfGeneratorCron ="https://stageops.portea.com/croncontroller/pdfGenerator";
			   driver.navigate().to(pdfGeneratorCron);
			   GlobalUtil.wait(2);
			   driver.navigate().back();
			   GlobalUtil.wait(5); 
			   System.out.println("Send Notification");
			   WebElement sendNotificationbtn = driver.findElement(By.xpath("//a[contains(@class,'edit-label') and contains(.,'Send Notification')]"));
			   GlobalUtil.wait(2);
			   sendNotificationbtn.click(); 
			   GlobalUtil.wait(2);
			   driver.switchTo().alert().accept();
			   GlobalUtil.wait(2);
			   //Check on DB for SMS
			    String sqlQuery = "SELECT message FROM smsen_sms_record WHERE scheduled_type='Invoice Generated' and mobile_number='918553013244' and receiver_type='Patient' and brand ='1' ORDER BY id DESC LIMIT 1";
		        //String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Invoice Generated' and mobile_number='918553013244' and brand_id=1 ORDER BY id DESC";
		        String expectedSMS="Dear Customer,Your invoice for period 2016-06-01 to 2016-09-22 is generated.Please visit my.portea.com to download your invoice.Use your Patient ID POR035079 as login, if you dont have a password, click on 'Cant Log In' to generate new password.--Portea Medical";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        //String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput=actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s", "");
		        System.out.println("Actual SMS :" +actualSMS);
		        GlobalUtil.wait(10);
		//        System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(actualSMS);
		        Assert.assertEquals(actualoutput,expectedoutput);
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
		        
		   }
		  
		   
		   @Test
		   public void TC_Batch1_testVerifySMSInvoiceGeneratedForManipalPatient()
		   {
			   System.out.println("Verify that Manipal Patient should received Invoice generation SMS");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   WebElement searchPatient = driver.findElement(By.xpath("//input[contains(@name,'search')]"));
			   searchPatient.sendKeys("MAN534869");
			   GlobalUtil.wait(1);
			   WebElement searchBtn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			   searchBtn.click();
			   GlobalUtil.wait(1);
			   WebElement selectPatient = driver.findElement(By.xpath("//a[contains(@href,'https://stageops.portea.com/patient/details/534869')]"));
			   selectPatient.click();
			   GlobalUtil.wait(2);
			   //Invoice Generation
			   WebElement clickOnInvoiceTab = driver.findElement(By.xpath("//a[contains(@href,'/patient/invoice')]"));
			   clickOnInvoiceTab.click();
			   GlobalUtil.wait(2);
			   WebElement startDate = driver.findElement(By.xpath("//input[contains(@id,'startdate')]"));
			   startDate.click();
			   startDate.sendKeys("2016-06-01");
			   WebElement endDate= driver.findElement(By.xpath("//input[contains(@id,'enddate')]"));
			   endDate.click();
			   endDate.sendKeys("2016-09-22");
			   GlobalUtil.wait(2);
			   WebElement previewBtn = driver.findElement(By.xpath("//button[contains(@id,'previewBtn')]"));
			   previewBtn.click();
			   GlobalUtil.wait(2);
			   WebElement generateBtn = driver.findElement(By.xpath("//input[contains(@type,'button') and contains(@value,'Generate')]"));
			   generateBtn.click();
			   GlobalUtil.wait(2);
			   driver.switchTo().alert().accept();
			   GlobalUtil.wait(5);
			   String pdfGeneratorCron ="https://stageops.portea.com/croncontroller/pdfGenerator";
			   driver.navigate().to(pdfGeneratorCron);
			   GlobalUtil.wait(2);
			   driver.navigate().back();
			   GlobalUtil.wait(5); 
			   WebElement sendNotificationbtn = driver.findElement(By.xpath("//a[contains(@class,'edit-label') and contains(.,'Send Notification')]"));
			   sendNotificationbtn.click(); 
			   driver.switchTo().alert().accept();
			   //Check on DB for SMS
			    String sqlQuery = "SELECT message FROM smsen_sms_record WHERE scheduled_type='Invoice Generated' and mobile_number='919901970749' and brand_id=2 and receiver_type='patient' ORDER BY id DESC LIMIT 1";
		        //String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Invoice Generated' and mobile_number='918553013244' and brand_id=2 ORDER BY id DESC";
		        String expectedSMS = "Dear Customer,Your invoice for period 2016-06-01 to 2016-09-22 is generated and sent to your registered email-id.-- Manipal Homecare";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        //String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        //String actualoutput=actualSMS.replaceAll("\\s", "");
		        String expectedoutput=expectedSMS.replaceAll("\\s", "");
		        System.out.println("Actual SMS :" +actualSMS);
		        GlobalUtil.wait(10);
		        //System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(actualSMS);
		        Assert.assertEquals(actualSMS,expectedoutput);
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
		        
		   }
		   

		   @Test
		   public void TC_Batch1_testVerifyFirstVisitSMSForPorteaPatient()
		   {
			   System.out.println("Verify that Portea Patient should received first visit SMS");
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   PatientModal patientModal = PatientModal.getDefaultPatientDetails();
			   patientModal.setSalutation(SALUTATION.Mr);
			   patientModal.setBrand(BRAND.Portea);
			   patientModal.setGender(GENDER.Male);
			   patientpage.addPatient(patientModal);
			   appointmentpage.addKYC("Physiotheraphy");
			   GlobalUtil.wait(2);
			   appointmentpage.addAppointmentWithAlreadyKYC("Physiotherapy","9:30 AM");
			   GlobalUtil.wait(2);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
			   //appointmentpage.changeAppointmentStatus("Confirmed", "Successful");
			   //run cron for first Visit SMS
			   driver.get("https://stageops.portea.com/croncontroller/sendPatientFirstAppointmentSms");
			   driver.navigate().back();
			   //Check on DB for SMS
			    String sqlQuery = "SELECT message, scheduled_id FROM smsen_sms_record WHERE scheduled_type='Invoice Generated' and mobile_number='918553013244' and brand_id=1 and receiver_type='patient' ORDER BY id DESC";
		        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Invoice Generated' and mobile_number='918553013244 and brand_id=1 ORDER BY id DESC";
		        String expectedSMS = "";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput = actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s", "");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(actualSMS);
		        Assert.assertEquals(actualoutput,expectedoutput);
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY");
		        
		   }
		   
		   //@Test
		   public void TC_Batch1_testVerifyFeedBackSMSForPorteaPatient()
		   {
			   System.out.println("Verify that Portea Patient should received SMS on giving missed call as Yes for feedback response");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   PatientModal patientModal = PatientModal.getDefaultPatientDetails();
			   patientModal.setSalutation(SALUTATION.Mr);
			   patientModal.setBrand(BRAND.Portea);
			   patientModal.setGender(GENDER.Male);
			   //patientModal.setLocality(LOCALITY.DomlurBusStand);
			   patientpage.addPatient(patientModal);
			   appointmentpage.addKYC("Physiotheraphy");
			   GlobalUtil.wait(2);
			   appointmentpage.addAppointmentWithAlreadyKYC("Physiotherapy", "11:00 AM");
			   GlobalUtil.wait(2);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
			   appointmentpage.changeAppointmentStatus("Confirmed", "Successful");
			   //run cron for feedback SMS
			   driver.get("http://stageops.portea.com/croncontroller/firstAppointmentFeedback");
			   driver.navigate().back();
			   //Check on DB for SMS
			    String sqlQuery = "SELECT message, scheduled_id FROM smsen_sms_record WHERE scheduled_type='Invoice Generated' and mobile_number='918553013244' and brand_id=2 and receiver_type='patient' ORDER BY id DESC";
		        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Invoice Generated' and mobile_number='918553013244' and brand_id=2 ORDER BY id DESC";
		        String expectedSMS = "Dear Customer,Your invoice for period 2016-06-01 to 2016-06-30 is generated and sent to your registered email-id.-- Manipal Homecare";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput = actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s", "");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(actualSMS);
		        Assert.assertEquals(actualoutput,expectedoutput);
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY"); 
		   }
		   
		   //@Test
		   public void TC_Batch1_testVerifyYesResponseForFeedBackSMSForPorteaPatient()
		   {
			   System.out.println("Verify that Portea Patient should received SMS on giving missed call as Yes for feedback response");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   PatientModal patientModal = PatientModal.getDefaultPatientDetails();
			   patientModal.setSalutation(SALUTATION.Mr);
			   patientModal.setBrand(BRAND.Portea);
			   patientModal.setGender(GENDER.Male);
			   //patientModal.setLocality(LOCALITY.DomlurBusStand);
			   patientpage.addPatient(patientModal);
			   appointmentpage.addKYC("Physiotheraphy");
			   GlobalUtil.wait(2);
			   appointmentpage.addAppointmentWithAlreadyKYC("Physiotherapy", "4:00 PM");
			   GlobalUtil.wait(2);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
			   appointmentpage.changeAppointmentStatus("Confirmed", "Successful");
			   //run cron for feedback SMS
			   driver.get("http://stageops.portea.com/croncontroller/firstAppointmentFeedback");
			   driver.navigate().back();
			   //run cron for YES missed call
			   driver.get("http://stageops.portea.com/webservice/missedCallPatientResponse?api_key=portea&time=10-06-14&sid=20982003128127&event=NewCall&called_number=918067264653&cid=07795752911");
			   GlobalUtil.wait(2);
			   //run cron for process missed call
			   driver.get("http://stageops.portea.com/croncontroller/processMissCalldata");
			   //Check on DB for SMS
			    String sqlQuery = "SELECT message, scheduled_id FROM smsen_sms_record WHERE scheduled_type='Invoice Generated' and mobile_number='919901970749' and brand_id=2 and receiver_type='patient' ORDER BY id DESC";
		        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='Invoice Generated' and mobile_number='919901970749' and brand_id=2 ORDER BY id DESC";
		        String expectedSMS = "Dear Customer,Your invoice for period 2016-06-01 to 2016-06-30 is generated and sent to your registered email-id.-- Manipal Homecare";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput = actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s", "");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(actualSMS);
		        Assert.assertEquals(actualoutput,expectedoutput);
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY"); 
		   }
		   
		   //@Test
		   public void TC_Batch1_testVerifyNoResponseForFeedBackSMSForPorteaPatient()
		   {
			   System.out.println("Verify that Portea Patient should received SMS on giving missed call as No for feedback response");
			   loginpage.doLogin(uname, passwd);
			   GlobalUtil.wait(2);
			   homepage.openPatientListPage();
			   PatientModal patientModal = PatientModal.getDefaultPatientDetails();
			   patientModal.setSalutation(SALUTATION.Mr);
			   patientModal.setBrand(BRAND.Portea);
			   patientModal.setGender(GENDER.Male);
			   //patientModal.setLocality(LOCALITY.DomlurBusStand);
			   patientpage.addPatient(patientModal);
			   appointmentpage.addKYC("Physiotheraphy");
			   GlobalUtil.wait(2);
			   appointmentpage.addAppointmentWithAlreadyKYC("Physiotherapy","5:30 PM");
			   GlobalUtil.wait(2);
			   appointmentpage.changeAppointmentStatus("Pending", "Confirmed");
			   GlobalUtil.wait(2);
			   appointmentpage.changeAppointmentStatus("Confirmed", "Successful");
			   //run cron for feedback SMS
			   driver.get("http://stageops.portea.com/croncontroller/firstAppointmentFeedback");
			   driver.navigate().back();
			   //run cron for No missed call
			   driver.get("http://stageops.portea.com/webservice/missedCallPatientResponse?api_key=portea&time=10-06-14&sid=20982003128127&event=NewCall&called_number=918067264654&cid=07795752911");
			   GlobalUtil.wait(2);
			   //run cron for process missed call
			   driver.get("http://stageops.portea.com/croncontroller/processMissCalldata");
			   //Check on DB for SMS
			    String sqlQuery = "SELECT message, scheduled_id FROM smsen_sms_record WHERE scheduled_type='appointment' and mobile_number='918553013244' and brand_id=1 and receiver_type='patient' ORDER BY id DESC";
		        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='appointment' and mobile_number='918553013244' and brand_id=1 ORDER BY id DESC";
		        String expectedSMS = "Dear Customer,We value your feedback. Are you happy with the treatment given to you, would you recommend our services to your friends AND family? If your answer is yes, give a missed call to 08067264653. If you are not satisfied with our service, give a missed call to 08067264654.Alternatively, you can download our app http://portea.com/downloadApp or visit my.portea.com to leave us a feedback.Your Patient Id is POR199834, please use this in all your communication with Portea. -- Portea Medical";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
		        GlobalUtil.wait(10);
		        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
		        GlobalUtil.wait(10);
		        String actualoutput = actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s", "");
		        System.out.println("Actual SMS :" +actualoutput);
		        GlobalUtil.wait(10);
		        System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(actualSMS);
		        Assert.assertEquals(actualoutput,expectedoutput);
		        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY"); 
		   }
		  
		   /****************************************************************************
		    * Batch 2 SMS: SMS to submit lead from any portea landing page
		    *//***************************************************************************/
		 /*
	@Test
	 public void TC_Batch2_testVerifyLeadSMS()
	   {
		   System.out.println("Verify that user should recieve SMS on submitting any lead through portea portal");
		   driver.get("http://stage.portea.com/lp/physiotherapy-10");
		   WebElement name = driver.findElement(By.xpath("//input[contains(@id,'name')]"));
		   name.sendKeys(GlobalUtil.getRandomName(6));
		   WebElement mobileNo = driver.findElement(By.xpath("//input[contains(@id,'phoneNumber')]"));
		   mobileNo.sendKeys("8553013244");
		   WebElement btn = driver.findElement(By.xpath("//input[contains(@id,'bigbutton')]"));
		   btn.click();
		   //run cron
		   driver.get("http://stage.portea.com/croncontroller/entryInCrmForPendingStatus");
		   driver.navigate().back();
		   
		   //Check on DB for SMS
		    String sqlQuery = "SELECT message FROM smsen_sms_record WHERE scheduled_type='lead' and receiver_type='lead' and brand_id=1 ORDER BY id DESC";
	        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='appointment' and mobile_number='918553013244' and brand_id=1 ORDER BY id DESC";
	        String expectedSMS = "DearCustomer,ThankyouforyourinterestinPorteaMedical.Ourcustomercareteamwillgetintouchwithyoushortly.Ifyouhaveanyqueries,pleasefeelfreetoreachusat18001212323.Yourprimarynumberforcommunicationswithusis1111111111.Chatwithadoctor,bookappointmentsusingPorteaMobileApp!Downloadathttp://portea.com/downloadApp--PorteaMedical";
	        //Getting employee name by Id
	        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
	        GlobalUtil.wait(10);
	        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
	        GlobalUtil.wait(10);
	        String actualoutput = actualSMS.replaceAll("\\s","");
	        String expectedoutput=expectedSMS.replaceAll("\\s", "");
	        System.out.println("Actual SMS :" +actualoutput);
	        GlobalUtil.wait(10);
	        System.out.println("Delivery Status :" +deliveryStatus);
	        Assert.assertNotNull(actualSMS);
	        Assert.assertEquals(actualoutput,expectedoutput);
	        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY"); 
	   }
	
		   /****************************************************************************
		    * Batch 3 SMS: Convert Lead to Patient
		    *//**************************************************************************/
		  /*
		  @Test
			 public void TC_Batch3_testVerifySMSOnConvertLeadToPatient()
			   {
				   System.out.println("Verify that user should recieve SMS on converting lead to patient.");
				   loginpage.doLogin(uname, passwd);
				   GlobalUtil.wait(2);
				   homepage.openLeadsPage();
				   GlobalUtil.wait(5);
				   //Add Lead
				    WebElement addleadbtn = driver.findElement(By.xpath("//a[text()='Add Lead']"));
				    addleadbtn.click();
					GlobalUtil.wait(5);
				   leadpage.addLead();
				   GlobalUtil.wait(5);
				   //Check on DB for SMS
				    String sqlQuery = "SELECT message, scheduled_id FROM smsen_sms_record WHERE scheduled_type='lead' and receiver_type='lead' and brand_id=1 and receiver_type='patient' ORDER BY id DESC";
			        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='appointment' and mobile_number='918553013244' and brand_id=1 ORDER BY id DESC";
			        String expectedSMS = "Dear Customer,Thank you for your interest in Portea Medical. Our customer care team will get in touch with you shortly.If you have any queries, please feel free to reach us at 1800 121 2323. Your primary number for communications with us is 2342342342.Chat with a doctor, book appointments using Portea Mobile App! Download at http://portea.com/downloadApp-- Portea Medical";
			        //Getting employee name by Id
			        String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
			        GlobalUtil.wait(10);
			        String deliveryStatus=DBConnector.executeSQLQuery(sqlQueryStatus);
			        GlobalUtil.wait(10);
			        String actualoutput = actualSMS.replaceAll("\\s","");
			        String expectedoutput=expectedSMS.replaceAll("\\s", "");
			        System.out.println("Actual SMS :" +actualoutput);
			        GlobalUtil.wait(10);
			        System.out.println("Delivery Status :" +deliveryStatus);
			        Assert.assertNotNull(actualSMS);
			        Assert.assertEquals(actualoutput,expectedoutput);
			        //Assert.assertEquals(deliveryStatus, "SUCCESSFUL_DELIVERY"); 
			   }

		/*---------------------------------------------------------------------------------------------------
		 * Batch 6 SMS: Link Wallet OTP SMS, Forgot Password OTP, Registration OTP, Patient SMS Verification
		 * --------------------------------------------------------------------------------------------------
		 * */
		
		/*
		   @Test
			public void TC_Batch6_testVerifyLinkWalletOTPSMS()
			{
				System.out.println("Verify that user should get SMS on linking wallet");
				driver.get("http://stage.my.portea.com");
				GlobalUtil.wait(2);
				WebElement mobNo = driver.findElement(By.xpath("//input[contains(@name,'patientID')]"));
				mobNo.sendKeys("8553013244");
				GlobalUtil.wait(2);
				WebElement pwd = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
				pwd.sendKeys("123456");
				GlobalUtil.wait(2);
				WebElement login = driver.findElement(By.xpath("//input[contains(@value,'login')]"));
				login.click();
				GlobalUtil.wait(5);
				WebElement skip = driver.findElement(By.xpath("//a[contains(@class,'skip-rating')]"));
				skip.click();
				GlobalUtil.wait(2);
				WebElement wallet=driver.findElement(By.xpath("//a[contains(@href,'https://stage.my.portea.com/wallet')]"));
				Actions ele = new Actions(driver);
				ele.moveToElement(wallet).click();
				//wallet.click();
				GlobalUtil.wait(2);
				WebElement registerWallet = driver.findElement(By.xpath("//input[contains(@id,'registerWallet')]"));
				registerWallet.click();
				GlobalUtil.wait(2);
				WebElement linkWallet = driver.findElement(By.xpath("//input[contains(@id,'linkWallet')]"));
				linkWallet.click();
				GlobalUtil.wait(2);
				String sqlQuery = "SELECT otp FROM 'otp_verification' WHERE mobileNumber = '918553013244' ORDER BY 'id' DESC";
		        String sqlQueryMsg = "SELECT message FROM smsen_sms_records WHERE mobileNumber='918553013244' ORDER BY id DESC";
		        String expectedSMS = "Dear Customer,  '"+sqlQuery+"' is your OTP for patient id, POR035079";
		        //Getting employee name by Id
		        String actualSMS = DBConnector.executeSQLQuery(sqlQueryMsg);
		        GlobalUtil.wait(10);
		        String actualoutput = actualSMS.replaceAll("\\s","");
		        String expectedoutput=expectedSMS.replaceAll("\\s","");
		        System.out.println("Actual SMS :" +actualoutput);
		        System.out.println("Expected SMS:" +expectedSMS);
		        GlobalUtil.wait(10);
		        //System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(actualSMS);
		        Assert.assertTrue(sqlQueryMsg.contains(sqlQuery));
			}
			
		   @Test
			public void TC_Batch6_testVerifyForgotPasswordOTPSMS()
			{
				System.out.println("Verify that user should get OTP SMS on Forgot Password");
				driver.get("http://stage.my.portea.com");
				GlobalUtil.wait(2);
				WebElement mobNo = driver.findElement(By.xpath("//input[contains(@name,'patientID')]"));
				mobNo.sendKeys("8553013244");
				GlobalUtil.wait(2);
				WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[contains(@class,'forgot_password')]"));
				forgotPasswordLink.click();
				GlobalUtil.wait(2);
				String expectedMsg ="OTP has been sent to 85XXXXXX44";
				WebElement msg = driver.findElement(By.xpath("//span[contains(@class,'field-success otp-success')]"));
				Assert.assertEquals(expectedMsg, msg.getText());
				//Connect to DB
				String sqlQuery = "SELECT otp FROM 'otp_verification' WHERE mobileNumber = '8553013244' ORDER BY 'id' DESC";
		        String sqlQueryMsg = "SELECT message FROM smsen_sms_records WHERE mobileNumber='8553013244' ORDER BY id DESC";
		        
		        String getOTP=DBConnector.executeSQLQuery(sqlQuery);
		        String OTPSMS = DBConnector.executeSQLQuery(sqlQueryMsg);
		        GlobalUtil.wait(10);
		        String actualoutput = OTPSMS.replaceAll("\\s","");
		        //String expectedoutput=expectedSMS.replaceAll("\\s","");
		        System.out.println("Actual SMS :" +actualoutput);
		        String expectedSMS = "Dear Customer,'"+getOTP+"' is your OTP for patient id, POR035079";
		        System.out.println("Expected SMS:" +expectedSMS);
		        GlobalUtil.wait(10);
		        //System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(OTPSMS);
		        Assert.assertTrue(OTPSMS.contains(getOTP));
			}
		   
		   @Test
		   public void TC_Batch6_testVerifyRegistrationOTPSMS()
			{
				System.out.println("Verify that user should get OTP SMS on Registration");
				driver.get("http://stage.my.portea.com");
				GlobalUtil.wait(2);
				WebElement regLink = driver.findElement(By.xpath("//a[contains(@class,'new-user-link')]"));
				regLink.click();
				GlobalUtil.wait(2);
				WebElement mobileNo = driver.findElement(By.xpath("//input[contains(@name,'mobile')]"));
				mobileNo.sendKeys("8553013244");
				GlobalUtil.wait(2);
				WebElement getStarted = driver.findElement(By.xpath("//input[contains(@id,'registerSubmit')]"));
				getStarted.click();
				GlobalUtil.wait(2);
				String sqlQuery = "SELECT otp FROM 'otp_verification' WHERE mobileNumber = '8553013244' ORDER BY 'id' DESC";
				String otp = DBConnector.executeSQLQuery(sqlQuery);
				System.out.println("OTP:" +otp);
				Assert.assertNotNull(otp);
				String sqlQueryMsg = "SELECT message FROM smsen_sms_records WHERE mobileNumber='8553013244' ORDER BY id DESC";
				String OTPSMS = DBConnector.executeSQLQuery(sqlQueryMsg);
		        GlobalUtil.wait(10);
		        String actualoutput = OTPSMS.replaceAll("\\s","");
		        //String expectedoutput=expectedSMS.replaceAll("\\s","");
		        System.out.println("Actual SMS :" +actualoutput);
		        String expectedSMS = "Dear Customer,'"+otp+"' is your OTP for Portea mobile verification";
		        System.out.println("Expected SMS:" +expectedSMS);
		        GlobalUtil.wait(10);
		        //System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(OTPSMS);
		        Assert.assertTrue(OTPSMS.contains(otp));
//				WebElement enterOTP= driver.findElement(By.xpath("//input[contains(@name,'otp')]"));
//				enterOTP.sendKeys(otp);
//				GlobalUtil.wait(2);
//				getStarted.click();
//				GlobalUtil.wait(2);
				
			}
		   

			/*---------------------------------------------------------------------------------------------------
			 * Batch 3 SMS: Patient Registration SMS, Reward SMS For Add Family, Reward for Add Existing patient as Family,
			 *              SMS For Pharmacy Order, SMS for order confirmation, SMS on out for delivery, SMS on delivery completed
			 *              SMS on cancel order,SMS on order cancel through Ops portal.
			 * --------------------------------------------------------------------------------------------------
			 * */
		  /*
		   @Test
		   public void TC_Batch3_testVerifySMSOnPharmacyOrder()
		   {
			   System.out.println("Verify that user should get SMS on order Pharmacy");
			   driver.get("http://stage.pharmacy.portea.com");
			   WebElement searchMedicine = driver.findElement(By.xpath("//input[contains(@placeholder,'Search medicines')]"));
			   searchMedicine.sendKeys("Crocin",Keys.DOWN);
			   GlobalUtil.wait(2);
			   WebElement pinCode = driver.findElement(By.xpath("//input[contains(@class,'cart-item-quantity input')]"));
			   pinCode.click();
			   GlobalUtil.wait(1);
			   pinCode.sendKeys("560071");
			   GlobalUtil.wait(2);
			   WebElement proceed = driver.findElement(By.xpath("//button[contains(text(),'Proceed')]"));
			   proceed.click();
			   GlobalUtil.wait(2);
			   WebElement mobNo = driver.findElement(By.xpath("//input[contains(@name,'patientID')]"));
				mobNo.sendKeys("8553013244");
				GlobalUtil.wait(2);
				WebElement pwd = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
				pwd.sendKeys("123456");
				GlobalUtil.wait(2);
				WebElement login = driver.findElement(By.xpath("//input[contains(@value,'login')]"));
				login.click();
				GlobalUtil.wait(5);
				proceed.click();
				GlobalUtil.wait(2);
				WebElement presTitle= driver.findElement(By.xpath("//input[contains(@id,'prescriptionTitle')]"));
				presTitle.sendKeys("test");
				GlobalUtil.wait(2);
				WebElement uploadPres = driver.findElement(By.xpath("//input[contains(@id,'upload-btn')]"));
				uploadPres.click();
				File file = new File("C:/Users/Public/Pictures/Sample Pictures/Tulips");
				file.getAbsoluteFile();
				WebElement switchON = driver.findElement(By.xpath("//span[contains(@class,'switchery switchery-default')]"));
				switchON.click();
				GlobalUtil.wait(2);
				WebElement OK= driver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
				OK.click();
				GlobalUtil.wait(2);
				WebElement selRadio = driver.findElement(By.xpath("//div/input[contains(@type,'radio') and contains(@value,'28475')]"));
				selRadio.click();
				GlobalUtil.wait(2);
				WebElement continueBtn = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
				continueBtn.click();
				WebElement selIagree = driver.findElement(By.xpath("//input[contains(@type,'checkbox')]"));
				selIagree.click();
				WebElement placeOrder = driver.findElement(By.xpath("//button[contains(text(),'Place order')]"));
				placeOrder.click();
				String sqlQueryMsg = "SELECT message FROM smsen_sms_records WHERE mobileNumber='8553013244' ORDER BY id DESC";
				String OTPSMS = DBConnector.executeSQLQuery(sqlQueryMsg);
		        GlobalUtil.wait(10);
		        String actualoutput = OTPSMS.replaceAll("\\s","");
		        //String expectedoutput=expectedSMS.replaceAll("\\s","");
		        System.out.println("Actual SMS :" +actualoutput);
		        String expectedSMS = "Your indent no. '' has been recieved and forwarded to Pharamchy team for prescription validation. We will reach out to you in case of any concerns.";
		        System.out.println("Expected SMS:" +expectedSMS);
		        GlobalUtil.wait(10);
		        //System.out.println("Delivery Status :" +deliveryStatus);
		        Assert.assertNotNull(OTPSMS);
		        //Assert.assertTrue(OTPSMS.contains(otp));
		   }
		   
		   */
	       /*
		  // @Test
		   public void TC_Batch3_testVerifySMSOnPharmacyOrderConfirmation()
		   {
			   
		   }
		   
		   //@Test
		   public void TC_Batch3_testVerifySMSOnPharmacyOrderOutForDelivery()
		   {
			   
		   }
		   
		   //@Test
		   public void TC_Batch3_testVerifySMSOnPharmacyOrderCompleted()
		   {
			   
		   }
		   
		  //@Test
		   public void TC_Batch3_testVerifySMSOnPharmacyOrderCancel()
		   {
			   
		   }
		   */
		   //Add Appoinment for LABS
		   
		   
	}


