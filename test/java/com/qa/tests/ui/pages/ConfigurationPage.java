package com.qa.tests.ui.pages;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.BasePage;
import com.qa.tests.ui.common.PackageModal;

public class ConfigurationPage<packagemodal> extends BasePage {

	public ConfigurationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public String packageTabLocator = "//ul[contains(@class,'tabs')]/./li/a[contains(text(),'Packages')]";
	public String getPackageTabLocator()
	{
		return packageTabLocator;
	}
	
	public String servicesTabLocator = "//ul[contains(@class,'tabs')]/./li/a[contains(text(),'Services')]";
	public String getServicesTabLocator()
	{
		return servicesTabLocator;
	}
	
	
	public String areasTabLocator = "//ul[contains(@class,'tabs')]/./li/a[contains(text(),'Areas')]";
	public String getAreasTabLocator()
	{
		return areasTabLocator;
	}
	
	public String subscriptionsTabLocator = "//ul[contains(@class,'tabs')]/./li/a[contains(text(),'Subscriptions')] ";
	public String getSubscriptionsTabLocator()
	{
		return subscriptionsTabLocator;
	}
	
	public String referrerTabLocator = "//ul[contains(@class,'tabs')]/./li/a[contains(text(),'Referrer')] ";
	public String getReferrerTabLocator()
	{
		return referrerTabLocator;
	}
	
	
	public String referrerDoctorTabLocator = "//ul[contains(@class,'tabs')]/./li/a[contains(text(),'Referrer Doctor')] ";
	public String getReferrerDoctorTabLocator()
	{
		return referrerDoctorTabLocator;
	}
	
	public String priceListTabLocator = "//li/a[contains(text(),'Price List')]";
	public String getPriceListTabLocator()
	{
		return priceListTabLocator;
	}
	
	public String addPackageButtonLocator = "//a[contains(text(),'Add Packages')]";
	public String getAddPackageButtonLocator()
	{
		return addPackageButtonLocator;
	}
	
	public String editPackageButtonLocator = "//input[contains(@value,'Edit Package')]";
	public String getEditPackageButtonLocator()
	{
		return editPackageButtonLocator;
	}
	
	
	public String deletePackageButtonLocator = "//input[contains(@value,'Delete Package')]";
	public String getDeletePackageButtonLocator()
	{
		return deletePackageButtonLocator;
	}
	
	
	public String addAreaButtonLocator = "//a[contains(text(),'Add Areas')]";
	public String getAddAreaButtonLocator()
	{
		return addAreaButtonLocator;
	}
	
	public String editAreaButtonLocator = "//input[contains(@value,'Edit Area')]";
	public String getEditAreaButtonLocator()
	{
		return addAreaButtonLocator;
	}
		
	
	public String addServicesButtonLocator = "//a[contains(text(),'Add Services')]";
	public String getAddServicesButtonLocator()
	{
		return addServicesButtonLocator;
	}
	
	
	public String editServicesButtonLocator = "//input[contains(@value,'Edit Service')]";
	public String getEditServicesButtonLocator()
	{
		return editServicesButtonLocator;
	}
	
	public String deleteServicesButtonLocator = "//input[contains(@value,'Delete Service')]";
	public String getDeleteServciesButtonLocator()
	{
		return deleteServicesButtonLocator;
	}
	
	
	public String subscribeServicesButtonLocator = "//a[contains(text(),'Subscribe Service')]";
	public String getSubscribeServicesButtonLocator()
	{
		return subscribeServicesButtonLocator;
	}
	
	public String detailsButtonLocator = "//a[contains(text(),'Details')]";
	public String getDetailsButtonLocator()
	{
		return detailsButtonLocator;
	}
	
	
	public String addReferrerButtonLocator = "//a[contains(text(),'Add Referrer')]";
	public String getAddReferrerButtonLocator()
	{
		return addReferrerButtonLocator;
	}
	
	public String editReferrerButtonLocator = "//a[contains(@href,'/referrer/edit')]";
	public String getEditReferrerButtonLocator()
	{
		return editReferrerButtonLocator;
	}
	
	public String deleteReferrerButtonLocator = "//a[contains(text(),'Delete')]";
	public String getDeleteReferrerButtonLocator()
	{
		return deleteReferrerButtonLocator;
	}
	
