package com.km_cm.java;

public class Km_Cm {
	// using recursion

	public static void main(String[] args) {
		System.out.println("Kilometer to centimeter:"+KM(5));
	}
      static int KM(int i) {
    	if(i==0)
    		return 1;
    	else
    		return (i+(i*10000)-1); 
	
    }
}