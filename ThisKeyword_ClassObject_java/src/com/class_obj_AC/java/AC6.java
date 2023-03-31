package com.class_obj_AC.java;

public class AC6 {
	String company_name;
	int price;
	
	 AC6(String company_name,int price){
		 AC6 a5=m3();
		 System.out.println(a5.toString());
		 System.out.println(company_name);
		 System.out.println(price);
	 }

	 AC6 m3() {
		System.out.println("this use to return instance from the method");
		return this;
	}

	public static void main(String[] args) {
		new AC("LG",85000);
		new AC2("samsung",85000);
		new AC3("samsung",85000);
		new AC4("samsung",85000);
		new AC5("LG",85000);
		new AC6("samsung",82000);
	}

}
