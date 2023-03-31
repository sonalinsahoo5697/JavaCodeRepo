package com.class_obj_customer.java;

public class Customer5 {
	String name;  
	int DOB,salary;
	
	Customer5(String name,int DOB,int salary){
		Customer5 c5=new Customer5(this);//this passed an argument in constructor call
	}

	public Customer5(Customer5 customer5) {
		customer5.name="sona";
		customer5.DOB=9/05/1999;
		customer5.salary=90000;
	}

}
