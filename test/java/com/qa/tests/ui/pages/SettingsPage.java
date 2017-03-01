package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.tests.ui.common.AreaName;
import com.qa.tests.ui.common.BasePage;

public class SettingsPage extends BasePage {

	public SettingsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String generalTabLocator = "//a[contains(text(),'General')]";
	public String getGeneralTabLocator()
	{
		return generalTabLocator;
	}
	
	public String rolesTabLocator = "//a[contains(text(),'Roles')]";
	public String getRolesTabLocator()
	{
		return rolesTabLocator;
	}
	
	public String permissionsTabLocator = "//a[contains(text(),'Permissions')]";
	public String getPermissionsTabLocator()
	{
		return permissionsTabLocator;
	}
	
	public String usersTabLocator = "//a[contains(text(),'Users')]";
	public String getUsersTabLocator()
	{
		return usersTabLocator;
	}
	
	public String holidaysTabLocator = "//a[contains(text(),'Holidays')]";
	public String getHolidaysTabLocator()
	{
		return holidaysTabLocator;
	}
	
	public String addNewRoleButtonLocator = "//a[contains(text(),'Add New Role')]";
	public String getaddNewRoleButtonLocator()
	{
		return addNewRoleButtonLocator;
	}
	
	public String addNewRoleScreenLocator = "//div[contains(@id,'dialog-form-add-role')]";
	public String getaddNewRoleScreenLocator()
	{
		return addNewRoleScreenLocator;
	}
	
	public String roleColumnLocator = "//th[contains(text(),'Role')]";
	public String getroleColumnLocator()
	{
		return roleColumnLocator;
	}
	
	public String descriptionColumnLocator = "//th[contains(text(),'Description')]";
	public String getDescriptionColumnLocator()
	{
		return descriptionColumnLocator;
	}
	
	public String usersColumnLocator = "//th[contains(text(),'Users')]";
	public String getUsersColumnLocator()
	{
		return usersColumnLocator;
	}
	
	public String editColumnLocator = "//th[contains(text(),'Edit')]";
	public String getEditColumnLocator()
	{
		return editColumnLocator;
	}
	
	public String editButtonLocator = "//a[contains(text(),'Edit')]";
	public String getEditButtonLocator()
	{
		return editButtonLocator;
	}
	
	public String viewButtonLocator = "//a[contains(text(),'View')]";
	public String getViewButtonLocator()
	{
		return viewButtonLocator;
	}
	
	public String enterRoleFieldLocator = "//input[contains(@id,'role_title')]";
	public String getEnterRoleFieldLocator()
	{
		return enterRoleFieldLocator;
	}
	
	public String selectParentFieldLocator = "//select[contains(@id,'role_parent')]";
	public String getSelectParentFieldLocator()
	{
		return selectParentFieldLocator;
	}
	
	
	public String descriptionFieldLocator = "//textarea[contains(@id, 'role_desc')]";
	public String getDescriptionFieldLocator()
	{
		return descriptionFieldLocator;
	}
	
	//Role Tab Xpaths
	public String addButtonLocator = "//span[contains(text(),'Add')]";
	public String getAddButtonLocator()
	{
		return addButtonLocator;
	}
	
	public String cancelButtonLocator = "//span[contains(text(),'Cancel')]";
	public String getCancelButtonLocator()
	{
		return cancelButtonLocator;
	}
	
	public String addedNewRoleLocator = "//a[contains(text(),'QA_Group')]";
	public String getAddedNewRole()
	{
		return addedNewRoleLocator;
	}
	
	//Users tab Xpaths
	public String showButtonLocator = "//a[text()='Show']";
	public String getShowButtonLocator()
	{
		return showButtonLocator;
	}
	
	
	//Holiday tab Xpaths
	
	public String enterHolidaysDateFieldLocator = "//input[contains(@id,'holiday-date')]";
	public String getEnterHolidaysDateFieldLocator()
	{
		return enterHolidaysDateFieldLocator;
	}
	
	public String enterReasonFieldLocator = "//input[contains(@id,'holiday-reason')]";
	public String getEnterReasonFieldLocator()
	{
		return enterReasonFieldLocator;
	}
	
	public String areaSelectLocator = "//input[contains(@name,'area_select[]')]";
	public String getAreaSelectLocator()
	{
		return areaSelectLocator;
	}
	
	public String saveDataButtonLocator = "//button[text()='Save Data']";
	public String getSaveDataButtonLocator()
	{
		return saveDataButtonLocator;
	}
	
	public String deleteButtonLocator = "//a[text()='Delete']";
	public String getDeleteButtonLocator()
	{
		return deleteButtonLocator;
	}

	
	public String searchTextBoxLocator = "//input[contains(@id,'search')]";
	public String getSearchTextBoxLocator()
	{
		return searchTextBoxLocator;
	}
	
