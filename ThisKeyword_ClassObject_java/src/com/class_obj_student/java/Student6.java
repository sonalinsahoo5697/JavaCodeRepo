package com.class_obj_student.java;

public class Student6 {
	String name,address;
	int roll;
	
	Student6(String name,String address, int roll){
		Student6 s6=m3();
		System.out.println(s6.toString());
	}

	  Student6 m3() {
		System.out.println("this is use for return the method");
		return this;//this return as a from function
	}

	public static void main(String[] args) {
		new Student("ABHAYA","DKL",20);
		new Student2("ABHAYA","DKL",20);
		new Student3("ABHAYA","ctc",20);
		new Student4("ABHAYA","DKL",20);
		new Student6("ABHAY","bbsr",25);

	}

}