	public String addReferrerDoctorButtonLocator = "//a[contains(text(),'Add Referrer Doctor')]";
	public String getAddReferrerDoctorButtonLocator()
	{
		return addReferrerDoctorButtonLocator;
	}
	
	public String editReferrerDoctorButtonLocator = "//a[contains(@href,'/referrer/doctor/edit')]";
	public String geteditReferrerDoctorButtonLocator()
	{
		return editReferrerDoctorButtonLocator;
	}
	
	public String uploadReferrerDoctorCSVButtonLocator = "//a[contains(text(),'Upload Referrer Doctor')]";
	public String getUploadReferrerDoctorCSVButtonLocator()
	{
		return uploadReferrerDoctorCSVButtonLocator;
	}
	
	
	public String referrerFilterLocator = "//select[contains(@id,'filter-by-referrer-name')]";
	public String getReferrerFilterLocator()
	{
		return referrerFilterLocator;
	}
	
	public String searchButtonLocator = "//button[contains(text(),'Search')]";
	public String getSearchButtonLocator()
	{
		return searchButtonLocator;
	}
	
	public String searchTextBoxLocator = "//input[contains(@id,'search')]";
	public String getSearchTextBoxLocator()
	{
		return searchTextBoxLocator;
	}
	
	public String packageNameFieldLocator = "//input[contains(@name,'name')]";
	public String getPackageNameFieldLocator()
	{
		return packageNameFieldLocator;
	}
	
	
	public String packageDescriptionFieldLocator = "//textarea[contains(@name,'description')]";
	public String getPackageDescriptionFieldLocator()
	{
		return packageDescriptionFieldLocator;
	}
	
	public String packageCostFieldLocator = "//input[contains(@name,'cost')]";
	public String getPackageCostFieldLocator()
	{
		return packageCostFieldLocator;
	}
	
	public String maxDiscountFieldLocator = "//input[contains(@name,'maxdiscount')]";
	public String getMaxDiscountFieldLocator()
	{
		return maxDiscountFieldLocator;
	}
	
	
	public String areaFieldLocator = "//input[contains(@id,'areas')]";
	public String getAreaFieldLocator()
	{
		return areaFieldLocator;
	}
	
	public String costAreaWiseFieldLocator = "//input[contains(@id,'cost')]";
	public String getCostAreaWiseFieldLocator()
	{
		return costAreaWiseFieldLocator;
	}
	
	public String maxDiscounttAreaWiseFieldLocator = "//input[contains(@id,'maxDiscount')]";
	public String getMaxDiscountAreaWiseFieldLocator()
	{
		return maxDiscounttAreaWiseFieldLocator;
	}
	
	public String addMoreButtonLocator = "//input[contains(@id,'maxDiscount')]/../button[contains(text(),'Add More')]";
	public String getAddMoreButtonLocator()
	{
		return addMoreButtonLocator;
	}
	
	public String selectServiceFieldLocator = "//input[contains(@id,'services')]";
	public String getSelectServiceFieldLocator()
	{
		return selectServiceFieldLocator;
	}
	
	public String selectFrequencyFieldLocator = "//input[contains(@id,'frequency')]";
	public String getSelectFrequencyFieldLocator()
	{
		return selectFrequencyFieldLocator;
	}
	
	public String serviceStartDayFieldLocator = "//input[contains(@id,'start_date')]";
	public String getServiceStartDayFieldLocator()
	{
		return serviceStartDayFieldLocator;
	}
	
	public String intervalFieldLocator = "//input[contains(@id,'interval')]";
	public String getIntervalFieldLocator()
	{
		return intervalFieldLocator;
	}
	
	public String serviceAddMoreButtonLocator = "//button[contains(text(),'Add More')]";
	public String getserviceAddMoreButtonLocator()
	{
		return serviceAddMoreButtonLocator;
	}
	
	public String addPackageButtonOnPackageScreenLocator ="//input[contains(@value,'Add Package')]";
	public String getAddPackageButtonOnPackageScreenLocator()
	{
		return addPackageButtonOnPackageScreenLocator;
	}
	
	public String saveCarePlanButtonOnPackageScreenLocator ="//input[contains(@value,'Save Care Plan')]";
	public String getSaveCarePlanButtonOnPackageScreenLocator()
	{
		return saveCarePlanButtonOnPackageScreenLocator;
	}
	
