package com.divisible.java;

import java.util.Scanner;

//check the number is divisible by 5,11 or not
public class Divisible {

	public static void main(String[] args) {
		int a;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		
		if(a%5==0 && a%11==0)
			System.out.println("this number is divisible by 5 & 11");
		else
			System.out.println("this number is not divisible by 5 & 11");
	}

}
