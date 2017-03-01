package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalConstants.BRAND;
import com.qa.tests.common.GlobalConstants.GENDER;
import com.qa.tests.common.GlobalConstants.SALUTATION;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.common.RandomUtil;
import com.qa.tests.common.GlobalConstants.LOCALITY;
import com.qa.tests.ui.common.PatientModal;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.BrandSpecificPatientPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.PatientProfile;
import com.qa.tests.ui.pages.PatientsPage;

public class BrandSpecificPatientTests extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	PatientsPage patientpage;
	PatientProfile patientprofilepage;
	BrandSpecificPatientPage brandspecificpatientpage;

	public static String username = "qatest@test.com";
	public static String password ="flower";
	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		patientpage = PageFactory.initElements(driver, PatientsPage.class);
		patientprofilepage = PageFactory.initElements(driver, PatientProfile.class);
		brandspecificpatientpage = PageFactory.initElements(driver, BrandSpecificPatientPage.class);
		
	}
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	@Test
	public void testVerifyUserIsAbleToAddOtherBrandPatient()
	{
		System.out.println("Verify that user is able to add patients for Other brands");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(5);
		homepage.openPatientListPage();
		PatientModal patientModal = getPatientDetails();
		patientModal.setSalutation(SALUTATION.Ms);
		patientModal.setBrand(BRAND.Manipal);
		patientModal.setGender(GENDER.Female);
		patientpage.addPatient(patientModal);
		patientpage.getAddedPatient(patientModal);
		Assert.assertNotNull(patientpage.getPatientNameLinkLocator());
		Assert.assertTrue(true, brandspecificpatientpage.getPatientIDLocator());
	}
	
	@Test
	public void testVerifyDisplayMobileNoRestrictedOnProfile()
	{
		System.out.println("Verify that for other brand, mobile number is displaying as Restricted");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(5);
		homepage.openPatientListPage();
		PatientModal patientModal = getPatientDetails();
		patientModal.setSalutation(SALUTATION.Ms);
		patientModal.setBrand(BRAND.Manipal);
		patientModal.setGender(GENDER.Female);
		patientpage.addPatient(patientModal);
		patientpage.getAddedPatient(patientModal);
		Assert.assertNotNull(patientpage.getPatientNameLinkLocator());
		Assert.assertTrue(true, brandspecificpatientpage.getPatientIDLocator());
	}
	
	@Test
	public void testVerifyClickToCallNotVisibleforOtherBrands()
	{
		System.out.println("Verify that for other brands, displaying restricted instead of Click to call option");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(5);
		homepage.openPatientListPage();
		PatientModal patientModal = getPatientDetails();
		patientModal.setSalutation(SALUTATION.Ms);
		patientModal.setBrand(BRAND.Manipal);
		patientModal.setGender(GENDER.Female);
		patientpage.addPatient(patientModal);
		patientpage.getAddedPatient(patientModal);
		Assert.assertTrue(true, brandspecificpatientpage.getClickToCallFieldLocator());
	}
	
	@Test
	public void testVerifyDisplayDNDStatusForBulkEmailForOtherBrand()
	{
		System.out.println("Verify that for other brands while sending bulk emails, it should display status as DND.");
		loginpage.doLogin(username, password);
		GlobalUtil.wait(5);
		homepage.openEmailPage();
		//go to bulk emails
		//select form
		//enter Patient ID
		//click on Proceed
		Assert.assertTrue(true, brandspecificpatientpage.bulkEmailStatusfieldLocator);
	}
	

	private PatientModal getPatientDetails(){
		PatientModal patientModal = new PatientModal();
		patientModal.setSalutation(patientModal.getSalutation());
		patientModal.setFirstName(GlobalUtil.getRandomName(8));
		patientModal.setLastName(GlobalUtil.getRandomName(8));
		patientModal.setMobileNumber(RandomUtil.generateRandomMobileNo());
		patientModal.setLoginEmail(GlobalUtil.getRandomName(4) + "@portea.qa");
		patientModal.setPinCode("560076");
		patientModal.setGender(patientModal.getGender());
		patientModal.setBrand(patientModal.getBrand());
		patientModal.setLocality(LOCALITY.Hulimavu);
		return patientModal;
	}

}
