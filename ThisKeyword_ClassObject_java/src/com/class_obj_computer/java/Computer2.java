package com.class_obj_computer.java;

public class Computer2 {
	String company_name;
	int price;
	
	public Computer2() {
			System.out.println("default constructor called by this().");
		}
	
	Computer2(String company_name,int price){
		this();//default constructor
	}


	public static void main(String[] args) {
		Computer2 c2=new Computer2("LG",85000);

	}

}
