package com.javaSingleClass.java;

public class Database {
	
	private static Database dbObject;
	
	private Database() {
		
		System.out.println("Hi! I am Lingaraj.");
		
	}
	
	public static Database getInstance() {
		
		if(dbObject == null) {
			dbObject = new Database();
		}
		
		return dbObject;
	}
	
	public void getConnection() {
		System.out.println("You Are Now Connected To the Database.");
	}

}
