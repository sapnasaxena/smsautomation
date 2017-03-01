package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.BasePage;

public class LeadPage extends BasePage{

	public LeadPage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String leadOptionLocator = "//a[contains(@href,'lead/all')]";
	public String getLeadOptionLocator()
	{
		return leadOptionLocator;
	}
	
	public String leadListingScreenLocator = "//div[contains(text(),'Lead Listings' )]";
	public String getLeadListingsScreenLocator()
	{
		return leadListingScreenLocator;
	}
	
	public String createdOnLabelLocator ="//label[contains(text(),'Created On')]";
	public String getCreatedOnLabelLocator()
	{
		return createdOnLabelLocator;
	}
	
	public String createdOnFieldLocator = "//div[contains(@class,'date-filter')]";
	public String getCreatedOnFieldLocator()
	{
		return createdOnFieldLocator;
	}
	
	public String dispositionLabelLocator = "//label[contains(text(),'Disposition')]";
	public String getDispositionLabelLocator()
	{
		return dispositionLabelLocator;
	}
	public String dispositionFieldLocator = "//select[contains(@id,'filter')]";
	public String getDispositionFieldLocator()
	{
		return dispositionFieldLocator;
	}
	
	public String filterButtonLocator ="//button[text()='Filter']";
	public String getFilterButtonLocator()
	{
		return filterButtonLocator;
	}
	
	public String downloadCSVButtonLocator ="//input[contains(@name,'downloadCSV')]";
	public String getDownloadCSVButtonLocator()
	{
		return downloadCSVButtonLocator;
	}
	
	public String searchBoxLocator ="//input[contains(@id,'search')]";
	public String getSearchBoxLocator()
	{
		return searchBoxLocator;
	}
	
	public String searchButtonLocator ="//button[contains(text(),'Search')]";
	public String getSearchButtonLocator()
	{
		return searchButtonLocator;
	}
	
	public String addLeadButtonLocator ="//a[contains(text(),'Add Lead')]";
	public String getAddLeadButtonLocator()
	{
		return addLeadButtonLocator;
	}
	
	public String callDetailsTabLocator ="//a[text()='Call Details']";
	public String getCallDetailsTabLocator()
	{
		return callDetailsTabLocator;
	}
	
	public String ivrStatusFieldLocator ="//select[contains(@id,'call-status')]";
	public String getivrStatusFieldLocator()
	{
		return ivrStatusFieldLocator;
	}
	
	public String purposeOfCallFieldLocator ="//select[contains(@id,'lead-purpose-filter')]";
	public String getpurposeOfCallFieldLocator()
	{
		return purposeOfCallFieldLocator;
	}
	
	public String advanceSearchTabLocator ="//a[text()='Advance Search']";
	public String getAdvanceSearchTabLocator()
	{
		return advanceSearchTabLocator;
	}
	
	public String enterPhoneNoFieldLocator ="//input[contains(@id,'search']";
	public String getEnterPhoneNoFieldLocator()
	{
		return enterPhoneNoFieldLocator;
	}
	
	public String leadReferrerTabLocator ="//a[text()='Lead Referrer']";
	public String getLeadReferrerTabLocator()
	{
		return leadReferrerTabLocator;
	}
	
	public String referrerTypeFieldLocator ="//select[contains(@id,'referrer-type')]";
	public String getReferrerTypeFieldLocator()
	{
		return referrerTypeFieldLocator;
	}
	
	public String servicesFieldLocator ="//select[contains(@id,'lead-service-filter')]";
	public String getServicesFieldLocator()
	{
		return servicesFieldLocator;
	}
	
	// Add Lead Screen locators
	public String leadScreenLocator ="//div[contains(text(),'Add Lead')]";
	public String getLeadScreenLocator()
	{
		return leadScreenLocator;
	}
	
	public String firstNameFieldLocator ="//input[contains(@id,'firstName')]";
	public String getFirstNameFieldLocator()
	{
		return firstNameFieldLocator;
	}
	
	public String lastNameFieldLocator ="//input[contains(@id,'lastName')]";
	public String getLastNameFieldLocator()
	{
		return lastNameFieldLocator;
	}
	
	public String emailIdFieldLocator ="//input[contains(@id,'contactEmailId')]";
	public String getEmailIdFieldLocator()
	{
		return emailIdFieldLocator;
	}
	public String mobileNoFieldLocator ="//input[contains(@id,'mobileNumber')]";
	public String getMobileNoFieldLocator()
	{
		return mobileNoFieldLocator;
	}
	
	public String genderLocator ="//select[contains(@name,'gender')]";
	public String getGenderLocator()
	{
		return genderLocator;
	}
	
