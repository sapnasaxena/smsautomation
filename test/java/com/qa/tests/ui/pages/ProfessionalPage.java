package com.qa.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.tests.common.GlobalUtil;
import com.qa.tests.ui.common.BasePage;

public class ProfessionalPage extends BasePage {

	
	
	public ProfessionalPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String allProfessionalsTabLocator= "//a[text()='Professionals']";
	public String getAllProfessionalsTab()
	{
		return allProfessionalsTabLocator;
	}
	
	public String travelreportTabLocator = "//a[text()='Travel Report']";
	public String getTravelReportTab()
	{
		return travelreportTabLocator;
	}
	
	
	public String professionaltrackerTabLocator = "//a[text()='Professional Tracker']";
	public String getProfessionalTrackerTabLocator()
	{
		return professionaltrackerTabLocator;
	}

	
	public String myteamTabLocator= "//a[text()='My Team']";
	public String getMyTeamTabLocator()
	{
		return myteamTabLocator;
	}

	public String callRecordTabLocator= "//a[text()='Call Record']";
	public String getCallRecordTabLocator()
	{
		return callRecordTabLocator;
	}

	public String professionFilterLocator = "//select[contains(@id,'profession-filter')]";
	public String getprofessionFilterLocator()
	{
		return professionFilterLocator;
	}
	
	public String addProfessionalButtonLocator = "//a[text()='Add Professional']";
	public String getAddProfessionalButtonLocator()
	{
		return addProfessionalButtonLocator;
	}
	
	public String addedProfessionalNameLocator ="//tr[1]/td[2]";
	public String getAddedProfessionalNameLocator()
	{
		return addedProfessionalNameLocator;
	}
	
	public String statusFilterOnProfessionalTabLocator = "//select[contains(@id, 'filter-by-profStatus')]";
	public String getStatusFilterOnProfessionalTabLocator()
	{
		return statusFilterOnProfessionalTabLocator;
	}
	
	public String languageFilterOnProfessionalTabLocator = "//select[contains(@id, 'filter-by-language')]";
	public String getLanguageFilterOnProfessionalTabLocator()
	{
		return languageFilterOnProfessionalTabLocator;
	}
	
	
	public String typeFilterOnProfessionalTabLocator = "//select[contains(@id, 'filter')]";
	public String getTypeFilterOnProfessionalTabLocator()
	{
		return typeFilterOnProfessionalTabLocator;
	}
	
	public String androidFilterOnProfessionalTabLocator = "//select[contains(@id, 'filter-by-android')]";
	public String getAndroidFilterOnProfessionalTabLocator()
	{
		return androidFilterOnProfessionalTabLocator;
	}
	
	public String searchTextBoxOnProfessionalTabLocator = "//input[contains(@id, 'search')]";
	public String getSearchTextBoxOnProfessionalTabLocator()
	{
		return searchTextBoxOnProfessionalTabLocator;
	}
	
	public String searchButtonOnProfessionalTabLocator = "//button[text()='Search']";
	public String getSearchButtonOnProfessionalTabLocator()
	{
		return searchButtonOnProfessionalTabLocator;
	}
	
	public String profTimingCheckBoxOnProfessionalTabLocator = "//input[contains(@id,'timing')]";
	public String getProfTimingCheckBoxOnProfessionalTabLocator()
	{
		return profTimingCheckBoxOnProfessionalTabLocator;
	}
	
	public String profTimingMondayOnProfessionalTabLocator = "//th[contains(text(),'monday')]";
	public String getprofTimingMondayOnProfessionalTabLocator()
	{
		return profTimingMondayOnProfessionalTabLocator;
	}
	
	public String profTimingTuesdayOnProfessionalTabLocator = "//th[contains(text(),'tuesday')]";
	public String getprofTimingTuesdayOnProfessionalTabLocator()
	{
		return profTimingTuesdayOnProfessionalTabLocator;
	}
	
	public String profTimingWednesdayOnProfessionalTabLocator = "//th[contains(text(),'wednesday')]";
	public String getprofTimingWednesdayOnProfessionalTabLocator()
	{
		return profTimingWednesdayOnProfessionalTabLocator;
	}
	
	public String profTimingThursdayOnProfessionalTabLocator = "//th[contains(text(),'thursday')]";
	public String getprofTimingThursdayOnProfessionalTabLocator()
	{
		return profTimingThursdayOnProfessionalTabLocator;
	}
	
