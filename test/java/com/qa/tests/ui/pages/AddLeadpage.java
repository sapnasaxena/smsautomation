package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.qa.tests.common.GlobalConstants.BRAND;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.common.RandomUtil;
import com.qa.tests.ui.common.AddLeadModal;
import com.qa.tests.ui.common.BasePage;

public class AddLeadpage extends BasePage{

	public AddLeadpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[contains(text(),'Add Lead')]")
	private WebElement AddLeadLocator;
	public WebElement getAddLeadLocator(){
		return AddLeadLocator;
	}
	private String patientFnameLocator = "//input[contains(@name,'firstName')]";
	public String getPatientFNameLocator()
	{
		return patientFnameLocator;
	}
	
	private String patientLnameLocator = "//input[contains(@name,'lastName')]";
	public String getPatientLastNameLocator()
	{
		return patientLnameLocator;
	}
	public String mobileNumberLocator = "//input[contains(@name,'mobileNumber')]";
	public String getMobileNumberLocator()
	{

		return mobileNumberLocator;

	}
	public String emailLocator = "//input[@name='contactEmailId']";
	public String getemailLocator()
	{

		return emailLocator;

	}
	public String pincodeLocator = "//input[contains(@id,'pinCode')]";
	public String getPinCodeLocator()
	{
		return pincodeLocator;
	}
	public String patientAgeLocator = "//input[@id='patient_age']";
	public String getpatientAgeLocator()
	{
		return patientAgeLocator;
	}
	public String genderLocator = "//select[contains(@name,'gender')]";
	public String getGenderLocator()
	{
		return genderLocator;
	}

	public String brandLocator = "//select[contains(@name,'brandId')]";
	public String getBrandLocator()
	{
		return brandLocator;
	}
	public String localiltyLocator = "//select[contains(@id,'locality')]";
	public String getLocalityLocator()
	{
		return localiltyLocator;
	}
	
	public String ticketInfoTitleLocator = "//div[contains(@id,'headingTwo')]";
	public String getTicketInfoLocator()
	{
		return ticketInfoTitleLocator;
	}
	
	public String ticketDetailsLocator = "//textarea[contains(@id,'details')]";
	public String getTicketDetailsLocator()
	{
		return ticketDetailsLocator;
	}
	
	
		public AddLeadModal getleadDetails(){
			AddLeadModal add=new AddLeadModal();
		add.setFirstName(GlobalUtil.getRandomName(4));
		add.setMobileNumber(RandomUtil.generateRandomMobileNo());
		add.setemail(GlobalUtil.getRandomName(4) + "@test.com");
		add.setPatientAge("30");
		add.setGender(add.getGender());
		add.setPinCode("560014");
		add.setLocality(add.getLocality());
		return add;
			}
		
	public void addLead(AddLeadModal addlead){
    	driver.findElement(By.xpath(patientFnameLocator)).sendKeys(addlead.getFirstName());
    	GlobalUtil.wait(2);
    	driver.findElement(By.xpath(patientLnameLocator)).sendKeys(addlead.getLastName());
    	GlobalUtil.wait(2);
    	driver.findElement(By.xpath(emailLocator)).sendKeys(addlead.getemail());
    	GlobalUtil.wait(2);
		driver.findElement(By.xpath(mobileNumberLocator)).sendKeys(addlead.getMobileNumber());
		GlobalUtil.wait(2);
		driver.findElement(By.id("radio_age")).click();
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(patientAgeLocator)).sendKeys(addlead.getpatientAge());
        Select gender = new Select(driver.findElement(By.xpath(genderLocator)));		
		switch(addlead.getGender()){
		case Male:
			gender.selectByVisibleText(addlead.getGender().toString());
			break;
		case Female:
			gender.selectByVisibleText(addlead.getGender().toString());
			break;
		default:
			break;
		
	}

		GlobalUtil.wait(10);
		GlobalUtil.wait(10);
		System.out.println("DEBUG: Select Locality");
		Select selectLocality = new Select(driver.findElement(By.xpath(localiltyLocator)));
		switch (addlead.getLocality())
		{
		case Hulimavu:
			selectLocality.selectByVisibleText("Hulimavu");
			break;
		case Bilekahalli:
			selectLocality.selectByVisibleText("Bilekahalli");
			break;
		case BannerghattaRoad:
			selectLocality.selectByVisibleText("Bannerghatta Road");
			break;
		case JalahalliEast:
			selectLocality.selectByVisibleText("Jalahalli East");
			break;
		case JPNagar:
			selectLocality.selectByVisibleText("JP Nagar");
			break;
		default:
			break;
			
		}
		GlobalUtil.wait(10);

	
	Select selectBrand = new Select(driver.findElement(By.xpath(brandLocator)));
	selectBrand.selectByVisibleText("Portea");
	GlobalUtil.wait(5);
	ticketInfo();
	GlobalUtil.wait(5);
	save();	
	}
	public void save(){
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	}

	public void ticketInfo()
	{
		driver.findElement(By.xpath(ticketInfoTitleLocator)).click();
		GlobalUtil.wait(5);
		WebElement ticketDetails = driver.findElement(By.xpath(ticketDetailsLocator));
		ticketDetails.sendKeys("test");
		
	}
}
