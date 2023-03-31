package com.Swap.java;
 //swap two number without using 3rd variable
public class Swap {

	public static void main(String[] args) {
		int a=20 ,b=30;   
		b=b+a;
		a=b-a; //b-a=(a+b)-a= b , here a is swapped
		b=b-a; //b-a=(a+b)-b= a , here b is swapped
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
	}

}