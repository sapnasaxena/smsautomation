package com.sms.DBTesting;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DBConnector {

	    private static String dbusername;
	    private static String dbpassword;

	    private static String databaseURLSTAGE= "jdbc:mysql://portea-test.c6wevl4fx9j5.ap-southeast-1.rds.amazonaws.com:3306/portea_crm?user=toor&password=23NP6w68P353";
	  


	    public static String executeSQLQuery(String sqlQuery) {
	        String connectionUrl="";
	        Connection connection;
	        String resultValue = "";
	        ResultSet rs;

	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        }catch(ClassNotFoundException e) {
	            e.printStackTrace();
	        }

	        try {
	            connection = DriverManager.getConnection(databaseURLSTAGE);
	            if(connection!=null) {
	                System.out.println("Connected to the database...");
	            }else {
	                System.out.println("Database connection failed to stage Environment");
	            }
	            Statement stmt = connection.createStatement();
	            rs=stmt.executeQuery(sqlQuery);

	            try {
	                while(rs.next()){
	                    resultValue = rs.getString(1).toString();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            catch (NullPointerException err) {
	                System.out.println("No Records obtained for this specific query");
	                err.printStackTrace();
	            }
	            connection.close();

	        }catch(SQLException sqlEx) {
	            System.out.println( "SQL Exception:" +sqlEx.getStackTrace());
	        }
	        return resultValue;
	    }


	    public static ArrayList<String> executeSQLQuery_List(String sqlQuery, String colLabel) {
	        String connectionUrl="";
	        Connection connection;
	        ArrayList<String> resultValue = new ArrayList<String>();
	        ResultSet resultSet;

	        

	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        }catch(ClassNotFoundException e) {
	            e.printStackTrace();
	        }

	        try {
	            connection = DriverManager.getConnection(databaseURLSTAGE);
	            if(connection!=null) {
	                System.out.println("Connected to the database");
	            }else {
	                System.out.println("Failed to connect to stage database");
	            }
	            Statement statement = connection.createStatement();
	            resultSet=statement.executeQuery(sqlQuery);
	            System.out.println("Sent SMS:" +resultSet.getString("message"));
	            //System.out.println("Delivery Status:" +resultSet.getString("delivery_status"));
	           

	            try {
	                while(resultSet.next()){
	                    int columnCount = resultSet.getMetaData().getColumnCount();
	                    StringBuilder stringBuilder = new StringBuilder();
	                    for(int iCounter=1;iCounter<=columnCount; iCounter++){
	                        stringBuilder.append(resultSet.getString(iCounter).trim()+" ");
	                    }
	                    String reqValue = stringBuilder.substring(0, stringBuilder.length()-1);
	                    resultValue.add(reqValue);
	                    resultSet.getString(colLabel);
	                    
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            catch (NullPointerException ex) {
	                System.out.println("No Records found for this specific query" +ex.getStackTrace());
	            }
	            finally {
	                if (connection != null) {
	                    try {
	                        connection.close();
	                    } catch (SQLException ex) {
	                        System.out.println( "SQL Exception:" +ex.getStackTrace());
	                    }
	                }
	            }

	        }catch(SQLException sqlEx) {
	            System.out.println( "SQL Exception:" +sqlEx.getStackTrace());
	        }
	        return resultValue;
	    }
	}


