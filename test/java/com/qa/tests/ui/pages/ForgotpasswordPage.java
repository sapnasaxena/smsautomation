package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.BasePage;

public class ForgotpasswordPage extends BasePage {

	public ForgotpasswordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void forgotPassword(){
		driver.get("http://stage.my.portea.com/");
		driver.findElement(By.xpath("//a[@href='http://stage.my.portea.com/cantLogin']/i")).click();
		GlobalUtil.wait(5);
		driver.findElement(By.xpath("//input[@id='frgt_pswd']")).click();
		System.out.println("entered patient ID");
		driver.findElement(By.xpath("//div/input[@name='patientID']")).sendKeys("POR030772");
		driver.findElement(By.xpath("//button[@name='continue']")).click();
		System.out.println("sending request for generating OTP number");
		driver.findElement(By.xpath("//input[@value='send_to_sms']")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();	
		driver.quit();
	}
	 public void navigatingtoSMSScreen(){
		 System.out.println("navigating to sms tab");
		 driver.findElement(By.xpath("//a[@href='sms/received']")).click();
		 System.out.println("navigating to pending SMS tab");
		driver.findElement(By.xpath("//a[text()='Pending SMS']")).click();
	 }
	 public void visibleTextComparision(){
		 String ExpectedPage="Patient Forgot password";
		 String wbxpath="//td[contains(text(),'Patient Forgot password')]";
		  WebElement ele=driver.findElement(By.xpath(wbxpath));
		  String actText=ele.getText();
		  System.out.println("actText = " + actText);
		  if(ExpectedPage.equals(actText)){
			  System.out.println("SMS received= " + ExpectedPage);
		  }else {
			System.out.println("SMS not recevied:= " + ExpectedPage);
		}
		  driver.quit();
	  }


}
