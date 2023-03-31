package com.triangle_with_ret_no_args.java;

public class Triangle_With_Ret_No_Args {
	
	static float Triangle() {
		int base=5, height=6;
		return(1/(float)2*base*height);
	}

	public static void main(String[] args) {
		System.out.println("Area of Triangle is: "+Triangle());
	}

}
