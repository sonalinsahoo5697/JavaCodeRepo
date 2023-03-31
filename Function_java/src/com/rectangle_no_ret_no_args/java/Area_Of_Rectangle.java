package com.rectangle_no_ret_no_args.java;

import java.util.Scanner;

public class Area_Of_Rectangle {
  
	static void Rectangle()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		b=sc.nextInt();
		System.out.println("Area of rectangle is: "+(a*b));
	}
	public static void main(String[] args) {
		Rectangle();
	}

}
