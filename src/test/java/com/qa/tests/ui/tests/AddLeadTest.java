package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalConstants.GENDER;
import com.qa.tests.common.GlobalConstants.LOCALITY;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.common.RandomUtil;
import com.qa.tests.ui.common.AddLeadModal;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.AddLeadpage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;

public class AddLeadTest extends TestBase{
 
	LoginPage loginpage;
	HomePage homepage;
	AddLeadpage addlead;
	public static final String username = "sapna.saxena@porteamedical.com";
	public static final String password ="123456";
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		addlead=PageFactory.initElements(driver, AddLeadpage.class);
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	@Test
	public void testCreatingLead()
	{
	loginpage.doLogin(username, password);
	homepage.openLeadsPage();
	addlead.getAddLeadLocator().click();
	GlobalUtil.wait(5);
	AddLeadModal add=new AddLeadModal();
	addlead.addLead(add);
	add.getFirstName();
	add.getLastName();
	add.getMobileNumber();
	add.getemail();
	add.setGender(GENDER.Male);
	add.setLocality(LOCALITY.BannerghattaRoad);
	//addlead.save();
	}
	
	public AddLeadModal getleadDetails(){
		AddLeadModal add=new AddLeadModal();
	add.setFirstName(GlobalUtil.getRandomName(4));
	add.setLastName(GlobalUtil.getRandomName(4));
	add.setMobileNumber(RandomUtil.generateRandomMobileNo());
	add.setemail(GlobalUtil.getRandomName(4) + "@test.com");
	add.setPatientAge("30");
	add.setGender(add.getGender());
	add.setPinCode("560071");
	add.setLocality(add.getLocality());
	return add;
		}
	
}
