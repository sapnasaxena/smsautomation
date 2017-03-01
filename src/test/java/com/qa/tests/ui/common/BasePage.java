package com.qa.tests.ui.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.qa.tests.common.GlobalUtil;

public abstract class BasePage {
	protected WebDriver driver;
	public static boolean f11 = false;

	public BasePage(WebDriver driver){
		this.driver = driver;
	}


	public boolean isElementPresent(By by) 
	{ 
		try 
		{ 
			turnOffImplicitWaits();
			driver.findElement(by);
			return true;
		}
		catch (NoSuchElementException e)
		{ 
			//e.printStackTrace();
			return false; 
		} 
		finally{
			turnOnImplicitWaits();
		}
	}
	protected void turnOffImplicitWaits() {
		this.driver.manage().timeouts().implicitlyWait(GlobalUtil.StandardInterval, TimeUnit.SECONDS);
	}

	protected void turnOnImplicitWaits()
	{
		this.driver.manage().timeouts().implicitlyWait(GlobalUtil.ShortInterval, TimeUnit.MINUTES);
	}

}
