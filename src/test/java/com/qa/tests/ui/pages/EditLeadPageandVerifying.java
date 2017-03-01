package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.tests.ui.common.BasePage;

public class EditLeadPageandVerifying extends BasePage {

	public EditLeadPageandVerifying(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void editLead(){
		driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr[6]/td[2]/a")).click();
		System.out.println("selecting edit lead option");
		driver.findElement(By.xpath("//div[@class='main-container']/div[1]/div[1]/div[1]/a[1][contains(text(),'Edit Lead')]")).click();
		driver.findElement(By.id("radio_age")).click();
		driver.findElement(By.id("patient_age")).clear();
		driver.findElement(By.id("patient_age")).sendKeys("45");
		driver.findElement(By.name("contact_name")).sendKeys("lead contact relation name");
		driver.findElement(By.name("contact_relation")).sendKeys("testing");
		System.out.println("saving the edit lead details");
		driver.findElement(By.xpath("//div[@class='form-actions']/button[contains(text(),'Save')]")).click();
	}
	 public void visibleTextComparision(){
		 String ExpectedPage="45";
		 String wbxpath="//div[@class='container-blue']/div[2]/div/div[3]/div[2]/div[2][text()='45']";
		  WebElement ele=driver.findElement(By.xpath(wbxpath));
		  String editedAge=ele.getText();
		  System.out.println("editedAge = " + editedAge);
		  if(ExpectedPage.equals(editedAge)){
			  System.out.println("Lead age id verified= " + ExpectedPage);
		  }else {
			System.out.println("Lead age is not verified:= " + ExpectedPage);
		}
	  }

}
