package com.class_obj_watch.java;

public class Watch1 {
	String brand,colour;
	int price;

	public Watch1(String brand, String colour, int price) {
		this.brand=brand;
		this.colour=colour;
		this.price=price; 
		System.out.println(brand+" "+colour+" "+price);
	}

	public static void main(String[] args) {
		Watch1 w1=new Watch1("Noise","teal-green",5499);

	}

}