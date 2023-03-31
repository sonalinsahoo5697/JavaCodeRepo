package com.class_obj_keyboard.java;

public class Keyboard4 {
	 String name;
	 int button;
	    
		public Keyboard4(String name, int button) {
			m2(this);
		}

	   void m2(Keyboard4 keyboard4) {
		keyboard4.name="dell";
		keyboard4.button=104;
		System.out.println("passing this an argument using method call");
		}

	public static void main(String[] args) {
		Keyboard4 k4=new Keyboard4("dell",104);
	}

}
