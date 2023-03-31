package com.Student_Default.java;

import java.util.Scanner;

public class Student {
	//properties of student class
	String name;
	int roll_no,age;
	
	Student() //default constructor
	{
		System.out.println("Enter Student name, roll_no, age:");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		roll_no=sc.nextInt();
		age=sc.nextInt();
	}
	
	void display() // for showing output
	{
		System.out.println("Student details are:");
		System.out.println("Name:"+name);
		System.out.println("Roll_No:"+roll_no);
		System.out.println("Age:"+age);
	}

	public static void main(String[] args) {
		Student ref=new Student();
		ref.display();
	}

}
