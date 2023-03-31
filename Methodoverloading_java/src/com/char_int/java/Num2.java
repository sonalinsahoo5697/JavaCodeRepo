package com.char_int.java;

public class Num2 {
	
	static char nm(char i) {
		return(i);
	}
	  static int nm(int j,int k) {
		return(j*j+k*k);
	}

	public static void main(String[] args) {
		System.out.println(Num2.nm('s'));
       System.out.println(Num2.nm(5,6));
	}

}