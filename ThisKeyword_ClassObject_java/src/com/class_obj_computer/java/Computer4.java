package com.class_obj_computer.java;

public class Computer4 {
	String company_name;
	int price;
	
	Computer4(String company_name,int price){
	  m2(this); //this can be passed an argument in the method call
	}

	 void m2(Computer4 computer4) {
		computer4.company_name=company_name;
		computer4.price=price;
		System.out.println("this can be passed an argument in the method class");
	}

	public static void main(String[] args) {
		Computer4 c4=new Computer4("LG",85000);
	}

}
