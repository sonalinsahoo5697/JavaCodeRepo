package com.class_obj_fan.java;

public class Fan4 {
	int blade;
	String colour;
	
	public Fan4(int blade, String colour) {
		m2(this);// passing this an argument by method call
	}
	 void m2(Fan4 fan4) {
		fan4.blade=6;
		fan4.colour="brown";
		System.out.println("passing this argument by method");
	}
	public static void main(String[] args) {
		Fan4 f4=new Fan4(3,"black");

	}
}
