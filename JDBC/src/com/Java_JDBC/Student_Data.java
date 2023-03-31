package com.Java_JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Student_Data {

	public static void main(String[] args) throws Exception {
		//JDBC Driver Name and Database URL	
		
		  final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		  final String DB_URL = "jdbc:mysql://localhost/nimbletech";
		  
		  //Database Credentials
		  final String USER = "sonalin";
		  final String PASSWORD = "sonalin!@34";
		  
		  //Assign values on con and stmt object;
		  Connection con = null;
		  Statement stmt = null;
		  
		  //Register JDBC Driver
		  Class.forName(JDBC_DRIVER);
			
		  //Open a connection
		  System.out.println("Connecting to database...................\n");
		  con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		  
		  //Execute a query
		  System.out.println("Creating Statement......");
		  stmt = con.createStatement();
		  String sql;
		  sql = "SELECT * FROM `student` where age=19";
		  ResultSet rs = stmt.executeQuery(sql);
		  
		  //Extract data from Resultset
		  while(rs.next()){
			  //Retrive by column name
			  int roll= rs.getInt("roll");
			  String Name = rs.getString("name");
			  int age = rs.getInt("age");
			  
			  //Display values
			  System.out.println("Student Roll:"+roll+" Name:"+Name+" Age: "+age);
		  }
		  
		  rs.close();
		  stmt.close();
		  con.close();

		  if(stmt!=null){
			  stmt.close();
		  }
		  
		  if(con!=null){
			  con.close();
		  }
		  System.out.println("GOOD BYE...........");
		}

}
