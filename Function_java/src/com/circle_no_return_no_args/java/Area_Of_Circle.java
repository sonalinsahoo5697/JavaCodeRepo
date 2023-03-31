package com.circle_no_return_no_args.java;

import java.util.Scanner;
// no return no argument
public class Area_Of_Circle {

	static void Area_of_circle()
	{
		Scanner sc=new Scanner(System.in);
		double r;
		System.out.println("Enter the value of r:");
		r=sc.nextDouble();
		System.out.println("Area of circle is: "+(3.14*r*r));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area_of_circle();
	}

}
