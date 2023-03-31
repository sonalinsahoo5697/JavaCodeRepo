package com.Tiger_Parameterized.java;

public class Tiger {
	String color,Gender;
	int leg,weight;
	Tiger(String color, String Gender,int leg, int weight){
		this.color=color;
		this.Gender=Gender;
		this.leg=leg;
		this.weight=weight;
	}
	void disp() {
		System.out.println("About Tiger:");
		System.out.println("Color:"+color);
		System.out.println("Gender:"+Gender);
		System.out.println("Leg:"+leg);
		System.out.println("Weight:"+weight);
	}

	public static void main(String[] args) {
		Tiger T=new Tiger("White","Female",4,75);
	      T.disp();
	}

}
