package com.class_obj_customer.java;

public class Customer1 {
	String name;   //properties
	int DOB,salary; //properties
	
	Customer1(String name,int Dob, int salary){
		this.name=name;
		this.DOB=DOB;
		this.salary=salary;
		System.out.println(name+" "+salary);
	}

	public static void main(String[] args) {
		Customer1 c1=new Customer1("sona",9/05/1999,90000);

	}

}
