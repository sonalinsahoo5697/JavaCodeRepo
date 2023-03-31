package com.SuperKeyword.java;

public class School {
	
	String schoolName;
	String schoolAddress;
	
	School(String schoolName, String schoolAddress)
	{
		this.schoolAddress = schoolAddress;
		this.schoolName = schoolName;
	}
	
	void schoolDetails()
	{
		System.out.println(schoolName+" "+schoolAddress);
	}

}
