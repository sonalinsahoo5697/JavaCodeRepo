package com.square_no_return_no_args.java;

import java.util.Scanner;

public class Area_Of_Square {

	static void Square()
	{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int a;
	System.out.println("Enter the value of x: ");
	a=sc.nextInt();
	System.out.println("Area of Square is:"+(a*a));
	}
	public static void main(String[] args) {
		Square();
	}

}
