package com.javaSingleClass.java;

public class SingleTonEx {
	
	//private field that refers to the object
	private static SingleTonEx singleObject;//a reference to the object of the class
	
	private SingleTonEx() {
		//constructor of singleTonEx class
		
	}
	
	public static SingleTonEx getInstance() {
		return singleObject;
		//write code that allows us to create only one object
		//access the object as per our need.
		
		/*
		 * this method returns the reference to the object of the class. since the method static, it can be accessed
		 * using the class
		 * 
		 * 
		 */
	}

	public static void main(String[] args) {
		
	}

}
