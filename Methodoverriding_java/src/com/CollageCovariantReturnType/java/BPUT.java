package com.CollageCovariantReturnType.java;

public class BPUT {
	
   String location;
   int Price;
	
   BPUT gets() {
	  return this;
  }
  
  void input() {
	  location="bbsr";
	  Price=234862358;
  }
  void display() {
	  System.out.println("Clg location:"+location);
	  System.out.println("clg price:"+Price);
  }
}