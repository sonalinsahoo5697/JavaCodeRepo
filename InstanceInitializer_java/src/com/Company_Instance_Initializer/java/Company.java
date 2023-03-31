package com.Company_Instance_Initializer.java;

public class Company {
	String name;
	
	//instance initializer
	{
		name="mahabir utensils";
		System.out.println(name);
	}
	//static block
	static String city;
	static
	{
	city="dkl";
	System.out.println(city);
	}

	public static void main(String[] args) {
		Company C=new Company();

	}

}
