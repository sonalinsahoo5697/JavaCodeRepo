package com.class_obj_student.java;

public class Student {
	String name,address;
	int roll;
	
//	Student(){
//		System.out.println("constructor call by this()");
//	}
	
	Student(String name,String address, int roll){
		//this();   
		this.name=name;
		this.address=address;
		this.roll=roll;
	}
//		this.m1();
//		m2(this);
//		//Student s1=new Student(this);
//		Student s=m3();
//		System.out.println(s.toString());
//	}
//
//	   Student m3() {
//		System.out.println("this class can be used to return from the method");
//		return this;
//	}
//
//	void m2(Student student) {
//		student.name="ABHAYA";
//		student.address="DKL";
//		student.roll=20;
//		System.out.println("this can be use to pass argument from call method");
//	}
//
//	void m1() {
//		System.out.println("this can be use for class method");
//		
//	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Student s=new Student("ABHAYA","DKL",20);
	}

}
