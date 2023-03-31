package com.multiplication.java;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		int a, b , mul;//take integer value a & b ,mul is for multiplication result
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in); //to take user input , scanner class is used
		System.out.println("Enter the value of a:"); // for showing msg before taking the input
        a=sc.nextInt();        // to take first input value 
        System.out.println("Enter the value of b:");
        b=sc.nextInt();  // to take second input value
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();
        mul=a*b*c;
        System.out.println("Multiplication of a & b is:" +mul );
	}

}
