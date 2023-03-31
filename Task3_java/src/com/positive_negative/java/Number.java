package com.positive_negative.java;

import java.util.Scanner;

//check the number is positive ,negative or zero.
public class Number {

	public static void main(String[] args) {
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		
		if(a>0)
			System.out.println(a+":this number is positive");
		else if(a<0)
			System.out.println(a+":This number is negative");
		else
			System.out.println("ZERO...");
	}

}
