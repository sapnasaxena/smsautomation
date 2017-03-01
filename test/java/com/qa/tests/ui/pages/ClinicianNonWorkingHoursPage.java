package com.qa.tests.ui.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.BasePage;

public class ClinicianNonWorkingHoursPage extends BasePage {

	public ClinicianNonWorkingHoursPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 @FindBy(xpath="//a[@href='appointment/all']")
		private WebElement ApptLocator;
		public WebElement getApptLocator(){
			return ApptLocator;
		}
		public void pendingSelection(){
			 WebElement ele=driver.findElement(By.xpath("//select[@id='filter']"));
			  Select s=new Select(ele);
			  s.selectByIndex(1);
			driver.findElement(By.xpath("//button[text()='Filter']")).click();
		}
		@FindBy(xpath="//table[1]/tbody/tr[1]/td[7]/a")
		private WebElement dateandTimeLocator;
		public WebElement getdateandTimeLocator(){
			return dateandTimeLocator;
		}
	
	public void nonWorkingTimingsClinician() throws InterruptedException{
	 driver.findElement(By.xpath("//td[@class='day today active']")).click();
	 driver.findElement(By.xpath("//fieldset[2][@class='hour']/span[11]")).click();
		driver.findElement(By.xpath("//fieldset[@class='minute']/span[2]")).click();
		GlobalUtil.wait(5);
		driver.findElement(By.name("duration")).clear();
		driver.findElement(By.name("duration")).sendKeys("45");
		driver.findElement(By.id("post-notes")).sendKeys("testing");
		driver.findElement(By.xpath("//button/span[text()='PostPone']")).click();
		 Alert a=driver.switchTo().alert();
		  System.out.println(a.getText());
		// a.accept();
		  a.dismiss();
	}
	

}
