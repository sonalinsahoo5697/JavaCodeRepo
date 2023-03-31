package com.class_obj_computer.java;

public class Computer3 {
	String company_name;
	int price;
	
	Computer3(String company_name,int price){
		this.m1();//this can be used to method class
	}

     void m1() {
		System.out.println("create method class using this ");
		
	}

	public static void main(String[] args) {
		Computer3 c3=new Computer3("LG",85000);
	}

}
