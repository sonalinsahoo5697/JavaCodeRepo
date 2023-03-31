package com.Customer_copy.java;

public class Customer_Copy {
	String name,address;
	int  age,salary;
  
	Customer_Copy(String name,String address,int age,int salary){
		this.name=name;
		this.address=address;
		this.age=age;
		this.salary=salary;
	}
	Customer_Copy(Customer_Copy ref){
		name=ref.name;
		address=ref.address;
		age=ref.age;
		salary=ref.salary;
	}
	
	public static void main(String[] args) {
		Customer_Copy sc=new Customer_Copy("Ankush","bbsr",23,50000);
		Customer_Copy sc1=new Customer_Copy(sc);
		sc1.name=sc.name;
		sc1.address=sc.address;
		sc1.age=sc.age;
		sc1.salary=sc.salary;
		System.out.println("Name:"+sc1.name);
		System.out.println("Address:"+sc1.address);
		System.out.println("Age:"+sc1.age);
		System.out.println("Salary:"+sc1.salary);
	}

}
