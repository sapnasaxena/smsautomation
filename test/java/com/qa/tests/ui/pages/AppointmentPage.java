package com.qa.tests.ui.pages;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.tests.common.GlobalConstants.LOCALITY;
import com.qa.tests.common.GlobalUtil;
import com.qa.tests.common.RandomUtil;
import com.qa.tests.common.GlobalConstants.APPOINTMENTTYPE;
import com.qa.tests.common.GlobalConstants.AREA;
import com.qa.tests.common.GlobalConstants.BRAND;
import com.qa.tests.common.GlobalConstants.GENDER;
import com.qa.tests.common.GlobalConstants.SALUTATION;
import com.qa.tests.common.GlobalConstants.SERVICE;
import com.qa.tests.ui.common.AppointmentModal;
import com.qa.tests.ui.common.BasePage;
import com.qa.tests.ui.common.CalendarModal;
import com.qa.tests.ui.common.FindClinicianModal;
import com.qa.tests.ui.common.PatientModal;
import com.qa.tests.ui.common.ProfessionalModal;
import com.qa.tests.ui.common.ServiceModal;

public class AppointmentPage extends BasePage {


	
	int nameIndex = 1;
	int statusIndex = 9;
	int multiplicationFactor = 9;
	int profNameIndex = 21;
	int assignTabProfSelectStatusIndex = 9;
	

	public AppointmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//*** Xpath for Add Service***
	
	public String subscribeServiceLinkLocator = "//a[contains(text(),'Subscribe Service')]";
	public String getSubscribeSreviceLinkLocator()
	{
		return subscribeServiceLinkLocator;
	}
	public String serviceSelectFieldLocator = "//select[contains(@id,'serviceSelector')]";
	public String getServiceSelectFieldLocator()
	{
		return serviceSelectFieldLocator;
	}
	public String subserviceFieldLocator = "//select[contains(@id,'subservices')]";
	public String getSubserviceFieldLocator()
	{
		return subserviceFieldLocator;
	}
	public String smeVisitTabLocator = "//a[contains(text(),'SME Visit')]";
	public String getSMEVisitTabLocator()
	{
		return smeVisitTabLocator;
	}
	
	public String preferencesFieldLocator = "//select[contains(@id,'special_pref')]";
	public String getPreferencesFieldLocator()
	{
		return preferencesFieldLocator;
	}
	
	public String instructionFieldLocator = "//textarea[contains(@name,'specialInst')]";
	public String getInstructionFieldLocator()
	{
		return instructionFieldLocator;
	}
	
	public String changeStatusWindow = "//div[contains(@class,'ui-dialog') and contains(.,'Change Status')]";
			//"//div[contains(@class,'ui-dialog-title') and contains(.,'Change Status')]";
	public String getChangeStatusWindowLocator()
	{
		return instructionFieldLocator;
	}
	
	public String selectButton = "//input[contains(@name,'select')]";
	public String getSelectButton()
	{
		return selectButton;
	}
	
	//***Xpaths for Confirm Services Info Screen***
	public String firstVisitPriceTextField = "//input[contains(@name,'firstVisitPrice')]";
	public String getFirstVisitPriceTextField()
	{
		return firstVisitPriceTextField;
	} 
	
	public String secondVisitPriceTextField = "//input[contains(@name,'subsequentVisitPrice')]";
	public String getSecondVisitPriceTextField()
	{
		return secondVisitPriceTextField;
	} 
	
	public String confirmButtonLocator ="//input[contains(@name,'confirm')]";
	public String getConfirmButtonLocator()
	{
		return confirmButtonLocator;
	}
	
	public String setAppointmentButtonLocator ="//a[contains(text(),'Set Appointment')]";
	public String getSetAppointmentButtonLocator()
	{
		return setAppointmentButtonLocator;
	}
	
	//**Xpaths for Calendar Screen**
	public String viewCalendarButtonLocator = "//button[contains(@id,'view_calendar')]";
	public String getViewCalendarButtonLocator()
	{
		return viewCalendarButtonLocator;
	}
	
	public String calendarFormWindow ="//div[contains(@id,'calendar-form-window')]";
	public String getCalendatFormWindow()
	{
		return calendarFormWindow;
	}
	
	public String timePickerLocator ="//input[contains(@placeholder,'Select Time')]";
	
	public String timeDurationFieldLocator ="//input[contains(@placeholder,'Enter Duration in minutes')]";
	
	public String selectDayFromCalendarLocator ="//td/div[contains(@class,'day-contents')]";
	public String getselectDayFromCalendarLocator()
	{
		return selectDayFromCalendarLocator;
	}
	
	public String saveCalendarDetailsLocator = "//button[contains(text(),'Save')]";
	public String getSaveCalendarDetailsLocator()
	{
		return saveCalendarDetailsLocator;
	}
	
	
	public String saveAppointmentButtonLocator = "//span[contains(text(),'Save')]";
	public String getSaveAppointmentButtonLocator()
	{
		return saveAppointmentButtonLocator;
	}
	
	
	public String cancelAppointmentButtonLocator = "//span[contains(text(),'Cancel')]";
	public String getCancelAppointmentButtonLocator()
	{
		return cancelAppointmentButtonLocator;
	}
	
	
	public String submitAppointmentButtonLocator = "//button[text()='Save Appointment']";
	public String getSubmitAppointmentButtonLocator()
	{
		return submitAppointmentButtonLocator;
	}
	
	//**
	public String assignProfTableLocator = "//table[contains(@id,'tableSelect')]//tbody//tr//td";
	public String getAssignProfTableLocator()
	{
		return assignProfTableLocator;
	}
	
	public String appointmentMainScreen = "//div[contains(h3,'Appointments')]";
	public String getAppointmentMainScreen()
	{
		return appointmentMainScreen;
	}


	public String allTab = "//a[@href='/appointment/all']";
	public String getAllTab()
	{
		return allTab;
	}


	public String upcomingTab =  "//a[contains(text(),'Upcoming')]";
	public String getUpcomingTab()
	{
		return upcomingTab;
	}


	public String firstvisitTab =  "//a[contains(text(),'First Visit']";
	public String getFirstVisitTab()
	{
		return firstvisitTab;
	}


	public String findavailableClinicianTab = "//a[contains(text(),'Find Available Clinician')]";
	public String getFindAvailableClinicianTab()
	{
		return findavailableClinicianTab;
	}


	public String myTeamsappointmentTab = "//a[contains(text(),'My Team's Appointment')]";
	public String getMyTeamsAppointmentTab()
	{
		return myTeamsappointmentTab;
	}


	public String newTab = "//a[contains(text(),'New')]";
	public String getNewTab()
	{
		return newTab;
	}


	public String dateFilter = "//div[contains(@class,'date-filter')]";
	public String getDateFilter()
	{
		return dateFilter;
	}



	public String professionalFilter = "//select[contains(@id,'profession-filter')]";
	public String getProfessionalFilter()
	{
		return professionalFilter;
	}


	public String referrerFilter = "//select[contains(@id,'filter-by-referrer-name')]";
	public String getReferrerFilter()
	{
		return referrerFilter;
	}


	public String filterDropDown = "//select[contains(@id,'filter')]";
	public String getfilterDropDown()
	{
		return filterDropDown;
	}


	public String searchTextBox = "//input[contains(@id,'search')]";
	public String getSearchTextBox()
	{
		return searchTextBox;
	}


	//	public String searchButtonLocator = "//button[contains(@type,'submit')]" ;
	//	public String getSearchButtonLocator()
	//	{
	//		return searchButtonLocator;
	//	}
	//	

	public String statusFilterLocator = "//select[contains(@id,'status-filter')]";
	public String getStatusFilterLocator()
	{
		return statusFilterLocator;
	}


