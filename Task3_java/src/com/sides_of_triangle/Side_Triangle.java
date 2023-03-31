package com.sides_of_triangle;

import java.util.Scanner;

//input all sides of a triangle and check the triangle is valid or not
public class Side_Triangle {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		System.out.println("Enter the value of c:");
		c=sc.nextInt();
		
		if((a+b)>c) 
			System.out.println("Triangle is valid..");
		else if((a+c)>b)
			System.out.println("Triangle is valid");
		else if((b+c)>a)
			System.out.println("VALID");
		else
			System.out.println("Triangle  not valid..");
	}
}
