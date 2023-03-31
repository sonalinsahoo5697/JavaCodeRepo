package com.InnerClass.java;

public class OuterClass {
	
	class InnerClass{
		int x = 89;
		
		void m1()
		{
			System.out.println("Inner Class Method.");
		}
	}

	public static void main(String[] args) {
		
		OuterClass ot = new OuterClass();
		
		InnerClass in = ot.new InnerClass();
		
		System.out.println(in.x);
		in.m1();

	}
}