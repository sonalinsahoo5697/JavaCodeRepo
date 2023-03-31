package com.class_obj_watch.java;

public class Watch5 {
	String brand,colour;
	int price;

	public Watch5(String brand, String colour, int price) {
		Watch5 w5=new Watch5(this);
		System.out.println(brand+" "+colour+" "+price);
	}
	public Watch5(Watch5 watch5) {
		watch5.brand="Noise";
		watch5.colour="green";
		watch5.price=4300;
	}
	public static void main(String[] args) {
		Watch5 w5=new Watch5("Noise","teal-green",5499);
	}

}
