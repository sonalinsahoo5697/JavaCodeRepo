package com.byte_short.java;

public class Num1 {

	public static void main(String[] args) {
        System.out.println(Num1.n((byte) 10));
        System.out.println(Num1.n(5));
	}

	  static short n(int i) {
		return (short) (3*i) ;
	}

	static byte n(byte i) {
		return (byte)(2*(i));
	}

}