	public String profTimingFridayOnProfessionalTabLocator = "//th[contains(text(),'friday')]";
	public String getprofTimingFrisdayOnProfessionalTabLocator()
	{
		return profTimingFridayOnProfessionalTabLocator;
	}
	
	public String profTimingSaturdayOnProfessionalTabLocator = "//th[contains(text(),'saturday')]";
	public String getprofTimingSaturdayOnProfessionalTabLocator()
	{
		return profTimingSaturdayOnProfessionalTabLocator;
	}
	
	public String profTimingSundayOnProfessionalTabLocator = "//th[contains(text(),'sunday')]";
	public String getprofTimingSundayOnProfessionalTabLocator()
	{
		return profTimingSundayOnProfessionalTabLocator;
	}
	
	public String statusUnavailableColumnLocatorOnProfessionalTab = "//td/a[contains(text(), 'Unavailable')]";
	public String getStatusUnavailableColumnLocatorOnProfessionalTab()
	{
		return statusUnavailableColumnLocatorOnProfessionalTab;
	}
	
	public String statusAvailableColumnLocatorOnProfessionalTab = "//td[contains(text(), 'Available')]";
	public String getStatusAvailableColumnLocatorOnProfessionalTab()
	{
		return statusAvailableColumnLocatorOnProfessionalTab;
	}
	
	public String statusInactiveColumnLocatorOnProfessionalTab = "//td/a[contains(text(), 'Inactive')]";
	public String getStatusInactiveColumnLocatorOnProfessionalTab()
	{
		return statusInactiveColumnLocatorOnProfessionalTab;
	}
	
	public String typeSelectedDoctorColumnLocatorOnProfessionalTab = "//td[contains(text(), 'Doctor')]";
	public String getTypeSelectedDoctorColumnLocatorOnProfessionalTab()
	{
		return typeSelectedDoctorColumnLocatorOnProfessionalTab;
	}
	
	public String typeSelectedPhysiotherapistColumnLocatorOnProfessionalTab = "//td[contains(text(), 'Physiotherapist')]";
	public String getTypeSelectedPhysiotherapistColumnLocatorOnProfessionalTab()
	{
		return typeSelectedPhysiotherapistColumnLocatorOnProfessionalTab;
	}
	
	public String typeSelectedNursingColumnLocatorOnProfessionalTab = "//td[contains(text(), 'Nursing Attendant')]";
	public String getTypeSelectedNursingColumnLocatorOnProfessionalTab()
	{
		return typeSelectedNursingColumnLocatorOnProfessionalTab;
	}
	
	public String androidSelectedNOColumnLocatorOnProfessionalTab = "//td/img[contains(@src,'android_dark_3.png')]";
	public String getAndroidSelectedNOColumnLocatorOnProfessionalTab()
	{
		return androidSelectedNOColumnLocatorOnProfessionalTab;
	}
	
	public String androidSelectedYESColumnLocatorOnProfessionalTab = "//td/img[contains(@src,'android_small.png')]";
	public String getAndroidSelectedYESColumnLocatorOnProfessionalTab()
	{
		return androidSelectedYESColumnLocatorOnProfessionalTab;
	}
	
	public String searchedRecordsByProfNameListLocator = "//td/a[contains(text(),'test')]";
	public String getSearchedRecordsByProfNameListLocator()
	{
		return  searchedRecordsByProfNameListLocator;
	}
	
	public String travelReportDateColumnLocator = "//th[contains(text(),'Date')]";
	public String getTravelReportDateColumnLocator()
	{
		return  travelReportDateColumnLocator;
	}
	
	public String travelReportNameColumnLocator = "//th[contains(text(),'Name')]";
	public String getTravelReportNameColumnLocator()
	{
		return  travelReportNameColumnLocator;
	}
	public String travelReportNoOfAppointmentsColumnLocator = "//th[contains(text(),'No. of Appointments')]";
	public String getTravelReportNoOfAppointmentsColumnLocator()
	{
		return  travelReportNoOfAppointmentsColumnLocator;
	}
	public String travelReportTotalDistanceTravelledColumnLocator = "//th[contains(text(),'Total distance travelled')]";
	public String getTravelReportTotalDistanceTravelledColumnLocator()
	{
		return  travelReportTotalDistanceTravelledColumnLocator;
	}
	
