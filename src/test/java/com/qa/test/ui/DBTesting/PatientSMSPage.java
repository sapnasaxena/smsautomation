package com.qa.test.ui.DBTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.BasePage;
import com.qa.tests.ui.common.PatientModal;

public class PatientSMSPage extends BasePage {

	public PatientSMSPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String genderInfoOverviewLocator ="//li[contains(@class,'referrerId')]";
	  public String getGenderInfoOverviewLocator()
	  {
		  return genderInfoOverviewLocator;
	  }
		
	  public String restrictedMobileNo ="//td[text()='M: Restricted']";
	  public String getRestrictedMobileNo()
	  {
		  return restrictedMobileNo;
	  }
		public String allTab ="//a[@href='/patient/all']" ;
		public String getAllTab()
		{
			return allTab;
		}

		public String searchTabLocator = "//a[@href='/patient/patientSearch']";
		public String getSearchTabLocator()
		{
			return searchTabLocator;
		}

		public String myteamspatientTabLocator= "//a[@href='/patient/byReportingManager']";
		public String getMyteamspatientTabLocator()
		{
			return myteamspatientTabLocator;
		}

		public String serviceFilterLocator = "//select[contains(@id,'patients-service-filter')]";
		public String getServiceFilterLocator()
		{
			return serviceFilterLocator;
		}

		public String packageFilterLocator = "//select[contains(@id,'patients-package-filter')]";
		public String getPackageFilterLocator()
		{
			return packageFilterLocator;
		}

		public String referrerFilterLocator = "//select[contains(@id,'patients-referrer-filter')]";
		public String getReferrerFilterLocator()
		{
			return referrerFilterLocator;
		}

		public String searchTextBox = "//input[contains(@id,'search')]";
		public String getSearchTextBox()
		{
			return searchTextBox;
		}

		public String searchButtonLocator = "//button[contains(@type,'submit')]";
		public String getSearchButtonLocator()
		{
			return searchButtonLocator;
		}

		//driver.findElement(By.xpath(patientNameLinkLocator.replace(GlobalUtil.PLACEHOLDER, patientModal.getFirstName())));

		private String patientNameLinkLocator = "//td/a[text()='" + GlobalUtil.PLACEHOLDER +"']";
		public String getPatientNameLinkLocator(){
			return patientNameLinkLocator;
		}


		private String editPatientButtonLocator = patientNameLinkLocator + "/..//..//td/a[text()='Edit']";
		public String getEditPatientButtonLocator(){
			return editPatientButtonLocator;
		}
		
		private String editPatientLinkLocator = "//a[text()='Edit']";
		public String getEditPatientLinkLocator(){
			return editPatientLinkLocator;
		}
		
		private String ageTextFieldLocator = "//input[contains(@id,'patient_age')]";
		public String getAgeTextFieldLocator(){
			return ageTextFieldLocator;
		}

		//****Add Patients screens xpaths***

		public String addPatientButtonLocator = "//a[text()='Add Patient']";
		public String getAddPatientButtonLocator()
		{
			return addPatientButtonLocator;
		}

		public String salutationlocator = "//select[contains(@name,'salutation')]";
		public String getSalutationLocator()
		{
			return salutationlocator;
		}

		public String patientFnameLocator = "//input[contains(@id,'firstName')]";
		public String getPatientFNameLocator()
		{
			return patientFnameLocator;
		}


		public String patientLnameLocator = "//input[contains(@id,'lastName')]";
		public String getPatientLNameLocator()
		{
			return patientLnameLocator;
		}


		public String patientMNameLocator ="//input[contains(@id,'middleName')]";
		public String getPatientMNameLocator()
		{
			return patientMNameLocator;
		}

		public String loginEmailIdLocator = "//input[contains(@name,'contactEmailId')]";
		public String getLoginEmailIdLocator()
		{
			return loginEmailIdLocator;
		}

//		public String contactEmailLocator ="//input[contains(@name,'contactEmailId')]";
//		public String getContactEmailLocator()
//		{
//			return contactEmailLocator;
//		}

		public String mobileNumberLocator = "//input[contains(@name,'mobileNumber')]";
		public String getMobileNumberLocator()
		{

			return mobileNumberLocator;

		}

		public String genderLocator = "//select[contains(@name,'gender')]";
		public String getGenderLocator()
		{
			return genderLocator;
		}

		public String dobRadioButtonLocator = "//input[contains(@id,'radio_dob')]";
		public String getDOBRadioButtonLocator()
		{
			return dobRadioButtonLocator;

		}

