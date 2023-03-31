package com.class_obj_watch.java;

public class Watch6 {
	String brand,colour;
	int price;

	public Watch6(String brand, String colour, int price) {
	Watch6 w6=m3();
	System.out.println(brand+" "+colour+" "+price);
	System.out.println(w6.toString());
	}

	 Watch6 m3() {
		System.out.println("this use for return class from method ");
		return this;
	}

	public static void main(String[] args) {
		Watch6 w6=new Watch6("Noise","teal-green",5499);
	}

}
