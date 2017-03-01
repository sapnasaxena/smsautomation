package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.BasePage;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	//@FindBy(how=How.XPATH, using = "//input[contains(@name,'username')]")
	private String userNameLocator = "//input[contains(@name,'username')]";
	
	
	public String getUserNameLocator() {
		return userNameLocator;
	}

	//@FindBy(how=How.XPATH, using = "//input[contains(@name,'password')]")
	public String passWordLocator = "//input[contains(@name,'password')]";
	
	
	public String getPasswordLocator()
	{
		return passWordLocator;
	}
	
	
	public String userEmailIdOnHomePageLocator = "//div[contains(@class,'user-dropdown')]";
	public String getUserEmailIdOnHomePageLocator()
	{
		return userEmailIdOnHomePageLocator;
	}
	
	
	//@FindBy(how=How.XPATH,using = "//button[contains(@type,'submit')]")
	public String loginButtonLocator = "//button[contains(@type,'submit')]" ;
	
	public String getLoginButtonLocator()
	{
		return loginButtonLocator;
	}
	
	public String errorMessageLogin = "//div[contains(text(),'Invalid Credentials')]";
	public String getErrorMessage()
	{
		return errorMessageLogin;
	}
	
	//@FindBy(how=How.XPATH,using = "//a[contains(@href,'http://stageops.portea.com/authenticate/forgotpw')]")
	public String forgotPasswordLink = "//a[contains(@href,'http://stageops.portea.com/authenticate/forgotpw')]";
	public String getForgotPasswordLink()
	{
		return forgotPasswordLink;
	}
	
	//@FindBy(how=How.XPATH,using = "//input[contains(@name,'emailId')]")
	public String forgotPasswordEmailId = "//input[contains(@name,'username')]";
	public String getForgotPasswordEmailId()
	{
		return forgotPasswordEmailId;
	}
	
	
	//@FindBy(how=How.XPATH, using = "//button[contains(@type,'submit')]")
	public String forgotPasswordButton = "//button[contains(@type,'submit')]";
	public String getForgotPasswordButton()
	{
		return forgotPasswordButton;
	}
	
	
	//@FindBy(how=How.XPATH,using = "//a[contains(@href,'http://stageops.portea.com/authenticate/register')]")
	public String createAccountLinkLocator ="//a[contains(@href,'http://stageops.portea.com/authenticate/register')]" ;
	public String getCreateAccountLinkLocator()
	{
		return createAccountLinkLocator;
	}
	
	//@FindBy(how=How.XPATH,using = "//input[contains(@name,'remember')]")
	public String rememberMeCheckboxLocator = "//input[contains(@name,'remember')]";
	public String getRememberCheckBoxLocator()
	{
		return rememberMeCheckboxLocator;
	}
	
	//@FindBy(how=How.XPATH,using = "//label[contains(@type,'checkbox')]")
	public String rememberMeLabelLocator = "//label[contains(@type,'checkbox')]";
	public String getRememberMeLabelLocator()
	{
		return rememberMeLabelLocator;
	}
	
	public String forgotPasswordConfirmationScreen = "html/body/div[2]/div[2]";
	public String getForgotPasswordConfirmationScreen()
	{
		return forgotPasswordConfirmationScreen;
	}

	
	public String homePageScreenTitleLocator = "//h3";
	
	public String getHomePageScreenTitleLocator()
	{
		return homePageScreenTitleLocator;
	}
	
	
	public String createAccountNameLocator = "//input[contains(@placeholder,'Enter your Name')]";
	public String getCreateAccountNameLocator()
	{
		return createAccountNameLocator;
	}
	
	public String createAccountEmailIdLocator = "//input[contains(@placeholder,'Enter your email')]";
	public String getCreateAccountEmailIdLocator()
	{
		return createAccountEmailIdLocator;
	}

	public String createAccountMobileNumberLocator = "//input[contains(@placeholder,'Enter your Mobile number')]";
	public String getCreateAccountMobileNumberLocator()
	{
		return createAccountMobileNumberLocator;
	}
	
	public String createAccountPasswordLocator = "//input[contains(@placeholder,'Enter your password')]";
	public String getCreateAccountPasswordLocator()
	{
		return createAccountPasswordLocator;
	}
	
	public String createAccountRegisterButtonLocator = "//button[contains(@type,'submit')]";
	public String getCreateAccountRegisterButtonLocator()
	{
		return createAccountRegisterButtonLocator;
	}
	
	public String createAccountConfirmationscreenLocator = "//div[contains(@class,'login-content')]";
	public String getCreateAccountConfirmationScreenLocator()
	{
		return createAccountConfirmationscreenLocator;
	}
	
	  public String logOutLocator = "//a[@href = 'http://stageops.portea.com/authenticate/logout']";
	  public String getLogOutLocator()
	{
		return logOutLocator;
	}
	  
	  
	  public String duplicateAccountErrorMsg = "//div[contains(@class,'error-msg')]";
	  public String getDuplicateAccountErrorMsg()
	  {
		  return duplicateAccountErrorMsg;
	  }
	  
	public void doLogin(String uname, String passwd)
	{
		System.out.println("DEBUG: Enter username");
		driver.findElement(By.xpath(userNameLocator)).sendKeys(uname);
		System.out.println("DEBUG: Enter Password");
		driver.findElement(By.xpath(passWordLocator)).sendKeys(passwd);
		System.out.println("DEBUG: Click on Login Button");
		driver.findElement(By.xpath(loginButtonLocator)).click();
		GlobalUtil.wait(5);
		driver.manage().window().maximize();
	
	}
	
	public void errorMessage()
	{
		System.out.println("Check display Error message");
		driver.findElement(By.xpath(errorMessageLogin));
	}
	public void doLogOut()
	{
		driver.findElement(By.xpath(logOutLocator)).click();
	}
	
	public void doForgotPassword(String emailId)
	{
		System.out.println("DEBUG: Click on Forgot Password Link");
		driver.findElement(By.xpath(forgotPasswordLink)).click();
		System.out.println("DEBUG: Enter Email ID");
		driver.findElement(By.xpath(forgotPasswordEmailId)).sendKeys(emailId);
		System.out.println("DEBUG: Click on Forgot button");
		driver.findElement(By.xpath(forgotPasswordButton)).click();
	}
	
	
	public void createAccount(String uname, String emailid, String mobileno, String password)
	{
		System.out.println("DEBUG: Click on create Account link");
		driver.findElement(By.xpath(createAccountLinkLocator)).click();
		System.out.println("DEBUG: Enter name ");
		driver.findElement(By.xpath(createAccountNameLocator)).sendKeys(uname);
		System.out.println("DEBUG:Enter Email Id");
		driver.findElement(By.xpath(createAccountEmailIdLocator)).sendKeys(emailid);
		System.out.println("DEBUG: Enter Mobile number");
		driver.findElement(By.xpath(createAccountMobileNumberLocator)).sendKeys(mobileno);
		System.out.println("DEBUG: Enter Password");
		driver.findElement(By.xpath(createAccountPasswordLocator)).sendKeys(password);
		System.out.println("DEBUG: Click on Register button");
		driver.findElement(By.xpath(createAccountRegisterButtonLocator)).click();
		
	}
}
