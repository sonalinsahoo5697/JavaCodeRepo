package com.covariantReturnType.java;

public class A {

	A get() {
		return this;
	}

	void message()
	{
		System.out.println("this is a covariant return type. ");
	}
}
