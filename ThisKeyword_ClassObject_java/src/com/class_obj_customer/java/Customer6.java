package com.class_obj_customer.java;

public class Customer6 {
	String name;  
	int DOB,salary;
	
	Customer6(String name,int DOB,int salary){
		Customer6 c6=m3();
		System.out.println(c6.toString());
	}

	 Customer6 m3() {
		System.out.println("this  use to return the instance class from method");
		return this;
	}

	public static void main(String[] args) {
		Customer6 c6=new Customer6("sona",9/05/1999,90000);
    }
}
