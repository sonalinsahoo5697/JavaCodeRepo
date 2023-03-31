 package com.class_obj_fan.java;

public class Fan2 {
	int blade;
	String colour;
	
   public Fan2() {
		System.out.println("default constructor call by this()");
	}
	
	public Fan2(int blade, String colour) {
		this();//default constructor call by this
	}
	
	public static void main(String[] args) {
		Fan2 f2=new Fan2(3,"black");
	}

}

