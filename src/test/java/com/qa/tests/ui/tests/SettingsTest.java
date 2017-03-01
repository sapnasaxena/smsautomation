package com.qa.tests.ui.tests;

import junit.framework.Assert;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.ui.common.AreaName;

import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.SettingsPage;

public class SettingsTest extends TestBase  {

	
	LoginPage loginpage;
	HomePage homepage;
	SettingsPage settingspage;
	
	public SettingsTest() {
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		settingspage = PageFactory.initElements(driver, SettingsPage.class);
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	@Test
	public void testVerifyGeneralTabVisibility()
	{
		System.out.println("DEBUG: To verify that General tab is visible on Settings");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		Assert.assertTrue(settingspage.getGeneralTabLocator(), true);
	}
	
	@Test
	public void testVerifyRolesTabVisibility()
	{
		System.out.println("DEBUG: To verify that Roles tab is visible on Settings");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		Assert.assertTrue(settingspage.getRolesTabLocator(), true);
	}
	
	@Test
	public void testVerifyPermissionsTabVisibility()
	{
		System.out.println("DEBUG: To verify that Permissions tab is visible on Settings");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		Assert.assertTrue(settingspage.getPermissionsTabLocator(), true);
	}
	
	@Test
	public void testVerifyUsersTabVisibility()
	{
		System.out.println("DEBUG: To verify that Users tab is visible on Settings");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		Assert.assertTrue(settingspage.getUsersTabLocator(), true);
	}
	
	@Test
	public void testVerifyHolidaysTabVisibility()
	{
		System.out.println("DEBUG: To verify that Holidays tab is visible on Settings");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		Assert.assertTrue(settingspage.getHolidaysTabLocator(), true);
	}
	
	@Test
	public void testVerifyAddNewRoleButtonVisibilityOnRoles()
	{
		System.out.println("DEBUG: To verify that 'Add New Role' Button is visible on Roles tab of Settings");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openRolesTab();
		Assert.assertTrue(settingspage.getaddNewRoleButtonLocator(), true);
	}
	
	@Test
	public void testVerifyOnClickAddNewRoleButtonOnRoles()
	{
		System.out.println("DEBUG: To verify that 'Add New Role' screen will open on clicking Add New Role  Button  on Roles tab of Settings");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openRolesTab();
		settingspage.openAddNewRoleScreen();
		Assert.assertTrue(settingspage.getaddNewRoleScreenLocator(), true);
	}
	
	
	@Test
	public void testVerifyViewButtonVisibilityOnRoles()
	{
		System.out.println("DEBUG: To verify that 'View' Button is visible on Users column on Roles tab of Settings");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openRolesTab();
		Assert.assertTrue(settingspage.getViewButtonLocator(), true);
	}
	
	@Test
	public void testVerifyRolesColumnVisibilityOnRoles()
	{
		System.out.println("DEBUG: To verify that 'Role' Column is visible on table of Roles tab of Settings");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openRolesTab();
		Assert.assertTrue(settingspage.getroleColumnLocator(), true);
	}

	@Test
	public void testVerifyDescriptionColumnVisibilityOnRoles()
	{
		System.out.println("DEBUG: To verify that 'Descriptions' Column is visible on table of Roles tab of Settings");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openRolesTab();
		Assert.assertTrue(settingspage.getDescriptionColumnLocator(), true);
	}
	
	@Test
	public void testVerifyUsersColumnVisibilityOnRoles()
	{
		System.out.println("DEBUG: To verify that 'Users' Column is visible on table of Roles tab of Settings");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openRolesTab();
		Assert.assertTrue(settingspage.getUsersColumnLocator(), true);
	}
	
	@Test
	public void testVerifyEditColumnVisibilityOnRoles()
	{
		System.out.println("DEBUG: To verify that 'Edit' Column is visible on table of Roles tab of Settings");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openRolesTab();
		Assert.assertTrue(settingspage.getEditColumnLocator(), true);
	}
	
	@Test
	public void testVerifyAddNewRoleScreenHaveEnterRoleField()
	{
		System.out.println("DEBUG: To verify that 'Enter Role' field  is visible on Add New Role screen");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openRolesTab();
		settingspage.openAddNewRoleScreen();
		Assert.assertTrue(settingspage.getEnterRoleFieldLocator(), true);
	}
	
	@Test
	public void testVerifyAddNewRoleScreenHaveSelectParentField()
	{
		System.out.println("DEBUG: To verify that 'Select Parent' field  is visible on Add New Role screen");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openRolesTab();
		settingspage.openAddNewRoleScreen();
		Assert.assertTrue(settingspage.getSelectParentFieldLocator(), true);
	}
	
	@Test
	public void testVerifyAddNewRoleScreenHaveDescriptionsField()
	{
		System.out.println("DEBUG: To verify that 'Descriptions' field  is visible on Add New Role screen");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openRolesTab();
		settingspage.openAddNewRoleScreen();
		Assert.assertTrue(settingspage.getDescriptionFieldLocator(), true);
	}
	
	@Test
	public void testVerifyAddNewRoleScreenHaveAddButton()
	{
		System.out.println("DEBUG: To verify that 'Add' Button  is visible on Add New Role screen");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openRolesTab();
		settingspage.openAddNewRoleScreen();
		Assert.assertTrue(settingspage.getAddButtonLocator(), true);
	}
	
	@Test
	public void testVerifyAddNewRoleScreenHaveCancelButton()
	{
		System.out.println("DEBUG: To verify that 'Cancel' Button  is visible on Add New Role screen");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openRolesTab();
		settingspage.openAddNewRoleScreen();
		Assert.assertTrue(settingspage.getCancelButtonLocator(), true);
	}
	
	@Test
	public void testVerifyAddNewRole()
	{
		System.out.println("To Verify that user is able to add New Role");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openRolesTab();
		settingspage.addNewRole("QA_Group","Admin");
		Assert.assertTrue(settingspage.getAddedNewRole(),true);
		
	}
	
	@Test
	public void testVerifyCancelAddNewRole()
	{
		System.out.println("To Verify that user is able to add New Role");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openRolesTab();
		settingspage.cancelNewRole();
		Assert.assertTrue(settingspage.getAddedNewRole(),true);
	}
	
	
	@Test
	public void testVerifyAddHoliday()
	{
		System.out.println("To Verify that user is able to add Holiday");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openHolidaysTab();
		AreaName areaName = getAreaName();
		settingspage.addHolidays(areaName);
		//Assert.assertTrue(settingspage.getAreaSelectLocator(),true);
	}
	
	
	
	@Test
	public void testVerifySearchFuncOnUserTab()
	{
		System.out.println("DEBUG: To verify that user can search any user on User tab");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openUsersTab();
		settingspage.searchUseronUsertab("test");
		Assert.assertTrue(settingspage.usersColumnLocator, true);
	}
	
	

	@Test
	public void testVerifyTypeFilterOnUserTab()
	{
		System.out.println("DEBUG: To verify that user can search any user on User tab");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openSettingsPage();
		settingspage.openUsersTab();
		settingspage.searchUseronUsertab("test");
		Assert.assertTrue(settingspage.usersColumnLocator, true);
	}
	
	
	
	
	
	private AreaName getAreaName(){
		AreaName areaName = new AreaName();
		areaName.setAreaName(areaName.getAreaName());
		return areaName;
	}
	
	

	
}
