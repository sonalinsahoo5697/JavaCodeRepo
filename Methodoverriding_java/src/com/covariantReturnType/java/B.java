package com.covariantReturnType.java;

public class B extends A{
	
//	int x=90;
	
	B get()
	{
		return this;
	}
	
//	void message()
//	{
//		System.out.println("this is a covariant return type. ");
//	}

	public static void main(String[] args) {
		
		new B().get().message();
//		System.out.println(new B().x);

	}

}