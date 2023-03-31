package com.Angle_of_Triangle.java;
//input angle of a triangle and check the triangle is valid or not
public class Triangle {

	public static void main(String[] args) {
		int a=60,b=50,c=70 ;
		int d=a+b+c;
		
		if(d==180) {
			System.out.println("The triangle is valid");
		}
		else {
			System.out.println("The triangle is not valid");
		}

	}

}
