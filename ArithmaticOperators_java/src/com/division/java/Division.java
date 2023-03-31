package com.division.java;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		double a , b ,div;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextDouble();
		System.out.println("Enter the value of b:");
		b=sc.nextDouble();
		div=a/b;
		System.out.println("Result : "+div);
		}

}
