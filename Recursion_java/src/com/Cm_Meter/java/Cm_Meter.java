package com.Cm_Meter.java;

public class Cm_Meter {

	public static void main(String[] args) {
		System.out.println("centimeter to meter:"+meter(3));
	}
   static double meter(double i) {
	   if(i==0)
		   return 1;
	   else
		   return (i+(i/100)-1);
   }
}
