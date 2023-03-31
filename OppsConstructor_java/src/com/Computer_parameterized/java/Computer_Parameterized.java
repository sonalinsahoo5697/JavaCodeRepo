package com.Computer_parameterized.java;

public class Computer_Parameterized {
	int price;
	String brand;
	
	Computer_Parameterized(String brand,int price){
		this.brand=brand;
		this.price=price;
	}
	void disp() {
		System.out.println(brand+" "+price);
	}

	public static void main(String[] args) {
		Computer_Parameterized c=new Computer_Parameterized("hp",68000);
		c.disp();
	}

}
