package com.Km_Inch.java;

public class Km_Inch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("kilometer to inch:"+Inch(4));
	}
	static int Inch(int n) {
	if(n==0)
		return 1;
	else
		return(n+(n*39370)-1);
	}
}