	public String serviceIdFilterLocator = "//select[contains(@id,'service_id')]";
	public String getServiceIdFilterLocator()
	{
		return serviceIdFilterLocator;
	}


	public String areaFilterLocator = "//select[contains(@id,'service_id')]";
	public String getAreaFilterLocator()
	{
		return areaFilterLocator;
	}

	public String genderFilterLocator = "//select[contains(@id,'gender_pref')]";
	public String getGenderFilterLocator()
	{
		return genderFilterLocator;
	}


	//	public String appointmentDateFieldLocator = "//input[contains(@id,'datetime')]";
	//	public String getAppointmentDateFieldLocator()
	//	{
	//		return appoi;
	//	}


	public String durationsFieldLocator = "//input[contains(@id,'duration')]";
	public String getDurationsFieldLocator()
	{
		return durationsFieldLocator;
	}


	//	public String locationField = "//input[contains(@id,'location')]";
	//	public String getLocationFieldLocator()
	//	{
	//		return searchTextBox;
	//	}


	public String selectlocationButtonusing = "//input[contains(@id,'location')]" ;


	public String findcliniciansearchButton = "//button[contains(@id,'search')]";

	public String mapimg = "//label[contains(@id,'map_canvas')]";

	public String patientnameLocator = "//tr[1]/td[2]";
	public String getPatientNameLocator()
	{
		return patientnameLocator;
	}



	public String appointmentIDLocator = "//tr[1]/td[1]";
	public String getAppointmentIDLocator()
	{
		return appointmentIDLocator;
	}


	public String nursingProfessional ="//td[contains(.,'Nursing')]";
	public String getNursingProfessional()
	{
		return nursingProfessional;
	}

	public String doctorProfessional ="//td[contains(.,'Doctor')]";
	public String getDoctorProfessional()
	{
		return doctorProfessional;
	}


	public String physiotherapistProfessional ="//td[contains(.,'Physiotherapy')]";
	public String getPhysiotherapistProfessional()
	{
		return physiotherapistProfessional;
	}

	public String staffProfessional ="//td[contains(.,'Staff')]";
	public String getStaffProfessional()
	{
		return staffProfessional;
	}

	public String nursingAttendantProfessional ="//td[contains(.,'Nursing Attendant')]";
	public String getNursingAttendant()
	{
		return nursingAttendantProfessional;
	}



	public String statusPendingFilter = "//td[contains(.,'Pending')]";
	public String getStatusPendingFilter()
	{
		return statusPendingFilter;
	}

	public String statusNewFilter = "//td[contains(.,'New')]";
	public String getStatusPendingNewFilter()
	{
		return statusNewFilter;
	}

	public String statusCancelledFilter = "//td[contains(.,'Cancelled')]";
	public String getStatusCancelledFilter()
	{
		return statusCancelledFilter;
	}

	public String statusClinicianCancelledFilter = "//td[contains(.,'Clinician Cancelled')]";
	public String getStatusClinicianCancelledFilter()
	{
		return statusClinicianCancelledFilter;
	}

	public String statusSuccessfulFilter = "//td[contains(.,'Successful')]";
	public String getStatusSuccessfulFilter()
	{
		return statusSuccessfulFilter;
	}

	public String statusConfirmedFilter = "//td[contains(.,'Confirmed')]";
	public String getStatusConfirmedFilter()
	{
		return statusConfirmedFilter;
	}

	//**** Find Available Clinician Tab Xpaths *****
	public String serviceFieldLocator = "//select[contains(@id,'service_id')]";
	public String getServiceFieldLocator()
	{
		return serviceFieldLocator;
	}

	public String genderFieldLocator = "//select[contains(@id,'gender_pref')]";
	public String getGenderFieldLocator()
	{
		return genderFieldLocator;
	}

	public String appointmentDateFieldLocator = "//input[contains(@id,'datetime')]";
	public String getAppointmentDateFieldLocator()
	{
		return appointmentDateFieldLocator;
	}

	public String durationFieldLocator = "//input[contains(@id,'duration')]";
	public String getDurationFieldLocator()
	{
		return durationFieldLocator;
	}

	public String pinCodeFieldLocator = "//input[contains(@id,'pincode')]";
	public String getPinCodeFieldLocator()
	{
		return pinCodeFieldLocator;
	}

	public String localityFieldLocator = "//select[contains(@id,'locality')]";
	public String getLocalityFieldLocator()
	{
		return localityFieldLocator;
	}

	public String areaFieldLocator = "//select[contains(@id,'area')]";
	public String getAreaFieldLocator()
	{
		return areaFieldLocator;
	}

	public String locationFieldLocator = "//input[contains(@id,'location')]";
	public String getLocationFieldLocator()
	{
		return locationFieldLocator;
	}

	public String searchButtonLocator = "//button[contains(@id,'search')]";
	public String getSearchButtonLocator()
	{
		return searchButtonLocator;
	}

	public String findClinicianTableLocator = "//table[contains(@id,'tableSelect')]";
	public String getFindClinicianTableLocator()
	{
		return  findClinicianTableLocator;
	}

	public String findClinicianTableRowsLocator = "//tr";
	public String getFindClinicianTableRowsLocator()
	{
		return  findClinicianTableRowsLocator;
	}

	public String findClinicianTableColumnsLocator = "//td";
	public String getFindClinicianTableColumnsLocator()
	{
		return  findClinicianTableColumnsLocator;
	}

    public String tableBaseLocator = "//table[contains(@class, 'data-table')]//tbody//td";
    public String getTableBaseLocator()
    {
    	return tableBaseLocator;
    }
    
	//Assign Professional xpaths
	public String changeLinkLocator = "//a[text()='( Change )']";
	public String getchangeLinkLocator()
	{
		return  changeLinkLocator;
	}

	public String assignProfessionalScreenLocator = "//table[contains(@id,'tableSelect')]";
	public String getAssignProfessionalScreenLocator()
	{
		return assignProfessionalScreenLocator;
	}

	public String assignProfessionalNameColumnLocator = "//table[contains(@id,'tableSelect')]/tbody/tr[1]/td[1]/a";
	public String getAssignProfessionalNameColumnLocator()
	{
		return assignProfessionalNameColumnLocator;
	}

	public String assignProfessionalStatusColumnLocator = "//table[contains(@id,'tableSelect')]/tbody/tr[1]/td[9]/input";
	public String getAssignProfessionalStatusColumnLocator()
	{
		return assignProfessionalStatusColumnLocator;
	}

	public String assignProfessionalButtonLocator="//button[contains(@type,'button')]//span[text()='Assign Professional']";
	public String getAssignProfessionalButtonLocator()
	{
		return assignProfessionalButtonLocator;
	}

	public String cancelButtonLocator="//button/span[text()='Cancel']";
	public String getCancelButtonLocator()
	{
		return cancelButtonLocator;
	}


	//functions
	
	public void onClickAllTab()
	{
		driver.findElement(By.xpath(allTab)).click();
	}
	
	public void onClickUpcomingTabs()
	{
		driver.findElement(By.xpath(upcomingTab)).click();
	}
	
	public void onClickFirstVisitTab()
	{
		driver.findElement(By.xpath(firstvisitTab)).click();
	}
	
	public void onClickFindAvailableClinicianTab()
	{
		driver.findElement(By.xpath(findavailableClinicianTab)).click();
	}
	
	public void onClickMyAppointmentTabs()
	{
		driver.findElement(By.xpath(myTeamsappointmentTab)).click();
	}
	
	public void onClickSMEVisitTab()
	{
		driver.findElement(By.xpath(smeVisitTabLocator)).click();
	}
	
	public void searchPatientByName(String pname)
	{
		System.out.println("Enter Patient Name");
		driver.findElement(By.xpath(searchTextBox)).sendKeys(pname);
		GlobalUtil.wait(2);
		System.out.println("DEBUG: Click on Search Button");
		driver.findElement(By.xpath(searchButtonLocator)).click();
		GlobalUtil.wait(5);
	}