		public String dateOfBirthTextBoxLocator = "//input[contains(@id,'patient_dob')]";
		public String getDateOfBirthTextBoxLocator()
		{
			return dateOfBirthTextBoxLocator;
		}

		public String ageRadioButtonLocator = "//input[contains(@id,'radio_age')]";
		public String getAgeRadioButtonLocator()
		{
			return ageRadioButtonLocator;

		}

		public String ageTextBoxLocator = "//input[contains(@id,'patient_age')]";
		public String getAgeTextBoxLocator()
		{
			return ageTextBoxLocator;
		}

		public String addressLocator = "//textarea[contains(@name,'address')]";
		public String getAddressLocator()
		{
			return addressLocator;
		}

		public String pincodeLocator = "//input[contains(@name,'pinCode')]";
		public String getPinCodeLocator()
		{
			return pincodeLocator;
		}

		public String cityNameLabelLocator ="//label[contains(@id,'cityName')]";

		public String localiltyLocator = "//select[contains(@name,'locality')]";
		public String getLocalityLocator()
		{
			return localiltyLocator;
		}

		public String cityLocator = "//label[contains(@id,'cityName')]";
		public String getCityLocator()
		{
			return cityLocator;
		}

		public String areaLocator = "//select[contains(@id,'area')]";
		public String getAreaLocator()
		{

			return areaLocator;
		}

		public String locationLocator = "//input[contains(@id,'location')]";
		public String getlocationLocator()
		{
			return locationLocator;
		}
		
		private String locationCoordinatesLocators ="//input[contains(@id,'loc_cordinates')]";
		public String getLocationCoordinatesLocators()
		{
			return locationCoordinatesLocators;
		}

		public String locationButtonLocator = "//button[contains(@id,'loc-button')]";
		public String  getLocationButtonLocator()
		{
			return locationButtonLocator;
		}


		public String selectBrandLocator = "//select[contains(@id,'brandId')]";
		public String getselectBrandLocator()
		{
			return selectBrandLocator;
		}

		public String leadSourceLocator = "//select[contains(@id,'referrerName')]";
		public String getLeadSourceLocator()
		{
			return leadSourceLocator;
		}


		public String hospitalRegID = "//input[contains(@name,'hospitalRegId')]";
		public String getHospitalRegId()
		{

			return hospitalRegID;
		}

		public String savebuttonLocator = "//button[contains(text(),'Save')]";
		public String getSaveButtonLocator()
		{
			return savebuttonLocator;
		}


		public String patientNameOnListLocator = "//tr[1]/td[2]";
		public String getPatientNameOnListLocator()
		{
			return patientNameOnListLocator;
		}
	public void addPatient()
	{
	}
	public void getAddedPatient(PatientModals patientModal)
	{
		driver.findElement(By.xpath(patientNameLinkLocator.replace(GlobalUtil.PLACEHOLDER, patientModal.getFirstName()))).click();
	}
	
	
	public void addPatient(PatientModals patientModal)
	{
		System.out.println("DEBUG: Click on Add Patient button");
		driver.findElement(By.xpath(addPatientButtonLocator)).click();
		GlobalUtil.wait(10);
		System.out.println("Select Salutation");
		Select salutation = new Select(driver.findElement(By.xpath(salutationlocator)));
		salutation.selectByVisibleText("Mr");

	
		GlobalUtil.wait(2);

		System.out.println("DEBUG: Enter Patient first name");
		driver.findElement(By.xpath(patientFnameLocator)).sendKeys(patientModal.getFirstName());

       GlobalUtil.wait(2);
       System.out.println("DEBUG: Enter Patient last name");
		driver.findElement(By.xpath(patientLnameLocator)).sendKeys(patientModal.getLastName());

      GlobalUtil.wait(2);

		System.out.println("DEBUG: Enter Login email");
		driver.findElement(By.xpath(loginEmailIdLocator)).sendKeys(patientModal.getLoginEmail());
       GlobalUtil.wait(5);

		System.out.println("DEBUG: Enter Mobile number");
		driver.findElement(By.xpath(mobileNumberLocator)).sendKeys(patientModal.getMobileNumber());
		
		Select gender = new Select(driver.findElement(By.xpath(genderLocator)));
		gender.selectByVisibleText("Male");
		
		GlobalUtil.wait(10);

		WebElement hiddenInput = driver.findElement(By.xpath(locationCoordinatesLocators));
         String value = hiddenInput.getAttribute("Domlur Bus Stand");
		System.out.println("DEBUG: Select Brand");
		Select selectbrand = new Select(driver.findElement(By.xpath(selectBrandLocator)));
		selectbrand.selectByVisibleText("Portea");
        GlobalUtil.wait(5);
		System.out.println("DEBUG: Click on Save button");
		driver.findElement(By.xpath(savebuttonLocator)).click();;
		GlobalUtil.wait(10);
	}

