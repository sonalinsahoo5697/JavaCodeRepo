package com.semicircle_no_ret_no_args.java;

import java.util.Scanner;

public class Semi_Circle {

	static void Semicircle() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int r ;
		System.out.println("Enter the value of r:");
		r=sc.nextInt();
		double Area=1/(float)2*3.14*r*r;
		System.out.println("Area of semicircle is: "+Area);
	}
	public static void main(String[] args) {
		Semicircle();
	}

}