	public void searchPatientByID(String pid)
	{
		System.out.println("Enter Patient ID");
		driver.findElement(By.xpath(searchTextBox)).sendKeys(pid);
		GlobalUtil.wait(2);
		System.out.println("DEBUG: Click on Search Button");
		driver.findElement(By.xpath(searchButtonLocator)).click();
		GlobalUtil.wait(5);
	}

	public void openPatientProfile()
	{
		System.out.println("click on patient Name");
		driver.findElement(By.xpath(patientnameLocator)).click();
		System.out.println("DEBUG: Patient Profile screen is displaying now");

	}



	public void searchbyDoctorProfessionfilter()
	{
		System.out.println("Debug: Select Doctor from Professional filter");
		Select profession = new Select(driver.findElement(By.xpath(professionalFilter)));
		profession.selectByVisibleText("Doctor");
	}

	public void searchbyAllProfessionfilter()
	{
		System.out.println("Debug: Select All from Professional filter");
		Select profession = new Select(driver.findElement(By.xpath(professionalFilter)));
		profession.selectByVisibleText("All");
	}

	public void searchbyNurseProfessionfilter()
	{
		System.out.println("Debug: Select Nurse from Professional filter");
		Select profession = new Select(driver.findElement(By.xpath(professionalFilter)));
		profession.selectByVisibleText("Nurse");
	}

	public void searchbyPhsyioProfessionfilter()
	{
		System.out.println("Debug: Select Physiotherapist from Professional filter");
		Select profession = new Select(driver.findElement(By.xpath(professionalFilter)));
		profession.selectByVisibleText("Physiotherapist");
	}

	public void searchbyNursingAttendantProfessionfilter()
	{
		System.out.println("Debug: Select Nursing Attendant from Professional filter");
		Select profession = new Select(driver.findElement(By.xpath(professionalFilter)));
		profession.selectByVisibleText("Nursing Attendant");

	}

	public void searchbyStaffProfessionfilter()
	{
		System.out.println("Debug: Select Staff from Professional filter");
		Select profession = new Select(driver.findElement(By.xpath(professionalFilter)));
		profession.selectByVisibleText("Staff");

	}


	public void searchbyTodayDateFilter()
	{
		System.out.println("DEBUG: Select Today from date filter");
		Select date = new Select(driver.findElement(By.xpath(dateFilter)));
		date.selectByVisibleText("Today");
	}

	public void searchbyTomorrowDateFilter()
	{
		System.out.println("DEBUG: Select Tomorrow from date filter");
		Select date = new Select(driver.findElement(By.xpath(dateFilter)));
		date.selectByVisibleText("Tomorrow");
	}

	public void searchbyYesterdayDateFilter()
	{
		System.out.println("DEBUG: Select Yesterday from date filter");
		Select date = new Select(driver.findElement(By.xpath(dateFilter)));
		date.selectByVisibleText("Yesterday");
	}

	public void searchbyUpcomingDateFilter() 
	{
		System.out.println("DEBUG: Select upcoming from date filter");
		Select date = new Select(driver.findElement(By.xpath(dateFilter)));
		date.selectByVisibleText("Upcoming");
	}


	public void searchbyAfterDate()
	{
		System.out.println("DEBUG: Select After date from date filter");
		Select date = new Select(driver.findElement(By.xpath(dateFilter)));
		date.selectByVisibleText("After date");
	}

	public void searchbyReferrerName(String refname)
	{
		System.out.println("DEBUG: See all records of specific Referrer");
		Select referrername = new Select(driver.findElement(By.xpath(referrerFilter)));
		referrername.selectByVisibleText(refname);
	}

	public void searchbyProfessionalName(String profname)
	{
		System.out.println("DEBUG: See all records of specific Referrer");
		Select professionalname = new Select(driver.findElement(By.xpath(professionalFilter)));
		professionalname.selectByVisibleText(profname);
	}

	public void searchbyDate(String date)
	{
		System.out.println("DEBUG: Select date from date filter");
		Select selectdate = new Select(driver.findElement(By.xpath(dateFilter)));
		selectdate.selectByVisibleText(date);
	}

