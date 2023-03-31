package com.cylinder_3d.java;

public class Cylinder {

	public static void main(String[] args) {
		int r=3;
		int h=4;
		double volume=3.14*r*r*h;
		System.out.println("Volume of cylinder is:"+volume);
		double curved_area=2*3.14*r*h;
		System.out.println("Curved surface area of cylinder is:"+curved_area);
		double surface_area=2*3.14*r*(r+h);
		System.out.println("Total surface area of cylinder is:"+surface_area);
	}

}
