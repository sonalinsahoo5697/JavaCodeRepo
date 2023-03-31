package com.CovariantReturnType2.java;

public class A1 {
	
	A1 get()
	{
		return this;
	}

	void print() {
		System.out.println("Inside the class A1.");
	}
}
