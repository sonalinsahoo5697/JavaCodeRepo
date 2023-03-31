package com.Employee_parameterized.java;

public class Employee {
	int Emp_id,salary;
	String name,company_name,designation;
	
	Employee(int Emp_id,String name,String company_name,String designation,int salary)
	{
	 this.Emp_id=Emp_id;
	 this.name=name;
	 this.company_name=company_name;
	 this.designation=designation;
	 this.salary=salary;
	}
	void dis() {
		System.out.println("Details of employee:");
		System.out.println("Employee id:"+Emp_id);
		System.out.println("Name:"+name);
		System.out.println("Comapny Name:"+company_name);
		System.out.println("Designation:"+designation);
		System.out.println("Salary:"+salary);
	}

	public static void main(String[] args) {
		Employee emp=new Employee(22,"Ankit bhat","Infosys","Tester",60000);
		emp.dis();
	}

}
