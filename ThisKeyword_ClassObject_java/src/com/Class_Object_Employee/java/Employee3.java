package com.Class_Object_Employee.java;

public class Employee3 {
	int empId;
	String empName;
	
	Employee3(int empId, String empName){
		this.m1();
	}
	
	void m1() {
		System.out.println("this method m1 called by this.m1()") ;
	}
	
	public static void main(String[] args) {
		Employee3 e3=new Employee3(5642,"nitulin");	

	}

}