	public String travelReportAvgDistanceColumnLocator = "//th[contains(text(),'Avg. distance/appointment')]";
	public String getTravelReportAvgDistanceColumnLocator()
	{
		return  travelReportAvgDistanceColumnLocator;
	}
	
	public String travelReportAvgWaitTimeColumnLocator = "//th[contains(text(),'Avg. wait time')]";
	public String getTravelReportAvgWaitTimeColumnLocator()
	{
		return  travelReportAvgWaitTimeColumnLocator;
	}
	
	public String travelReportMaxWaitTimeColumnLocator = "//th[contains(text(),'Max. wait time')]";
	public String getTravelReportMaxWaitTimeColumnLocator()
	{
		return  travelReportMaxWaitTimeColumnLocator;
	}
	
	public String androidAppFilterLocator = "//select[contains(@id,'app-filter')]";
	public String getAndroidAppFilterLocator()
	{
		return  androidAppFilterLocator;
	}
	
	public String searchTextBoxLocatorOnProfTrackerTab = "//input[contains(@id,'search')]";
	public String getSearchTextBoxLocatorOnProfTrackerTab()
	{
		return  searchTextBoxLocatorOnProfTrackerTab;
	}
	
	public String searchButtonLocatorOnProfTrackerTab = "//button[contains(text(),'Search')]";
	public String getSearchButtonLocatorOnProfTrackerTab()
	{
		return  searchButtonLocatorOnProfTrackerTab;
	}
	
	public String nameColumnLocatorOnMyTeamTab = "//th[contains(text(),'Name')]";
	public String getNameColumnLocatorOnMyTeamTab()
	{
		return  nameColumnLocatorOnMyTeamTab;
	}
	
	public String typeColumnLocatorOnMyTeamTab = "//th[contains(text(),'Type')]";
	public String getTypeColumnLocatorOnMyTeamTab()
	{
		return typeColumnLocatorOnMyTeamTab;
	}
	
	public String mobileColumnLocatorOnMyTeamTab = "//th[contains(text(),'Mobile')]";
	public String getMobileColumnLocatorOnMyTeamTab()
	{
		return  mobileColumnLocatorOnMyTeamTab;
	}
	
	public String genderColumnLocatorOnMyTeamTab = "//th[contains(text(),'Gender')]";
	public String getGenderColumnLocatorOnMyTeamTab()
	{
		return  genderColumnLocatorOnMyTeamTab;
	}
	
	public String areaColumnLocatorOnMyTeamTab = "//th[contains(text(),'Area')]";
	public String getAreaColumnLocatorOnMyTeamTab()
	{
		return  areaColumnLocatorOnMyTeamTab;
	}
	
	public String employeeTypeColumnLocatorOnMyTeamTab = "//th[contains(text(),'Employee Type')]";
	public String getEmployeeTypeColumnLocatorOnMyTeamTab()
	{
		return  employeeTypeColumnLocatorOnMyTeamTab;
	}
	
	public String locationsColumnLocatorOnMyTeamTab = "//th[contains(text(),'Locations')]";
	public String getLocationsColumnLocatorOnMyTeamTab()
	{
		return  locationsColumnLocatorOnMyTeamTab;
	}
	
	public String statusColumnLocatorOnMyTeamTab = "//th[contains(text(),'Status')]";
	public String getStatusColumnLocatorOnMyTeamTab()
	{
		return  statusColumnLocatorOnMyTeamTab;
	}
	
	public String editColumnLocatorOnMyTeamTab = "//th[contains(text(),'Edit')]";
	public String getEditColumnLocatorOnMyTeamTab()
	{
		return  editColumnLocatorOnMyTeamTab;
	}
	
	public String editButtonLocatorOnMyTeamTab = "//a[contains(text(),'Edit')]";
	public String getEditButtonLocatorOnMyTeamTab()
	{
		return  editButtonLocatorOnMyTeamTab;
	}
	
	public String editScreenLocator = "//div[contains(text(),'Edit Professional')]";
	public String getEditScreenLocator()
	{
		return  editScreenLocator;
	}
	
	
	public String sendSMSColumnLocatorOnMyTeamTab = "//th[contains(text(),'Send SMS')]";
	public String getSendSMSColumnLocatorOnMyTeamTab()
	{
		return  sendSMSColumnLocatorOnMyTeamTab;
	}
	
