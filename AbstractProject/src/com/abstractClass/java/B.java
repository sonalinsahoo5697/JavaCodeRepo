package com.abstractClass.java;

public class B extends A{

	public static void main(String[] args) {
		B b = new B();
		b.m1();

	}

	@Override //annotation
	void m1() {
		System.out.println("this is abstract method.");
		
	}

}
/*

 partial abstract (50%)
 
 interface - 100%  fully abstract
 
 1. abstract keyword
 
 2. can't be instantiate 

 3. constructors and static methods.
 
 4. final method can be declared.

*/