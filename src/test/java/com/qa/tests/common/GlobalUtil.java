package com.qa.tests.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import org.apache.xerces.impl.dv.xs.DateDV;
//import org.apache.xerces.impl.dv.xs.DateTimeDV;

public class GlobalUtil {
	
	public static final int ShortInterval = 3;
	public static final int LongInterval = 30;
	public static final int MinuteInterval = 1;
	public static final int StandardInterval = 10;
	public static final String PLACEHOLDER = "<PLACE_HOLDER>";
	
	
	/*wait for time*/
	
	public static void wait(int secs)
    {
        try {
            Thread.sleep(secs * 1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	/*Generates a sixteen character long random string */
	
	public static String generateRandomString(){
		return Long.toHexString(Double.doubleToLongBits(Math.random()));
	}
	
	
	/*Generate random numbers*/
	public static String getRandomNumber(int length)
	{
		Random rndNumber =  new Random();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= length; i++){
            int number = rndNumber.nextInt((9-1)) + 1;
            sb.append((char)(number));
        }
        System.out.println(sb);
        return sb.toString();
	}
	
	public static String getRandomName(int length){
       Random rndNumber =  new Random();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= length; i++){
            int number = rndNumber.nextInt((122-97)) + 97;
            sb.append((char)(number));
        }
        System.out.println(sb);
        return sb.toString();
    }


		/*public static String getCurrentDate()
		{
			 Calendar currentDate = Calendar.getInstance();
			  SimpleDateFormat formatter= 
			  new SimpleDateFormat("yyyy/MMM/dd");
			  String dateNow = formatter.format(currentDate.getTime());
			  System.out.println("Now the date is :=>  " + dateNow);
			  return dateNow;
			 
		}*/
		
		public static String getCurrentDate()
		{
			 return new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		
		}
		
		public static String getCreatedDateForDB()
		{
			 return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		
		}
		
		public static String getCurrentDateInDD()
		{
			 Calendar cal=Calendar.getInstance();
			  SimpleDateFormat month_date = new SimpleDateFormat("DD");
			  String date = month_date.format(cal.getTime());
			  return date;
		}
		
		
		
		public static String getTomorrowsDate()
		{
			Calendar c = Calendar.getInstance();
			
			c.setTime(c.getTime()); 
			c.add(Calendar.DATE, 1);
			return String.valueOf(c.get(Calendar.DATE));
		}
		
		@SuppressWarnings("unused")
		public void getTodaysDate()
		{
			Calendar javaCalendar = null;
			 String currentDate = "";

			javaCalendar = Calendar.getInstance();

			currentDate = javaCalendar.get(Calendar.DATE) + "/" + (javaCalendar.get(Calendar.MONTH) + 1) + "/" + javaCalendar.get(Calendar.YEAR);
		}
		
		public static String getCurrentDateWithTwoHrsBeforeTime(){
			Calendar cal = Calendar.getInstance();    
			cal.add(Calendar.DATE, 0 );
			cal.add(Calendar.HOUR, -2);
			cal.add(Calendar.MINUTE, 0);
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm");
			String convertedDate= dateFormat.format(cal.getTime());    
			//System.out.println("Date increase by one.."+convertedDate);
			return convertedDate;
		}
		
		public static String getTwoHrsAfterTime(){
			Calendar cal = Calendar.getInstance();    
			//cal.add(Calendar.DATE, 0 );
			cal.add(Calendar.HOUR, 2);
			//cal.add(Calendar.MINUTE, +30);
			SimpleDateFormat dateFormat = new SimpleDateFormat("h:'"+15+" 'a");
			String convertedDate= dateFormat.format(cal.getTime());    
			//System.out.println("Date increase by one.."+convertedDate);
			return convertedDate;
		}
		
		public static String getYesterdayDate(){
			Calendar cal = Calendar.getInstance();    
			cal.add(Calendar.DATE, -1 );
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
			String convertedDate= dateFormat.format(cal.getTime());    
			//System.out.println("Date increase by one.."+convertedDate);
			return convertedDate;
		}
		
		
		public static void forceVisibility(WebDriver driver, WebElement element) {
		    try {
		        // Standard means of setting visibility
		        executeJavascript(driver, "arguments[0].style.height='auto'; arguments[0].style.display='block'; arguments[0].style.visibility='visible';", element);

		    } catch (Exception e) {
		      
		        throw e;
		    }
		}
		public static Object executeJavascript(WebDriver driver, String script, Object... arguments) {
		    try {
		        return ((JavascriptExecutor) driver).executeScript(script, arguments);
		    } catch (Exception e) {
		    	return null;	     
		    }
		}
		
	}
	 
	 


