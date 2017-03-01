package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.BasePage;

public class ForgotLoginPage extends BasePage {

	public ForgotLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void driver(){
		driver.get("http://stage.my.portea.com/");
		driver.findElement(By.xpath("//a[@href='http://stage.my.portea.com/cantLogin']/i")).click();
		GlobalUtil.wait(5);
		driver.findElement(By.xpath("//input[@id='frgt_userId']")).click();
		driver.findElement(By.xpath("//input[@name='userMobileNumber']")).sendKeys("8123420058");
		driver.findElement(By.xpath("//button[@name='continue']")).click();
		driver.quit();
		
	}
	@FindBy(xpath="//a[@href='http://stage.my.portea.com/cantLogin']/i")
	private WebElement cantloginLocator;
	public WebElement getcantloginlLocator(){
		return cantloginLocator;
	}
	@FindBy(xpath="//input[@id='frgt_userId']")
	private WebElement forgotpatientIdLocator;
	public WebElement getforgotpatientIdLocator(){
		return forgotpatientIdLocator;
	}
	@FindBy(xpath="//input[@name='userMobileNumber']")
	private WebElement mobileIdLocator;
	public WebElement getmobileIdLocator(){
		return mobileIdLocator;
	}
	
	 public void navigatingtoSMSScreen(){
		 System.out.println("navigating to sms tab");
		driver.findElement(By.xpath("//a[@href='sms/received']")).click();
		 System.out.println("navigating to pending SMS tab");
		 driver.findElement(By.xpath("//a[text()='Pending SMS']")).click();
	 }
	 public void visibleTextComparision(){
		 String ExpectedPage="Forgot Patient Login";
		 String wbxpath="//td[contains(text(),'Forgot Patient Login')]";
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
