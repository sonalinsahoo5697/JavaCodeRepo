package com.javaSingleClass.java;

public class Main {

	public static void main(String[] args) {
		
		//Database db1;
		
		Database db1 = Database.getInstance();
		
		db1.getConnection();
		
		Database db2 = Database.getInstance();
		
		db2.getConnection();

	}

}
