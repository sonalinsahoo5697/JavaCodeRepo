package com.Class_Object_Employee.java;

public class Employee5 {
	int empId;
	String empName;
	
	Employee5(int empId, String empName){
		Employee5 E5=new Employee5(this);
	}
	Employee5(Employee5 employee5){
		employee5.empId=1456;
		employee5.empName="Priyanka";
	}
}
