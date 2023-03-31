package com.hierarchical_inheritance.java;

public class Employee3 extends Company {
	String emp_nm2;
	int emp_id2;
	
	Employee3(){
		com_nm="Hexaware";
		emp=215;
		emp_nm2="Lipsa";
		emp_id2=103;
		System.out.println("company name:"+com_nm);
		System.out.println("Available employee in company:"+emp);
		System.out.println("Employee name:"+emp_nm2);
		System.out.println("Employee id:"+emp_id2);
	}

	public static void main(String[] args) {
		Employee3 e=new Employee3();

	}

}
