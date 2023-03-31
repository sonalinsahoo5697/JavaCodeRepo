package com.class_obj_student.java;

public class Student3 {
	String name,address;
	int roll;
	
	Student3(String name,String address, int roll){
		this.m1();//calling current class method
	}

	 void m1() {
		 System.out.println("this can be use for class method");
		
	}

	public static void main(String[] args) {
		Student3 s3=new Student3("ABHAYA","ctc",20);

	}

}
