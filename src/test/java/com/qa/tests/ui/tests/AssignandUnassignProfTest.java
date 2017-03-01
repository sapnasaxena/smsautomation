package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.AssignandUnassignProfPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;

public class AssignandUnassignProfTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	AssignandUnassignProfPage profpage;
	public static final String username = "qatest@test.com";
	public static final String password ="flower";
	String patientName="sravani";
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		profpage=PageFactory.initElements(driver,AssignandUnassignProfPage.class);
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	@Test
	public void testAssignProf() throws InterruptedException
	{
	loginpage.doLogin(username, password);
	System.out.println("navigating to Appointments tab");
	homepage.openAppointmentPage();
	 System.out.println("new status selecting");
	  profpage.newFilter();
	  profpage.getchangeLoactor().click();
	  GlobalUtil.wait(5);
	  System.out.println("chossing Prof from list");
	  profpage.getradioProfselect().click();
	  profpage.assignProfButton();
	  profpage.newFilterClear();
  }
	 @Test
	  public void testChangeProf() throws InterruptedException{
		 loginpage.doLogin(username, password);
			System.out.println("navigating to Appointments tab");
			homepage.openAppointmentPage();
		  System.out.println("confirmed status selecting");
		  profpage.pendingSelection();
		  profpage.getchangeLoactor().click();
		 GlobalUtil.wait(5);
		  profpage.getradioSelectionforChange().click();
		  GlobalUtil.wait(5);
		  System.out.println("chossing Prof from list");
		  profpage.assignProfButton();
	  } 
	 @Test
	  public void testUnassignProf() throws InterruptedException{
		 loginpage.doLogin(username, password);
			System.out.println("navigating to Appointments tab");
			homepage.openAppointmentPage();
		  System.out.println("confirmed status selecting");
		  profpage.pendingSelection();
		  System.out.println("status changing to Unassign");
		  profpage.getunassignLocator().click();
		  profpage.getchangestatusLoacator().click();
		 Alert a=driver.switchTo().alert();
		 a.accept();
		  System.out.println("prof unassigned");
	  }
}
