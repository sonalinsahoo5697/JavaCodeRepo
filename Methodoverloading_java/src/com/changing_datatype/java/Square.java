 package com.changing_datatype.java;

public class Square {
	
	static int sq(int x){
		return(x*x);
	}
	static double sq(double x) {
		return(x*x);
	}

	public static void main(String[] args) {
		System.out.println(Square.sq(4));
		System.out.println(Square.sq(2.4));

	}

}
