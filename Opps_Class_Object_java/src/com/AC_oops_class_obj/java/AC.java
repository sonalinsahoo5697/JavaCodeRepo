package com.AC_oops_class_obj.java;

public class AC {
	String name;
	int price;
	
	void AC_input() {
		name="hi-tachi";
		price=50000;
	}
	void AC_display() {
		System.out.println(name);
		System.out.println(price);
	}

	public static void main(String[] args) {
		AC a=new AC();
		a.AC_input();
		a.AC_display();
	}
}