	public String editSavePackageButtonLocator = "//input[contains(@name,'edit')]";
	public String getEditSaveButtonLocator()
	{
		return editSavePackageButtonLocator;
	}
	
	public String areaNameLocator = "//input[contains(@name,'name')]";
	public String getAreaNameLocator()
	{
		return areaNameLocator;
	}
	
	
	public String areaComeUnderFieldLocator = "//select[contains(@name,'parentId')]";
	public String getareaComeUnderFieldLocator()
	{
		return areaComeUnderFieldLocator;
	}
	
	public String typeFieldLocator = "//select[contains(@name,'type')]";
	public String getTypeFieldLocator()
	{
		return typeFieldLocator;
	}
	
	public String opsManagerNameFieldLocator = "//input[contains(@name,'opsManagerName')]";
	public String getOpsManagerNameFieldLocator()
	{
		return opsManagerNameFieldLocator;
	}
	
	public String opsManagerMobileNoFieldLocator = "//input[contains(@name,'opsManagerMobileNumber')]";
	public String getManagerMobileNoFieldLocator()
	{
		return opsManagerMobileNoFieldLocator;
	}
	
	public String stdCodeFieldLocator = "//input[contains(@name,'stdCode')]";
	public String getStdCodeFieldLocator()
	{
		return stdCodeFieldLocator;
	}

	public String addAreaButtonOnAreaPageLocator = "//input[contains(@value,'Add Area')]";
	public String getAddAreaButtonOnAreaPageLocator()
	{
		return addAreaButtonOnAreaPageLocator;
	}
	
	public String editAreaButtonOnAreaPageLocator = "//input[contains(@name,'edit')]";
	public String getEditAreaButtonOnAreaPageLocator()
	{
		return editAreaButtonOnAreaPageLocator;
	}
	
	public String callCenterNoFieldLocator = "//input[contains(@name,'callCenterNumber')]";
	public String getCallCenterNoFieldLocator()
	{
		return callCenterNoFieldLocator;
	}
	
	public String addedNewAreaLocator = "//tr[2]/td[1]";
	public String getAddedNewAreaLocator()
	{
		return addedNewAreaLocator;
	}
	
	public String addedNewPackageLocator = "//td[contains(text(),'IBM Camp')]";
	public String getAddedNewPackageLocator()
	{
		return addedNewPackageLocator;
	}
	
	public String addAreaPricingLocator ="//button[contains(text(),'Add Area Pricing')]";
	public String getAddAreaPricingLocator()
	{
		return addAreaPricingLocator;
	}
	
	public String areaNameFieldLocator ="//select[contains(@name,'areaIds[]')]";
	public String getAreaNameFieldLocator()
	{
		return areaNameFieldLocator;
	}
	
	public String brandNameFieldLocator ="//select[contains(@name,'brandIds[]')]";
	public String getBrandNameFieldLocator()
	{
		return brandNameFieldLocator;
	}
	
	public String mrpFieldLocator ="//input[contains(@name,'cost')]";
	public String getMRPFieldLocator()
	{
		return mrpFieldLocator;
	}
	
	public String maxDiscFieldLocator = "//input[contains(@name,'maxDiscount')]";
	public String getMaxDiscFieldLocator()
	{
		return maxDiscFieldLocator;
	}
	public String savePricingButton="//button[contains(text(),'Save Pricing')]";
	public String getSavePricingButton()
	{
		return savePricingButton;
	}
	//Xpaths for Services
	
	public String addServiceButtonLocator = "//a[contains(text(),'Add Services')]";
	public String getAddServiceButtonLocator()
	{
		return addServiceButtonLocator;
	}
	
	public String serviceNameFieldLocator = "//input[contains(@name,'name')]";
	public String getServiceNameFieldLocator()
	{
		return serviceNameFieldLocator;
	}
	
	public String serviceComeUnderFieldLocator = "//select[contains(@name,'serviceParentId')]";
	public String getServiceComesUnderFieldLocator()
	{
		return serviceComeUnderFieldLocator;
	}
	
	public String requiredProfessionFieldLocator = "//select[contains(@name,'professionId')]";
	public String getRequiredProfessionFieldLocator()
	{
		return requiredProfessionFieldLocator;
	}
	
	
	public String healthProfessionFieldLocator = "//input[contains(@name,'healthProfessionalTerm')]";
	public String getHealthProfessionFieldLocator()
	{
		return healthProfessionFieldLocator;
	}
	
