package com.class_obj_keyboard.java;

public class Keyboard5 {
	 String name;
	 int button;
	    
		public Keyboard5(String name, int button) {
			Keyboard5 k5=new Keyboard5(this); //passing this an argument by constructor call
		}

		public Keyboard5(Keyboard5 keyboard5) {
			keyboard5.name="dell";
			keyboard5.button=104;
		}
}
