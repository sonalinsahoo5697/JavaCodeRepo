package com.Km_Yard.java;

public class Km_Yard {

	public static void main(String[] args) {
		System.out.println("kilometr to yard:"+Yard(3));
	}
	static double Yard(double i) {
		if(i==0)
			return 1;
		else
			return(i+(i*1094)-1);
	}

}
