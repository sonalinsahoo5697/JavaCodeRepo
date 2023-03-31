package com.triangle_with_ret_with_args.java;

public class Triangle_With_Ret_With_Args {
    
	static float Triangle (int b, int h) {
		return(1/(float)2*b*h);
	}
	public static void main(String[] args) {
		int b=5, h= 6;
		System.out.println("Area of triangle is: "+Triangle(b,h));
	}

}
