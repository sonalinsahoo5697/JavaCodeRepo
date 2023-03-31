package com.triangle_no_return_no_args;

import java.util.Scanner;

public class Area_Of_Triangle {

	static void Triangle()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int base, height;
		System.out.println("Enter the value of base: ");
		base=sc.nextInt();
		System.out.println("Enter the value of height: ");
		height=sc.nextInt();
		System.out.println("Area of triangle is: "+(1/(float)2*base*height));
	}
	public static void main(String[] args) {
		Triangle();
	}

}
