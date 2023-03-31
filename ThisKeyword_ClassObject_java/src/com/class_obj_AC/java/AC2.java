package com.class_obj_AC.java;

public class AC2  {
	String company_name;
	int price;
	AC2(){
		System.out.println("default constructor use to call this().");
	}
	AC2(String company_name,int price){
		this();//call default constructor
		System.out.println(company_name);
		System.out.println(price);
	}
	

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		AC2 a1=new AC2("samsung",85000);
	}

}
