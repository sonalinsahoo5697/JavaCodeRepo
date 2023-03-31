package com.rectangle_no_ret_with_args.java;

import java.util.Scanner;

public class Area_Rectangle {
	
	static void Rectangle(int a,int b) {
		System.out.println("Area of Rectangle is: "+(a*b));
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter the value of x:");
		x=sc.nextInt();
		int y;
		System.out.println("Enter the value of y:");
		y=sc.nextInt();
		Rectangle(x,y);
	}

}
