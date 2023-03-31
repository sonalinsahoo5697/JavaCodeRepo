package com.circle_with_ret_no_args.java;

import java.util.Scanner;

public class Circle_With_Ret_No_Args {
	
	public static double circle() {
		Scanner sc=new Scanner(System.in);
		int r;
		System.out.println("Enter the value of r:");
		r=sc.nextInt();
		return (3.14*r*r) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double d = circle(); 
       System.out.println("Area of circle is:"+d);
	}

}
