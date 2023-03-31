package com.class_obj_AC.java;

public class AC4 {
	String company_name;
	int price;
	
	AC4(String company_name,int price){
		m2(this);//create argument in method
		System.out.println(company_name);
		System.out.println(price);
	}

	 void m2(AC4 ac4) {
		ac4.company_name=company_name;
		ac4.price=price;
		System.out.println("this is use to pass argument in method class");
		
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		AC4 a3=new AC4("samsung",85000);
	}

}
