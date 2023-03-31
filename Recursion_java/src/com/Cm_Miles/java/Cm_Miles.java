package com.Cm_Miles.java;

public class Cm_Miles {

	public static void main(String[] args) {
		System.out.println("centimeter to miles:"+miles(6));
	}
   static double miles(double n) {
	   if(n==0)
		   return 1;
	   return (n+(n/160900)-1);
   }
}
 