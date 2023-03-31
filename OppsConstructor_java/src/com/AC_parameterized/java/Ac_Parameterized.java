package com.AC_parameterized.java;

public class Ac_Parameterized {
	String company;
	int price;
	
	Ac_Parameterized(String company,int price){
		this.company=company;
		this.price=price;
	}
	
	void disp() {
		System.out.println("company name:"+company);
		System.out.println("price:"+price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ac_Parameterized a=new Ac_Parameterized("samsung",80000);
		a.disp();
	}

}