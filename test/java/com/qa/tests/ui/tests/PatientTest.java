package com.qa.tests.ui.tests;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tests.common.GlobalConstants.BRAND;
import com.qa.tests.common.GlobalConstants.GENDER;
import com.qa.tests.common.GlobalConstants.LOCALITY;
import com.qa.tests.common.GlobalConstants.SALUTATION;
import com.qa.tests.common.GlobalConstants.SERVICE;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.AppointmentModal;
import com.qa.tests.ui.common.CalendarModal;
import com.qa.tests.ui.common.PatientModal;
import com.qa.tests.ui.common.ServiceModal;
import com.qa.tests.ui.common.TestBase;
import com.qa.tests.ui.pages.AppointmentPage;
import com.qa.tests.ui.pages.HomePage;
import com.qa.tests.ui.pages.LoginPage;
import com.qa.tests.ui.pages.PatientsPage;


//**** Created By: Sapna Saxena (Test Lead) **** 
// *** Dated: 20 September 2014
//*** Last updated on : 09 Feb 2015

public class PatientTest extends TestBase{


	PatientsPage patientpage;
	LoginPage loginpage;
	HomePage homepage;
	AppointmentPage appointmentpage;
	public final String username = "sapna.saxena@porteamedical.com";
	public final String password ="123456";
	String pname = "porteauser"+ GlobalUtil.getRandomName(10);




	public PatientTest() 
	{
		super();
		// TODO Auto-generated constructor stub
	}



	@BeforeMethod
	public void setUp() throws Exception
	{
		super.setUp();
		driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		patientpage = PageFactory.initElements(driver, PatientsPage.class);
		appointmentpage = PageFactory.initElements(driver, AppointmentPage.class);


	}

	@AfterMethod
	public void tearDown() throws Exception
	{
		super.tearDown();
	}


