package com.class_obj_customer.java;

public class Customer4 {
	String name;  
	int DOB,salary;
	
	Customer4(String name,int DOB,int salary){
		m2(this);//this argument passed in method
	}

	 void m2(Customer4 customer4) {
		customer4.name="sona";
		customer4.DOB=9/05/1999;
		customer4.salary=90000;
		System.out.println("passing this as argument in method call");
		
	}

	public static void main(String[] args) {
		Customer4 c4=new Customer4("sona",9/05/1999,90000);

	}

}
