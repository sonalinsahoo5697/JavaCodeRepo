 package com.constructor.java;

public class Constructor  {
     int x=0;//non-static
     static int y=0;//static
	
	Constructor () //default constructor
	{
	  x++;
	 System.out.println(x);
	 
	  /*y++ ;
	 System.out.println(y);*/
	}
	public static void main(String[] args) {
		Constructor I= new Constructor();
		Constructor I2= new Constructor();
		Constructor I3 = new Constructor();
	}

}
