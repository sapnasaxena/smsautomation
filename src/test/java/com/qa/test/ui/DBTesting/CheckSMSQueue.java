package com.qa.test.ui.DBTesting;
import java.sql.*;
public class CheckSMSQueue {
	
	   // JDBC driver name and database URL 
	  // static final String DB_URL = "jdbc:mysql:https://stageops.portea.com/adminer.php?server=db.portea.internal&username=porteauser&db=portea_crm";
	   static final String url = "jdbc:mysql://portea-test.c6wevl4fx9j5.ap-southeast-1.rds.amazonaws.com:3306/portea_crm?user=toor&password=23NP6w68P353";
	   //static final String HOST_Name ="db.portea.internal";

	   //  Database credentials
	   static final String DB_USER = "porteauser";
	   static final String DB_PASS = "p0rteaCrm2013";
	   static final String DB_NAME="portea_crm";
	 
	   
	   public static void main(String[] args) {
		   
		   CheckSMSQueue chk = new CheckSMSQueue();
		   String result = null;
		   chk.fetchSmsQueue();
		   
	   }
	
	   public static void fetchSmsQueue()
	   {
		   
		   Connection conn = null;
		   Statement stmt = null;
		   try{
			      Class.forName("com.mysql.jdbc.Driver");
			      System.out.println("Connecting to a selected database...");
			      conn = DriverManager.getConnection(url);
			      System.out.println("Connected database successfully...");
			      System.out.println("Creating statement...");
			      stmt = conn.createStatement();

			      String sql = "SELECT mobile_number,message,last_updated_on,brand_id FROM smsen_sms_record WHERE scheduled_type='Payment' and mobile_number=918553013244 ORDER BY id DESC";
			      ResultSet rs = stmt.executeQuery(sql);
			     while(rs.next()){
//			     // System.out.println(rs.getString("id"));
//			      //System.out.println(rs.getString("correlation_id"));
//			      //System.out.println(rs.getString("country_code"));
//			     //System.out.println(rs.getString("gateway_status"));
			      System.out.println(rs.getString("last_updated_on"));
			      System.out.println(rs.getString("message"));
			      System.out.println(rs.getString("mobile_number"));
			      System.out.println(rs.getString("receiver_type"));
			      System.out.println(rs.getString("scheduled_type"));
			      System.out.println(rs.getString("primary_processing_status"));
			      System.out.println(rs.getString("secondary_processing_status"));
			      System.out.println(rs.getString("status_reason"));
			      System.out.println(rs.getString("brand_id"));
			      System.out.println(rs.getString("gateway_id"));
			      System.out.println(rs.getString("user_id"));
			     }
			      rs.close();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			         if(conn!=null)
			            conn=null;
			      }
			   System.out.println("Goodbye!");
			}//end main
	   }

	