	public String classificationLocator ="//select[contains(@name,'classification_type')]";
	public String getClassificationLocator()
	{
		return classificationLocator;
	}
	
	public String brandLocator ="//select[contains(@id,'brandId')]";
	public String getBrandLocator()
	{
		return brandLocator;
	}
	
	public String areaLocator ="//select[contains(@id,'area')]";
	public String getAreaLocator()
	{
		return areaLocator;
	}
	
	public String ticketInfoLabelLocator ="//h4[contains(text(),'Ticket Info')]";
	public String getTicketInfoLabelLocator()
	{
		return ticketInfoLabelLocator;
	}
	
	public String categoryLocator ="//select[contains(@id,'category')]";
	public String getCategoryLocator()
	{
		return categoryLocator;
	}
	
	public String subcategoryLocator ="//select[contains(@id,'subcategory')]";
	public String getSubCategoryLocator()
	{
		return subcategoryLocator;
	}
	
	public String statusLocator ="//select[contains(@id,'status')]";
	public String getStatusLocator()
	{
		return statusLocator;
	}
	
	public String ticketDetailsLocator ="//textarea[contains(@id,'details')]";
	public String getTicketDetailsLocator()
	{
		return ticketDetailsLocator;
	}
	//Add Lead->Address
	public String addressLocator ="//textarea[contains(@name,'address')]";
	public String getAddressLocator()
	{
		return addressLocator;
	}
	
	public String pinCodeLocator ="//input[contains(@id,'pinCode')]";
	public String getPinCodeLocator()
	{
		return pinCodeLocator;
	}
	
	public String localityLocator ="//span[contains(@id,'localityvalue')]";
	public String getLocalityLocator()
	{
		return localityLocator;
	}
	
	public String cityLocator ="//span[contains(@id,'locality_city')]";
	public String getCityLocator()
	{
		return cityLocator;
	}
	
	public String locationLocator ="//input[contains(@id,'location')]";
	public String getLocationLocator()
	{
		return locationLocator;
	}
	
	public String saveButtonLocator ="//button[contains(text(),'Save')]";
	public String getSaveButtonLocator()
	{
		return saveButtonLocator;
	}
	//Add Lead->Contact Info
	
	public void addLead()
	{
		WebElement fName = driver.findElement(By.xpath("//input[contains(@id,'firstName')]"));
		fName.sendKeys(GlobalUtil.getRandomName(6));
		WebElement lName=driver.findElement(By.xpath("//input[contains(@id,'lastName')]"));
		lName.sendKeys(GlobalUtil.getRandomName(6));
		GlobalUtil.wait(5);
		WebElement email = driver.findElement(By.xpath("//input[contains(@name,'contactEmailId')]"));
		email.sendKeys(GlobalUtil.getRandomName(4) + "@portea.qa");
		GlobalUtil.wait(5);
		WebElement mobNo = driver.findElement(By.xpath("//input[contains(@id,'mobileNumber')]"));
		mobNo.sendKeys("8553013244");
		GlobalUtil.wait(2);
		Select gender = new Select(driver.findElement(By.xpath("//select[contains(@name,'gender')]")));
		gender.selectByVisibleText("Male");
		GlobalUtil.wait(5);
		Select area = new Select(driver.findElement(By.xpath("//select[contains(@id,'area']")));
		area.selectByVisibleText("Bangalore");
		GlobalUtil.wait(5);
		WebElement expandTktFrame = driver.findElement(By.xpath("//div[contains(@id,'headingTwo')]"));
		expandTktFrame.click();
		GlobalUtil.wait(5);
		Select selectCategory = new Select(driver.findElement(By.xpath("//select[contains(@id,'category']")));
		selectCategory.selectByVisibleText("Sales");
		GlobalUtil.wait(5);
		WebElement ticketDetails = driver.findElement(By.xpath("//textarea[contains(@id,'details')]"));
		ticketDetails.sendKeys("test");
		GlobalUtil.wait(5);
		WebElement save = driver.findElement(By.xpath("//button[text()='Save']"));
		save.click();
		GlobalUtil.wait(5);
		WebElement edittkt = driver.findElement(By.xpath("//a[text()='Edit']"));
		edittkt.click();
		GlobalUtil.wait(2);
		Select status = new Select(driver.findElement(By.xpath("//select[contains(@id,'status']")));
		status.selectByVisibleText("Sales done");
		GlobalUtil.wait(2);
		WebElement reason = driver.findElement(By.xpath("//textarea[contains(@id,'comments')]"));
		reason.sendKeys("test");
		GlobalUtil.wait(2);
		WebElement savebtn = driver.findElement(By.xpath("//button[text()='Save']"));
		savebtn.click();
		
	}
}
