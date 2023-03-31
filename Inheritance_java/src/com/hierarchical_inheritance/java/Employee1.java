package com.hierarchical_inheritance.java;

public class Employee1 extends Company {
	String emp_nm;
	int emp_id;
	
	Employee1(){
		com_nm="Hexaware";
		emp=215;
		emp_nm="sonalin sahoo";
		emp_id=101;
		System.out.println("company name:"+com_nm);
		System.out.println("Available employee in company:"+emp);
		System.out.println("Employee name:"+emp_nm);
		System.out.println("Employee id:"+emp_id);
	}

	public static void main(String[] args) {
		Employee1 e=new Employee1();
	}

}
