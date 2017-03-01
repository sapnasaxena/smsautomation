package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.BasePage;

public class LoggedUserProfilePage extends BasePage{

	public LoggedUserProfilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private String userPicLocator = "//a[contains(@class,'user-text')]";
	private String userNameLocator = "//a[contains(text(), 'qatest@test.com')]";
	private String logOutLocator = "//a[contains(text(),'Logout')]";
	private String EditProfileLocator = "//a[contains(text(),'Edit Profile')]";
	private String passwordLocator ="//a[contains(text(),'Change Password')]";
	private String changePasswordScreenLocator = "//h3[contains(@text,'Change Password')]";
	private String oldPasswordLocator ="//input[contains(@name,'old_pass')]";
	private String newPasswordLocator ="//input[contains(@name,'new_pass')]";
	private String confirmPasswordLocator = "//input[contains(@name,'confirm_pass')] ";
	private String cancelButtonLocator = "//a[text()='Cancel']";
	private String changePasswordButtonLocator = "//button[text()='Change Password']";
	private String userNameFieldLocator = "//input[contains(@name,'name')]";
	private String editProfileScreenLocator = "//h3[text() = 'Edit Profile']";
	private String mobileNumberLocator = "//input[contains(@name,'phone')]";
	private String changeProfileButtonLocator = "//button[text()='Change Profile']";
	private String errorMessageLocator ="//div[contains(@class,'error-msg')]";
	
	
	
	
	
	public String getErrorMessageLocator() {
		return errorMessageLocator;
	}
	public String getChangePasswordScreenLocator() {
		return changePasswordScreenLocator;
	}
	public String getEditProfileScreenLocator() {
		return editProfileScreenLocator;
	}
	public String getChangeProfileButtonLocator() {
		return changeProfileButtonLocator;
	}
	public String getCancelButtonLocator() {
		return cancelButtonLocator;
	}
	public String getChangePasswordButtonLocator() {
		return changePasswordButtonLocator;
	}
	public String getUserPicLocator() {
		return userPicLocator;
	}
	public String getUserNameLocator() {
		return userNameLocator;
	}
	public String getLogOutLocator() {
		return logOutLocator;
	}
	public String getEditProfileLocator() {
		return EditProfileLocator;
	}
	public String getPasswordLocator() {
		return passwordLocator;
	}
	public String getOldPasswordLocator() {
		return oldPasswordLocator;
	}
	public String getNewPasswordLocator() {
		return newPasswordLocator;
	}
	public String getConfirmPasswordLocator() {
		return confirmPasswordLocator;
	}
	public String getUserNameFieldLocator() {
		return userNameFieldLocator;
	}
	public String getMobileNumberLocator() {
		return mobileNumberLocator;
	}
	
	
	public void editProfile()
	{
		driver.findElement(By.xpath(EditProfileLocator)).click();
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(userNameFieldLocator)).clear();
		driver.findElement(By.xpath(userNameFieldLocator)).sendKeys("Sapna");
		driver.findElement(By.xpath(mobileNumberLocator)).clear();
		driver.findElement(By.xpath(mobileNumberLocator)).sendKeys("123456");
		driver.findElement(By.xpath(changeProfileButtonLocator)).click();
	}
	
	
	public void cancelEditProfile()
	{
		driver.findElement(By.xpath(EditProfileLocator)).click();
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(userNameFieldLocator)).sendKeys("");
		driver.findElement(By.xpath(mobileNumberLocator)).sendKeys("");
		driver.findElement(By.xpath(cancelButtonLocator)).click();
	}
	
	public void changePassword(String oldPassword, String newPassword, String confirmPassword)
	{
		driver.findElement(By.xpath(oldPasswordLocator));
		driver.findElement(By.xpath(newPasswordLocator)).sendKeys(newPassword);
		driver.findElement(By.xpath(confirmPasswordLocator)).sendKeys(confirmPassword);
		driver.findElement(By.xpath(changePasswordButtonLocator)).click();
	}
	
	public void cancelChangePassword(String oldPassword, String newPassword, String confirmPassword)
	{
		driver.findElement(By.xpath(oldPasswordLocator)).clear();
		driver.findElement(By.xpath(oldPasswordLocator)).sendKeys(oldPassword);
		driver.findElement(By.xpath(newPasswordLocator)).sendKeys(newPassword);
		driver.findElement(By.xpath(confirmPasswordLocator)).sendKeys(confirmPassword);
		driver.findElement(By.xpath(cancelButtonLocator)).click();
	}
	
	public void maxlengthPassword(String oldPassword, String newPassword, String confirmPassword)
	{
		driver.findElement(By.xpath(oldPasswordLocator)).clear();
		driver.findElement(By.xpath(oldPasswordLocator)).sendKeys(oldPassword);
		driver.findElement(By.xpath(newPasswordLocator)).sendKeys(newPassword);
		driver.findElement(By.xpath(confirmPasswordLocator)).sendKeys(confirmPassword);

	}
	
	public void logout()
	{
		driver.findElement(By.xpath(logOutLocator)).click();
	}

}