	//@Test
	public void testAddPatientSalutationMrBrandPorteaGenderMale(){
		System.out.println("DEBUG: To verify user is able to add the Male patient for Portea.");
		System.out.println("Debug: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();
		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Portea,GENDER.Male, SALUTATION.Mr, LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}


	@Test
	public void testVerifyEditPatient()
	{
		System.out.println("DEBUG: To verify user is able to add the Male patient for Portea.");
		System.out.println("Debug: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();
		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Portea,GENDER.Male, SALUTATION.Mr, LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		patientpage.getAddedPatient(PatientModal.getDefaultPatientDetails());
		GlobalUtil.wait(2);
		patientpage.editProfile();
		GlobalUtil.wait(2);
		if (driver.findElement(By.xpath(patientpage.genderInfoOverviewLocator)).equals("Male"))
		{
			Assert.assertTrue(patientpage.getGenderInfoOverviewLocator(), true);
		}
		else
		{
			System.out.println("Profile not updated..");
		}
		
	}

	@Test
	public void testAddPatientSalutationMrBrandPorteaGendermale(){
		System.out.println("DEBUG: To verify user is able to add the Male patient for Portea.");
		System.out.println("Debug: Login to application");
		loginpage.doLogin(username, password);
		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();
		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Portea,GENDER.Male, SALUTATION.Mr,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}





	@Test
	public void testAddPatientSalutationMrBrandMaxGenderMale(){
		System.out.println("DEBUG: To verify user is able to add the Male patient for Max Brand.");
		System.out.println("Debug: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();
		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Portea,GENDER.Male, SALUTATION.Mr,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}





	@Test
	public void testAddPatientSalutationMrBrandMaxGenderFemale(){
		System.out.println("DEBUG: To verify user is able to add the Female patient for Max.");
		System.out.println("Debug: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();
		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Max,GENDER.Female, SALUTATION.Mr,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}





	@Test
	public void testAddPatientSalutationMrBrandManipalGenderMale(){
		System.out.println("DEBUG: To verify user is able to add the Male patient to Manipal.");
		System.out.println("Debug: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();
		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Manipal,GENDER.Male, SALUTATION.Mr, LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
		Assert.assertTrue(patientpage.getRestrictedMobileNo(), true);
	}





	@Test
	public void testAddPatientSalutationMrsBrandManipalGenderFemale(){
		System.out.println("DEBUG: To verify user is able to add the Mrs Female patient of Manipal.");
		System.out.println("Debug: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();
		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Manipal,GENDER.Female, SALUTATION.Mrs, LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}





	@Test
	public void testAddPatientSalutationMrsBrandPorteaGenderFemale(){
		System.out.println("DEBUG: To verify user is able to add the Mrs Female patient for Portea.");
		System.out.println("Debug: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();
		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Portea,GENDER.Female, SALUTATION.Mrs, LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}



	@Test
	public void testAddPatientSalutationMrsBrandMaxGenderFemale(){
		System.out.println("DEBUG: To verify user is able to add the Mrs Female patient for Max.");
		System.out.println("Debug: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();
		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Max,GENDER.Female, SALUTATION.Mrs, LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}



	@Test
	public void testAddPatientSalutationDrBrandPorteaGenderMale(){
		System.out.println("DEBUG: To verify user is able to add the Dr Male patient for Portea.");
		System.out.println("Debug: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();
		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Portea,GENDER.Male, SALUTATION.Dr,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}





	@Test
	public void testAddPatientSalutationDrBrandPorteaGenderFemale(){
		System.out.println("DEBUG: To verify user is able to add the Dr Female patient for Portea.");
		System.out.println("Debug: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();
		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Portea,GENDER.Female, SALUTATION.Dr,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}





	@Test
	public void testAddPatientSalutationDrBrandMaxGenderMale(){
		System.out.println("DEBUG: To verify user is able to add the Dr Male patient for Max.");
		System.out.println("Debug: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();
		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Max,GENDER.Male, SALUTATION.Dr, LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}





	@Test
	public void testAddPatientSalutationDrBrandMaxGenderFemale(){
		System.out.println("DEBUG: To verify user is able to add the Dr Female patient for Max.");
		System.out.println("Debug: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();
		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Max,GENDER.Female, SALUTATION.Dr,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}





	@Test
	public void testAddPatientSalutationDrBrandManipalGenderMale(){
		System.out.println("DEBUG: To verify user is able to add the Dr Male patient for Manipal.");
		System.out.println("Debug: Login to application");
		loginpage.doLogin("test123@test.com", "flower");
		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();
		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Manipal,GENDER.Male, SALUTATION.Dr,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}





	@Test
	public void testAddPatientSalutationDrBrandManipalGenderFemale(){
		System.out.println("DEBUG: To verify user is able to add the Dr Female patient for Manipal Brand.");
		loginpage.doLogin("test123@test.com", "flower");
		GlobalUtil.wait(5);
		homepage.openPatientListPage();
		PatientModal.getPatientDetails(BRAND.Manipal,GENDER.Female, SALUTATION.Dr,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		System.out.println("Check Patient has been added successfully..");
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}





	@Test
	public void testAddPatientSalutationMsBrandPorteaGenderFemale()
	{

		System.out.println("DEBUG: To verify user is able to add the Ms Female patient for Portea.");
		loginpage.doLogin("test123@test.com", "flower");
		GlobalUtil.wait(5);
		homepage.openPatientListPage();
		PatientModal.getPatientDetails(BRAND.Portea,GENDER.Female, SALUTATION.Ms,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		System.out.println("Check Patient has been added successfully..");
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}


	@Test
	public void testAddPatientSalutationMsBrandMaxGenderFemale(){
		System.out.println("DEBUG: To verify user is able to add the Ms Female patient for Max.");
		loginpage.doLogin("test123@test.com", "flower");
		GlobalUtil.wait(5);
		homepage.openPatientListPage();
		PatientModal.getPatientDetails(BRAND.Max,GENDER.Female, SALUTATION.Ms,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		System.out.println("Check Patient has been added successfully..");
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}

	@Test
	public void testAddPatientSalutationMsBrandManipalGenderFemale()
	{

		System.out.println("DEBUG: To verify user is able to add the Ms Female patient for Manipal.");
		loginpage.doLogin("test123@test.com", "flower");
		GlobalUtil.wait(5);
		homepage.openPatientListPage();
		PatientModal.getPatientDetails(BRAND.Manipal,GENDER.Female, SALUTATION.Ms,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		System.out.println("Check Patient has been added successfully..");
		patientpage.getAddedPatient(PatientModal.getDefaultPatientDetails());
		Assert.assertTrue(patientpage.getPatientNameLinkLocator(), true);
	}


	//@Test
	public void testVerifyAddAppointmentForPackage()
	{
		System.out.println("To Verify user is able to add appointment for selected Package");

		System.out.println("Login to the application");
		loginpage.doLogin("test123@test.com", "flower");

		System.out.println("DEBUG: click on Patient Navigation bar");
		GlobalUtil.wait(5);
		driver.findElement((By.xpath(homepage.patientsNavBarLocator))).click();

		System.out.println("DEBUG: Add Patient by clicking on add patient button");
		PatientModal.getPatientDetails(BRAND.Portea,GENDER.Male, SALUTATION.Mr,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		patientpage.getAddedPatient(PatientModal.getDefaultPatientDetails());

		System.out.println("DEBUG: Click on Add Appointment button on Patient List");
		driver.findElement(By.xpath(patientpage.addAppointmentButtonOnPatientListLocator)).click();

		System.out.println("DEBUG: ADD Appointment");


	}
	
	

	//@Test
	public void testVerifySubscribeCustomServiceWithRecurringAptType()
	{
		System.out.println("DEBUG: Verify that user is able to customised the service with Recurring Appointment type");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openPatientListPage();
		PatientModal.getPatientDetails(BRAND.Portea,GENDER.Male, SALUTATION.Mr,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		ServiceModal.getServiceDetails(SERVICE.DoctorVisit, "200", "400");
		patientpage.addService(ServiceModal.getDefaultServiceDetails());
		homepage.openPatientListPage();
		patientpage.getAddedPatient(PatientModal.getDefaultPatientDetails());
		if(patientpage.getAddedServiceNameLocator().equals(SERVICE.DoctorVisit))
		{
		Assert.assertTrue(patientpage.getAddedServiceNameLocator(),true);
		}
		
	}
	
	@Test
	public void testVerifySubscribeCustomServiceWithFixedAptType()
	{
		System.out.println("DEBUG: Verify that user is able to customised the service with fixed appointment type");
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openPatientListPage();
		PatientModal.getPatientDetails(BRAND.Portea,GENDER.Male, SALUTATION.Mr,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		patientpage.getAddedPatient(PatientModal.getDefaultPatientDetails());
		ServiceModal.getServiceDetails(SERVICE.DoctorVisit, "200", "400");
		patientpage.addService(ServiceModal.getDefaultServiceDetails());
		homepage.openPatientListPage();
		patientpage.getAddedPatient(PatientModal.getDefaultPatientDetails());
		if(patientpage.getAddedServiceNameLocator().equals(SERVICE.DoctorVisit))
		{
		Assert.assertTrue(patientpage.getAddedServiceNameLocator(),true);
		}
		
	}
	
	//@Test
	public void testVerifySubscribeCustompackage()
	{
		System.out.println("DEBUG: Verify that user is able to customised the package");
		loginpage.doLogin("qatest@test.com", "flower");
	}
	
	//@Test
	public void testVerifyAddAppointment()
	{
		try{
        //login
		loginpage.doLogin("qatest@test.com", "flower");
		homepage.openPatientListPage();
		
		//add patient
		PatientModal.getPatientDetails(BRAND.Portea,GENDER.Male, SALUTATION.Mr,LOCALITY.DomlurBusStand);
		patientpage.addPatient(PatientModal.getDefaultPatientDetails());
		patientpage.getAddedPatient(PatientModal.getDefaultPatientDetails());
		//add service
		ServiceModal.getServiceDetails(SERVICE.DoctorVisit, "200", "400");
		patientpage.addService(ServiceModal.getDefaultServiceDetails());
		
		//add appointment
		AppointmentModal appointmentModal = getAppointmentDetails();
		appointmentModal.setClinicianPref("Best Available");
		appointmentModal.setSelectPackage("Doctor Visit");
		appointmentModal.setClinicianPref("Best Available");
	    patientpage.addAppointment(appointmentModal);
		CalendarModal.getDefaultCalendarDetails("9:30AM", "25", "60");
	   // patientpage.viewCalendar(CalendarModal.getCalendarDetails());
		
		appointmentpage.assignProfessional();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		//assign professional
		
		
		//read data
		
		
	}
	

	

	
	
	
	private AppointmentModal getAppointmentDetails(){
		AppointmentModal appointmentModal = new AppointmentModal();
		appointmentModal.setSelectPackage(appointmentModal.getSelectPackage());
		appointmentModal.setClinicianPref(appointmentModal.getClinicianPref());
		appointmentModal.setViewCalendar(appointmentModal.getViewCalendar());
		appointmentModal.setTimings(appointmentModal.getTimings());
		appointmentModal.setDuration(appointmentModal.getDuration());
		appointmentModal.setDayContent(appointmentModal.getDayContent());
		return appointmentModal;
	}
	
	
	
}