	public String costPerUnitFieldLocator = "//label[contains(text(),'Cost/Unit')]/../input[contains(@name,'cost')]";
	public String getCostPerUnitFieldLocator()
	{
		return costPerUnitFieldLocator;
	}
	
	public String servicesMaxDiscountFieldLocator = "//label[contains(text(),'Max. Discount')]/../input[contains(@name,'maxDiscount')]";
	public String getServicesMaxDiscountFieldLocator()
	{
		return servicesMaxDiscountFieldLocator;
	}
	
	public String assessmentPriceFieldLocator = "//label[contains(text(),'Assessment Price')]/../input[contains(@name,'assessmentPrice')]";
	public String getAssessmetPriceFieldLocator()
	{
		return assessmentPriceFieldLocator;
	}
	
	public String durationFieldLocator = "//label[contains(text(),'Duration')]/../input[contains(@name,'duration')]";
	public String getDurationFieldLocator()
	{
		return durationFieldLocator;
	}
	
	public String isDurationFixedFieldLocator = "//input[contains(@name,'isDurationFixed')]";
	public String getIsDurationFixedFieldLocator()
	{
		return isDurationFixedFieldLocator;
	}
	
	//*** functions***
	public void addPackage(PackageModal packageModal)
		{
		
		System.out.println("DEBUG: Add Packages");
		driver.findElement(By.xpath(addPackageButtonLocator)).click();
		
		System.out.println("DEBUG: Enter Package Name");
		driver.findElement(By.xpath(packageNameFieldLocator)).sendKeys(packageModal.getPackageName());
		
		System.out.println("DEBUG: Enter Package Description");
		driver.findElement(By.xpath(packageDescriptionFieldLocator)).sendKeys(packageModal.getPackageDescription());
		
		System.out.println("DEBUG: Enter Package Cost");
		driver.findElement(By.xpath(packageCostFieldLocator)).sendKeys(packageModal.getPackageCost());
		
		System.out.println("Enter Max Discount");
		driver.findElement(By.xpath(maxDiscountFieldLocator)).sendKeys(packageModal.getMaxDiscount());
		
		
		System.out.println("DEBUG: Enter Service");
		driver.findElement(By.xpath(selectServiceFieldLocator)).sendKeys(packageModal.getSelectService().toString());
		GlobalUtil.wait(5);
		
		System.out.println("DEBUG: Select Frequency");
		driver.findElement(By.xpath(selectFrequencyFieldLocator)).sendKeys(packageModal.getSelectFrequency());;
		GlobalUtil.wait(5);
		
		System.out.println("DEBUG: Enter Service Start day");
		Select serviceStartDay = new Select(driver.findElement(By.xpath(serviceStartDayFieldLocator)));
		serviceStartDay.selectByValue((packageModal.getServiceStartDay()));
		GlobalUtil.wait(5);
		
		System.out.println("DEBUG: Interval in days");
		driver.findElement(By.xpath(intervalFieldLocator)).sendKeys(packageModal.getIntervalInDays());
		
		
		System.out.println("DEBUG: Click on Add Package button");
		driver.findElement(By.xpath(addPackageButtonOnPackageScreenLocator)).click();
		
		System.out.println("click on Add Area Pricing");
		driver.findElement(By.xpath(addAreaPricingLocator)).click();
		
		System.out.println("Enter form");
		Select areaName = new Select(driver.findElement(By.xpath(areaNameFieldLocator)));
		areaName.selectByVisibleText(packageModal.getArea().toString());
		GlobalUtil.wait(5);
		Select brandName = new Select(driver.findElement(By.xpath(brandNameFieldLocator)));
		brandName.selectByVisibleText(packageModal.getBrand().toString());
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(mrpFieldLocator)).sendKeys(packageModal.getCost());
		driver.findElement(By.xpath(maxDiscFieldLocator)).sendKeys(packageModal.getMaxDiscount());
		
