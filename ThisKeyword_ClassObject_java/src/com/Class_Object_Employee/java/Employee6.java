package com.Class_Object_Employee.java;

public class Employee6 {
	int empId;
	String empName;
	
	Employee6(int empId, String empName){
		Employee6 E6=m6();
		System.out.println(E6.toString());
		System.out.println(empName);
	}
	 Employee6 m6() {
			System.out.println("this can be use to return from method call");
			return this;
		}
	public static void main(String[] args) {
		Employee6 e6=new Employee6(5642,"nitulin");
	}

}