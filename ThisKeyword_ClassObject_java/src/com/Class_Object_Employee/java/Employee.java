 package com.Class_Object_Employee.java;

public class Employee {
	int empId;
	String empName;
	
	Employee(){
		System.out.println("2.This default consturctor call by this()");
	}
	
	Employee(int empId, String empName){
		this();//2
		this.empId=empId;
		this.empName=empName;
		this.m1();//3
		m2(this);//4
		@SuppressWarnings("unused")
		Employee E2=new Employee(this);//5
		Employee E=m3();//6
		System.out.println(E.toString());
	}
	Employee(Employee employee){
		employee.empId=1456;
		employee.empName="Priyanka";
	}

	  Employee m3() {
		System.out.println("6.this can be use to return from method call");
		return this;
	}

	void m2(Employee employee) {
		employee.empId=1456;
		employee.empName="Priyanka";
		System.out.println("4.passing this as argument in method call");
	}

	void m1() {
		System.out.println("3.this method m1 called by this.m1()") ;
		
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Employee E=new Employee(1254,"Ankush");//1
	}

}
