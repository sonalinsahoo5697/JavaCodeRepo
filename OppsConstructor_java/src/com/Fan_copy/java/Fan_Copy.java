package com.Fan_copy.java;

public class Fan_Copy {
	int blade,types;
	double weight;
	String colour;
	
	Fan_Copy(String colour, int blade, double weight,int types){
		this.colour=colour;
		this.blade=blade;
		this.weight=weight;
		this.types=types;
	}
	Fan_Copy(Fan_Copy ref){
		colour=ref.colour;
		blade=ref.blade;
		weight=ref.weight;
		types=ref.types;
	}

	public static void main(String[] args) {
		Fan_Copy f=new Fan_Copy("Blue",3,1.2,5);
		Fan_Copy f1=new Fan_Copy(f);
		f1.colour=f.colour;
		f1.blade=f.blade;
		f1.weight=f.weight;
		f1.types=f.types;
		System.out.println("Fan colour:"+f1.colour);
		System.out.println("How many blades available:"+f1.blade);
		System.out.println("Fan Weight:"+f1.weight);
		System.out.println("Types of Fan:"+f1.types);
	}

}
