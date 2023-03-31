package com.hierarchical_inheritance.java;

public class Employee2 extends Company{
	String emp_nm1;
	int emp_id1;
	
	Employee2(){
		com_nm="Hexaware";
		emp=215;
		emp_nm1="Sushil";
		emp_id1=102;
		System.out.println("company name:"+com_nm);
		System.out.println("Available employee in company:"+emp);
		System.out.println("Employee name:"+emp_nm1);
		System.out.println("Employee id:"+emp_id1);
	}
	public static void main(String[] args) {
		Employee2 e=new Employee2();
    }
}