	public void addAppointmentWithExistingAddedService()
	{
		WebElement addedService = driver.findElement(By.xpath("//a[contains(@href,'/appointment/add') and contains(.,'Add')]"));
		addedService.click();
		GlobalUtil.wait(2);
		
	}
	public static void fetchSmsQueue()
	 {
	 }
	 }
//		   Connection conn = null;
//		   Statement stmt = null;
//		   //ArrayList<String> resultValue = new ArrayList<String>();
//		   //public static final String url="jdbc:mysql://portea-test.c6wevl4fx9j5.ap-southeast-1.rds.amazonaws.com:3306/portea_crm?user=toor&password=23NP6w68P353";
//		   try{
//			      Class.forName("com.mysql.jdbc.Driver");
//			      System.out.println("Connecting to a selected database...");
//			      conn = DriverManager.getConnection("jdbc:mysql://portea-test.c6wevl4fx9j5.ap-southeast-1.rds.amazonaws.com:3306/portea_crm?user=toor&password=23NP6w68P353");
//			      System.out.println("Connected database successfully...");
//			      System.out.println("Creating statement...");
//			      stmt = conn.createStatement();
//			      String sql = "SELECT mobile_number,message,last_updated_on,brand_id FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number=918553013244 ORDER BY id DESC";
//			      ResultSet rs = stmt.executeQuery(sql);
//			      //String result = rs.toString();
//	              
//			     while(rs.next()){
//			      System.out.println("id:" +rs.getString("id"));
//			      System.out.println("Correlation id:" +rs.getString("correlation_id"));
//			      System.out.println("country_code:" +rs.getString("country_code"));
//			      System.out.println("gateway_status:" +rs.getString("gateway_status"));
//			      System.out.println("last_updated_on:" +rs.getString("last_updated_on"));
//			      System.out.println("message:" +rs.getString("message"));
//			      System.out.println("mobile number:" +rs.getString("mobile_number"));
//			      System.out.println("receiver type:" +rs.getString("receiver_type"));
//			      System.out.println("Scheduled type:" +rs.getString("scheduled_type"));
//			      System.out.println("Primary Processing Status:" +rs.getString("primary_processing_status"));
//			      System.out.println("Secondary Processing Status:" +rs.getString("secondary_processing_status"));
//			      System.out.println("Status Reason:" +rs.getString("status_reason"));
//			      System.out.println("Brand id:" +rs.getString("brand_id"));
//			      System.out.println("Gateway id:" +rs.getString("gateway_id"));
//			      System.out.println("User Id:" +rs.getString("user_id"));
//			     }
//			      
//	      rs.close();
//	      
//			   }catch(Exception e){
//			      //Handle errors for Class.forName
//			      e.printStackTrace();
//			   }finally{
//			         if(conn!=null)
//			            conn=null;
//			      }
//			   System.out.println("Goodbye!");
//			
//	 }
//	
//		   }
//			 
//			//}//end main
//	   
////	public void testVerifyAddPatient()
////	{
////		System.out.println("Verify that Patient should recieve SMS on appointment successful");
////		loginpage.doLogin(uname, passwd);
////		GlobalUtil.wait(2);
////		homepage.openPatientListPage();
////		PatientModals patientmodal=PatientModals.getDefaultPatientDetails();
//////		patientmodal.setSalutation(SALUTATION.Mr);
//////		patientmodal.setGender(GENDER.Male);
////		//patientmodal.setLocality(LOCALITY.DomlurBusStand);
////		//patientmodal.setBrand(BRAND.Portea);
////		addPatient(PatientModals.getDefaultPatientDetails());
////		getAddedPatient(PatientModals.getDefaultPatientDetails());
////		//System.out.println(patientpage.getAddedPatient(PatientModal.getDefaultPatientDetails()));
////		GlobalUtil.wait(2);
////		//addKYC("Physiotherapy");
////		WebElement overviewTab=driver.findElement(By.xpath("//a[contains(@href,'/patient/details') and contains(.,'Overview')]"));
////		overviewTab.click();
////		appointmentpage.addAppointmentWithAlreadyKYC("Physiotherapy");
////		GlobalUtil.wait(2);
////		appointmentpage.changeStatusPendingToConfirm();
////		//get matched record from SMS queue
////		chkSmsQueue.fetchSmsQueue();
////		
////	}
		   

	 
