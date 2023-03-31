package com.vehicle.java;

public class Car extends Bike  {
	
	void bike() {
		//over-riding
		System.out.println("It is a four tier vehicle");
	}

	public static void main(String[] args) {
		Car c=new Car();
		c.bike();
    }

}
