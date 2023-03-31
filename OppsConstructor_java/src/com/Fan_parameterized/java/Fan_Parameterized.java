package com.Fan_parameterized.java;

public class Fan_Parameterized {
	int blade,types;
	double weight;
	String colour;
	
	Fan_Parameterized(String colour,double weight,int blade,int types ){
		this.colour=colour;
		this.blade=blade;
		this.weight=weight;
		this.types=types;
	}
	void show() {
		System.out.println("Some properties of fan:");
		System.out.println("Fan colour:"+colour);
		System.out.println("How many blades available:"+blade);
		System.out.println("Fan Weight:"+weight);
		System.out.println("Types of Fan:"+types);
	}

	public static void main(String[] args) {
		Fan_Parameterized FP=new Fan_Parameterized("Brown",3,2,5);
		FP.show();
	}

} 
