package com.class_obj_watch.java;

   public class Watch2 {
	  String brand,colour;
	  int price;
	
    public Watch2() {
		System.out.println("default constructor call by this().");
	}

	public Watch2(String brand, String colour, int price) {
		this();
		System.out.println(brand+" "+colour+" "+price);
	}

	public static void main(String[] args) {
		Watch2 w2=new Watch2("Noise","teal-green",5499);
	}

}
