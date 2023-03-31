package com.Cm_Yard.java;

public class Cm_Yard {

	public static void main(String[] args) {
		System.out.println("centimeter to yard:"+yard(4));

	}
   static double yard(double i) {
	   if(i==0)
		   return 1;
	   else
		   return (i+(i/91.44)-1);
   }
}