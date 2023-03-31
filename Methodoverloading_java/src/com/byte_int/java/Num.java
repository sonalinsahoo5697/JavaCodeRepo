package com.byte_int.java;

public class Num {
	
	static byte a(byte i) {
		return(i);
	}
	
	private static int a(int i) {
		return(i*i*i*i);
	}

	public static void main(String[] args) {
	System.out.println(Num.a((byte) 8));
    System.out.println(Num.a(2));
	}

}
