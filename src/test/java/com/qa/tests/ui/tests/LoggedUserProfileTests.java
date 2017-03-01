package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.LoggedUserProfilePage;
import com.qa.tests.ui.pages.LoginPage;

public class LoggedUserProfileTests extends TestBase {

	LoginPage loginpage;
	LoggedUserProfilePage loggeduserprofilepage;
	
	public static String username = "qatest@test.com";
	public static String password ="flower";
	public static String new_password ="123456";
	public static String confirm_password = "123456";

	
	
	
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		loggeduserprofilepage = PageFactory.initElements(driver, LoggedUserProfilePage.class);
	}
	
 
    @AfterMethod
    public void tearDown() throws Exception
    {
	super.tearDown();
     }
	
    @Test
   	public void testVerifyLoggedInUserNameVisibilty()
   	{
   	   System.out.println("Verify that user is able to see loggedin username  on mouse hovering ong Profile Pic.");
   	   loginpage.doLogin(username, password);
   	   Actions mousehover = new Actions((WebDriver) driver.findElement(By.xpath(loggeduserprofilepage.getUserPicLocator())));
   	   mousehover.build().perform();
   	   Assert.assertTrue(loggeduserprofilepage.getUserNameLocator(), true);
   	   
   	}
 
   @Test
	public void testVerifyEditProfileOptionVisibilty()
	{
	   System.out.println("Verify that user is able to see Edit Profile link on mouse hovering ong ProfilePic.");
   	   loginpage.doLogin(username, password);
   	   Actions mousehover = new Actions((WebDriver) driver.findElement(By.xpath(loggeduserprofilepage.getUserPicLocator())));
   	   mousehover.build().perform();
   	   Assert.assertTrue(loggeduserprofilepage.getEditProfileLocator(), true);
	}
   
   @Test
  	public void testVerifyChangePasswordOptionVisibilty()
  	{
	   System.out.println("Verify that user is able to see Change Password link on mouse hovering ong ProfilePic.");
   	   loginpage.doLogin(username, password);
   	   Actions mousehover = new Actions((WebDriver) driver.findElement(By.xpath(loggeduserprofilepage.getUserPicLocator())));
   	   mousehover.build().perform();
   	   Assert.assertTrue(loggeduserprofilepage.getPasswordLocator(), true);
  	   
  	}
   
   @Test
  	public void testVerifyLogOutOptionVisibilty()
  	{
	   System.out.println("Verify that user is able to see LogOut link on mouse hovering ong ProfilePic.");
   	   loginpage.doLogin(username, password);
   	   Actions mousehover = new Actions((WebDriver) driver.findElement(By.xpath(loggeduserprofilepage.getUserPicLocator())));
   	   mousehover.build().perform();
   	   Assert.assertTrue(loggeduserprofilepage.getLogOutLocator(), true);
  	   
  	}
   
   //Functional Test Cases
   @Test
   public void testVerifyUserIsAbleToEditProfileSuccessfully()
   {
	   System.out.println("Verify that user is able to see LogOut link on mouse hovering ong ProfilePic.");
   	   loginpage.doLogin(username, password);
   	   GlobalUtil.wait(5);
   	   Actions mousehover = new Actions((WebDriver) driver.findElement(By.xpath(loggeduserprofilepage.getUserPicLocator())));
   	   mousehover.build().perform();
   	   loggeduserprofilepage.editProfile();
   	   GlobalUtil.wait(5);
   	   Assert.assertTrue(loginpage.getHomePageScreenTitleLocator(), true);
   }
   
   @Test
   public void testVerifyUserIsAbleToChangePasswordSuccessfully()
   {
	   System.out.println("Verify that user is able to see LogOut link on mouse hovering ong ProfilePic.");
   	   loginpage.doLogin(username, password);
   	   GlobalUtil.wait(5);
   	   Actions mousehover = new Actions((WebDriver) driver.findElement(By.xpath(loggeduserprofilepage.getUserPicLocator())));
   	   mousehover.build().perform();
   	   loggeduserprofilepage.changePassword(password,new_password,confirm_password);
   	   GlobalUtil.wait(5);
   	   Assert.assertTrue(loginpage.getHomePageScreenTitleLocator(), true);
   }
   
   @Test
   public void testVerifyErrorOnMismatchNewAndConfirmPassword()
   {
	   System.out.println("Verify that user is able to see LogOut link on mouse hovering ong ProfilePic.");
   	   loginpage.doLogin(username, password);
   	   GlobalUtil.wait(5);
   	   Actions mousehover = new Actions((WebDriver) driver.findElement(By.xpath(loggeduserprofilepage.getUserPicLocator())));
   	   mousehover.build().perform();
   	   loggeduserprofilepage.changePassword(password,new_password,"1234");
   	   GlobalUtil.wait(5);
   	   Assert.assertTrue(loggeduserprofilepage.getErrorMessageLocator(), true);
   }
   
   @Test
   public void testVerifyErrorOnMismatchOldPassword()
   {
	   System.out.println("Verify that user is able to see LogOut link on mouse hovering ong ProfilePic.");
   	   loginpage.doLogin(username, password);
   	   GlobalUtil.wait(5);
   	   Actions mousehover = new Actions((WebDriver) driver.findElement(By.xpath(loggeduserprofilepage.getUserPicLocator())));
   	   mousehover.build().perform();
   	   loggeduserprofilepage.changePassword("qwerty",new_password,"1234");
   	   GlobalUtil.wait(5);
   	   Assert.assertTrue(loggeduserprofilepage.getErrorMessageLocator(), true);
   }
   
   @Test
   public void testVerifyMaxLengthOfPassword()
   {
	   System.out.println("Verify that user is able to see LogOut link on mouse hovering ong ProfilePic.");
   	   loginpage.doLogin(username, password);
   	   GlobalUtil.wait(5);
   	   Actions mousehover = new Actions((WebDriver) driver.findElement(By.xpath(loggeduserprofilepage.getUserPicLocator())));
   	   mousehover.build().perform();
   	   loggeduserprofilepage.maxlengthPassword(password,new_password,confirm_password);
   	   if(new_password.length()<5)
   	   {
   		Assert.assertTrue(loggeduserprofilepage.getErrorMessageLocator(), true);
   	   }
  
   	   
   }
   
   @Test
   public void testVerifyUserIsAbleToLogOutSuccessfully()
   {
	   System.out.println("Verify that user is able to see LogOut link on mouse hovering ong ProfilePic.");
   	   loginpage.doLogin(username, password);
   	   GlobalUtil.wait(5);
   	   Actions mousehover = new Actions((WebDriver) driver.findElement(By.xpath(loggeduserprofilepage.getUserPicLocator())));
   	   mousehover.build().perform();
   	   loggeduserprofilepage.logout();
   	   Assert.assertTrue(loginpage.getLoginButtonLocator(), true);
   }
   
}
