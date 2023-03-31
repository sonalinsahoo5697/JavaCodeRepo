package com.class_obj_computer.java;

public class Computer1 {
	int price;
	String company_name;
	
	Computer1(String company_name,int price){
		this.company_name=company_name;
		this.price=price;
	}

	public static void main(String[] args) {
		Computer1 c1=new Computer1("LG",85000);
		Computer2 c2=new Computer2("LG",85000);
		Computer3 c3=new Computer3("LG",85000);
		Computer4 c4=new Computer4("LG",85000);
		Computer6 c6=new Computer6("LG",85000);
	}

}
