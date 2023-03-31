package com.Computer_copy.java;

public class Computer_Copy {
	int price;
	String brand;
	
	Computer_Copy(){
		brand="hp";
		price=78000;
	}
	Computer_Copy(Computer_Copy ref){
		brand=ref.brand;
		price=ref.price;
	}

	public static void main(String[] args) {
		Computer_Copy c=new Computer_Copy();
		Computer_Copy c1=new Computer_Copy(c);
		c1.brand=c.brand;
		c1.price=c.price;
		System.out.println(c1.brand);
		System.out.println(c1.price);
	}

}
