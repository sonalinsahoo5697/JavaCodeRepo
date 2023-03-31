package com.circle_no_return_with_args.java;

import java.util.Scanner;
  // no return with argument 
public class Area_Circle {

	    static void Circle( double a)
		{
			System.out.println("Area of Circle is: "+(3.14*a*a));
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double r;
			System.out.println("Enter the value of r:");
			r=sc.nextDouble();
			Circle(r);
		}
		

}


