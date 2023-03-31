package com.class_obj_keyboard.java;

public class Keyboard2 {
	 String name;
	 int button;
	 
	 public Keyboard2() {
			System.out.println("default constructor called by this");
		}
	    
		public Keyboard2(String name, int button) {
			this();
		}

	public static void main(String[] args) {
		Keyboard2 k2=new Keyboard2("dell",104);

	}

}
