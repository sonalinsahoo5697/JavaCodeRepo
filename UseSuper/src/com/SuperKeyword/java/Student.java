package com.SuperKeyword.java;

public class Student extends School{

	Student()
	{
		super("University High School","QWE-ty/45");
		super.schoolDetails();
	}
	
	public static void main(String args[])
	{
		Student S = new Student();
	}

}
