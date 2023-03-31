package com.class_obj_watch.java;

public class Watch3 {
	String brand,colour;
	int price;

	public Watch3(String brand, String colour, int price) {
		this.m1();
		System.out.println(brand+" "+colour+" "+price);
	}

	 void m1() {
		System.out.println("Mthod call by this");
	}

	public static void main(String[] args) {
		Watch3 w3=new Watch3("Noise","teal-green",5499);
	}

}
