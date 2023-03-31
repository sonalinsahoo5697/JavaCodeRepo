package com.Addition.java;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a, b , Sum ; //a , b & sum is a integer data type
		Scanner sc=new Scanner(System.in); // here Scanner is class , sc is a instance ,new is a object
		System.out.println("Enter the value of a:"); //showing the 1st message
		a=sc.nextInt();                              // to take 1st input value
		System.out.println("Enter the value of b:"); //showing the 2nd message
		b=sc.nextInt();                              //to take 2nd input value
		Sum=a+b; 
		System.out.println("Addition of a & b is:"+Sum);
		
   }

}
