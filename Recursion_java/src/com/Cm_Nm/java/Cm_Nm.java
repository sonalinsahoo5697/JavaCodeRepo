package com.Cm_Nm.java;

public class Cm_Nm {

	public static void main(String[] args) {
		System.out.println("centimeter to nanometer:"+Nm(5));
	}
   static int Nm(int n) {
	   if(n==0)
		   return 1;
	   else
		   return (n+(n*10000000)-1);
   }
}
