
package com.class_obj_student.java;

public class Student2 {
	String name,address;
	int roll;
	
	Student2(){
		System.out.println("constructor call by this");
	}
	Student2(String name,String address, int roll){
		this();//calling current class default constructor
	}

	public static void main(String[] args) {
		Student2 s2=new Student2("Abhaya","DKL",20);

	}
	
}
