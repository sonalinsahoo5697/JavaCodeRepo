package com.triangle_no_return_with_args.java;

import java.util.Scanner;

public class Area_Triangle {
	
	static void Triangle(int base,int height) {
		System.out.println("Area of triangle: "+(1/(float)2*base*height));
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        int a, b;
        System.out.println("Enter the value of a: ");
        a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        b=sc.nextInt();
        Triangle(a,b);
	}

} 
