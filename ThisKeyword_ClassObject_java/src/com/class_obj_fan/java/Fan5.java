package com.class_obj_fan.java;

public class Fan5 {
	int blade;
	String colour;
	
	public Fan5(int blade, String colour) {
		Fan5 f5=new Fan5(this);//passing this an argument by constructor call
	}

	public Fan5(Fan5 fan5) {
		fan5.blade=6;
		fan5.colour="brown";
	}
}
