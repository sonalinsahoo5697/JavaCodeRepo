package com.Fan_default.java;

public class Fan_Default {
	int blade,Types;
	double weight;
	String colour;
	
	Fan_Default(){
		blade=3;
		Types=5;
		weight=1.2;
		colour="Black";
	}
	void show() {
		System.out.println("Some properties of fan:");
		System.out.println("Fan colour:"+colour);
		System.out.println("How many blades available:"+blade);
		System.out.println("Types of Fan:"+Types);
		System.out.println("Fan Weight:"+weight);
	}

	public static void main(String[] args) {
		Fan_Default FD=new Fan_Default();
		FD.show();
	}

}
