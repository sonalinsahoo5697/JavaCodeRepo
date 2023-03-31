package com.class_obj_computer.java;

public class Computer6 {
	String company_name;
	int price;
	
	Computer6(String company_name,int price){
		Computer6 c6=m3();                //this use to return class method
		System.out.println(c6.toString());
	}


	 Computer6 m3() {
		System.out.println("this can be use to return instance class from method");
		return this;
	}


	public static void main(String[] args) {
		Computer6 c6=new Computer6("LG",85000);
	}

}