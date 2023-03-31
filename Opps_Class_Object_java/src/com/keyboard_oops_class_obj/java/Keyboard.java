 package com.keyboard_oops_class_obj.java;

public class Keyboard {
	String company_name;
	int button;
	
	void key_input() {
		company_name="Dell";
		button=104;
	}
	void key_disp() {
		System.out.println(company_name);
		System.out.println(button);
	}

	public static void main(String[] args) {
		Keyboard k=new Keyboard();
        k.key_input();
        k.key_disp();
	}

}
