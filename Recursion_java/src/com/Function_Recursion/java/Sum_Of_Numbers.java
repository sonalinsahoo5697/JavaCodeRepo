 package com.Function_Recursion.java;

public class Sum_Of_Numbers {

	public static void main(String[] args) {
		System.out.println("Sum of numbers: "+ (10));
	}
	
	static int Func(int i) {
		if(i==0)// condition for true
			return 0;
		else // condition for false
			return (i+Func(i-1));
	}

}
