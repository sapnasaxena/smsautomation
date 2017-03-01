package com.qa.tests.ui.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.tests.common.GlobalConstants.LOCALITY;
import com.qa.tests.common.GlobalConstants.SERVICE;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.common.RandomUtil;
import com.qa.tests.ui.common.AppointmentModal;
import com.qa.tests.ui.common.BasePage;
import com.qa.tests.ui.common.CalendarModal;
import com.qa.tests.ui.common.PatientModal;
import com.qa.tests.ui.common.ServiceModal;

public class PatientsPage extends BasePage{


	public PatientsPage(WebDriver driver) {
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

//	public String contactEmailLocator ="//input[contains(@name,'contactEmailId')]";
//	public String getContactEmailLocator()
//	{
//		return contactEmailLocator;
//	}

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

	//*** XPATHs for Add Services ***

	public String serviceLinkLocator = "//a[contains(text(),'Service')]";
	public String getServiceLinkLocator()
	{
		return serviceLinkLocator;
	}

	public String subscribeServiceLocator = "//a[contains(@href,'services')]";
	public String getSubscribeServiceLocator()
	{
		return subscribeServiceLocator;
	}

	public String selectServiceLocator = "//select[contains(@id,'serviceSelector')]";
	public String getSelectServiceLocator()
	{
		return selectServiceLocator;
	}


	public String selectButtonLocator = "//input[contains(@name,'select')]";
	public String getSelectButtonLocator()
	{
		return selectButtonLocator;
	}


	public String serviceconfirmButtonLocator ="//input[contains(@name,'confirm')]";
	public String getServiceConfirmButtonLocator()
	{
		return serviceconfirmButtonLocator;
	}


	public String firstVisitPriceLocator = "//input[contains(@name,'firstVisitPrice')]";
	public String getFirstVisitPriceLocator()
	{
		return firstVisitPriceLocator;
	}

	public String secondVisitPriceLocator = "//input[contains(@name,'subsequentVisitPrice')]";
	public String getSecondVisitPriceLocator()
	{
		return secondVisitPriceLocator;
	}

	public String setAppointmentButtonLocator = "//a[contains(@class,'blue-submit')]";
	public String getSetAppointmentButtonLocator()
	{
		return setAppointmentButtonLocator;
	}


	public String appointmentTypeFieldLocator = "//select[contains(@id,'appointmentType')]";
	public String getAppointmentTypeFieldLocator()
	{
		return appointmentTypeFieldLocator;
	}
	
	public String addedServiceNameLocator ="//table[contains(@class,'data-table')]/td";
	public String getAddedServiceNameLocator()
	{
		return addedServiceNameLocator;
	}

	public String noOfVisitsLocator ="//input[contains(@id,'frequency')]";
	public String getNoOfVisitsLocator()
	{
		return noOfVisitsLocator;
	}
	
	public String offeredPriceLocator ="//input[contains(@name,'offeredPrice')]";
	public String getOfferedPriceLocator()
	{
		return offeredPriceLocator;
	}
	
	public String maxPriceLocator ="//input[contains(@name,'total_mrp')]";
	public String getMaxPriceLocator()
	{
		return maxPriceLocator;
	}
	
	public String minPriceLocator ="//input[contains(@name,'min_price')]";
	public String getMinPriceLocator()
	{
		return minPriceLocator;
	}
	
	public String confirmButtonOnCustomSinglePlanScreenLocator ="//input[contains(@name,'confirm')]";
	public String getConfirmButtonOnCustomSinglePlanScreenLocator()
	{
		return confirmButtonOnCustomSinglePlanScreenLocator;
	}
	
	//*** XPATHS for add packages ***

	public String packageLinkLocator = "//a[contains(text(),'Package')]";
	public String getpackageLinkLocator()
	{
		return packageLinkLocator;
	}


	public String selectLocator = "//a[contains(text(),'Select')]";
	public String getSelectLocator()
	{
		return selectLocator;
	}


	public String offerDiscountFieldLocator = "//input[contains(@name,'offeredDiscount')]";
	public String getOfferDiscountFieldLocator()
	{
		return offerDiscountFieldLocator;
	}

	public String confirmButtonLocator = "//input[contains(@name,'confirm')]";
	public String getConfirmButtonLocator()
	{
		return confirmButtonLocator;
	}

	public String setAppointmentFromPackageLocator = "//a[contains(text(),'Set Appointment')]";
	
	public String subscribePackageLink = "//a[text()=' Subscribe Package']";
	public String getSubscribePackageLink()
	{
		return subscribePackageLink;
	}
	
	
	public String customPackageLink = "//a[text()=' Custom Package']";
	public String getCustomPackageLink()
	{
		return customPackageLink;
	}
	
	public String selectCustomPackageLinkLocator = "//td[text()='Custom Package']/..//a[text()='Select']";
	public String getSelectCustomPackageLinkLocator()
	{
		return selectCustomPackageLinkLocator;
	}
	
	public String carePlanNameFieldLocator = "//input[contains(@name,'packageName')]";
	public String getCarePlanNameFieldLocator()
	{
		return carePlanNameFieldLocator;
	}
	
	public String carePlanDescFieldLocator = "//input[contains(@name,'packageDescription')]";
	public String getCarePlanDescFieldLocator()
	{
		return carePlanDescFieldLocator;
	}
	
	public String carePlanSelectServiceFieldLocator = "//select[contains(@class,'select-element')]";
	public String getCarePlanSelectServiceFieldLocator()
	{
		return carePlanSelectServiceFieldLocator;
	}
	
	public String carePlanNoOfVisitFieldLocator = "//input[contains(@id,'frequency')]";
	public String getCarePlanNoOfVisitFieldLocator()
	{
		return carePlanNoOfVisitFieldLocator;
	}
	
	public String carePlanAddMoreButtonLocator = "//button[contains(text(),'Add More')]";
	public String getCarePlanAddMoreButtonLocator()
	{
		return carePlanAddMoreButtonLocator;
	}
	
	
	
	//**** XPATHS for ADD APPOINTMENTS ****

	public String addAppointmentButtonLocator = "//tr[1]/td[9]";
	public String getaaddAppointmentButtonLocator()
	{
		return addAppointmentButtonLocator;
	}


	public String selectpackageLocator = "//select[contains(@id,'packageSelector')]";
	public String getselectpackageLocator()
	{
		return selectpackageLocator;
	}


	public String selectClinicianPreferencesLocator = "//select[contains(@id,'selectPrefrence')]";
	public String getSelectClinicianPreferencesLocator()
	{
		return selectClinicianPreferencesLocator;
	}

	public String selectProfessionalLocator = "//select[contains(@id,'profSelector')]";
	public String getSelectProfessionalLocator()
	{
		return selectProfessionalLocator;
	}

	public String viewCalendarLocator = "//button[contains(@id,'view_calendar')]";
	public String getViewCalendarLocator()
	{
		return viewCalendarLocator;
	}

	////div/input[contains(@id,'calender-time-picker')]

	public String setTimeLocator = "//input[contains(@id,'calender-time-picker')]";
	public String getSetTimeLocator()
	{
		return setTimeLocator;
	}
	public String selectDayLocator ="//div[contains(@class,'day-content')]";
	public String getSelectDayLocator()
	{
		return selectDayLocator;
	}
	
	public String selectTimeTextBoxLocator ="//input[contains(@id,'calender-time-picker')]";
	public String getSelectTimeTextBoxLocator()
	{
		return selectTimeTextBoxLocator;
	}
	public String selectTimeFromListLocator ="//div[contains(@class,'ui-timepicker-wrapper')]//ul";
	public String getSelectTimeFromListLocator()
	{
		return selectTimeFromListLocator;
	}

	public String timeDurationLocator = "//input[contains(@id,'calender-time-duration')]";
	public String getTimeDurationLocator()
	{
		return timeDurationLocator;
	}

	public String dateSelectLocator ="//div[contains(@class,'day-contents')]";
	public String getDateSelectLocator()
	{
		return dateSelectLocator;
	}


	public String saveCalendarLocator = "//button[contains(text(),'Save')]";
	public String getSaveCalendarLocator()
	{
		return saveCalendarLocator;
	}

	public String saveAppointmentTimingDetailsLocator = "//span[contains(text(),'Save')]";
	public String getSaveAppointmentTimingDetailsLocator()
	{
		return saveAppointmentTimingDetailsLocator;
	}

	public String saveAppointmentButtonLocator = "//span[contains(@class,'ui-button-text') and text()='Save']";
	public String getSaveAppointmentButtonLocator()
	{
		return saveAppointmentButtonLocator;
	}


	//*** XPath for Free Service/Assessment***//

	public String addAppointmentButtonOnPatientListLocator = "//a[contains(@href,'/appointment/add')]";
	public String getAddAppointmentButtonOnPatientListLocator()
	{
		return addAppointmentButtonOnPatientListLocator;
	}

	public String freeAssessmentLocator = "//input[contains(@id,'freeSelector')]";
	public String getFreeAssessmentLocator()
	{
		return freeAssessmentLocator;
	}

	public String freeServiceSelectorLocator = "//select[contains(@id,'serviceSelector')]";
	public String getFreeServiceSelectorLocator()
	{
		return freeServiceSelectorLocator;
	}

	public String freeServiceSelectClinician = "//select[contains(@id,'selectPrefrence')]";
	public String getFreeServiceSelectClinician()
	{
		return freeServiceSelectClinician;
	}


	//*** Functions to Add Patients ***
	
	public void addTempPatient(PatientModal patientModal)
	{
		driver.findElement(By.xpath(addPatientButtonLocator)).click();
		GlobalUtil.wait(10);
		
		System.out.println("Select Salutation");
		Select salutation = new Select(driver.findElement(By.xpath(salutationlocator)));
	      salutation.selectByVisibleText(patientModal.getSalutation().toString());
		GlobalUtil.wait(10);
		driver.findElement(By.xpath(patientFnameLocator)).sendKeys(patientModal.getFirstName());
         GlobalUtil.wait(10);
		driver.findElement(By.xpath(loginEmailIdLocator)).sendKeys(patientModal.getLoginEmail());
          GlobalUtil.wait(5);
		driver.findElement(By.xpath(mobileNumberLocator)).sendKeys(patientModal.getMobileNumber());
		Select gender = new Select(driver.findElement(By.xpath(genderLocator)));
		gender.selectByVisibleText(patientModal.getGender().toString());
		GlobalUtil.wait(10);
//		WebElement hiddenInput = driver.findElement(By.xpath("locationLocator"));
//		String value = hiddenInput.getAttribute("Domlur Bus Stand");
		driver.findElement(By.xpath(locationLocator)).sendKeys("Domlur Bus Stand");	
		driver.findElement(By.xpath(locationCoordinatesLocators)).click();
		Select selectbrand = new Select(driver.findElement(By.xpath(selectBrandLocator)));
	     selectbrand.selectByVisibleText(patientModal.getBrand().toString());
        GlobalUtil.wait(5);
		System.out.println("DEBUG: Click on Save button");
		driver.findElement(By.xpath(savebuttonLocator)).click();;
		GlobalUtil.wait(10);
	}

	public void addPatient(PatientModal patientModal)
	{
		System.out.println("DEBUG: Click on Add Patient button");
		driver.findElement(By.xpath(addPatientButtonLocator)).click();
		GlobalUtil.wait(10);
		System.out.println("Select Salutation");
		Select salutation = new Select(driver.findElement(By.xpath(salutationlocator)));
		switch(patientModal.getSalutation()){
		case Mr:
			salutation.selectByVisibleText(patientModal.getSalutation().toString());
			break;
		case Mrs:
			salutation.selectByVisibleText(patientModal.getSalutation().toString());
			break;
		case Dr:
			salutation.selectByVisibleText(patientModal.getSalutation().toString());
			break;
		case Ms:
			salutation.selectByVisibleText(patientModal.getSalutation().toString());
			break;
	}
	
		GlobalUtil.wait(10);

		System.out.println("DEBUG: Enter Patient name");
		driver.findElement(By.xpath(patientFnameLocator)).sendKeys(patientModal.getFirstName());

       GlobalUtil.wait(10);

		System.out.println("DEBUG: Enter Login email");
		driver.findElement(By.xpath(loginEmailIdLocator)).sendKeys(patientModal.getLoginEmail());
       GlobalUtil.wait(5);

		System.out.println("DEBUG: Enter Mobile number");
		driver.findElement(By.xpath(mobileNumberLocator)).sendKeys(patientModal.getMobileNumber());
		
		Select gender = new Select(driver.findElement(By.xpath(genderLocator)));
		
		switch(patientModal.getGender()){
		case Male:
			gender.selectByVisibleText(patientModal.getGender().toString());
			break;
		case Female:
			gender.selectByVisibleText(patientModal.getGender().toString());
			break;
		default:
			break;
		
	}

		GlobalUtil.wait(10);
		Select area = new Select(driver.findElement(By.xpath("//select[contains(@id,'area')]")));
		GlobalUtil.wait(2);
		area.selectByVisibleText("Bangalore");
		GlobalUtil.wait(2);
		System.out.println("DEBUG: Select Locality");
		WebElement location = driver.findElement(By.xpath("//input[contains(@id,'location')]"));
		//location.sendKeys();
		location.sendKeys("Domlur, Bengaluru, Karnataka, India");
		WebElement city = driver.findElement(By.xpath("//input[contains(@id,'locality_city')]"));
		city.sendKeys("Bengaluru");
		
		WebElement pincode = driver.findElement(By.xpath("//input[contains(@id,'pinCode')]"));
		pincode.sendKeys("560071");
		//selectLocality.selectByVisibleText(patientModal.getLocality().toString());
//		switch (patientModal.getlocation())
//		{
//		case Hulimavu:
//			driver.findElement(By.xpath(locationLocator)).sendKeys("Hulimavu");
//			break;
//		case Bilekahalli:
//			driver.findElement(By.xpath(locationLocator)).sendKeys("Bilekahalli");
//			break;
//		case BannerghattaRoad:
//			driver.findElement(By.xpath(locationLocator)).sendKeys("Bannerghatta Road");
//			break;
//		case JalahalliEast:
//			driver.findElement(By.xpath(locationLocator)).sendKeys("Jalahalli East");
//			break;
//		case JPNagar:
//			driver.findElement(By.xpath(locationLocator)).sendKeys("JP Nagar");
//			break;
//		case DomlurBusStand:
//			driver.findElement(By.xpath(locationLocator)).sendKeys("Domlur Bus Stand");
//			break;
//			
//		default:
//			break;
//			
//		}
//		WebElement hiddenInput = driver.findElement(By.xpath(locationCoordinatesLocators));
//         String value = hiddenInput.getAttribute("Domlur Bus Stand");
		//driver.findElement(By.xpath(locationCoordinatesLocators)).click();
//		Select coordinates = new Select(driver.findElement(By.xpath(locationCoordinatesLocators)));
//		coordinates.selectByVisibleText("Domlur Bus Stand");
//		GlobalUtil.wait(10);
		System.out.println("DEBUG: Select Brand");
		Select selectbrand = new Select(driver.findElement(By.xpath(selectBrandLocator)));
		switch(patientModal.getBrand()){
		case Portea:
			selectbrand.selectByVisibleText(patientModal.getBrand().toString());
			break;
		case Max:
			selectbrand.selectByVisibleText(patientModal.getBrand().toString());
			break;
		case Manipal:
			selectbrand.selectByVisibleText(patientModal.getBrand().toString());
			break;
		
	}
        GlobalUtil.wait(5);
		System.out.println("DEBUG: Click on Save button");
		driver.findElement(By.xpath(savebuttonLocator)).click();;
		GlobalUtil.wait(10);
	}

	//*** Functions to Add Packages ***
	public void addPackage(String offerDiscount)
	{
		System.out.println("DEBUG: Click on Package link");
		driver.findElement(By.xpath(packageLinkLocator)).click();

		System.out.println("DEBUG: Select Package");
		driver.findElement(By.xpath(selectLocator)).click();

		System.out.println("DEBUG: Enter Offered Discount");
		driver.findElement(By.xpath(offerDiscountFieldLocator)).sendKeys(offerDiscount);

		System.out.println("DEBUG: click on Confirm button");
		driver.findElement(By.xpath(confirmButtonLocator));

		System.out.println("Set Appointment");
		driver.findElement(By.xpath(setAppointmentFromPackageLocator)).click();
	}

	//Subscribe Custom Package
	public void subscribeCustomPackage()
	{
		
	}
	
	//Add Patient
	public void getAddedPatient(PatientModal patientModal)
	{
		driver.findElement(By.xpath(patientNameLinkLocator.replace(GlobalUtil.PLACEHOLDER, patientModal.getFirstName()))).click();
	}
	//*** Functions to Add Services ***
	
	public void addService(ServiceModal serviceModal)
	{

		System.out.println("DEBUG: Click on Service Link");
		driver.findElement(By.xpath(subscribeServiceLocator)).click();
		Select service = new Select(driver.findElement(By.xpath(selectServiceLocator)));
		switch(serviceModal.getServiceName())
		{
		case Nursing:
			service.selectByVisibleText("Nursing");
			break;
		case NursingAttendant:
			service.selectByVisibleText("Nursing Attendant");
			break;
		case DoctorVisit:
			service.selectByVisibleText("Doctor Visit");
			break;
		case Physiotherapy:
			service.selectByVisibleText("Physiotheraphy");
			break;
		default:
			break;
		}
	
		Select appointmentType = new Select(driver.findElement(By.xpath(appointmentTypeFieldLocator)));
		switch(serviceModal.getAppointmentType())
		{
		case Recurring:
			appointmentType.selectByVisibleText("Recurring");
			break;
		case Fixed:
			appointmentType.selectByVisibleText("Fixed");
			break;
		default:
				break;
		}
		
		driver.findElement(By.xpath(selectButtonLocator)).click();
		System.out.println("Enter First visit Price");
		driver.findElement(By.xpath(firstVisitPriceLocator)).sendKeys(serviceModal.getFirstVisitPrice());

		System.out.println("Enter Second Visit Price");
		driver.findElement(By.xpath(secondVisitPriceLocator)).sendKeys(serviceModal.getSecondVisitPrice());;

		System.out.println("Click on Confirm button");
		driver.findElement(By.xpath(confirmButtonLocator)).click();
		
		System.out.println("Click on Set Appointment button");
		driver.findElement(By.xpath(setAppointmentButtonLocator)).click();
		
	}
	
	public void editProfile()
	{
		driver.findElement(By.xpath(editPatientLinkLocator));
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(ageTextFieldLocator)).sendKeys("30");
		Select  gender = new Select(driver.findElement(By.xpath(genderLocator)));
		gender.selectByVisibleText("Female");
		driver.findElement(By.xpath(savebuttonLocator));
		
		
		
	}

