package com.Java_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Record {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
		  sql = "INSERT INTO `student`(`name`, `age`, `gender`, `address`) VALUES ('Ram','23','Male','RS-78/W')";
		  
		  stmt.executeUpdate(sql);
		  System.out.println("Record Inserted Successfully....");
		  
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