	public void getClinicianAvailableDetails(FindClinicianModal findClinicianModal)
	{

		driver.findElement(By.xpath(findavailableClinicianTab)).click();
		Select service = new Select(driver.findElement(By.xpath(serviceFieldLocator)));
		switch(findClinicianModal.getService())
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
         GlobalUtil.wait(10);
		Select gender = new Select(driver.findElement(By.xpath(genderFieldLocator)));
		switch(findClinicianModal.getGender())
		{
		case Male:
			gender.selectByVisibleText("Male");
			break;
		case Female:
			gender.selectByVisibleText("Female");
			break;
		case Any:
			gender.selectByVisibleText("Any");
			break;
		default:
			break;
		}
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(appointmentDateFieldLocator)).sendKeys(findClinicianModal.getAppointmentDate());
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(durationFieldLocator)).sendKeys(findClinicianModal.getDuration());
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(pinCodeFieldLocator)).sendKeys(findClinicianModal.getPinCode());
		GlobalUtil.wait(10);
		Select locality = new Select(driver.findElement(By.xpath(localityFieldLocator)));
		locality.selectByVisibleText(findClinicianModal.getLocality().toString());
		switch(findClinicianModal.getLocality())
		{
		case DomlurBusStand:
			locality.selectByVisibleText("Domlur Bus Stand");
			break;
		case Hulimavu:
			locality.selectByVisibleText("Hulimavu");
		case BannerghattaRoad:
			locality.selectByVisibleText("Bannerghatta Road");
		case JalahalliEast:
			locality.selectByVisibleText("Jalahalli East");
		default:
			break;
		}
		GlobalUtil.wait(10);
		Select area = new Select(driver.findElement(By.xpath(areaFieldLocator)));
		switch(findClinicianModal.getArea())
		{
		case Bangalore:
			area.selectByVisibleText("Bangalore");
			break;
		case Mumbai:
			area.selectByVisibleText("Mumbai");
			break;
		case Ahmedabad:
			area.selectByVisibleText("Ahmedabad");
			break;
		case Chennai:
			area.selectByVisibleText("Chennai");
			break;
		case Hyderabad:
			area.selectByVisibleText("Hyderabad");
			break;
		case Pune:
			area.selectByVisibleText("Pune");
			break;
		case DelhiNCR:
			area.selectByVisibleText("DelhiNCR");
			break;
		case Coimbatore:
			area.selectByVisibleText("Coimbatore");
			break;
		case Lucknow:
			area.selectByVisibleText("Lucknow");
			break;
		case Kolkatta:
			area.selectByVisibleText("Kolkatta");
			break;
		case Gurgaon:
			area.selectByVisibleText("Gurgaon");
			break;
		case Goa:
			area.selectByVisibleText("Goa");
			break;
		case Madurai:
			area.selectByVisibleText("Madurai");
			break;
		case Chandigarh:
			area.selectByVisibleText("Chandigarh");
			break;
		case Faridabad:
			area.selectByVisibleText("Faridabad");
			break;
		case Ghaziabad:
			area.selectByVisibleText("Ghaziabad");
			break;
		case Vishakapatnam:
			area.selectByVisibleText("Vishakapatnam");
			break;
		default :
			break;
		}
        GlobalUtil.wait(5);
		//driver.findElement(By.xpath(locationFieldLocator)).sendKeys(findClinicianModal.getLocation());
		driver.findElement(By.xpath(searchButtonLocator)).click();


	}

	public List<ProfessionalModal> readDataFromFindClinicianTable()
	{


		@SuppressWarnings("unused")
		String newline = System.getProperty("line.separator");
		List<WebElement> professionalElements = driver.findElements(By.xpath(tableBaseLocator));
	    int elementsPerPage = professionalElements.size() / multiplicationFactor;
		List<ProfessionalModal> professionalModals = new ArrayList<>();
		for(int i = 0; i < elementsPerPage; i++){
			ProfessionalModal professionalModal = new ProfessionalModal();
			professionalModal.setName(professionalElements.get(nameIndex + multiplicationFactor * i -1).getText());
			professionalModal.setStatus(professionalElements.get(statusIndex + multiplicationFactor * i -1).getText());
			professionalModals.add(professionalModal);
		}
		return professionalModals;

} 
		
	

	public void assignProfessional()
	{
		 
		driver.findElement(By.xpath(changeLinkLocator)).click();
		GlobalUtil.wait(5);
		driver.switchTo().window(assignProfessionalScreenLocator);
		GlobalUtil.wait(5);
		if(driver.findElement(By.xpath(assignProfessionalStatusColumnLocator)).isDisplayed())
		{
			driver.findElement(By.xpath(assignProfessionalStatusColumnLocator)).click();
		}

		driver.findElement(By.xpath(assignProfessionalButtonLocator)).click();
		GlobalUtil.wait(5);
		

	}
	
	public void availableClinicianTabledata()
	{
		WebElement Webtable=driver.findElement(By.xpath(findClinicianTableLocator)); // Replace TableID with Actual Table ID or Xpath
		List<WebElement> TotalRowCount=Webtable.findElements(By.xpath("//*[@id='tableSelect']/tbody/tr"));

		System.out.println("No. of Rows in the WebTable: "+TotalRowCount.size());
		// Now we will Iterate the Table and print the Values   
		int RowIndex=1;
		for(WebElement rowElement:TotalRowCount)
		{
		      List<WebElement> TotalColumnCount=rowElement.findElements(By.xpath("td"));
		      int ColumnIndex=1;
		      for(WebElement colElement:TotalColumnCount)
		      {
		           System.out.println("Row "+RowIndex+" Column "+ColumnIndex+" Data "+colElement.getText());
		           ColumnIndex=ColumnIndex+1;
		       }
		      RowIndex=RowIndex+1;
		 }

	}
	
	public void assignprofessionaltabledata()
	{
		WebElement Webtable=driver.findElement(By.xpath(assignProfTableLocator)); // Replace TableID with Actual Table ID or Xpath
		List<WebElement> TotalRowCount=Webtable.findElements(By.xpath("//*[@id='tableSelect']/tbody/tr"));

		System.out.println("No. of Rows in the WebTable: "+TotalRowCount.size());
		// Now we will Iterate the Table and print the Values   
		int RowIndex=1;
		for(WebElement rowElement:TotalRowCount)
		{
		      List<WebElement> TotalColumnCount=rowElement.findElements(By.xpath("td"));
		      int ColumnIndex=1;
		      for(WebElement colElement:TotalColumnCount)
		      {
		           System.out.println("Row "+RowIndex+" Column "+ColumnIndex+" Data "+colElement.getText());
		           ColumnIndex=ColumnIndex+1;
		       }
		      RowIndex=RowIndex+1;
		 }

	}
	public void getAssignProfessional()
	{
		PatientsPage patientpage = new PatientsPage(driver);
		PatientModal patientModal = getPatientDetails();
		patientModal.setSalutation(SALUTATION.Mr);
		patientModal.setGender(GENDER.Male);
		patientModal.setBrand(BRAND.Portea);
		patientModal.setPinCode("560076");
		patientModal.setLocation(LOCALITY.DomlurBusStand);
		patientpage.addPatient(patientModal);
	
		System.out.println("Subscribe Services");
    	ServiceModal serviceModal = getServiceDetails();
    	serviceModal.setServiceName(SERVICE.Nursing);
    	serviceModal.setAppointmentType(APPOINTMENTTYPE.Recurring);
    	serviceModal.setFirstVisitPrice("200");
    	serviceModal.setSecondVisitPrice("400");
    	patientpage.addService(serviceModal);
    	
    	System.out.println("Add Appointment");
    	AppointmentModal appointmentModal = getAppointmentDetails();
    	appointmentModal.setSelectPackage("Nursing");
    	appointmentModal.setClinicianPref("Best Available");
    	CalendarModal calendarModal = getCalendarDetails();
        calendarModal.setSelectTimeList("7:30pm");
    	calendarModal.setDuration("60");
    	calendarModal.setSelectDay("25");
    	patientpage.viewCalendar(calendarModal);
    	patientpage.addAppointment(appointmentModal);
    	
    	System.out.println("Assign Professional");
    	assignProfessional();
		
		
	}

	public void getAvailableClinicianOnFindAvailableTab()
	{
		 HomePage homepage = new HomePage(driver);
		 homepage.openAppointmentPage();
		 FindClinicianModal findClinicianModal = getClinicianAvailablityDetails();
		 findClinicianModal.setService(SERVICE.Nursing);
		 findClinicianModal.setGender(GENDER.Any);
		 findClinicianModal.setArea(AREA.Bangalore);
		 getClinicianAvailableDetails(findClinicianModal);
	}
	
	public List<ProfessionalModal> readDataFromAssignProfesssionalScreen()
	{
		
		
		@SuppressWarnings("unused")
		String newline = System.getProperty("line.separator");
		List<WebElement> professionalElements = driver.findElements(By.xpath(assignProfTableLocator));
		int elementsPerAssignProfPage = professionalElements.size() / multiplicationFactor;
		List<ProfessionalModal> assignProfessionalModal = new ArrayList<>();
		for (int i =0; i<elementsPerAssignProfPage; i++)
		{
			ProfessionalModal professionalModal = new ProfessionalModal();
			professionalModal.setName(professionalElements.get(profNameIndex + multiplicationFactor * i -1).getText());
			professionalModal.setStatus(professionalElements.get(assignTabProfSelectStatusIndex + multiplicationFactor * i -1).getText());
			assignProfessionalModal.add(professionalModal);
			System.out.println(assignProfessionalModal.toString());
		}
        return assignProfessionalModal;
	}
	
	public void subscribeServices()
	{
		System.out.println("Add Services...");
		driver.findElement(By.xpath(subscribeServiceLinkLocator)).click();
		GlobalUtil.wait(5);
		Select service = new Select(driver.findElement(By.xpath(serviceSelectFieldLocator)));
		service.selectByVisibleText("Physiotherapy");
		
//		driver.findElement(By.xpath(subserviceFieldLocator)).click();
//		Select subservice = new Select(driver.findElement(By.xpath(subserviceFieldLocator)));
//		subservice.selectByVisibleText("ADL Training");
		ServiceModal servicemodal = getServiceDetails();
//		
//		driver.findElement(By.xpath(preferencesFieldLocator)).click();
//		Select preferences = new Select(driver.findElement(By.xpath(preferencesFieldLocator)));
//		preferences.selectByVisibleText("Female");

//		servicemodal.setServiceName(SERVICE.Physiotherapy);
//		servicemodal.setSubservice(SUBSERVICE.ADLTraining);
//		servicemodal.setPreferences(PREFERENCES.Female);
//		servicemodal.setInstructions("Test");
		servicemodal.setAppointmentType(APPOINTMENTTYPE.Recurring);
		WebElement btn = driver.findElement(By.xpath(selectButton));
		btn.click();
		
	}
	
	public void confirmServiceInfo()
	{
		System.out.println("Confirm Service Info..");
		driver.findElement(By.xpath(firstVisitPriceTextField)).sendKeys("200");
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(secondVisitPriceTextField)).sendKeys("400");
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(confirmButtonLocator)).click();
		GlobalUtil.wait(5);
	}
	
	public void addAppointmentDatesFromCalendar()
	{
		System.out.println("View Calendar..");
		driver.findElement(By.xpath(setAppointmentButtonLocator)).click();
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(viewCalendarButtonLocator)).click();
		GlobalUtil.wait(5);
		//driver.switchTo().window(calendarFormWindow);
		driver.findElement(By.xpath(selectDayFromCalendarLocator)).click();
		driver.findElement(By.xpath(timePickerLocator)).click();
		GlobalUtil.wait(3);
		driver.findElement(By.xpath(timePickerLocator)).sendKeys("3:00pm");
		GlobalUtil.wait(3);
		driver.findElement(By.xpath(timeDurationFieldLocator)).sendKeys("30");
		driver.findElement(By.xpath(saveCalendarDetailsLocator)).click();
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(saveAppointmentButtonLocator)).click();
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(submitAppointmentButtonLocator)).click();
		GlobalUtil.wait(5);	
	}
	
	
	public void addPackages()
	{
		
	}
	
	public void cancelAppointments()
	{
		System.out.println("Cancel Appointment..");

	}
	
	public void addAppointments(String serviceName)
	{
		WebElement addService = driver.findElement(By.xpath("//a[contains(@href,'/subscriptions/add/services')]"));
		addService.click();
		Select service = new Select(driver.findElement(By.xpath("//select[contains(@id,'serviceSelector')]")));
		service.selectByVisibleText(serviceName);
		Select soldBy = new Select(driver.findElement(By.xpath("//select[contains(@id,'sold_by')]")));
		soldBy.selectByVisibleText("Sales");
		WebElement source = driver.findElement(By.xpath("//div[contains(@id,'source_chosen')]"));
		source.sendKeys("None");
		WebElement subscribeBtn = driver.findElement(By.xpath("//input[contains(@name,'select')]"));
		subscribeBtn.click();
		GlobalUtil.wait(2);
		WebElement overviewTab=driver.findElement(By.xpath(""));
		overviewTab.click();
		GlobalUtil.wait(2);
		WebElement confirmBtn = driver.findElement(By.xpath("//input[contains(@name,'confirm')]"));
		confirmBtn.click();
		
	}
	
	public void addAppointmentWithAlreadyKYC(String serviceName, String time)
	{
		WebElement addService = driver.findElement(By.xpath("//a[contains(@href,'/subscriptions/add/services')]"));
		addService.click();
		Select service = new Select(driver.findElement(By.xpath("//select[contains(@id,'serviceSelector')]")));
		service.selectByVisibleText(serviceName);
		Select soldBy = new Select(driver.findElement(By.xpath("//select[contains(@id,'sold_by')]")));
		soldBy.selectByVisibleText("Sales");
		WebElement source = driver.findElement(By.xpath("//div[contains(@id,'source_chosen')]"));
		source.sendKeys("None");
		WebElement subscribeBtn = driver.findElement(By.xpath("//input[contains(@name,'select')]"));
		subscribeBtn.click();
		GlobalUtil.wait(2);
		Select selectCliniPref = new Select(driver.findElement(By.xpath("//select[contains(@id,'selectPrefrence')]")));
		selectCliniPref.selectByVisibleText("I Know whom to pick");
		Select selectClini = new Select(driver.findElement(By.xpath("//select[contains(@id,'profSelector')]")));
		selectClini.selectByIndex(1);
		WebElement viewCalendarBtn = driver.findElement(By.xpath("//button[contains(@id,'view_calendar')]"));
		viewCalendarBtn.click();
		WebElement calendar = driver.findElement(By.xpath("//table/tr/td[contains(@class,'day-contents')]"));
		calendar.sendKeys(GlobalUtil.getTomorrowsDate());
		WebElement selecttime = driver.findElement(By.xpath("//input[contains(@id,'calender-time-picker')]"));
		selecttime.sendKeys(time);
		WebElement duration = driver.findElement(By.xpath("//input[contains(@id,'calender-time-duration')]"));
		duration.sendKeys("5");
		WebElement saveTime = driver.findElement(By.xpath("//button[@class='blue-submit' and contains(.,'Save')]"));
		saveTime.click();
		WebElement saveCalendar = driver.findElement(By.xpath("//button[@type='button' and contains(.,'Save')]"));
		saveCalendar.click();
		WebElement saveAppointment = driver.findElement(By.xpath("//button[contains(@id,'submit-appointment')]"));
		saveAppointment.submit();
		driver.switchTo().alert().accept();
	}
	public void changeStatusToSuccessful(String selectFilter, String status)
	{
		WebElement removefilter = driver.findElement(By.xpath("//a[contains(@class,'black-label-small')]"));
		removefilter.click();
		GlobalUtil.wait(2);
		Select filter = new Select(driver.findElement(By.xpath("//select[contains(@id,'filter')]")));
		filter.selectByVisibleText(selectFilter);
		WebElement filterBtn = driver.findElement(By.xpath("//button[@type='button' and contains(.,'Filter')]"));
		filterBtn.click();
		WebElement pendingBtn= driver.findElement(By.xpath("//a[@class='delete-label' and contains(text(),'"+selectFilter+"')]"));
		pendingBtn.click();
		GlobalUtil.wait(2);
		//driver.switchTo().window(changeStatusWindow);
		//GlobalUtil.wait(2);
		Select selectstatus = new Select(driver.findElement(By.xpath("//select[contains(@id,'status')]")));
		selectstatus.selectByVisibleText(status);
		WebElement checkbox = driver.findElement(By.xpath("//input[contains(@id,'no-payment-collected-checkbox')]"));
		checkbox.click();
		GlobalUtil.wait(2);
		WebElement csbtn = driver.findElement(By.xpath("//div/span[contains(text(),'Change Status')]/../following-sibling::div//button/span[contains(text(),'Change Status')]"));
		csbtn.click();
		GlobalUtil.wait(2);
		if(isAlertPresent())
		{
		driver.switchTo().alert().accept();
		}
	}
	
	public void changeAppointmentStatus(String selectFilter, String status)
	{
		Select filter = new Select(driver.findElement(By.xpath("//select[contains(@id,'filter')]")));
		filter.selectByVisibleText(selectFilter);
		WebElement filterBtn = driver.findElement(By.xpath("//button[@type='button' and contains(.,'Filter')]"));
		filterBtn.click();
		WebElement pendingBtn= driver.findElement(By.xpath("//a[@class='delete-label' and contains(text(),'"+selectFilter+"')]"));
		pendingBtn.click();
		GlobalUtil.wait(2);
		//driver.switchTo().window(changeStatusWindow);
		//GlobalUtil.wait(2);
		Select selectstatus = new Select(driver.findElement(By.xpath("//select[contains(@id,'status')]")));
		selectstatus.selectByVisibleText(status);
		WebElement csbtn = driver.findElement(By.xpath("//div/span[contains(text(),'Change Status')]/../following-sibling::div//button/span[contains(text(),'Change Status')]"));
		csbtn.click();
		GlobalUtil.wait(2);
		if(isAlertPresent())
		{
		driver.switchTo().alert().accept();
		}

	}
	
	public void selectProfessionalForNewAppt()
	{
		Select filter = new Select(driver.findElement(By.xpath("//select[contains(@id,'filter')]")));
		filter.selectByVisibleText("New");
		GlobalUtil.wait(2);
		WebElement filterBtn = driver.findElement(By.xpath("//button[@type='button' and contains(.,'Filter')]"));
		filterBtn.click();
		GlobalUtil.wait(2);
		WebElement changeProf = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]/a[text()='( Change )']"));
		changeProf.click();
		GlobalUtil.wait(5);
		WebElement selectProf = driver.findElement(By.xpath("//tbody/tr[1]/td[11]/input[contains(@value,'seldoctor')]"));
		selectProf.click();
		GlobalUtil.wait(2);
		WebElement assign = driver.findElement(By.xpath("//button/span[text()='Assign Professional']"));
		assign.click();
		GlobalUtil.wait(2);
		driver.switchTo().alert().accept();
		
	}
	
	public void changeStatusToReportReceived()
	{
		Select filter = new Select(driver.findElement(By.xpath("//select[contains(@id,'filter')]")));
		filter.selectByVisibleText("New");
		GlobalUtil.wait(2);
		WebElement filterBtn = driver.findElement(By.xpath("//button[@type='button' and contains(.,'Filter')]"));
		filterBtn.click();
		GlobalUtil.wait(2);
	}
	
