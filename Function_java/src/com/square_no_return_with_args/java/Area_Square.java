package com.square_no_return_with_args.java;

import java.util.Scanner;

public class Area_Square {
	
	static void Square(int a) {
		System.out.println("Area of Square: "+(a*a));
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter the value of x");
		x=sc.nextInt();
		Square(x);
	}

}
   