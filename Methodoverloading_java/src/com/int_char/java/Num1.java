package com.int_char.java;

public class Num1 {
	static int m(int j,int k) {
		return(j*j+k);
	}
	static char m(char i) {
		return(i);
	}

	public static void main(String[] args) {
		System.out.println(Num1.m(5,6));
		System.out.println(Num1.m('s'));

	}
}