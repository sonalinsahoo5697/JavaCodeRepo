package com.Nasted_if_else.java;
//find the greatest among 3 number using Nested if_else statement
public class Nasted_if_Else {

	public static void main(String[] args) {
		int a=3, b=4, c=5;
		if(a>b) {
			if(a>c)
				System.out.println("a is greater than c");
			else
				System.out.println("c is greater than a");
		}
		else {
			if(b>c)
				System.out.println("b is greater than c");
			else
				System.out.println("c is grater than b");
		}
	}
}