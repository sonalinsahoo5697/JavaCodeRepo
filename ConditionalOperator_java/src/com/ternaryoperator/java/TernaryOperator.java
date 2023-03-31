package com.ternaryoperator.java;

public class TernaryOperator {

	public static void main(String[] args) {
		int n=15;          // here n is integer data type & assign the value 15
		String result=(n/3==2)? " divisible ":" not divisible ";   // use ternary operator
		System.out.println(result);          // showing the result

		boolean b;
		b= (n>=25) ? true : false ;
		if(b==true)
			System.out.println(n+" is greater than 25 ");
		else
			System.out.println(n+" is lessthan 25");
	}

}