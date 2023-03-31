package com.polymorphism.java;

public class B extends A{
	
	void m1()
	{
		System.out.println("calling child class B....");
	}

	public static void main(String[] args) {
		
		A a1 = new B();//up-casting
		a1.m1();
//		try {
//			B b1 = (B) new A();//as down-casting
//			b1.m1();	
//		}catch(Exception e)
//		{
//			System.out.println("Class Cast Exception.");
//		}
	}

}
