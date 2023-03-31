package com.Family_Instance_Initializer.java;

public class Father extends GrandFather {
	String FatherName;
	int FatherAge;
	
	//instance initializer block
	{
		FatherName="Abhaya Kumar Sahoo";
		FatherAge=50;
		System.out.println("Father's Name:"+FatherName);
		System.out.println("Father's Age:"+FatherAge);
		super.disp();
	}

	public static void main(String[] args) {
		Father F=new Father();

	}
}