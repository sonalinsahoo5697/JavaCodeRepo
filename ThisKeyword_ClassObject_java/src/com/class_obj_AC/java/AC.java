package com.class_obj_AC.java;

public class AC {
	String company_name;
	int price;
	
	AC(String company_name,int price){
		this.company_name=company_name;
		this.price=price;
		System.out.println(company_name+" "+price);
	}

	public static void main(String[] args) {
		AC a=new AC("LG",85000);
	}

}
