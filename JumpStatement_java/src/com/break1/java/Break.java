package com.break1.java;

public class Break {

	public static void main(String[] args) {
		int n;
		for(n=2;n<=100;n+=2) {
			if(n==90) {
				break;
			}
			System.out.println(n);
		}
	}

}