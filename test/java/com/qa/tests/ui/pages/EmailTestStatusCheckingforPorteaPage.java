package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import com.qa.tests.ui.common.BasePage;

public class EmailTestStatusCheckingforPorteaPage extends BasePage{

	public EmailTestStatusCheckingforPorteaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[@href='email']")
	private WebElement EmailtabLocator;
	public WebElement getEmailtabLocator(){
		return EmailtabLocator;
	}
	@FindBy(xpath="//a[@href='/email/bulkEmail']")
	private WebElement sendBulkEmailLocator;
	public WebElement getsendBulkEmailLocator(){
		return sendBulkEmailLocator;
	}
	@FindBy(xpath="//button[contains(text(),'Proceed')]")
	private WebElement selectedTemplateProceed;
	public WebElement getselectedTemplateProceed(){
		return selectedTemplateProceed;
	}
	
	public void selectedTemplate(){
		 WebElement ele=driver.findElement(By.xpath("//select[@id='templateSelector']"));
		  Select s=new Select(ele);
		  s.selectByIndex(1);
		System.out.println("checking status for Portea Brand patient");
		driver.findElement(By.id("patientId")).sendKeys("POR030925");
	}
	
	public void statusVerifyingforPorteaBrand(){
		     String ExpectedPage="Can Send";
			 String wbxpath="//td[contains(text(),'Can Send')]";
			  WebElement ele=driver.findElement(By.xpath(wbxpath));
			  String editedTicketdetails=ele.getText();
			  System.out.println("verifying status for Portea brand = " + editedTicketdetails);
			  if(ExpectedPage.equals(editedTicketdetails)){
				  System.out.println("Status is verified for Portea Brand= " + ExpectedPage);
			  }else {
				System.out.println("Status is not verified:= " + ExpectedPage);
			}
		  }
}
