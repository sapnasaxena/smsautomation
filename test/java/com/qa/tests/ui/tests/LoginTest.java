package com.qa.tests.ui.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.LoginPage;

public class LoginTest extends TestBase{

	LoginPage loginpage;
	public static String username = "qatest@test.com";
	public static String password ="flower";
	public static String uname ="tests";
	public static String emailid ="test@test.com";
	public static String mobileno = "211221727";
	
	
	
	
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
	}
	
 
    @AfterMethod
    public void tearDown() throws Exception
    {
	super.tearDown();
     }
	

 
   @Test
	public void testVerifyUsernameField()
	{
		System.out.println("DEBUG: To verify that user is able to see the username field on login screen");
		System.out.println("DEBUG: Check username");
		Assert.assertTrue(true, loginpage.getUserNameLocator());
		
	}
	
	
	@Test
	public void testVerifyPasswordField()
	{
		System.out.println("DEBUG: To verify that user is able to see the password field on login screen");
		System.out.println("DEBUG: Check password field ");
		Assert.assertTrue(true,loginpage.getPasswordLocator());
		
	}
	
	
	@Test
	public void testVerifyLoginButton()
	{
		System.out.println("DEBUG: To verify that user is able to see the Login button on login screen");
		System.out.println("DEBUG: Check Login button");
		Assert.assertTrue(true,loginpage.getLoginButtonLocator());
		
	}
	

	@Test
	public void testVerifyRememberMeCheckbox()
	{
		System.out.println("DEBUG: To verify that user is able to see Remember Me checkbox on login screen");
		System.out.println("DEBUG: Check Remember Me checkbox");
		Assert.assertTrue(true,loginpage.getRememberCheckBoxLocator());
		
	}
	

	@Test
	public void testVerifyRememberMeLabel()
	{
		System.out.println("DEBUG: To verify that user is able to see Remember Me Label on login screen");
		System.out.println("DEBUG: Check Remember Me Label");
		Assert.assertTrue(true,loginpage.getRememberMeLabelLocator());
		
	}
	
	
	@Test
	public void testVerifyForgotPasswordLink()
	{
		System.out.println("DEBUG: To verify that user is able to see Forgot Password Link on login screen");
		System.out.println("DEBUG: Check Forgot Password Link on Login screen");
		Assert.assertTrue(true,loginpage.getForgotPasswordLink());
		
	}
	
	
	//@Test
	public void testVerifyCreateAccountLink()
	{
		System.out.println("DEBUG: To verify that user is able to see Create Account Link on login screen");
		System.out.println("DEBUG: Check Create Account Link on Login screen");
		Assert.assertTrue(true,loginpage.getCreateAccountLinkLocator());
		
	}
	
	@Test
	public void testVerifyLogin()
	{
		System.out.println("DEBUG: To verify that user is able to login to the application");
		System.out.println("DEBUG: Enter Username and password");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(10);
		AssertJUnit.assertTrue(loginpage.isElementPresent(By.xpath(loginpage.getHomePageScreenTitleLocator())));
		Actions mouseover = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(loginpage.userEmailIdOnHomePageLocator));
		WebElement logout = driver.findElement(By.xpath(loginpage.logOutLocator));
		mouseover.moveToElement(we).moveToElement(logout).click().build().perform();
		loginpage.getLogOutLocator();
		AssertJUnit.assertTrue(loginpage.isElementPresent(By.xpath(loginpage.createAccountConfirmationscreenLocator)));
		GlobalUtil.wait(10);
		
	}
	

	@Test
	public void testVerifyErrorMessageonLoginWithoutUsername()
	{
		System.out.println("DEBUG: To verify that user is able to login to the application");
		System.out.println("DEBUG: Enter Username and password");
		loginpage.doLogin(" ", password);
		loginpage.errorMessage();
		Assert.assertTrue(true, loginpage.getErrorMessage());
		
	}
	
	@Test
	public void testVerifyErrorMessageonLoginOnLeavingfieldsBlank()
	{
		System.out.println("DEBUG: To verify that user is able to login to the application");
		System.out.println("DEBUG: Enter Username and password");
		loginpage.doLogin(" ", " ");
		loginpage.errorMessage();
		Assert.assertTrue(true, loginpage.getErrorMessage());
		
	}
	
	@Test
	public void testVerifyErrorMessageonLoginWithInvalidCredentials()
	{
		System.out.println("DEBUG: To verify that user is able to login to the application");
		System.out.println("DEBUG: Enter Username and password");
		loginpage.doLogin("xyz ", "test");
		loginpage.errorMessage();
		Assert.assertTrue(true, loginpage.getErrorMessage());
		
	}

		@Test
	    public void testVerifyForgotPasswordFunctionality()
	    {
		GlobalUtil.wait(10);
		System.out.println("DEBUG: Verify that user is able to retrieve password through Forgot Password Link");
		loginpage.doForgotPassword(username);
		Assert.assertTrue(loginpage.isElementPresent(By.xpath(loginpage.getForgotPasswordConfirmationScreen())));
		GlobalUtil.wait(2);
		
	     }

	
	//@Test
	public void testVerifyCreateAccountFunctionality()
	{
		GlobalUtil.wait(10);
		System.out.println("DEBUG:To verify that user is able to create an account on application");
		loginpage.createAccount(uname, emailid, mobileno, password);
		Assert.assertTrue(loginpage.isElementPresent(By.xpath(loginpage.getCreateAccountConfirmationScreenLocator())));
		GlobalUtil.wait(2);
		
	}


	//@Test
	public void testVerifyDuplicateCreateAccount()
	{
		GlobalUtil.wait(10);
		System.out.println("DEBUG:To verify that user is able to see the error on trying to create duplicate  account on application");
		loginpage.createAccount(uname, emailid, mobileno, password);
		System.out.println("DEBUG: Check error message");
		Assert.assertTrue(loginpage.isElementPresent(By.xpath(loginpage.getDuplicateAccountErrorMsg())));
		GlobalUtil.wait(2);
		
	}
	
	//@Test
	public void testVerifyRegisteredUserLoginBeforeAdminActivation()
	{
		GlobalUtil.wait(10);
		System.out.println("DEBUG:To verify that user is able to see the error on trying to login before activation of account on application");
		loginpage.createAccount(uname, emailid, mobileno, password);
		loginpage.doLogin(username, password);
		Assert.assertTrue(loginpage.isElementPresent(By.xpath(loginpage.getDuplicateAccountErrorMsg())));
		GlobalUtil.wait(2);
		
	}
	
	
}
