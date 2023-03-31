package com.class_obj_student.java;

public class Student4 {
	String name,address;
	int roll;
	
	Student4(String name,String address, int roll){
		m2(this);//passing this as argument in any method
	}

	 void m2(Student4 student4) {
		student4.name=name;
		student4.address=address;
		student4.roll=roll;
		System.out.println("this can be use to pass argument from call method");
	 }

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Student4 s4=new Student4("ABHAYA","DKL",20);

	}

}