	public String sendSMSButtonLocatorOnMyTeamTab = "//button[contains(text(),'Send SMS')]";
	public String getSendSMSButtonLocatorOnMyTeamTab()
	{
		return  sendSMSButtonLocatorOnMyTeamTab;
	}
	
	public String sendSMSScreenLocator = "//span[contains(text(),'Send message')]";
	public String getSendSMSScreenLocator()
	{
		return  sendSMSScreenLocator;
	}
	
	public String callerTypeFilterLocatorOnCallRecordTab = "//select[contains(@id,'caller-type-filter')]";
	public String getCallerTypeFilterLocatorOnCallRecordTab()
	{
		return  callerTypeFilterLocatorOnCallRecordTab;
	}
	public String callTypeFilterLocatorOnCallRecordTab = "//select[contains(@id,'call-type-filter')]";
	public String getCallTypeFilterLocatorOnCallRecordTab()
	{
		return  callTypeFilterLocatorOnCallRecordTab;
	}
	
	public String callStatusFilterLocatorOnCallRecordTab = "//select[contains(@id,'call-status-filter')]";
	public String getCallStatusFilterLocatorOnCallRecordTab()
	{
		return  callStatusFilterLocatorOnCallRecordTab;
	}
	
	
	public String dateFilterLocatorOnCallRecordTab = "//div[contains(@class,'date-filter')]";
	public String getDateFilterLocatorOnCallRecordTab()
	{
		return  dateFilterLocatorOnCallRecordTab;
	}
	
	public String searchTextBoxLocatorOnCallRecordTab = "//input[contains(@id,'search')]";
	public String getSearchTextBoxFilterLocatorOnCallRecordTab()
	{
		return  searchTextBoxLocatorOnCallRecordTab;
	}
	
	public String searchButtonLocatorOnCallRecordTab = "//button[contains(text(),'Search')]";
	public String getSearchButtonLocatorOnCallRecordTab()
	{
		return  searchButtonLocatorOnCallRecordTab;
	}
	
	
	//public String addProfessionalButtonLocator ="//a[text()='Add Professional']";
	
	
	
	public String professionalNameLocator ="//tr[1]/td[2]/a[contains(@href,'details')]";
	public String getProfessionalNameLocator()
	{
		return professionalNameLocator;
	}
	
	public String timingsTabLocator ="//a[contains(@href,'timings')]";
	public String getTimingsTabLocator()
	{
		return timingsTabLocator;
	}
	
	public String statusFieldLocator ="//select[contains(@id,'status-select')]";
	public String getStatusFieldLocator()
	{
		return statusFieldLocator;
	}
	
	public String saveButtonOnTimingsTabLocator ="//a[contains(text(),'Save')]";
	public String getSaveButtonOnTimingsTabLocator()
	{
		return saveButtonOnTimingsTabLocator;
	}
	
	public String addRowButtonOnTimingsTabLocator ="//a[contains(text(),'Add Row')]";
	public String getAddRowButtonOnTimingsTabLocator()
	{
		return addRowButtonOnTimingsTabLocator;
	}
	
	public String removeRowButtonOnTimingsTabLocator ="//a[contains(text(),'Remove Row')]";
	public String getRemoveRowButtonOnTimingsTabLocator()
	{
		return removeRowButtonOnTimingsTabLocator;
	}
	
	public String fromTimeLocator ="//input[contains(@class,'week-time-input hasPtTimeSelect isPtTimeSelectActive')]";
	public String getFromTimeLocator()
	{
		return fromTimeLocator;
	}
	
	public String toTimeLocator ="//input[contains(@class,'week-time-input hasPtTimeSelect isPtTimeSelectActive')]";
	public String getToTimeLocator()
	{
		return toTimeLocator;
	}
	
	public String setButtonLocator ="ptTimeSelectSetButton";
	public String getSetButtonLocator()
	{
		return setButtonLocator;
	}
	
	public String selectdaysLocator ="//td[contains(@id,'week-1-6')]";
	public String getSelectDaysLocator()
	{
		return selectdaysLocator;
	}
	
