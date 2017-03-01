package com.qa.test.ui.DBTesting;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SMSQueueInsertRecord {

	static Connection con = null;
	
    private static Statement stmt;

    public static String DB_URL = "jdbc:mysql://stageops.portea.com/adminer.php?server=db.portea.internal&db=portea_crm";   
    //  Database credentials
    public static String DB_USER = "porteauser";
    public static String DB_PASSWORD = "p0rteaCrm2013";
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
	      
	       public static void main(String[] args) {
	    	   
	       Connection conn = null;
	       try{
	          //STEP 2: Register JDBC driver
	          Class.forName(JDBC_DRIVER);
	          //STEP 3: Open a connection
	          System.out.println("Connecting to a selected database...");
	          conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
	          System.out.println("Connected database successfully...");
	       }catch(SQLException se){
	          //Handle errors for JDBC
	          se.printStackTrace();
	       }catch(Exception e){
	          //Handle errors for Class.forName
	          e.printStackTrace();
	       }
	       finally{
	          //finally block used to close resources
          try{
	             if(conn!=null)
	                conn.close();
          }catch(SQLException se){
             se.printStackTrace();
          }//end finally try
       //end try
	       System.out.println("Goodbye!");
	    }//end main
	       }
	       }//end JDBCExample