public boolean isAlertPresent()
{
	boolean foundAlert = false; 
	WebDriverWait wait = new WebDriverWait(driver, 0 /*timeout in seconds*/); 
	try { 
		wait.until(ExpectedConditions.alertIsPresent()); 
		foundAlert = true; 
		} 
	catch (TimeoutException eTO) 
	{ 
		foundAlert = false; 
	} 
	return foundAlert; 
	}

   public void addAppointmentForAlreadyAddedService(String time)
    {
	WebElement addAppt = driver.findElement(By.xpath("//a[contains(@href,'/appointment/add') and contains(.,'Add Appointment')]"));
	addAppt.click();
	GlobalUtil.wait(2);
	Select selpackage = new Select(driver.findElement(By.xpath("//select[contains(@id,'packageSelector')]")));
	selpackage.selectByIndex(1);
	GlobalUtil.wait(2);
	Select service = new Select(driver.findElement(By.xpath("//select[contains(@id,'serviceSelector')]")));
	service.selectByIndex(0);
	GlobalUtil.wait(2);
	WebElement btn = driver.findElement(By.xpath("//button[contains(@class,'blue-submit') and contains(.,'Next')]"));
	btn.click();
	Select selectCliniPref = new Select(driver.findElement(By.xpath("//select[contains(@id,'selectPrefrence')]")));
	selectCliniPref.selectByVisibleText("I Know whom to pick");
	GlobalUtil.wait(2);
	Select selectClini = new Select(driver.findElement(By.xpath("//select[contains(@id,'profSelector')]")));
	selectClini.selectByIndex(1);
	GlobalUtil.wait(2);
	WebElement viewCalendarBtn = driver.findElement(By.xpath("//button[contains(@id,'view_calendar')]"));
	viewCalendarBtn.click();
	GlobalUtil.wait(2);
	WebElement calendar = driver.findElement(By.xpath("//td[contains(@class,\"calendar-day-"+GlobalUtil.getCurrentDate() + "\")]"));
	calendar.click();
	GlobalUtil.wait(5);
	WebElement timeDrop = driver.findElement(By.xpath("//input[contains(@id,'calender-time-picker')]"));
	timeDrop.click();
	GlobalUtil.wait(5);
	WebElement seltime = driver.findElement(By.xpath("//ul[@class='ui-timepicker-list']/li[text()='"+time+"']"));
	seltime.click();
	GlobalUtil.wait(5);
	WebElement duration = driver.findElement(By.xpath("//input[contains(@id,'calender-time-duration')]"));
	duration.sendKeys("5");
	GlobalUtil.wait(5);
	WebElement saveTime = driver.findElement(By.xpath("//button[@class='blue-submit' and contains(.,'Save')]"));
	saveTime.click();
	GlobalUtil.wait(5);
	WebElement saveCalendar = driver.findElement(By.xpath("//button[@type='button' and contains(.,'Save')]"));
	saveCalendar.click();
	GlobalUtil.wait(5);
	WebElement saveAppointment = driver.findElement(By.xpath("//button[contains(@id,'submit_appointment')]"));
	saveAppointment.click();
	GlobalUtil.wait(5);
	driver.switchTo().alert().accept();
    }
   
   public void addAppointmentWithoutSubscriptionforLabs(String time)
   {
	WebElement addAppt = driver.findElement(By.xpath("//a[contains(@href,'/appointment/add') and contains(.,'Add Appointment')]"));
	addAppt.click();
	GlobalUtil.wait(2);
	Select selpackage = new Select(driver.findElement(By.xpath("//select[contains(@id,'serviceSelectorWOSub')]")));
	selpackage.selectByValue("71");
	GlobalUtil.wait(2);
	WebElement btn = driver.findElement(By.xpath("//button[contains(@class,'blue-submit') and contains(.,'Next')]"));
	btn.click();
	GlobalUtil.wait(2);
	WebElement subser = driver.findElement(By.xpath("//div[@id='subservice_chosen']/ul"));
	subser.click();
	GlobalUtil.wait(2);
	WebElement sel = driver.findElement(By.xpath("//div[@class='chosen-drop']//li[contains(text(), 'Blood Grouping')]"));
	sel.click();
	GlobalUtil.wait(2);
	WebElement sb = driver.findElement(By.xpath("//div[@id='sold_by_chosen']/a"));
	sb.click();
	WebElement search = driver.findElement(By.xpath("//div[@id='sold_by_chosen']//div[@class='chosen-search']/input"));
	search.sendKeys(Keys.chord("Sales", Keys.ENTER));
	
	GlobalUtil.wait(2);
	WebElement source = driver.findElement(By.xpath("//div[@id='source_chosen']/a"));
	source.click();
	WebElement searchSource = driver.findElement(By.xpath("//div[@id='source_chosen']//div[@class='chosen-search']/input"));
	searchSource.sendKeys(Keys.chord("None", Keys.ENTER));
	GlobalUtil.wait(2);

	Select selectCliniPref = new Select(driver.findElement(By.xpath("//select[contains(@id,'selectPrefrence')]")));
	selectCliniPref.selectByVisibleText("I Know whom to pick");
	GlobalUtil.wait(2);
	Select selectClini = new Select(driver.findElement(By.xpath("//select[contains(@id,'profSelector')]")));
	selectClini.selectByIndex(1);
	GlobalUtil.wait(2);
	WebElement viewCalendarBtn = driver.findElement(By.xpath("//button[contains(@id,'view_calendar')]"));
	viewCalendarBtn.click();
	GlobalUtil.wait(2);
	WebElement calendar = driver.findElement(By.xpath("//td[contains(@class,\"calendar-day-"+GlobalUtil.getCurrentDate() + "\")]"));
	calendar.click();
	GlobalUtil.wait(5);
	WebElement timeDrop = driver.findElement(By.xpath("//input[contains(@id,'calender-time-picker')]"));
	timeDrop.click();
	GlobalUtil.wait(5);
	WebElement seltime = driver.findElement(By.xpath("//ul[@class='ui-timepicker-list']/li[text()='"+time+"']"));
	seltime.click();
	GlobalUtil.wait(5);
	WebElement duration = driver.findElement(By.xpath("//input[contains(@id,'calender-time-duration')]"));
	duration.sendKeys("5");
	GlobalUtil.wait(5);
	WebElement saveTime = driver.findElement(By.xpath("//button[@class='blue-submit' and contains(.,'Save')]"));
	saveTime.click();
	GlobalUtil.wait(5);
	WebElement saveCalendar = driver.findElement(By.xpath("//button[@type='button' and contains(.,'Save')]"));
	saveCalendar.click();
	GlobalUtil.wait(5);
	WebElement saveAppointment = driver.findElement(By.xpath("//button[contains(@id,'submit_appointment')]"));
	saveAppointment.click();
	GlobalUtil.wait(5);
	driver.switchTo().alert().accept();
   }
   
   public void addAppointmentWithoutSubscriptionforCurrentDay2hrsBeforeLabs()
   {
	WebElement addAppt = driver.findElement(By.xpath("//a[contains(@href,'/appointment/add') and contains(.,'Add Appointment')]"));
	addAppt.click();
	GlobalUtil.wait(2);
	Select selpackage = new Select(driver.findElement(By.xpath("//select[contains(@id,'serviceSelectorWOSub')]")));
	selpackage.selectByValue("71");
	GlobalUtil.wait(2);
	WebElement btn = driver.findElement(By.xpath("//button[contains(@class,'blue-submit') and contains(.,'Next')]"));
	btn.click();
	GlobalUtil.wait(2);
	WebElement subser = driver.findElement(By.xpath("//div[@id='subservice_chosen']/ul"));
	subser.click();
	GlobalUtil.wait(2);
	WebElement sel = driver.findElement(By.xpath("//div[@class='chosen-drop']//li[contains(text(), 'Blood Grouping')]"));
	sel.click();
	GlobalUtil.wait(2);
	WebElement sb = driver.findElement(By.xpath("//div[@id='sold_by_chosen']/a"));
	sb.click();
	WebElement search = driver.findElement(By.xpath("//div[@id='sold_by_chosen']//div[@class='chosen-search']/input"));
	search.sendKeys(Keys.chord("Sales", Keys.ENTER));
	
	GlobalUtil.wait(2);
	WebElement source = driver.findElement(By.xpath("//div[@id='source_chosen']/a"));
	source.click();
	WebElement searchSource = driver.findElement(By.xpath("//div[@id='source_chosen']//div[@class='chosen-search']/input"));
	searchSource.sendKeys(Keys.chord("None", Keys.ENTER));
	GlobalUtil.wait(2);

	Select selectCliniPref = new Select(driver.findElement(By.xpath("//select[contains(@id,'selectPrefrence')]")));
	selectCliniPref.selectByVisibleText("I Know whom to pick");
	GlobalUtil.wait(2);
	Select selectClini = new Select(driver.findElement(By.xpath("//select[contains(@id,'profSelector')]")));
	selectClini.selectByIndex(1);
	GlobalUtil.wait(2);
	WebElement viewCalendarBtn = driver.findElement(By.xpath("//button[contains(@id,'view_calendar')]"));
	viewCalendarBtn.click();
	GlobalUtil.wait(2);
	WebElement calendar = driver.findElement(By.xpath("//td[contains(@class,\"calendar-day-"+GlobalUtil.getCurrentDate() + "\")]"));
	calendar.click();
	GlobalUtil.wait(5);
	WebElement timeDrop = driver.findElement(By.xpath("//input[contains(@id,'calender-time-picker')]"));
	timeDrop.click();
	GlobalUtil.wait(5);
	WebElement seltime = driver.findElement(By.xpath("//ul[@class='ui-timepicker-list']/li[contains(text(),'"+GlobalUtil.getTwoHrsAfterTime()+"')]"));
	//
	//ul[@class='ui-timepicker-list']/li[text()='10:15 AM']
	
	System.out.println(seltime);
	GlobalUtil.wait(2);
	seltime.click();
	GlobalUtil.wait(2);
	WebElement duration = driver.findElement(By.xpath("//input[contains(@id,'calender-time-duration')]"));
	duration.sendKeys("5");
	GlobalUtil.wait(5);
	WebElement saveTime = driver.findElement(By.xpath("//button[@class='blue-submit' and contains(.,'Save')]"));
	saveTime.click();
	GlobalUtil.wait(5);
	WebElement saveCalendar = driver.findElement(By.xpath("//button[@type='button' and contains(.,'Save')]"));
	saveCalendar.click();
	GlobalUtil.wait(5);
	WebElement saveAppointment = driver.findElement(By.xpath("//button[contains(@id,'submit_appointment')]"));
	saveAppointment.click();
	GlobalUtil.wait(5);
	driver.switchTo().alert().accept();
   }
   public void changeStatusForLabReports()
   {
	   Select sel = new Select(driver.findElement(By.xpath("//select[@id='serviceType-filter']")));
	   sel.selectByVisibleText("Diagnostic");
	   GlobalUtil.wait(5);
	   Select type = new Select(driver.findElement(By.xpath("//select[@id='filter']")));
	   type.selectByVisibleText("Successful");
	   GlobalUtil.wait(5);
	   WebElement btn = driver.findElement(By.xpath("//div/button[contains(text() ,'Filter')]"));
	   btn.click();
	   GlobalUtil.wait(2);
	   WebElement ele = driver.findElement(By.xpath("//tr[1]/td[2]/a"));
	   ele.click();
	   GlobalUtil.wait(5);
	   WebElement statusBtn = driver.findElement(By.xpath("//a[contains(text(),'Sample Collected')]"));
	   statusBtn.click();
	   driver.switchTo().window("Change Investigation Status");
	   GlobalUtil.wait(2);
	   Select status = new Select(driver.findElement(By.xpath("investigation_status")));
	   status.selectByVisibleText("Reports Received");
	   GlobalUtil.wait(2);
	   driver.switchTo().alert().accept();
	   GlobalUtil.wait(5);
	   WebElement recstatusBtn = driver.findElement(By.xpath("//a[contains(text(),'Report Received')]"));
	   recstatusBtn.click();
	   GlobalUtil.wait(5);
   }
   
   public void uploadInvestigationReport()
   {
	   WebElement ele = driver.findElement(By.xpath("//a[contains(@href,'/patient/investigation_reports/281442')]"));
	   ele.click();
	   GlobalUtil.wait(5);
	   WebElement sel = driver.findElement(By.xpath("//tr[1]/td/input[contains(@id,'checkbox')]"));
	   sel.click();
	   GlobalUtil.wait(5);
	   WebElement btn = driver.findElement(By.xpath("//a[contains(text(),'Upload Investigation')]"));
	   btn.click();
	   GlobalUtil.wait(5);
	   WebElement uploadFile = driver.findElement(By.xpath("//div/input[contains(@id,'userfile')]"));
	   GlobalUtil.forceVisibility(driver, uploadFile);
//	   uploadFile.click();
//	   GlobalUtil.wait(2);
	   uploadFile.sendKeys("C:\\Users\\sapna\\Desktop\\Untitled1.png");
	   GlobalUtil.wait(5);
	   WebElement uploadBtn = driver.findElements(By.xpath("//div/button/span[contains(text(),'Upload')]")).get(1);
	   uploadBtn.click();
	   GlobalUtil.wait(5);
	   driver.get("http://stageops.portea.com/croncontroller/getMailContent");
	   GlobalUtil.wait(2);
	   driver.get("http://stageops.portea.com/croncontroller/sendQueueMail");
	   GlobalUtil.wait(2);
	   driver.get("https://stageops.portea.com/croncontroller/sendInvestigationsToPatient");
	   
	   
   }
   public void addAppointmentForBestAvailableClinician(String time)
   {
	WebElement addAppt = driver.findElement(By.xpath("//a[contains(@href,'/appointment/add') and contains(.,'Add Appointment')]"));
	addAppt.click();
	GlobalUtil.wait(2);
	Select selpackage = new Select(driver.findElement(By.xpath("//select[contains(@id,'packageSelector')]")));
	selpackage.selectByIndex(1);
	GlobalUtil.wait(2);
	Select service = new Select(driver.findElement(By.xpath("//select[contains(@id,'serviceSelector')]")));
	service.selectByIndex(0);
	GlobalUtil.wait(2);
	WebElement btn = driver.findElement(By.xpath("//button[contains(@class,'blue-submit') and contains(.,'Next')]"));
	btn.click();
	Select selectCliniPref = new Select(driver.findElement(By.xpath("//select[contains(@id,'selectPrefrence')]")));
	selectCliniPref.selectByVisibleText("Best Available");
	GlobalUtil.wait(2);
//	Select selectClini = new Select(driver.findElement(By.xpath("//select[contains(@id,'profSelector')]")));
//	selectClini.selectByIndex(1);
//	GlobalUtil.wait(2);
	WebElement viewCalendarBtn = driver.findElement(By.xpath("//button[contains(@id,'view_calendar')]"));
	viewCalendarBtn.click();
	GlobalUtil.wait(2);
	WebElement calendar = driver.findElement(By.xpath("//td[contains(@class,\"calendar-day-"+GlobalUtil.getCurrentDate() + "\")]"));
	calendar.click();
	GlobalUtil.wait(5);
	WebElement timeDrop = driver.findElement(By.xpath("//input[contains(@id,'calender-time-picker')]"));
	timeDrop.click();
	GlobalUtil.wait(5);
	WebElement seltime = driver.findElement(By.xpath("//ul[@class='ui-timepicker-list']/li[text()='"+time+"']"));
	seltime.click();
	GlobalUtil.wait(5);
	WebElement duration = driver.findElement(By.xpath("//input[contains(@id,'calender-time-duration')]"));
	duration.sendKeys("5");
	GlobalUtil.wait(5);
	WebElement saveTime = driver.findElement(By.xpath("//button[@class='blue-submit' and contains(.,'Save')]"));
	saveTime.click();
	GlobalUtil.wait(5);
	WebElement saveCalendar = driver.findElement(By.xpath("//button[@type='button' and contains(.,'Save')]"));
	saveCalendar.click();
	GlobalUtil.wait(5);
	WebElement saveAppointment = driver.findElement(By.xpath("//button[contains(@id,'submit_appointment')]"));
	saveAppointment.click();
	GlobalUtil.wait(5);
	driver.switchTo().alert().accept();
   }
  
   public void cancelAppointment()
   {
	   Select selectResponsible = new Select(driver.findElement(By.xpath("//select[@id='responsible']")));
	   selectResponsible.selectByValue("Clinician");
	   GlobalUtil.wait(5);
	   Select selectReason = new Select(driver.findElement(By.xpath("//select[@id='reason']")));
	   selectReason.selectByValue("Emergency Leave");
	   GlobalUtil.wait(5);
	   WebElement notes = driver.findElement(By.xpath("//textarea[@id='status-notes']"));
	   notes.sendKeys("test");
	   GlobalUtil.wait(2);
	   WebElement changeStatus = driver.findElement(By.xpath("//div/button/span[text()='Change Status']"));
	   changeStatus.click();
	   GlobalUtil.wait(2);
	   driver.switchTo().alert().accept();
   }
   
   public void rescheduleAppointment()
   {
	   //driver.switchTo().window("Reschedule Appointment");
       WebElement clickOnSelectTime = driver.findElement(By.xpath("//input[contains(@id,'timePicker')]"));
       clickOnSelectTime.click();
       WebElement selectTime = driver.findElement(By.xpath("//ul[contains(@class,'ui-timePicker-list')]"));
       selectTime.click();
       selectTime.sendKeys("5:30 PM");
       Select responsible = new Select(driver.findElement(By.xpath("//input[contains(@id,'responsible_schedule')]")));
       responsible.selectByVisibleText("Operations");
       Select reason = new Select(driver.findElement(By.xpath("//input[contains(@id,'reason_schedule')]")));
       reason.selectByVisibleText("NO Update");
       WebElement notes = driver.findElement(By.xpath("//textarea[contains(@id,'post_notes')]"));
       notes.sendKeys("test");
       WebElement btn = driver.findElement(By.xpath("//button[contains(@class,'ui-button-text') and contains(.,'Reschedule')]"));
       btn.click();
       driver.switchTo().alert().accept();
   }
   
	public void addKYC(String serviceName)
	{
		WebElement kyctab= driver.findElement(By.xpath("//a[contains(@href,'kyc')]"));
		kyctab.click();
//		WebElement addKYC= driver.findElement(By.xpath("//a[contains(@href,'/patient/kyc')]"));
//		addKYC.click();
		Select service = new Select(driver.findElement(By.xpath("//select[contains(@id,'service')]")));
		service.selectByVisibleText(serviceName);
		Select selectSpeciality= new Select(driver.findElement(By.xpath("//select[contains(@id,'medical_status')]")));
		selectSpeciality.selectByVisibleText("Others");
		WebElement medicalCondition = driver.findElement(By.xpath("//div[contains(@id,'medical_sub_status_chosen')]"));
		medicalCondition.sendKeys("Others");
		WebElement visitDoc = driver.findElement(By.xpath("//input[contains(@name,'visitdoctors') and contains(@value,'No')]"));
		visitDoc.click();
		WebElement visitPhysio = driver.findElement(By.xpath("//input[contains(@name,'visitphysio') and contains(@value,'No')]"));
		visitPhysio.click();
		WebElement treatment = driver.findElement(By.xpath("//div[contains(@id,'treatmentdiv')]"));
		treatment.sendKeys("test");
		WebElement hospitalized = driver.findElement(By.xpath("//input[contains(@id,'hospitalized') and contains(@value,'No')]"));
		hospitalized.sendKeys("test");
		WebElement bedridden = driver.findElement(By.xpath("//input[contains(@value,'No') and contains(@name,'bedridden')]"));
		bedridden.click();
		WebElement reason = driver.findElement(By.xpath("/textarea[contains(@name,'remarks')])"));
		reason.sendKeys("test");
		WebElement btn = driver.findElement(By.xpath("//button[contains(@id,'Save')])"));
		btn.click();
	}
	
	public void addService()
	{
		
	}
	 private PatientModal getPatientDetails(){
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
	 
	 private CalendarModal getCalendarDetails(){
	    	
			CalendarModal calendarModal = new CalendarModal();
			calendarModal.setSelectTimeList(calendarModal.getSelectTimeList());
			calendarModal.setSelectDay(calendarModal.getSelectDay());
			calendarModal.setDuration(calendarModal.getDuration());
			return calendarModal;
		
		}
	 private AppointmentModal getAppointmentDetails(){
			AppointmentModal appointmentModal = new AppointmentModal();
			appointmentModal.setSelectPackage(appointmentModal.getSelectPackage());
			appointmentModal.setClinicianPref(appointmentModal.getClinicianPref());
			appointmentModal.setViewCalendar(appointmentModal.getViewCalendar());
			appointmentModal.setTimings(appointmentModal.getTimings());
			appointmentModal.setDuration(appointmentModal.getDuration());
			appointmentModal.setDayContent(GlobalUtil.getCurrentDate());
			return appointmentModal;
		}
	 
	 
	 
	 private FindClinicianModal getClinicianAvailablityDetails(){
		 FindClinicianModal findClinicianModal = new FindClinicianModal();
		 findClinicianModal.setService(findClinicianModal.getService());
		 findClinicianModal.setGender(findClinicianModal.getGender());
		 findClinicianModal.setAppointmentDate("2014-10-25 19:30:00");
		 findClinicianModal.setDuration("60");
		 findClinicianModal.setPinCode("560076");
		 findClinicianModal.setLocality(findClinicianModal.getLocality());
		 findClinicianModal.setArea(findClinicianModal.getArea());
		// findClinicianModal.setLocation(findClinicianModal.getLocation());
			
			return findClinicianModal;
		}
	
	 private ServiceModal getServiceDetails(){
			ServiceModal serviceModal = new ServiceModal();
			serviceModal.setServiceName(serviceModal.getServiceName());
			serviceModal.setSubservice(serviceModal.getSubservice());
			serviceModal.setPreferences(serviceModal.getPreferences());
			serviceModal.setInstructions(serviceModal.getInstructions());
			serviceModal.setAppointmentType(serviceModal.getAppointmentType());
			serviceModal.setFirstVisitPrice(serviceModal.getFirstVisitPrice());
			serviceModal.setSecondVisitPrice(serviceModal.getSecondVisitPrice());
			serviceModal.setNoOfVisits(serviceModal.getNoOfVisits());
			serviceModal.setOfferedPrice(serviceModal.getOfferedPrice());
			return serviceModal;
		}
		


}
