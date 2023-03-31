 package com.single_inheritance.java;

public class Student extends School {
	String std_name;
	int roll;
	
	Student(){
		name="CIME";
		cls_room=15;
		std_name="Nitu";
		roll=25;
		System.out.println(name);
		System.out.println(cls_room);
		System.out.println(std_name);
		System.out.println(roll);
	}

	public static void main(String[] args) {
		Student s=new Student();
	}

}