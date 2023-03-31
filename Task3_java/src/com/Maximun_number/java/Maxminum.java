package com.Maximun_number.java;

import java.util.Scanner;

//find the maximum number between three
public class Maxminum {
	
	public static void main(String[] args) {
		int a;int b; int c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		System.out.println("Enter the value of c:");
		c=sc.nextInt();
		
		if(a>b) {
			if(a>c)
				System.out.println("Maximum number:"+a);
			else
				System.out.println("Maximum number:"+c);
		}
		else {
			if(b>c)
				System.out.println("Maximum number:"+b);
			else
				System.out.println("Maximum number:"+c);
		}
	}
}
	
