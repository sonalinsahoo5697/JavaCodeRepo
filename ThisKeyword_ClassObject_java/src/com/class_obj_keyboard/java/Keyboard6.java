package com.class_obj_keyboard.java;

public class Keyboard6 {
	 String name;
	  int button;
	    
		public Keyboard6(String name, int button) {
			Keyboard6 k6=m3();
			System.out.println(k6.toString());
		}

	   Keyboard6 m3() {
			System.out.println("this use to return instance class from method");
			return this;
		}

	public static void main(String[] args) {
		Keyboard6 k6=new Keyboard6("dell",104);

	}

}
