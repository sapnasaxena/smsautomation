package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.BasePage;
//import com.thoughtworks.selenium.Wait;

public class AddTicketPage extends BasePage {

	public AddTicketPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void leadSelection(){
		driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr[6]/td[2]/a")).click();
		driver.findElement(By.xpath("//a[2][contains(text(),'Add')]")).click();
		System.out.println("entering details for adding ticket");
		System.out.println("selecting Lead Source");
		driver.findElement(By.id("source_chosen")).click();
		driver.findElement(By.xpath("//div[@id='source_chosen']/div/ul/li[6]")).click();
		driver.findElement(By.name("promoCode")).sendKeys("12");
		driver.findElement(By.name("hospitalRegId")).sendKeys("32");
		System.out.println("selecting Services");
		driver.findElement(By.id("services_chosen")).click();
		driver.findElement(By.xpath("//div[@id='services_chosen']/div/ul/li[4]")).click();
		System.out.println("selecting Package");
		driver.findElement(By.id("packages_chosen")).click();
		driver.findElement(By.xpath("//div[@id='packages_chosen']/div/ul/li[5]")).click();
		System.out.println("selecting asignee");
		driver.findElement(By.id("assignedTo_chosen")).click();
		driver.findElement(By.xpath("//div[@id='assignedTo_chosen']/div/ul/li[7]")).click();
		System.out.println("entering ticket text details");
		driver.findElement(By.name("details")).sendKeys("test");
		System.out.println("selecting follow up date");
		driver.findElement(By.name("followUpOn")).click();
		driver.findElement(By.xpath("//div[@class='datetimepicker-days']/table/tfoot/tr/th[text()='Today']")).click();
		System.out.println("saving the ticket");
		driver.findElement(By.xpath("//div[@class='form-actions']/button[contains(text(),'Save')]")).click();
		
	}
	
	
}
