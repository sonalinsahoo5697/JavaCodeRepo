package com.class_obj_student.java;

public class Student5 {
	String name,address;
	int roll;
	
	Student5(String name,String address, int roll){
	@SuppressWarnings("unused")
	Student5 s5=new Student5(this);//this use to pass argument when constructor calling
	}
	
	 Student5(Student5 student5) {
		student5.name="anamika";
		student5.address="puri";
		student5.roll=5243;
	}
}
