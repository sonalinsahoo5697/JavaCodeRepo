package com.Class_Object_Employee.java;

public class Employee2 {
	int empId;
	String empName;
	
	Employee2(){
		System.out.println("This default consturctor call by this()");
	}
	
	Employee2(int empId, String empName){
	this();
	System.out.println(empId);
	System.out.println(empName);
	}
	public static void main(String[] args) {
		Employee2 e2=new Employee2(5642,"nitulin");

	}

}
