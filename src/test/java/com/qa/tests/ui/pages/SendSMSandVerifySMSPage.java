package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import com.qa.tests.ui.common.BasePage;

public class SendSMSandVerifySMSPage extends BasePage {

	public SendSMSandVerifySMSPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[@href='appointment/all']")
	private WebElement AppnmtLocator;
	public WebElement getAppnmtLocator(){
		return AppnmtLocator;
	}
	public void pendingSelection(){
		 WebElement ele=driver.findElement(By.xpath("//select[@id='filter']"));
		  Select s=new Select(ele);
		  s.selectByIndex(1);
		driver.findElement(By.xpath("//button[text()='Filter']")).click();
	}
	@FindBy(xpath="//table[@class='data-table']/tbody/tr[1]/td[12]/a[contains(text(),'Send SMS')]")
	private WebElement sendSMSLocator;
	public WebElement getsendSMSLocator(){
		return sendSMSLocator;
	}
	public void smsMessage(){
		 driver.findElement(By.xpath("//div/textarea[@id='reply']")).sendKeys("test");
	}
	@FindBy(xpath="//div/button/span[text()='Send']")
	private WebElement sendLocator;
	public WebElement getsendLocator(){
		return sendLocator;
	}
	@FindBy(xpath="//a[@href='sms/received']")
	private WebElement smstabLocator;
	public WebElement getsmstabLocator(){
		return smstabLocator;
	}
	 @FindBy(xpath="//a[contains(text(),'Pending SMS')]")
	 private WebElement pendingSMSLocator;
	 public WebElement getpendingSMSLocator(){
		 return pendingSMSLocator;
	 }
	 public void visibleTextComparision(){
		 String ExpectedPage="test";
		 String wbxpath="//td[contains(text(),'test')]";
		  WebElement ele=driver.findElement(By.xpath(wbxpath));
		  String actText=ele.getText();
		  System.out.println("actText = " + actText);
		  if(ExpectedPage.equals(actText)){
			  System.out.println("SMS received= " + ExpectedPage);
		  }else {
			System.out.println("SMS not recevied:= " + ExpectedPage);
		}
	  }

}
