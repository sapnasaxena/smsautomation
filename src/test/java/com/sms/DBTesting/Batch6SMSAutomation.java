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

public class Batch6SMSAutomation extends TestBase {
	
	   private static final String mobileNo="8553013244";
	   private static final String password="123456";
	   LoginPage loginpage; 
	   PatientsPage patientpage; 
	   HomePage homepage;
	   AppointmentPage appointmentpage;
	   PatientSMSPage patientsmspage;
	   CheckSMSQueue  chkSmsQueue; 
	
	//@BeforeMethod
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

	//@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	@Test
	public void testVerifyLinkWalletOTPSMS()
	{
		System.out.println("Verify that user should get SMS on linking wallet");
		driver.get("http://stage.my.portea.com");
		GlobalUtil.wait(2);
		WebElement mobNo = driver.findElement(By.xpath("//input[contains(@name,'patientID')]"));
		mobNo.sendKeys(mobileNo);
		GlobalUtil.wait(2);
		WebElement pwd = driver.findElement(By.xpath("//input[contain(@name,'password')]"));
		pwd.sendKeys(password);
		GlobalUtil.wait(2);
		WebElement login = driver.findElement(By.xpath("//input[contains(@value,'login')]"));
		login.click();
		GlobalUtil.wait(5);
		WebElement skip = driver.findElement(By.xpath("//a[contains(@class,'skip-rating')]"));
		skip.click();
		GlobalUtil.wait(2);
		WebElement wallet=driver.findElement(By.xpath("//a[contains(@href,'wallet')]"));
		wallet.click();
		GlobalUtil.wait(2);
		WebElement registerWallet = driver.findElement(By.xpath("//input[contains(@id,'registerWallet')]"));
		registerWallet.click();
		GlobalUtil.wait(2);
		WebElement linkWallet = driver.findElement(By.xpath("//input[contains(@id,'linkWallet')]"));
		linkWallet.click();
		GlobalUtil.wait(2);
		String sqlQuery = "SELECT message FROM smsen_sms_record WHERE scheduled_type='patient' and brand_id=1 and receiver_type='patient' ORDER BY id DESC";
        String sqlQueryStatus ="SELECT secondary_processing_status FROM smsen_sms_record WHERE scheduled_type='appointment' and mobile_number='918553013244' and brand_id=1 ORDER BY id DESC";
        String mystring = sqlQuery;
        String arr[] = mystring.split(" ", 2);

        String firstWord = arr[0];   //the
        String theRest = arr[1]; 
        String expectedSMS = "Dear Customer, '"+firstWord+"'is your OTP for patient id, POR035079";
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
	}
	
	//@Test
	public void testVerifyForgotPasswordOTPSMS()
	{
		
	}
	
	//@Test
	public void testVerifyRegistrationOTPSMS()
	{
		
	}

	//@Test
	public void testVerifyPatientMobileVerificationSMS()
	{
		
	}

}
