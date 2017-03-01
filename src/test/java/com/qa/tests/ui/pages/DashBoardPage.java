package com.qa.tests.ui.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.tests.ui.common.BasePage;

public class DashBoardPage extends BasePage {

	public DashBoardPage(WebDriver driver) {
		
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String apptSummaryTabLocator = "//a[text()='Appt Summary']";
	public String getApptSummaryTabLocator()
	{
		return apptSummaryTabLocator;
	}

	public String apptReportTabLocator = "//a[text()='Appt Report']";
	public String getApptReportTabLocator()
	{
		return apptReportTabLocator;
	}
	
	public String patientReportTabLocator = "//a[text()='Patient Report']";
	public String getPatientReportTabLocator()
	{
		return patientReportTabLocator;
	}
	
	
	public String revByReferrerServiceTabLocator = "//a[text()='Rev By Referrer/Services']";
	public String getRevByReferrerServiceTabLocator()
	{
		return revByReferrerServiceTabLocator;
	}
	

	public String revByClinicianTabLocator = "//a[text()='Rev By Clinician']";
	public String getRevByClinicianTabLocator()
	{
		return revByClinicianTabLocator;
	}
	
	public String paymentCollectionTabLocator = "//a[text()='Payment Collection']";
	public String getPaymentCollectionTabLocator()
	{
		return paymentCollectionTabLocator;
	}
	
	public String pendingPaymentTabLocator = "//a[text()='Pending Payment']";
	public String getPendingPaymentTabLocator()
	{
		return pendingPaymentTabLocator;
	}
	
	public String cancellationReportTabLocator = "//a[text()='Cancellation Report']";
	public String getCancellationReportTabLocator()
	{
		return cancellationReportTabLocator;
	}
	
	public String callReportTabLocator = "//a[text()='Call Report']";
	public String getCallReportTabLocator()
	{
		return callReportTabLocator;
	}
	
	public String dashboardAreaFilterLocator = "//select[contains(@id, 'filter-by-city')]";
	public String getDashboardAreaFilterLocator()
	{
		return dashboardAreaFilterLocator;
	}
	
	public String dashboardReferredByFilterLocator = "//select[contains(@id, 'referredBy-id')]";
	public String getDashboardReferredByFilterLocator()
	{
		return dashboardReferredByFilterLocator;
	}
	
	public String dashboardReferredTypeFilterLocator = "//select[contains(@id, 'referrerType-id')]";
	public String getDashboardReferredTypeFilterLocator()
	{
		return dashboardReferredTypeFilterLocator;
	}
	
	public String dashboardStatusFilterLocator = "//select[contains(@id, 'filter-by-status')]";
	public String getDashboardStatusFilterLocator()
	{
		return dashboardStatusFilterLocator;
	}
	
	
	public String dashboardAndroidFilterLocator = "//select[contains(@id, 'filter-by-android')]";
	public String getDashboardAndroidFilterLocator()
	{
		return dashboardAndroidFilterLocator;
	}
	

	public String showDateColumnLocator = "//input[contains(@id,'date')]";
	public String getShowDateColumnLocator()
	{
		return showDateColumnLocator;
	}
	
	public String showAreaColumnLocator = "//input[contains(@id,'city')]";
	public String getShowAreaColumnLocator()
	{
		return showAreaColumnLocator;
	}
	
	public String showClinicianColumnLocator = "//input[contains(@id,'clinicianName')]";
	public String getShowClinicianColumnLocator()
	{
		return showClinicianColumnLocator;
	}
	
	public String showReferredByColumnLocator = "//input[contains(@id,'referredBy')]";
	public String getShowReferredByColumnLocator()
	{
		return showReferredByColumnLocator;
	}
	
	public String showReferredTypeColumnLocator = "//input[contains(@id,'referrerType')]";
	public String getShowReferredTypeColumnLocator()
	{
		return showReferredTypeColumnLocator;
	}
	
	public String showStatusColumnLocator = "//input[contains(@id,'status')]";
	public String getShowStatusColumnLocator()
	{
		return showStatusColumnLocator;
	}
	
	public String showReferrerDoctorColumnLocator = "//input[contains(@id,'referrerDoctor')]";
	public String getShowReferrerDoctorColumnLocator()
	{
		return showReferrerDoctorColumnLocator;
	}
	
	public String dateFilterLocator = "//div[contains(@class,'date-filter')]";
	public String getDateFilterLocator()
	{
		return dateFilterLocator;
	}
	
	public String downloadCSVLocator = "//input[contains(@name,'downloadCSV')]";
	public String getDownloadCSVLocator()
	{
		return downloadCSVLocator;
	}
	
	public String lastUpdatedDateLocator = "";
	public String getLastUpdatedDateLocator()
	{
		return lastUpdatedDateLocator;
	}
	
	
	public String apptReportTabAreaFilterLocator = "//select[contains(@id,'report-filter-by-city')]";
	public String getApptReportTabAreaFilterLocator()
	{
		return apptReportTabAreaFilterLocator;
	}
	
	
	public String apptReportTabReferrerNameFilterLocator = "//select[contains(@id,'report-filter-by-referrer-name')]";
	public String getApptReportTabReferrerNameFilterLocator()
	{
		return apptReportTabReferrerNameFilterLocator;
	}
	
	public String apptReportTabReferrerTypeFilterLocator = "//select[contains(@id,'report-filter-by-referrer-type')]";
	public String getApptReportTabReferrerTypeFilterLocator()
	{
		return apptReportTabReferrerTypeFilterLocator;
	}
	
	

	public String apptReportTabStatusFilterLocator = "//select[contains(@id,'filter-by-status')]";
	public String getApptReportTabStatusFilterLocator()
	{
		return apptReportTabStatusFilterLocator;
	}
	
	
	public String patientReportTabServiceFilterLocator = "//select[contains(@id,'patients-service-filter')]";
	public String getPatientReportTabServiceFilterLocator()
	{
		return patientReportTabServiceFilterLocator;
	}
	
	
	public String patientReportTabPackageFilterLocator = "//select[contains(@id,'patients-package-filter')]";
	public String getPatientReportTabPackageFilterLocator()
	{
		return patientReportTabPackageFilterLocator;
	}
	
	
	public String revByReferrerServiceTabAreaFilterLocator = "//select[contains(@id,'area-id-for-revenueByReferrers')]";
	public String getRevByReferrerServiceTabAreaFilterLocator()
	{
		return revByReferrerServiceTabAreaFilterLocator;
	}
	
	
	public String revByReferrerServiceTabReferredByFilterLocator = "//select[contains(@id,'referredBy-id-for-revenueByReferrers')]";
	public String getRevByReferrerServiceTabReferredByFilterLocator()
	{
		return revByReferrerServiceTabReferredByFilterLocator;
	}
	
	public String revByReferrerServiceTabReferrerTypeFilterLocator = "//select[contains(@id,'referrerType-id-for-revenueByReferrers')]";
	public String getRevByReferrerServiceTabReferrerTypeFilterLocator()
	{
		return revByReferrerServiceTabReferrerTypeFilterLocator;
	}
	
	public String revByReferrerServiceTabClinicianTypeFilterLocator = "//select[contains(@id,'clinicianType-id-for-revenueByReferrers')]";
	public String getRevByReferrerServiceTabClinicianTypeFilterLocator()
	{
		return revByReferrerServiceTabClinicianTypeFilterLocator;
	}
	
	public String showColumnClinicianTypeLocator = "//input[contains(@id,'clinicianType')]";
	public String getShowColumnClinicianTypeLocator()
	{
		return showColumnClinicianTypeLocator;
	}
	
	
	public String revByClinicianTabAreaFilterLocator = "//select[contains(@id,'area-id-for-revenueByClinician')]";
	public String getRevByClinicianTabAreaFilterLocator()
	{
		return revByClinicianTabAreaFilterLocator;
	}
	
	public String showColumnPatientLocator = "//input[contains(@id,'patientName')]";
	public String getShowColumnPatientLocator()
	{
		return showColumnPatientLocator;
	}
	
	public String paymentCollectionTabAreaFilterLocator = "//select[contains(@id,'area-id-for-clinicianPayment')]";
	public String getPaymentCollectionTabAreaFilterLocator()
	{
		return paymentCollectionTabAreaFilterLocator;
	}
	
	
	
	public String cancellationReportTabResponsibleFilterLocator = "//select[contains(@id,'cancel-responsible-filter')]";
	public String getCancellationReportTabResponsibleFilterLocator()
	{
		return cancellationReportTabResponsibleFilterLocator;
	}
	
	public String cancellationReportTabReasonFilterLocator = "//select[contains(@id,'cancel-reason-filter')]";
	public String getCancellationReportTabReasonFilterLocator()
	{
		return cancellationReportTabReasonFilterLocator;
	}
	
	public String cancellationReportTabClinicianTypeFilterLocator = "//select[contains(@id,'report-filter-by-clinician-type')]";
	public String getCancellationReportTabClinicianTypeFilterLocator()
	{
		return cancellationReportTabClinicianTypeFilterLocator;
	}
	
	
	public String callReportTabCallStatusFilterLocator = "//select[contains(@id,'report-filter-by-call-status')]";
	public String getCallReportTabCallStatusFilterLocator()
	{
		return callReportTabCallStatusFilterLocator;
	}
	
	public String callReportTabClinicianTypeFilterLocator = "//select[contains(@id,'report-filter-by-user-type')]";
	public String getCallReportTabClinicianTypeFilterLocator()
	{
		return callReportTabClinicianTypeFilterLocator;
	}
	
	public String callReportTabViewAllCallsLocator = "//input[contains(@id,'view_all')]";
	public String getCallReportTabViewAllCallsLocator()
	{
		return callReportTabViewAllCallsLocator;
	}
	
	public String callReportTabViewAllIncomingsLocator = "//input[contains(@id,'view_incomings')]";
	public String getCallReportTabViewAllIncomingsLocator()
	{
		return callReportTabViewAllIncomingsLocator;
	}
	
	public String callReportTabViewAllOutgoingsLocator = "//input[contains(@id,'view_outgoings')]";
	public String getCallReportTabViewAllOutgoingsLocator()
	{
		return callReportTabViewAllOutgoingsLocator;
	}
	
	
	public String areaNameOnTableApptSummaryTab = "//th[contains(text(),'Area Name')]";
	public String getAreaNameOnTableApptSummaryTab()
	{
		return areaNameOnTableApptSummaryTab;
	}
	
	public String reportDateColumnOnTableApptSummaryTab = "//th[contains(text(),'Report Date')]";
	public String getReportDateColumnOnTableApptSummaryTab()
	{
		return reportDateColumnOnTableApptSummaryTab;
	}
	
	public String clinicianColumnOnTableApptSummaryTab = "//th[contains(text(),'Clinician Name')]";
	public String getClinicianColumnOnTableApptSummaryTab()
	{
		return clinicianColumnOnTableApptSummaryTab;
	}
	
	public String clinicianTypeColumnOnTableApptSummaryTab = "//th[contains(text(),'Clinician Type')]";
	public String getClinicianTypeColumnOnTableApptSummaryTab()
	{
		return clinicianTypeColumnOnTableApptSummaryTab;
	}
	
	public String patientColumnOnTable = "//th[contains(text(),'Patient')]";
	public String getPatientColumnOnTable()
	{
		return patientColumnOnTable;
	}
	
	public String referredByColumnOnTableApptSummaryTab = "//th[contains(text(),'Referred By')]";
	public String getRefferredByColumnOnTableApptSummaryTab()
	{
		return referredByColumnOnTableApptSummaryTab;
	}
	
	public String referrerTypeColumnOnTableApptSummaryTab = "//th[contains(text(),'Referrer Type')]";
	public String getReferrerTypeColumnOnTableApptSummaryTab()
	{
		return referrerTypeColumnOnTableApptSummaryTab;
	}
	
	public String statusColumnOnTableApptSummaryTab = "//th[contains(text(),'Status')]";
	public String getStatusColumnOnTableApptSummaryTab()
	{
		return statusColumnOnTableApptSummaryTab;
	}
	
	
	public String referrerDoctorColumnOnTableApptSummaryTab = "//th[contains(text(),'Referrer Doctor')]";
	public String getReferrerDoctorColumnOnTableApptSummaryTab()
	{
		return referrerDoctorColumnOnTableApptSummaryTab;
	}
	
	public void onClickPaymentCollectionTab()
	{
		driver.findElement(By.xpath(paymentCollectionTabLocator)).click();
	}
	
	public void onClickShowColumnPateintOption()
	{
		driver.findElement(By.xpath(showColumnPatientLocator)).click();
	}
	
	public void onClickRevByClinicianTab()
	{
		driver.findElement(By.xpath(revByClinicianTabLocator)).click();
	}

	public void onClickRevByReferrerTab()
	{
		driver.findElement(By.xpath(revByClinicianTabLocator)).click();
	}
	
	public void onClickApptSummaryTab()
	{
		driver.findElement(By.xpath(apptSummaryTabLocator)).click();
	}
	
	public void onClickCallRecordTab()
	{
		//driver.findElement(By.xpath(call)).click();
	}
	
	public void onClickCallReportTab()
	{
		driver.findElement(By.xpath(callReportTabLocator)).click();
	}
	
	

}
