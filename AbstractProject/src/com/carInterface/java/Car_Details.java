package com.carInterface.java;

public class Car_Details implements BMW,Audi{

	public static void main(String[] args) {
		
		Car_Details CD = new Car_Details();
		CD.Audi_Price();
		CD.BMW_Price();

	}

	@Override
	public void Audi_Price() {
		System.out.println("40 Lakhs....");
		
	}

	@Override
	public void BMW_Price() {
		System.out.println("80 lakhs,....");
		
	}

}
/*

IS_A a relationship

java 8 - default and static method in an interface.

java 9 - private methods in an interface.


3 reasons behind uses of interface
==================================

1. achieve abstraction
2. support multiple inheritance
3. achieve loose coupling[not strong depended]

class -> extends -> class , class -> implements -> interface , interface -> extends -> interface


*/