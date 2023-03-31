package com.AC_default.java;

public class Ac_Default {
	String company;
	int price;
	Ac_Default(){
		company="Hi-tech";
		price=80000;
	}
	void show() {
		System.out.println("AC name:"+company);
		System.out.println("AC price:"+price);
	}

	public static void main(String[] args) {
		Ac_Default a=new Ac_Default();
        a.show();
	}

}
