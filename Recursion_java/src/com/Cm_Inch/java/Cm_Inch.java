package com.Cm_Inch.java;

public class Cm_Inch {

	public static void main(String[] args) {
		System.out.println("centimeter to inch:"+inch(5));
	}
   static double inch(double i) {
	   if(i==0)
		   return 1;
	   else
		   return(i+(i/2.54)-1);
   }
}
