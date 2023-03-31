package com.Km_Feet.java;

public class Km_Feet {
   // using recursion
	public static void main(String[] args) {
	  System.out.println("kilometer to feet:"+FT(7));
	}
	
	static int FT(int i) {
		if(i==0)
			return  1;
		else
			return(i+(i*3281)-1);
	}

}
