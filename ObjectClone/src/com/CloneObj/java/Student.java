package com.CloneObj.java;

public class Student implements Cloneable{
	
	int roll;
	String name;
	
	

	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student S = new Student(123,"Qwerty");
		
		Student S2 = (Student) S.clone();
		
		Student S3 = (Student) S.clone();
		
		System.out.println(S.roll+" "+S.name);
		System.out.println(S2.roll+" "+S2.name);
		System.out.println(S3.roll+" "+S3.name);

	}

}