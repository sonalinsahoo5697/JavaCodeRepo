package com.class_obj_watch.java;

public class Watch4 {
	String brand,colour;
	int price;

	public Watch4(String brand, String colour, int price) {
		m2(this);
		System.out.println(brand+" "+colour+" "+price);
	}

	 void m2(Watch4 watch4) {
		watch4.brand="Noise";
		watch4.colour="green";
		watch4.price=4300;
		System.out.println("passing this argument by method");
	}

	public static void main(String[] args) {
		Watch4 w4=new Watch4("Noise","teal-green",5499);
	}

}
