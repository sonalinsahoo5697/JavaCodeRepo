package com.If_else.java;

import java.util.Scanner;

// If Else statement
public class If_Else {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of age:");
		age=sc.nextInt();
		if(age>=18)
			System.out.println("Eligible for voting");
		else
			System.out.println("Not eligible for voting");
	}

}
