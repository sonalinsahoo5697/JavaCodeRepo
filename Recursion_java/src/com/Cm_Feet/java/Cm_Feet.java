package com.Cm_Feet.java;

public class Cm_Feet {

	public static void main(String[] args) {
		System.out.println("centimeter to feet:"+ft(3));
	}
     static double ft(double n) {
    	if(n==0)
    		return 1;
    	else
    		return (n+(n/30.48)-n);
    }
}