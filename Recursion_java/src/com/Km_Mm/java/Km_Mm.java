package com.Km_Mm.java;

public class Km_Mm {

	public static void main(String[] args) {
		System.out.println("kilometer to Milimeter:"+Mm(5));
    }
    static double Mm(double i) {
    	if(i==0)
    		return 1;
    	else
    		return(i+(i*(1e+6)-1));
    }
}
