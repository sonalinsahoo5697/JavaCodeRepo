package com.class_obj_keyboard.java;

public class Keyboard1 {
    String name;
    int button;
    
	public Keyboard1(String name, int button) {
		this.name=name;
		this.button=button;
	}

	public static void main(String[] args) {
		Keyboard1 k1=new Keyboard1("dell",104);
	}

}
