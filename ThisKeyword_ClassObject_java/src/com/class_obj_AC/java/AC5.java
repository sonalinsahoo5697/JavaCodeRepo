package com.class_obj_AC.java;

public class AC5 {
	String company_name;
	int price;

  AC5(String company_name,int price){
	 AC5 a4=new AC5(this);//this use to pass argument when constructor calling
	 System.out.println(company_name);
	 System.out.println(price);
	}

    AC5(AC5 ac5) {
	ac5.company_name="lg";
	ac5.price=86000;
    }
 public static void main(String args[]) {
	 AC5 a4=new AC5("LG",85000);
 }
}
