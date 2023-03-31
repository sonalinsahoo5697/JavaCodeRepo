package com.class_obj_computer.java;

public class Computer5 {
	String company_name;
	int price;
	
	Computer5(String company_name,int price){
		Computer5 c5=new Computer5 (this);//this can be passed an argument in the constructor call
	}

	public Computer5(Computer5 computer5) {
		computer5.company_name="LG";
		computer5.price=85000;
	}

}
