package com.employee_oops_class_obj.java;

import java.util.Scanner;

public class Employee {
	String empName;
	int empId,income;
	
	void emp_input() {
		System.out.println("Enter the name,id& salary:");
		Scanner sc=new Scanner(System.in);
		empName=sc.next();
		empId=sc.nextInt();
		income=sc.nextInt();
	}
	void emp_disp() {
		System.out.println("Emp_Name:"+empName);
		System.out.println("Emp_Id:"+empId);
		System.out.println("Monthly income:"+income);
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		e.emp_input();
        e.emp_disp();
	}

}
