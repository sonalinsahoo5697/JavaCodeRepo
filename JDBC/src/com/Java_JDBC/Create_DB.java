package com.Java_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Create_DB {

	public static void main(String[] args) throws Exception{
		
			final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
			final String DB_URL = "jdbc:mysql://localhost/";
			
			final String USER = "root";
			final String PASSWORD = "";
			
			Connection con = null;
			Statement stmt = null;
			
			Class.forName(JDBC_DRIVER);
			
			System.out.println("Connection To database.............................");
			con = DriverManager.getConnection(DB_URL,USER, PASSWORD);
			
			System.out.println("Creating Statement..............................");
			stmt = con.createStatement();
			String sql = "CREATE DATABASE NIMBLETECH2";
			
			stmt.executeUpdate(sql);
			System.out.println("Database Created Successfully........................");
			
			stmt.close();
			con.close();

	}

}
