package com.Family_Instance_Initializer.java;

public class Son extends Father{
	String Name;
	int Age;
	
	//instance initializer block
	{
		Name="Ommprakash Sahoo";
		Age=18;
		System.out.println("Son Name:"+Name);
		System.out.println("Son Age:"+Age);
		super.disp();
	}
	
	public static void main(String[] args) {
		Son S=new Son();
	}

}
