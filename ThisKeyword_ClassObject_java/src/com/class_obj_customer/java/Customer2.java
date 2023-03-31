package com.class_obj_customer.java;

public class Customer2 {
	String name;  
	int DOB,salary;
	
	Customer2(){
		System.out.println("this default constructor call by this()");
	}
	Customer2(String name,int DOB,int salary){
		this();//this default constructor call by this()
	}

	public static void main(String[] args) {
		Customer2 c2=new Customer2("sona",9/05/1999,90000);

	}

}