	public String successMessageForSavedTimingsLocator ="//div[contains(@id,'ajaxMsg')]";
	public String getSuccessMessageForSavedTimingsLocator()
	{
		return successMessageForSavedTimingsLocator;
	}
	
	public String changeTimeTabLocator ="//a[contains(text(),'Change Time')]";
	public String getChangeTimeTabLocator()
	{
		return changeTimeTabLocator;
	}
	
	public String timeRangeFieldOnChangeTimeTabLocator ="//input[contains(@id,'dateRange')]";
	public String getTimeRangeFieldOnChangeTimeTabLocator()
	{
		return timeRangeFieldOnChangeTimeTabLocator;
	}
	
	public String monthSelectLocator ="//select[contains(@class,'ui-datepicker-month')]";
	public String getMonthSelectLocator()
	{
		return monthSelectLocator;
	}
	
	public String yearSelectLocator ="//select[contains(@class,'ui-datepicker-year')]";
	public String getYearSelectLocator()
	{
		return yearSelectLocator;
	}
	
	public String daySelectFromCalendarLocator ="//a[contains(@class,'ui-state-default')]";
	public String getDaySelectLocator()
	{
		return daySelectFromCalendarLocator;
	}
	
	public String doneButtonLocator ="//button[text()='Done']";
	public String getDoneButtonLocator()
	{
		return doneButtonLocator;
	}
	
	public String selectTypeOfAddTimeLocator = "//select[contains(@id,'profType')]";
	public String getSelectTypeOfAddTimeLocator()
	{
		return selectTypeOfAddTimeLocator;
	}
	
	public String startFromTimeLocator = "//input[contains(@id,'overtimefrom')]";
	
	public String endToTimeLocator = "//input[contains(@id,'overtimeto')]";
	
	public String addComment ="//textarea[contains(@id,'comment')]";
	
	public String saveDataButtonLocator = "//button[text()='Save Data']";
	
	public String addedTimeChangeTableLocator ="//table[contains(@class,'data-table')]";
	public String getAddedTimeChangeTableLocator()
	{
		return addedTimeChangeTableLocator;
	}
	
	public String leaveTabLocator ="//a[contains(@href,'leave']";
	public String getLeaveTabLocator()
	{
		return leaveTabLocator;
	}
	
	public String leaveFromFieldLocator ="//input[contains(@id,'leavefrom')]";
	public String getLeaveFromLocator()
	{
		return leaveFromFieldLocator;
	}
	
	public String leaveToFieldLocator ="//input[contains(@id,'leaveto')";
	public String getLeaveToLocator()
	{
		return leaveFromFieldLocator;
	}
	
	public String selectLeaveTypeLocator ="//select[contains(@name,'leaveType')]";
	public String getSelectLeaveTypeLocator()
	{
		return selectLeaveTypeLocator;
	}

	public String selectDateForLeaveLocator ="//td[contains(@data-handler,'selectDay')]";
	public String getSelectDateForLeaveLocator()
	{
		return selectDateForLeaveLocator;
	}
	
	public String locationTabLocator= "//a[contains(@href,'professionals/add/location']";
	public String getLocationTabLocator()
	{
		return locationTabLocator;
	}
	
	public String enterLocationFieldLocator ="//input[contains(@id,'location')]";
	
	public String locationButtonLocator = "//button[text()='Get Location']";
	
	public String saveButtonLocator ="//button[contains(text(),'Save')]";
	
	public String addedLocationLocator ="//table[contains(@class,'data-table loc-list-table')]";
	public String getAddedLocationLocator()
	{
		return addedLocationLocator;
	}
	//span[contains(text(),'Send message')]
	//functions//
	
	public void searchRecordByProfName()
	{
		driver.findElement(By.xpath(searchTextBoxOnProfessionalTabLocator)).sendKeys("test");
		driver.findElement(By.xpath(searchButtonOnProfessionalTabLocator)).click();
	}
	
	public void selectProfTimingOnProfessionalsTab()
	{
		
		if(!driver.findElement(By.xpath(profTimingCheckBoxOnProfessionalTabLocator)).isSelected())
			{
			driver.findElement(By.xpath(profTimingCheckBoxOnProfessionalTabLocator)).click();
			}
	}
	public void unselectProfTimingOnProfessionalsTab()
	{
		
		if(driver.findElement(By.xpath(profTimingCheckBoxOnProfessionalTabLocator)).isSelected())
			{
			driver.findElement(By.xpath(profTimingCheckBoxOnProfessionalTabLocator)).click();
			}
	}
	
