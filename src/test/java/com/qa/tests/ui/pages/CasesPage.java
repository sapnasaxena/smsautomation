package com.qa.tests.ui.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.tests.ui.common.BasePage;

public class CasesPage extends BasePage {

	public CasesPage(WebDriver driver) {
		
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String casesTabLocator ="//a[contains(@href,'/cases/all')]";
	public String getCasesTabLocator()
	{
		return casesTabLocator;
	}
	
	public String caseFileTabLocator = "//a[contains(@href,'/cases/casesFiles')]";
	public String getCasefileTabLocator()
	{
		return caseFileTabLocator;
	}
	
	public String documentsTabLocator = "//a[contains(@href,'/cases/documents')]";
	public String getDocumentTabLocator()
	{
		return documentsTabLocator;
	}
	
	public String searchTabLocator = "//a[contains(@href,'/cases/caseSearch')] ";
	public String getSearchTabLocator()
	{
		return searchTabLocator;
	}
		
	
	public String ratingReportsTabLocator = " //a[contains(@href,'/cases/reports')]";
	public String getRatingReportTabLocator()
	{
		return ratingReportsTabLocator;
	}

	
	public String casesReportTabLocator = "//a[contains(@href,'/cases/casesReport')] ";
	public String getCasesReportTabLocator()
	{
		return casesReportTabLocator;
	}
	
	
	public String dateFilterLocator = "//div[contains(@class,'date-filter')]";
	public String getDateFilterLocator()
	{
		return dateFilterLocator;
	}
	
	public String statusfilterLocator = "//select[contains(@id,'case-status-filter')]";
	public String getStatusFilterLocator()
	{
		return statusfilterLocator;
	}
	
	public String specialityfilterLocator = "//select[contains(@id,'speciality-filter')]";
	public String getSpecialityFilterLocator()
	{
		return specialityfilterLocator;
	}
	
	public String searchTextBoxLocator = "//input[contains(@id,'search')]";
	public String getSearchTextBoxLocator()
	{
		return searchTextBoxLocator;
	}
	
	public String searchButtonLocator = "//button[contains(text(),'Search')]";
	public String getSearchButtonLocator()
	{
		return searchButtonLocator;
	}
	
	public String idColumnLocator = "//td[1]";
	public String getidColumnLocator()
	{
		return idColumnLocator;
	}
	
	
	public String patientidColumnLocator = "//td[3]";
	public String getpatientidColumnLocator()
	{
		return patientidColumnLocator;
	}
	
	
	public String patientNameColumnLocator = "//td[4]";
	public String getPatientNameColumnLocator()
	{
		return patientNameColumnLocator;
	}
	
	public String todayDateFilterLocator = "//a[contains(text(),'Today')]";
	public String gettodayDateFilterLocator()
	{
		return todayDateFilterLocator;
	}
	
	public String allDateFilterLocator = "//a[contains(text(),'All')]";
	public String getAllDateFilterLocator()
	{
		return allDateFilterLocator;
	}
	
	public String tomorrowDateFilterLocator = "//a[contains(text(),'Tomorrow')]";
	public String getTomorrowDateFilterLocator()
	{
		return tomorrowDateFilterLocator;
	}
	
	public String yesterdayDateFilterLocator = "//a[contains(text(),'Yesterday')]";
	public String getYesterdayDateFilterLocator()
	{
		return yesterdayDateFilterLocator;
	}
	
	public String lastsevendaysDateFilterLocator = "//a[contains(text(),'Last 7 days')]";
	public String getLastSevenDaysDateFilterLocator()
	{
		return lastsevendaysDateFilterLocator;
	}
	
	
	public String upcomingDateFilterLocator = "//a[contains(text(),'Upcoming')]";
	public String getUpcomingDateFilterLocator()
	{
		return upcomingDateFilterLocator;
	}
	
	
	public void searchPatientByName(String patientName)
	{
		System.out.println("Enter patient name");
		driver.findElement(By.xpath(searchTextBoxLocator)).sendKeys(patientName);
		
		System.out.println("Click on Search button");
		driver.findElement(By.xpath(searchButtonLocator)).click();
		System.out.println("DEBUG: Check Patient details is visible on Cases tab");
		if(patientName.equals(patientNameColumnLocator))
		{
			System.out.println("Patient details are visible..");
		}
		else
		{
			System.out.println("Patient do not have any case");
		}

    }
	
	
	public void searchPatientById(String patientId)
	{
		System.out.println("Enter patient name");
		driver.findElement(By.xpath(searchTextBoxLocator)).sendKeys(patientId);
		
		System.out.println("Click on Search button");
		driver.findElement(By.xpath(searchButtonLocator)).click();
		System.out.println("DEBUG: Check Patient details is visible on Cases tab");
		if(patientId.equals(patientidColumnLocator))
		{
			System.out.println("Patient case details are visible..");
		}
		else
		{
			System.out.println("Patient do not have any case");
		}

    }
	
	public void searchCasesbyAllDate()
	{
		System.out.println("DEBUG: Search cases by using date filter");
		System.out.println("click on date filter");
		driver.findElement(By.xpath(dateFilterLocator)).click();
		System.out.println("Select 'All' option from date filter");
		driver.findElement(By.xpath(allDateFilterLocator)).click();
	}
	
	public void searchCasesbyTodayDate()
	{
		System.out.println("DEBUG: Search cases by using date filter");
		System.out.println("click on date filter");
		driver.findElement(By.xpath(dateFilterLocator)).click();
		System.out.println("Select 'Today' option from date filter");
		driver.findElement(By.xpath(todayDateFilterLocator)).click();
	}
	
	public void searchCasesbyYesterdaysDate()
	{
		System.out.println("DEBUG: Search cases by using date filter");
		System.out.println("click on date filter");
		driver.findElement(By.xpath(dateFilterLocator)).click();
		System.out.println("Select 'Yesterday' option from date filter");
		driver.findElement(By.xpath(yesterdayDateFilterLocator)).click();
	}
	
	public void searchCasesbyTomorrowDate()
	{
		System.out.println("DEBUG: Search cases by using date filter");
		System.out.println("click on date filter");
		driver.findElement(By.xpath(dateFilterLocator)).click();
		System.out.println("Select 'Tomorrow' option from date filter");
		driver.findElement(By.xpath(tomorrowDateFilterLocator)).click();
	}
	
}
