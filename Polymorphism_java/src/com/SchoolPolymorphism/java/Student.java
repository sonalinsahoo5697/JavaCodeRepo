package com.SchoolPolymorphism.java;

public class Student extends School {
	 String StdName;
	 int StdRoll;
	 
	public void sch() {
		StdName="NITU";
		StdRoll=24;
		System.out.println(StdName+" "+StdRoll);
	}

	public static void main(String[] args) {
		School S= new Student();
        S.sch();
	}

}