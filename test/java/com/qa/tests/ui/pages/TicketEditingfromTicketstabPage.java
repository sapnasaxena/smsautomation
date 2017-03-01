package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.qa.tests.ui.common.BasePage;

public class TicketEditingfromTicketstabPage extends BasePage {

	public TicketEditingfromTicketstabPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[@href='ticket/all']")
	private WebElement TicketstabLocator;
	public WebElement getTicketstabLocator(){
		return TicketstabLocator;
	}
	@FindBy(xpath="//table[@class='data-table']/tbody/tr[4]/td[15]/a[text()='Edit']")
	private WebElement selectingTickettoEditLocator;
	public WebElement getselectingTickettoEditLocator(){
		return selectingTickettoEditLocator;
	}
	public void editTicket(){
		driver.findElement(By.name("comments")).sendKeys("testing");
		System.out.println("selecting follow up date");
		driver.findElement(By.name("followUpOn")).click();
		driver.findElement(By.xpath("//div[@class='datetimepicker-days']/table/thead/tr[1]/th[3]")).click();
		driver.findElement(By.xpath("//div[@class='datetimepicker-days']/table/tbody/tr[2]/td[5]")).click();
		driver.findElement(By.xpath("//div[@class='datetimepicker-hours']/table/tbody/tr[1]/td[1]/fieldset[2]/span[5]")).click();
		driver.findElement(By.xpath("//div[@class='datetimepicker-minutes']/table/tbody/tr/td[1]/fieldset[1]/span[3]")).click();
		System.out.println("saving the edit ticket details");
		driver.findElement(By.xpath("//div[@class='form-actions']/button[contains(text(),'Save')]")).click();
	}
	public void visibleTextComparision(){
		 String ExpectedPage="testing";
		 String wbxpath="//table[@class='data-table']/tbody/tr[1]/td[5][text()='testing']";
		  WebElement ele=driver.findElement(By.xpath(wbxpath));
		  String editedTicketdetails=ele.getText();
		  System.out.println("edited ticket details comparing = " + editedTicketdetails);
		  if(ExpectedPage.equals(editedTicketdetails)){
			  System.out.println("edited ticket details  is verified= " + ExpectedPage);
		  }else {
			System.out.println("edited ticket details is not verified:= " + ExpectedPage);
		}

	}
}
