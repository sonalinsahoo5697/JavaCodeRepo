package com.rectangle_with_ret_with_args.java;

public class Rectangle_With_Ret_With_Args {
	
	    static int Rectangle(int x,int y) {
	    int Area=x*y;
		return(Area);
	}

	public static void main(String[] args) {
		int x=5,y=4;
		System.out.println("Area of rectangle is:"+Rectangle(x,y));
	}

}
