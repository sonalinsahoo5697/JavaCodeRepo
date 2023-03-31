package com.customer_opps_class_obj.java;

import java.util.Scanner;

public class Customer {
	String name;
	int age,salary;
	
	void Cus_input(){
    	System.out.println("Enter the name , age & salary:");
    	Scanner sc=new Scanner(System.in);
    	name=sc.next();
    	age=sc.nextInt();
    	salary=sc.nextInt();
    }
	void Cus_display() {
		System.out.println("NAME:"+name);
		System.out.println("AGE:"+age);
		System.out.println("SALARY:"+salary);
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.Cus_input();
        c.Cus_display();
	}

}