	public void openTravelReportTab()
	{
		driver.findElement(By.xpath(travelreportTabLocator)).click();
	}
	
	public void openProfessionalTrackerTab()
	{
		driver.findElement(By.xpath(professionaltrackerTabLocator)).click();
	}
	
	public void openMyTeamTab()
	{
		driver.findElement(By.xpath(myteamTabLocator)).click();
	}
	
	public void openCallRecordTab()
	{
		driver.findElement(By.xpath(callRecordTabLocator)).click();
	}
	
	public void clickOnEditButton()
	{
		driver.findElement(By.xpath(editButtonLocatorOnMyTeamTab)).click();
	}
	
	public void clickonSendSMSButton()
	{
		driver.findElement(By.xpath(sendSMSButtonLocatorOnMyTeamTab)).click();
	}
	
	public void clickOnProfessionalName()
	{
		driver.findElement(By.xpath(addedProfessionalNameLocator)).click();
	}
	
	public void openTimingsTab()
	{
		driver.findElement(By.xpath(timingsTabLocator)).click();
	}
	
	public void addWorkTimings()
	{
		Select status = new Select(driver.findElement(By.xpath(statusFieldLocator)));
		status.selectByVisibleText("Available");
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(fromTimeLocator)).sendKeys("9:30AM");
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(toTimeLocator)).sendKeys("6:00PM");
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(selectdaysLocator)).click();
		GlobalUtil.wait(5);
		driver.findElement(By.xpath(saveButtonOnTimingsTabLocator));
		GlobalUtil.wait(5);
		
	}
	
	public void openLeaveTab()
	{
		driver.findElement(By.xpath(leaveTabLocator)).click();
	}
	
	
	public void addLeave()
	{
		openLeaveTab();
		driver.findElement(By.xpath(leaveFromFieldLocator)).click();
		Select frommonth = new Select(driver.findElement(By.xpath(monthSelectLocator)));
		frommonth.selectByVisibleText("Nov");
		driver.findElement(By.xpath(selectDateForLeaveLocator)).sendKeys("20");
		Select tomonth = new Select(driver.findElement(By.xpath(monthSelectLocator)));
		tomonth.selectByVisibleText("Nov");
		driver.findElement(By.xpath(leaveToFieldLocator)).sendKeys("23");
		Select leaveType = new Select(driver.findElement(By.xpath(selectLeaveTypeLocator)));
		leaveType.selectByVisibleText("Leave");
		driver.findElement(By.xpath(saveDataButtonLocator)).click();
	}
	
	public void addLocation()
	{
		driver.findElement(By.xpath(locationTabLocator)).click();
		driver.findElement(By.xpath(enterLocationFieldLocator)).sendKeys("Bangalore");
		driver.findElement(By.xpath(locationButtonLocator)).click();
		driver.findElement(By.xpath(saveButtonLocator)).click();
	}
	
	public void addOverTime(String fromTime, String toTime)
	{
		driver.findElement(By.xpath(changeTimeTabLocator)).click();
		driver.findElement(By.xpath(selectdaysLocator)).click();
		driver.findElement(By.xpath(fromTimeLocator)).sendKeys(fromTime);
		driver.findElement(By.xpath(toTimeLocator)).sendKeys(toTime);
		Select selectProfType = new Select(driver.findElement(By.xpath(selectTypeOfAddTimeLocator)));
		selectProfType.selectByVisibleText("Over Time");
		driver.findElement(By.xpath(saveDataButtonLocator)).click();
		
	}
	
	public void addChangeTime(String fromTime, String toTime)
	{
		driver.findElement(By.xpath(changeTimeTabLocator)).click();
		driver.findElement(By.xpath(selectdaysLocator)).click();
		driver.findElement(By.xpath(fromTimeLocator)).sendKeys(fromTime);
		driver.findElement(By.xpath(toTimeLocator)).sendKeys(toTime);
		Select selectProfType = new Select(driver.findElement(By.xpath(selectTypeOfAddTimeLocator)));
		selectProfType.selectByVisibleText("Change Time");
		driver.findElement(By.xpath(saveDataButtonLocator)).click();
	}
}
