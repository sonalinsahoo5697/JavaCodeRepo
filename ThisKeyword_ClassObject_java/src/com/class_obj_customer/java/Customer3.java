package com.class_obj_customer.java;

public class Customer3 {
	String name;  
	int DOB,salary;
	
	Customer3(String name,int DOB,int salary){
		this.m1();
	}
	 void m1() {
		System.out.println("Method called by this");
		
	}
	public static void main(String[] args) {
		Customer3 c3=new Customer3("sona",9/05/1999,90000);
	}
}
