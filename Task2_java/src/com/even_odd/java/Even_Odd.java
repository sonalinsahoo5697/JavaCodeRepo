package com.even_odd.java;

import java.util.Scanner;

//WAP to check for even or odd number
public class Even_Odd {

	public static void main(String[] args) {
	int a;	
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number: ");
	a=sc.nextInt();
	if(a%2==0) {
		System.out.println(a+ " is even");
	   }
	else {
		System.out.println(a+ " is odd");
	}
  }

}
