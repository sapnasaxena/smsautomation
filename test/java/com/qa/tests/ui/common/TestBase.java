package com.qa.tests.ui.common;

import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


import com.qa.tests.common.GlobalUtil;


public class TestBase {
	protected  WebDriver driver;
	String screenshotLocation = System.getProperty("RESULTS") + System.getProperty("file.separator");
	private String url;
	


	public void setUp()
			throws Exception
	{
		System.out.println("Inside setUp: \n"+System.getProperty("webdriver_firefox_profile")+"\n"+System.getProperty("webdriver_firefox_bin"));
		FirefoxProfile profile =
				new FirefoxProfile(new File(System.getProperty("webdriver_firefox_profile")));
		profile.setEnableNativeEvents(true);

		String driverType = System.getProperty("BROWSER");
		if(driverType.equalsIgnoreCase("firefox")){
			this.driver =
					new FirefoxDriver(new FirefoxBinary(new File(System.getProperty("webdriver_firefox_bin"))),
							profile);
		}
		url = System.getProperty("URL");
		driver.get(url);
	}
	//driver.webdriverRegion.setBounds(new Rectangle(0, 0, 1024, 768));

	public void tearDown()
			throws Exception
	{
		System.out.println("Inside tearDown");
		driver.manage().deleteAllCookies();
		GlobalUtil.wait(3);
		//this.driver.close();
		this.driver.quit();
		
		BasePage.f11 = false;
	}

	public void close(){
		System.out.println("Debug: closeBrowser");
		screenshot(GlobalUtil.generateRandomString());
		driver.manage().deleteAllCookies();
		this.driver.quit();
		BasePage.f11 = false;
	}
	
	/**
	 * To capture the screenshot of a test
	 * @param screenshotName
	 */
	public void screenshot(String screenshotName)
	{
		GlobalUtil.wait(1);
		System.out.println("Debug: screenshot: Start");
		try {
			String folder_name =
					screenshotLocation + GlobalUtil.generateRandomString() + System.getProperty("file.separator");
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			System.out.println(screenshotName + "_" + GlobalUtil.generateRandomString());
			if (!new File(folder_name).exists()) {
				new File(folder_name).mkdir();
			}
			//FileUtils.copyFile(scrFile, new File(folder_name + screenshotName + ".png"));

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Debug: screenshot: End");
	}

}
