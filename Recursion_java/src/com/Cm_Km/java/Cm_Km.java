package com.Cm_Km.java;

public class Cm_Km {

	public static void main(String[] args) {
		System.out.println("centimeter to kilometer:"+Cm(4));

	}
   static double Cm(double i) {
	   if(i==0)
		   return 1;
	   else
		   return (i+(i/100000)-1);
   }
}
