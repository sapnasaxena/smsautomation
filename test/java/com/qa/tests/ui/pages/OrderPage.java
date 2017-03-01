package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.qa.tests.ui.common.BasePage;

public class OrderPage extends BasePage{

	public OrderPage(WebDriver driver)  {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String orderTabLocator = "//a[text()='Order']";
	public String getOrderTabLocator()
	{
		return orderTabLocator;
	}
	
	public String medicineListTabLocator = "//a[text()='Medicine List']";
	public String getMedicineListTabLocator()
	{
		return medicineListTabLocator;
	}
	
	public String equipmentRentalTabLocator = "//a[text()='Equipment Rental']";
	public String getEquipmentRentalTabLocator()
	{
		return equipmentRentalTabLocator;
	}
	
	public String labTestTabLocator = "//a[text()='Lab Test']";
	public String getLabTestTabLocator()
	{
		return labTestTabLocator;
	}
	
	public String dateFilterLocator = "//div[contains(@class,'left date-filter')]";
	public String getDateFilterLocator()
	{
		return dateFilterLocator;
	}
	
	public String orderStatusFilterLocator = "//select[contains(@id,'order-status-filter')]";
	public String getOrderStatusFilterLocator()
	{
		return orderStatusFilterLocator;
	}
	
	public String orderTypeFilterLocator = "//select[contains(@id,'order-type-filter')]";
	public String getOrderTypeFilterLocator()
	{
		return orderTypeFilterLocator;
	}
	
	
	public String searchBoxLocator = "//input[contains(@id,'search')]";
	public String getSearchBoxLocator()
	{
		return searchBoxLocator;
	}

	public String searchButtonLocator = "//button[contains(text(),'Search')]";
	public String getSearchButtonLocator()
	{
		return searchButtonLocator;
	}
	
	public String downloadCSVButtonLocator = "//input[contains(@name,'downloadCSV')]";
	public String getDownloadCSVButtonLocator()
	{
		return downloadCSVButtonLocator;
	}
	
	
	public String importCSVButtonLocator = "//a[contains(text(),'Import Csv')]";
	public String getImportCSVButtonLocator()
	{
		return importCSVButtonLocator;
	}
	
	
	public String editButtonLocator = "//a[text()='Edit']";
	public String getEditButtonLocator()
	{
		return editButtonLocator;
	}
	
	public String activeButtonLocator = "//a[text()='Active']";
	public String getActiveButtonLocator()
	{
		return activeButtonLocator;
	}
	
	public String orderNameLocator="//a[text()='']";
	public String getOrderNameLocator()
	{
		return orderNameLocator;
	}
	
	
	public String downloadCSVLocation="C:\\Users\\sapna\\Downloads";
	public String getDownloadCSVLocation()
	{
		return downloadCSVLocation;
	}
	
	
	//functions
	
	public void openOrderTab()
	{
		driver.findElement(By.xpath(orderTabLocator)).click();
	}
	
	
	public void openMedicineListTab()
	{
		driver.findElement(By.xpath(medicineListTabLocator)).click();
	}
	
	public void openEquipmentRentalTab()
	{
		driver.findElement(By.xpath(equipmentRentalTabLocator)).click();;
	}
	
	public void openLabTestTab()
	{
		driver.findElement(By.xpath(labTestTabLocator)).click();
	}
	
	public void searchItemByOrderId(String OrderId)
	{
		driver.findElement(By.xpath(searchBoxLocator)).sendKeys(OrderId);
		driver.findElement(By.xpath(searchButtonLocator)).click();
		
	}
	
	public void downloadCSV()
	{
		driver.findElement(By.xpath(downloadCSVButtonLocator)).click();
		
		
	}
	
	
	public void importCSV()
	{
		driver.findElement(By.xpath(importCSVButtonLocator)).click();
	}
	
	public void downloadCSVLocation(String filename)
	{
		System.out.println("Check download file location");
		driver.findElement(By.xpath(downloadCSVLocation)).equals(filename);
		
	}
	
}
