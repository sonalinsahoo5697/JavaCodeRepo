package com.Km_Meter.java;

public class Km_Meter {

	public static void main(String[] args) {
		System.out.println("kilometer to meter:"+Meter(3));

	}
    static int Meter(int i) {
    	if(i==0)
    		return 1;
    	else
    		return(i+(i*1000)-1);
    }
}
