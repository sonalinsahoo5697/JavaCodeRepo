package com.Java_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_Table {

	public static void main(String[] args) throws Exception{
		
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
		  sql = "CREATE TABLE student\r\n"
		  		+ "( \r\n"
		  		+ "    roll int(10) AUTO_INCREMENT PRIMARY KEY,\r\n"
		  		+ "    name CHARACTER(30),\r\n"
		  		+ "    age int(4),\r\n"
		  		+ "    gender CHARACTER(8),\r\n"
		  		+ "    address CHARACTER(100)\r\n"
		  		+ ")";
		  
		  stmt.executeUpdate(sql);
		  System.out.println("Table created successfully....");
		  
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
/*
Username: sonalin
Password: sonalin!@34
*/