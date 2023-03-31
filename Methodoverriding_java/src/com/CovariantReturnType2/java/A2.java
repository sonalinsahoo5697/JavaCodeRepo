package com.CovariantReturnType2.java;

public class A2 extends A1{

	A2 get()
	{
		return this;
	}
	
	void print() {
		System.out.println("Inside the class A2.");
	}
}
