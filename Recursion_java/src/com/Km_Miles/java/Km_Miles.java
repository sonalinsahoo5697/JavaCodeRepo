package com.Km_Miles.java;

public class Km_Miles {
	// using recursion
	public static void main(String[] args) {
		System.out.println("Kilometer to Miles:"+Miles(3));
	}

	
	static double Miles(double n) {
		if(n==0)
			return 1;
		else
			return(n+(n/1.609)-1);
	}
}
