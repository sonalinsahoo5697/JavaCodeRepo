package com.int_float.java;

public class Num5 {
	static int N(int i) {
		return(i+i*i);
	}
	static float N(float j,float k) {
		return(j+k*j);
	}

	public static void main(String[] args) {
		System.out.println(Num5.N(5));
		System.out.println(Num5.N(2,3));
	}
}