package com.Customer_default.java;

public class Customer {
	String name,address;
	int DOB,salary;
	
	Customer(){
		name="Gyana ranjan Sahoo.";
		address="BBSR";
		DOB=22/05/1994;
		salary=25000;
	}
	
	void show() {
		System.out.println("Customer details are:");
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("DOB:"+DOB);
		System.out.println("Salary:"+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer A=new Customer();
		A.show();
	}

}
