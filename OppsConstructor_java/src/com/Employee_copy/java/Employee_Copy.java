package com.Employee_copy.java;

public class Employee_Copy {
	int Emp_id,salary;
	String name,company_name,designation;
	
	Employee_Copy(){
		Emp_id=05;
		name="Chitaranjan prusty";
		company_name="Wipro";
		designation="Software developer";
		salary=90000;
	}
	Employee_Copy(Employee_Copy ref){
		Emp_id=ref.Emp_id;
		name=ref.name;
		company_name=ref.company_name;
		designation=ref.designation;
		salary=ref.salary;
	}

	public static void main(String[] args) {
		Employee_Copy EC=new Employee_Copy();
		Employee_Copy EC1=new Employee_Copy(EC);
		EC1.Emp_id=EC.Emp_id;
		EC1.name=EC.name;
		EC1.company_name=EC.company_name;
		EC1.designation=EC.designation;
		EC1.salary=EC.salary;
		System.out.println(EC1.Emp_id);
		System.out.println(EC1.name);
		System.out.println(EC1.company_name);
		System.out.println(EC1.designation);
		System.out.println(EC1.salary);
	}

}