	public String searchButtonLocator = "//button[text()='Search']";
	public String getSearchButtonLocator()
	{
		return searchTextBoxLocator;
	}
	
	//functions
	public void openRolesTab()
	{
		driver.findElement(By.xpath(rolesTabLocator)).click();
	}
	
	
	public void openPermissionsTab()
	{
		driver.findElement(By.xpath(permissionsTabLocator)).click();
	}
	
	public void openUsersTab()
	{
		driver.findElement(By.xpath(usersTabLocator)).click();
	}
	
	public void openHolidaysTab()
	{
		driver.findElement(By.xpath(holidaysTabLocator)).click();
	}
	
	public void openAddNewRoleScreen()
	{
		driver.findElement(By.xpath(addNewRoleButtonLocator)).click();
		driver.switchTo().window(addNewRoleScreenLocator);
	}
	
	public void onClickViewButton()
	{
		driver.findElement(By.xpath(viewButtonLocator)).click();
	}
	
	public void onClickEditButton()
	{
		driver.findElement(By.xpath(editButtonLocator)).click();
	}
	
	public void addNewRole(String roleName, String parent)
	{
		openAddNewRoleScreen();
		driver.findElement(By.xpath(enterRoleFieldLocator)).sendKeys(roleName);
		Select selectParent = new Select(driver.findElement(By.xpath(selectParentFieldLocator)));
		selectParent.selectByVisibleText(parent);
		driver.findElement(By.xpath(descriptionFieldLocator)).sendKeys("Testing purpose");
		driver.findElement(By.xpath(addButtonLocator)).click();
		
	}
	
	public void cancelNewRole()
	{
		openAddNewRoleScreen();
		driver.findElement(By.xpath(enterRoleFieldLocator)).sendKeys("QA_Group");
		Select selectParent = new Select(driver.findElement(By.xpath(selectParentFieldLocator)));
		selectParent.selectByVisibleText("Admin");
		driver.findElement(By.xpath(descriptionFieldLocator)).sendKeys("Testing purpose");
		driver.findElement(By.xpath(cancelButtonLocator)).click();
	}
	
	public void viewUsersAttachedToRole()
	{
		
	}
	
	public void editRole()
	{
		
	}
	
	public void addPermissions()
	{
		
	}
	
	public void editPermissions()
	{
		
	}
	
	public void clickOnPermissions()
	{
		
	}
	
	public void clickOnRoutes()
	{
		
	}
	
	public void addUsers()
	{
		
	}
	
	public void showUsersRole()
	{
		
	}
	
	public void clickOnUserName()
	{
		
	}
	
	public void clickOnDetails()
	{
		
	}
	
	public void loginActivation()
	{
		
	}
	
	public void addHolidays(AreaName areaName)
	{
		driver.findElement(By.xpath(enterHolidaysDateFieldLocator)).sendKeys("09/08/2014");
		driver.findElement(By.xpath(enterReasonFieldLocator)).sendKeys("test");
		
		Select area = new Select(driver.findElement(By.xpath(areaSelectLocator)));
		switch(areaName.getAreaName())
		{
			case Bangalore:
				area.selectByVisibleText(areaName.getAreaName().toString());
				break;
				
			case  Gurgaon: 
				area.selectByVisibleText(areaName.getAreaName().toString());
			break;
			
			case  Pune: 
				area.selectByVisibleText(areaName.getAreaName().toString());
			break;	
			
			case  Hyderabad: 
				area.selectByVisibleText(areaName.getAreaName().toString());
			break;
			
			case  Chennai: 
				area.selectByVisibleText(areaName.getAreaName().toString());
			break;
			
			case  Kolkatta: 
				area.selectByVisibleText(areaName.getAreaName().toString());
			break;
			
			case  Lucknow: 
				area.selectByVisibleText(areaName.getAreaName().toString());
			break;
			
			case  DelhiNCR: 
				area.selectByVisibleText(areaName.getAreaName().toString());
			break;
			
			case  Chandigarh: 
				area.selectByVisibleText(areaName.getAreaName().toString());
			break;
			
			case  Coimbatore: 
				area.selectByVisibleText(areaName.getAreaName().toString());
			break;
			
			case  Noida: 
				area.selectByVisibleText(areaName.getAreaName().toString());
			break;
			
			case  Mumbai: 
				area.selectByVisibleText(areaName.getAreaName().toString());
			break;
			
		default:
			break;
			
		}
		
		driver.findElement(By.xpath(saveDataButtonLocator)).click();
	}
	
	public void deleteHoliday()
	{
		driver.findElement(By.xpath(deleteButtonLocator)).click();
	}
	
	public void searchUseronUsertab(String userName)
	{
		driver.findElement(By.xpath(searchTextBoxLocator)).sendKeys(userName);
		driver.findElement(By.xpath(searchButtonLocator)).click();
		
	}
}
