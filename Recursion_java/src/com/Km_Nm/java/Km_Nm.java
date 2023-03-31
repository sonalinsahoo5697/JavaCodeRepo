package com.Km_Nm.java;

public class Km_Nm {

	public static void main(String[] args) {
		System.out.println("kilometer to nanometer:"+Nm(2));

	}
	static double Nm(double n) {
		if(n==0)
			return 1;
		else
			return(n+(n*(1e+12)-1));
	}

}
