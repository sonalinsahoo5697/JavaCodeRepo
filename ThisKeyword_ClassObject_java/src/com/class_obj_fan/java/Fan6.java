package com.class_obj_fan.java;

public class Fan6 {
	int blade;
	String colour;
	
	public Fan6(int blade, String colour) {
		Fan6 f6=m3();
		System.out.println(f6.toString());
	}
	 Fan6 m3() {
		System.out.println("this use to return instance class from method call");
		return this;
	}
	public static void main(String[] args) {
		Fan6 f6=new Fan6(3,"black");
   }

}
