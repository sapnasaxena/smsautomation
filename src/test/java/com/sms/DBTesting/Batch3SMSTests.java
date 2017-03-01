package com.sms.DBTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.test.ui.DBTesting.CheckSMSQueue;
import com.qa.test.ui.DBTesting.PatientSMSPage;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.AppointmentPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.PatientsPage;

class Batch3SMSTests extends TestBase {
	
	 private static final String uname="sapna.saxena@porteamedical.com";
	   private static final String passwd="123456";
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
		patientsmspage = PageFactory.initElements(driver, PatientSMSPage.class);
		chkSmsQueue= PageFactory.initElements(driver, CheckSMSQueue.class);

	}

	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	} 
	
	@Test
	 public void testVerifyRegistrationThroughPatientPortal()
	   {
		   System.out.println("Verify that user should recieve SMS on submitting any lead through portea portal");
		   driver.get("http://stage.my.portea.com");
		   WebElement regLink = driver.findElement(By.xpath("//a[contains(text(),'new user click here to register')]"));
		   regLink.click();
		   GlobalUtil.wait(2);
		   WebElement mobileNo = driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]"));
		   mobileNo.sendKeys(GlobalUtil.getRandomNumber(10));
		   GlobalUtil.wait(2);
		   WebElement btn = driver.findElement(By.xpath("//input[contains(@id,'registerSubmit')]"));
		   btn.click();
		   WebElement otp = driver.findElement(By.xpath("//input[contains(@name,'otp')"));
		   String sqlQuery = "SELECT message, scheduled_id FROM smsen_sms_record WHERE scheduled_type='lead' and receiver_type='lead' and brand_id=1 and receiver_type='patient' ORDER BY id DESC";
		   String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
	       GlobalUtil.wait(10);
		   otp.sendKeys(sqlQuery);
		   WebElement fname= driver.findElement(By.xpath("//input[contains(@name,'firstName')]"));
		   fname.sendKeys(GlobalUtil.getRandomName(6));
		   WebElement lname= driver.findElement(By.xpath("//input[contains(@name,'lastName')]"));
		   lname.sendKeys(GlobalUtil.getRandomName(6));
		   WebElement emailId= driver.findElement(By.xpath("//input[contains(@name,'emailId')]"));
		   emailId.sendKeys(GlobalUtil.getRandomName(4) +"@qa.com");
		   WebElement pwd= driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		   pwd.sendKeys("123456");
		   WebElement cpwd= driver.findElement(By.xpath("//input[contains(@name,'cpassword')]"));
		   cpwd.sendKeys("123456");
		   WebElement gender= driver.findElement(By.xpath("//input[contains(@value,'male')]"));
		   gender.click();
		   WebElement regbtn= driver.findElement(By.xpath("//button[contains(@text,'Register')]"));
		   regbtn.click();
		   //Check on DB for SMS
		    sqlQuery = "SELECT message, scheduled_id FROM smsen_sms_record WHERE scheduled_type='lead' and receiver_type='lead' and brand_id=1 and receiver_type='patient' ORDER BY id DESC";
	        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='appointment' and mobile_number='918553013244' and brand_id=1 ORDER BY id DESC";
	        String expectedSMS = "Dear Customer,Thank you for your interest in Portea Medical. Our customer care team will get in touch with you shortly.If you have any queries, please feel free to reach us at 1800 121 2323. Your primary number for communications with us is 2342342342.Chat with a doctor, book appointments using Portea Mobile App! Download at http://portea.com/downloadApp-- Portea Medical";
	        //Getting employee name by Id
	      //  String actualSMS = DBConnector.executeSQLQuery(sqlQuery);
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
	
	@Test
	public void testVerifyRegistrationThroughPharmacyPortal()
	{
		
	}
	
	
}
