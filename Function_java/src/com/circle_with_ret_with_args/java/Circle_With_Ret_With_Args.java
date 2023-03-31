package com.circle_with_ret_with_args.java;

public class Circle_With_Ret_With_Args {
   static double circle(double r) {
	   return(3.14*r*r);
   }

	public static void main(String[] args) {
		double r=40.5; 
		System.out.println("Area of Circle:"+circle(r)); 
	}

}
