package com.class_obj_fan.java;

public class Fan3 {
	int blade;
	String colour;
	
	public Fan3(int blade, String colour) {
		this.m1();
	}
	 void m1() {
		System.out.println("method call by this");
	}
	public static void main(String[] args) {
		Fan3 f3=new Fan3(3,"black");
	}

}
