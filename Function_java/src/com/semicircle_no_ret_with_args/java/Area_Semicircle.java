package com.semicircle_no_ret_with_args.java;

import java.util.Scanner;

public class Area_Semicircle {
	static void Semicircle(int r) {
		double Area=1/(float)2*3.14*r*r;
		System.out.println("Area of Semicircle is:"+Area);
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter the value of r:");
		x=sc.nextInt();
		Semicircle(x);
	}

	

}
