package com.class_obj_keyboard.java;

public class Keyboard3 {
	 String name;
	 int button;
	    
		public Keyboard3(String name, int button) {
			this.m1();
		}

	    void m1() {
			System.out.println("method call by this");
		}

	public static void main(String[] args) {
		Keyboard3 k3=new Keyboard3("dell",104);

	}

}