	public void fixedApptType(ServiceModal serviceModal)
	{
		driver.findElement(By.xpath(subscribeServiceLocator)).click();
		Select service = new Select(driver.findElement(By.xpath(selectServiceLocator)));
		switch(serviceModal.getServiceName())
		{
		case Nursing:
			service.selectByVisibleText("Nursing");
			break;
		case NursingAttendant:
			service.selectByVisibleText("Nursing Attendant");
			break;
		case DoctorVisit:
			service.selectByVisibleText("Doctor Visit");
			break;
		case Physiotherapy:
			service.selectByVisibleText("Physiotheraphy");
			break;
		default:
			break;
		}
	
		Select selectApptType = new Select(driver.findElement(By.xpath(appointmentTypeFieldLocator)));
		selectApptType.selectByVisibleText("Fixed");
		driver.findElement(By.xpath(selectButtonLocator)).click();
		driver.findElement(By.xpath(noOfVisitsLocator)).sendKeys(serviceModal.getNoOfVisits());
		GlobalUtil.wait(5);
	
		if(Integer.parseInt(serviceModal.getOfferedPrice().toString()) >= Integer.parseInt(serviceModal.getMinprice().toString()))
		{
			driver.findElement(By.xpath(offeredPriceLocator)).click();
			driver.findElement(By.xpath(offeredPriceLocator)).sendKeys(serviceModal.getOfferedPrice());
		}
		else
		{
		System.out.println("Offered Price is less than min price");
		}
		driver.findElement(By.xpath(confirmButtonOnCustomSinglePlanScreenLocator)).click();
		
	}
	
		
		
