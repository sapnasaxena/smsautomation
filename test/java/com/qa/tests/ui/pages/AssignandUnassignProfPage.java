package com.qa.tests.ui.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.BasePage;

public class AssignandUnassignProfPage extends BasePage {

	public AssignandUnassignProfPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//select[@id='filter']")
	private WebElement newdropdown;
	public WebElement getnewdropdown(){
		return newdropdown;
	}
	   @FindBy(xpath="//a[@href='appointment/all']")
		private WebElement ApptLocator;
		public WebElement getApptLocator(){
			return ApptLocator;
		}
				
		@FindBy(xpath="//table[@id='tableSelect']/tbody/tr[5]/td[9]/input[@name='seldoctor']")
		private WebElement radioProfselect;
		public WebElement getradioProfselect(){
			return radioProfselect;
		}
		
		@FindBy(xpath="//div/button/span[text()='Assign Professional']")
		private WebElement assignProfbutton;
		public WebElement getassignProfbutton(){
			return assignProfbutton;
		}
		public void assignProfButton(){
			driver.findElement(By.xpath("//div/button/span[text()='Assign Professional']")).click();
			GlobalUtil.wait(5);
			Alert a=driver.switchTo().alert();
			  System.out.println(a.getText());
			 a.accept();
		}
	public void newFilter(){
		WebElement ele=driver.findElement(By.xpath("//select[@id='filter']"));
		Select s=new Select(ele);
		s.selectByIndex(0);
		driver.findElement(By.xpath("//button[text()='Filter']")).click();
	}
	
	public void confirmedSelection(){
		WebElement ele=driver.findElement(By.xpath("//select[@id='filter']"));
		Select s=new Select(ele);
		s.selectByIndex(4);
		driver.findElement(By.xpath("//button[text()='Filter']")).click();
	}
	public void pendingSelection(){
		WebElement ele=driver.findElement(By.xpath("//select[@id='filter']"));
		Select s=new Select(ele);
		s.selectByIndex(1);
		driver.findElement(By.xpath("//button[text()='Filter']")).click();
	}
	
	@FindBy(xpath="//table[@class='data-table']/tbody/tr[1]/td[3]/a[text()='Change']")
	private WebElement changeLoactor;
	public WebElement getchangeLoactor(){
		return changeLoactor;
	}
	
	@FindBy(xpath="//table[@id='tableSelect']/tbody/tr[1]/td[9]/input[@name='seldoctor']")
	private WebElement radioSelectionforChange;
	public WebElement getradioSelectionforChange(){
		return radioSelectionforChange;
	}
	
	@FindBy(xpath="//table[@class='data-table']/tbody/tr[1]/td[3]/a[text()='Unassign']")
	private WebElement unassignLocator;
	public WebElement getunassignLocator(){
		return unassignLocator;
	}
	
	@FindBy(xpath="//button/span[text()='Change Status']")
	private WebElement changestatusLocator;
	public WebElement getchangestatusLoacator(){
		return changestatusLocator;
	}
 public void newFilterClear(){
	driver.findElement(By.xpath("//div[@class='left filter-placement']/a[contains(text(),'new')]")).click();

 }


}
