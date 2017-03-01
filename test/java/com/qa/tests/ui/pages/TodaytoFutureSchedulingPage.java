package com.qa.tests.ui.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.BasePage;

public class TodaytoFutureSchedulingPage extends BasePage{

	public TodaytoFutureSchedulingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void schedulingTodaytoTomorrow() throws InterruptedException{
		 driver.findElement(By.xpath("//td[@class='day today active']")).click();
		 driver.findElement(By.xpath("//div[@class='datetimepicker-hours']/table[1]/thead/tr/th[3]")).click();
		 driver.findElement(By.xpath("//div[@class='datetimepicker-hours']/table[1]/thead/tr/th[3]")).click();
		 driver.findElement(By.xpath("//fieldset[2][@class='hour']/span[5]")).click();
			driver.findElement(By.xpath("//fieldset[@class='minute']/span[1]")).click();
			GlobalUtil.wait(5);
			driver.findElement(By.id("post-notes")).sendKeys("testing");
			GlobalUtil.wait(5);
			driver.findElement(By.xpath("//button/span[text()='PostPone']")).click();
			GlobalUtil.wait(5);
			Alert a=driver.switchTo().alert();
			  System.out.println(a.getText());
			 a.dismiss();
	}
	@FindBy(xpath="//a[@href='patient/all']")
	private WebElement patientLocator;
	public WebElement getpatientLocator(){
		return patientLocator;
	}
	
	@FindBy(xpath="//input[@id='search']")
	private WebElement patientNameLocator;
	public WebElement getpatientNameLocator(){
		return patientNameLocator;
	}
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement searchLoactor;
	public WebElement getsearchLocator(){
		return searchLoactor;
	}
	@FindBy(xpath="//table[1]/tbody/tr[1]/td[4]/a")
	private WebElement dateandTimeLocator;
	public WebElement getdateandTimeLocator(){
		return dateandTimeLocator;
	}
	@FindBy(xpath="//div[@class='datetimepicker-days']/table[1]/tfoot/tr/th[text()='Today']")
	private WebElement currentDateLocator;
	public WebElement getcurrentDateLocator(){
		return currentDateLocator;
	}
	@FindBy(xpath="//table[@class='data-table']/tbody/tr/td[2]/a[contains(text(),'srav')]")
	private WebElement patientTableLocator;
	public WebElement getpatientTableLocator(){
		return patientTableLocator;
	}
	public void schedulingTodaytoToday() throws InterruptedException{
		 driver.findElement(By.xpath("//td[@class='day today active']")).click();
		GlobalUtil.wait(5);
		driver.findElement(By.xpath("//fieldset[2][@class='hour']/span[7]")).click();
		driver.findElement(By.xpath("//fieldset[@class='minute']/span[1]")).click();
		GlobalUtil.wait(5);
		driver.findElement(By.id("post-notes")).sendKeys("testing");
		GlobalUtil.wait(5);
		driver.findElement(By.xpath("//button/span[text()='PostPone']")).click();
		GlobalUtil.wait(5);
		Alert a=driver.switchTo().alert();
		  System.out.println(a.getText());
		 a.dismiss();
	}
	public void durationEnter(){
		GlobalUtil.wait(5);	
		driver.findElement(By.id("duration")).clear();
		driver.findElement(By.id("duration")).sendKeys("130");
		//GlobalUtil.wait(5);
		driver.findElement(By.id("post-notes")).sendKeys("testing");
	}
	public void savingApptPostpone() throws InterruptedException{
		GlobalUtil.wait(5);
		driver.findElement(By.xpath("//button/span[text()='PostPone']")).click();
		Alert a=driver.switchTo().alert();
		  System.out.println(a.getText());
		 a.dismiss();
	}

}
