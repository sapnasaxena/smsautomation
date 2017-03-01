package com.qa.tests.ui.pages;

import org.openqa.selenium.WebDriver;

import com.qa.tests.ui.common.BasePage;

public class MissedCallPage extends BasePage{

	public MissedCallPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String actualMessage ="//td[2]";
	public String getActualMessage()
	{
		return actualMessage;
	}
}
