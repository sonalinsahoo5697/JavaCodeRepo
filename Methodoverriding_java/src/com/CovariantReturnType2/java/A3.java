package com.CovariantReturnType2.java;

public class A3 extends A2{
	
	A3 get()
	{
		return this;
	}
	
	void print() {
		System.out.println("Inside the class A3.");
	}

}
