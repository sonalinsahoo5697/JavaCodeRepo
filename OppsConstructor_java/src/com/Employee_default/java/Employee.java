package com.Employee_default.java;

public class Employee {
	int Emp_id,salary;
	String name,company_name,designation;
	
	Employee(){
		Emp_id=05;
		name="Anil prusty";
		company_name="Wipro";
		designation="Software developer";
		salary=80000;
	}
	void Emp_display() {
		System.out.println("Employee details:");
		System.out.println("Employee id:"+Emp_id);
		System.out.println("Name:"+name);
		System.out.println("Comapny Name:"+company_name);
		System.out.println("Designation:"+designation);
		System.out.println("Salary:"+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Emp=new Employee();
		Emp.Emp_display();
	}

}
