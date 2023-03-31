package com.fahrenite_with_ret_with_args.java;

public class Fahrenite {
	
   public static void main(String[] args) {
	double C=45.6f;
     System.out.println("Fahrenite: "+Fah(C));
	}
	static double Fah(double C) {
		 return((double)9/5*C+3);
		}
}
