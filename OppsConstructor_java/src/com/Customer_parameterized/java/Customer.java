package com.Customer_parameterized.java;

//import java.util.Scanner;

public class Customer {
	String name,address;
	int  age,salary;

	Customer(String name,String address,int age,int salary){
		this.name=name;
		this.address=address;
		this.age=age;
		this.salary=salary;
//		System.out.println("enter the customer name, address, age & salary:");
//		Scanner ac=new Scanner(System.in);
//		name=ac.next();
//		address=ac.next();
//		age=ac.nextInt();
//		salary=ac.nextInt();
	}
	void Cus_display() {
		System.out.println("Customer details are:");
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Customer sc=new Customer("Ankush Nath","CTC",45,85000);
         sc.Cus_display();
	}

}