		driver.findElement(By.xpath(savePricingButton)).click();
		GlobalUtil.wait(5);
		System.out.println("DEBUG: Click on Save Care Plan button");
		driver.findElement(By.xpath(addPackageButtonOnPackageScreenLocator)).click();
	}
	
	public void addMoreArea()
	{
		
	}
	public void addMoreServiceInfo()
	{
		
	}
	
	public void deletePackage()
	{
		System.out.println("DEBUG: Delete Package");
		System.out.println("Click on Delete Package button");
		WebElement packageTable = driver.findElement(By.id("table"));
        List<WebElement> packageNameEntries = packageTable.findElements(By.xpath("//table[contains(@class,'data-table')]"));
        for (WebElement nameEntry : packageNameEntries) 
        {
        	System.out.println(nameEntry);
//            nameEntry.click();
//            deleteName.click();
//          
//            new Actions(driver).sendKeys(Keys.RETURN).perform();
       
        }
//		driver.findElement(By.xpath(deletePackageButtonLocator)).click();
//		System.out.println("DEBUG: Pop up error message displays");
//		driver.switchTo().alert().accept();
		
		
	}
	
	public void editPackage(String packageName, String updatedPackageName)
	{
		System.out.println("DEBUG: Edit Package");
		
		System.out.println("Click on Edit Package button");
		driver.findElement(By.xpath(editPackageButtonLocator)).click();
		
		System.out.println("Edit package name");
		WebElement packName = driver.findElement(By.xpath(packageNameFieldLocator));
		if(packName.isDisplayed())
		{
		driver.findElement(By.xpath(editPackageButtonLocator)).click();
		driver.findElement(By.xpath(packageNameFieldLocator)).sendKeys(updatedPackageName);
		}
		System.out.println("Click on Save button");
		driver.findElement(By.xpath(editSavePackageButtonLocator)).click();
	}
	
	public void addArea(String areaName, String areaComeUnder, String type, String opsManagerName, String opsManagerMobileNo, String stdCode, String callCenterNo)
	{
		System.out.println("DEBUG: ADD Area");
		
		System.out.println("DEBUG: Click Add Area");
		driver.findElement(By.xpath(addAreaButtonLocator)).click();
		
		System.out.println("Enter name");
		driver.findElement(By.xpath(areaNameLocator)).sendKeys(areaName);
		
		System.out.println("DEBUG: Select Area Come Under");
		Select selectSubArea = new Select(driver.findElement(By.xpath(areaComeUnderFieldLocator)));
		selectSubArea.selectByVisibleText(areaComeUnder);
		
		System.out.println("DEBUG: Select type");
		Select selectType = new Select(driver.findElement(By.xpath(typeFieldLocator)));
		selectType.selectByVisibleText(type);
		
		System.out.println("DEBUG: Enter Ops Manager");
		driver.findElement(By.xpath(opsManagerNameFieldLocator)).sendKeys(opsManagerName);
		
		System.out.println("Enter Ops Manager Mobile no");
		driver.findElement(By.xpath(opsManagerMobileNoFieldLocator)).sendKeys(opsManagerMobileNo);
		
		System.out.println("Enter STD code");
		driver.findElement(By.xpath(stdCodeFieldLocator)).sendKeys(stdCode);
		
		System.out.println("Enter Call Center number");
		driver.findElement(By.xpath(callCenterNoFieldLocator)).sendKeys(callCenterNo);
		
		System.out.println("Click on Add Area button");
		driver.findElement(By.xpath(addAreaButtonOnAreaPageLocator)).click();
		
	}
	
	public void editArea(String areaName)
	{
		System.out.println("DEBUG: Edit Area");
		
		System.out.println("click on Edit Area button");
		driver.findElement(By.xpath(editAreaButtonLocator));
		
		System.out.println("DEBUG: Edit any field");
		if(areaNameLocator.contentEquals(areaName))
		{
		driver.findElement(By.xpath(areaNameLocator)).sendKeys(areaName);
		}
		
		System.out.println("DEBUG: click on Save button");
		driver.findElement(By.xpath(editAreaButtonOnAreaPageLocator)).click();
	}
	
	public void deleteArea()
	{
		
	}
	
	public void addServices()
	{
		
	}
	
	public void subscribeServices()
	{
		
	}
	
	
	public void details()
	{
	
	}
	
	public void viewReferrerbyBrand()
	{
		
	}
	
	public void viewReferrerbyAll()
	{
		
	}
	
	public void searchReferrerbyName()
	{
		
	}
	
	public void searchReferrerByBrand()
	{
		
	}
	
	public void addReferrer()
	{
		
	}
	
	public void uploadReferrer()
	{
		
	}
	
	public void editReferrer()
	{
		
	}
	
}
