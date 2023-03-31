package com.Class_Object_Employee.java;

public class Employee4 {
	int empId;
	String empName;
	
	Employee4(int empId, String empName){
		m2(this);
	}
	void m2(Employee4 employee4) {
		employee4.empId=1456;
		employee4.empName="Priyanka";
		System.out.println("passing this as argument in method call");
	}

	public static void main(String[] args) {
		Employee4 e4=new Employee4(5642,"nitulin");
	}

}