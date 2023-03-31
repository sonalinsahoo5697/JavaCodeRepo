package com.no_return_with_args.java;

import java.util.Scanner;

public class No_Return_With_Args {
	
	static void mul(int a, int b)//called function
	{
		System.out.println("mul: "+(a*b));	
	}

	public static void main(String[] args) {
		int x,y;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the value of x: ");
			System.out.println("enter the value of y: ");
			x=sc.nextInt();
			y=sc.nextInt();
		}
		mul(x,y);//calling function
		//System.out.println("mul"+(x*y));
	}

}
