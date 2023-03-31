package com.Computer_default.java;

public class Computer_Default {
	int price;
	String brand;

	Computer_Default(){
		brand="hp";
		price=65000;
	}
	void disp() {
		System.out.println(brand+" "+price);
	}
	public static void main(String[] args) {
		Computer_Default c=new Computer_Default ();
		c.disp();
	}

}