	//*** Functions to Add Appointments ***
	public void addAppointment(AppointmentModal appointmentModal)
	{
//		System.out.println("Click on Set Appointment button");
//		driver.findElement(By.xpath(setAppointmentButtonLocator)).click();

		Select selectpackage = new Select(driver.findElement(By.xpath(selectpackageLocator)));
		selectpackage.selectByVisibleText(appointmentModal.getSelectPackage());
		GlobalUtil.wait(5);

		System.out.println("Select Clinician Preferences");
		Select selectClinician = new Select(driver.findElement(By.xpath(selectClinicianPreferencesLocator)));
		selectClinician.selectByVisibleText(appointmentModal.getClinicianPref());
		GlobalUtil.wait(5);
		CalendarModal calendarModal = new CalendarModal();
		calendarModal.setSelectTimeList(calendarModal.getSelectTimeList());

	}

	public void viewCalendar(CalendarModal calendarModal)
	{
        GlobalUtil.wait(5);
		driver.findElement(By.xpath(viewCalendarLocator)).click();
		
		GlobalUtil.wait(5);
		
		//driver.findElement(By.xpath(setTimeLocator)).sendKeys(appointmentModal.getTimings());
		driver.findElement(By.xpath(selectTimeTextBoxLocator)).click();
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(selectTimeFromListLocator)).sendKeys(calendarModal.getSelectTimeList());
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(timeDurationLocator)).sendKeys(calendarModal.getDuration());
//		Select day = new Select(driver.findElement(By.xpath(selectDayLocator)));
//		day.selectByVisibleText(appointmentModal.getDayContent());
		
		driver.findElement(By.xpath(selectDayLocator)).sendKeys(calendarModal.getSelectDay());
		
		driver.findElement(By.xpath(saveAppointmentTimingDetailsLocator)).click();

		System.out.println("Click on Save Appointment button");
		driver.findElement(By.xpath(saveAppointmentButtonLocator)).click();
		ServiceModal serviceModal = new ServiceModal();
		if(serviceModal.getServiceName()==SERVICE.DoctorVisit)
        {
			driver.switchTo().alert().accept();
        }
		
		
		
	}



	
	public void assignProfessional()
	{
	//click on PAtient name
	//click on assign professional link 
	}
	
	public void getappointmentScreen()
	{
		
		driver.findElement(By.xpath(setAppointmentButtonLocator)).click();
		
	}
	
	public String pendingStatus ="//a[text()='Pending']";
	public String getPendingStatus()
	{
		return pendingStatus;
	}
	
	public String changeStatusWindowLocator ="//div[contains(@id,'dialog-form-status')]";
	public String getChangeStatusWindowLocator()
	{
		return changeStatusWindowLocator;
	}
	
	public String statusDropDown = "//select[contains(@id,'status')]";
	public String getStatusDropDownLocator()
	{
		return statusDropDown;
	}

	public String notesFieldLocator = "//textarea[contains(@id,'status-notes')]";
	public String getNotesFieldLocator()
	{
		return notesFieldLocator;
	}
	
	public String changeStatusButtonLocator = "//button/span[text()='Change Status']";
	
	public void changeStatusFromPendingToSuccessful()
	{
		driver.findElement(By.xpath(pendingStatus)).click();
		GlobalUtil.wait(2);
		driver.switchTo().window(changeStatusWindowLocator);
		GlobalUtil.wait(3);
		Select status = new Select(driver.findElement(By.xpath(statusDropDown)));
		status.selectByVisibleText("Successful");	
		GlobalUtil.wait(2);
		driver.findElement(By.xpath(notesFieldLocator)).sendKeys("test");
		driver.findElement(By.xpath(changeStatusButtonLocator)).click();
		
	}
	
	public void changeStatusFromPendingToConfirmed()
	{
		driver.findElement(By.xpath(pendingStatus)).click();
		GlobalUtil.wait(2);
		
	}
	
	public void selectLocality()
	{
		String selectedValue ="Koramangala VI BK";
		System.out.println("DEBUG: Select Locality");
		Select dropdownLocality = new Select(driver.findElement(By.xpath(localiltyLocator)));
		String val = dropdownLocality.getFirstSelectedOption().getText();
		if(val.equals(selectedValue))
		{
			List<WebElement> Options = dropdownLocality.getOptions();
			for(WebElement option:Options){
				if(option.getText().equals(selectedValue)){
					option.click();  
				}
			}

		}

	}

	public PatientModal getPatientDetails(){
		PatientModal patientModal = new PatientModal();
		patientModal.setSalutation(patientModal.getSalutation());
		patientModal.setFirstName(GlobalUtil.getRandomName(8));
		patientModal.setLastName(GlobalUtil.getRandomName(8));
		patientModal.setMobileNumber(RandomUtil.generateRandomMobileNo());
		patientModal.setLoginEmail(GlobalUtil.getRandomName(4) + "@portea.qa");
		patientModal.setPinCode("560014");
		patientModal.setGender(patientModal.getGender());
		patientModal.setBrand(patientModal.getBrand());
		patientModal.setLocation(patientModal.getlocation());
		return patientModal;
	}
}
