package com.tostringMethod.java;

public class Student {
	String name;
	int roll;

	public Student(String name,int roll) {
		this.name=name;
		this.roll=roll;
	}
	public String toString() {
		return name+" "+roll;
		
	}
	public static void main(String[] args) {
		Student s=new Student("dhgcj",25);
		System.out.println(s);//Hashcode
	}

}