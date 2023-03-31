package com.int_double.java;

public class Num4 {
	static int n(int i,int j) {
		return(i*j);
	}
	static double n(double i) {
		return(i*i);
	}

	public static void main(String[] args) {
		System.out.println(Num4.n(5,2));
		System.out.println(Num4.n(2.5));
	}

}