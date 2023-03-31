package com.class_obj_AC.java;

public class AC3 {
	String company_name;
	int price;
	
	AC3(String company_name,int price){
	this.m1();//create method 
	System.out.println(company_name);
	System.out.println(price);
	}

	 void m1() {
		System.out.println("here this is use for method class");
	}

	public static void main(String[] args) {
		AC3 a2=new AC3("samsung",85000);

	}

}
