package com.Hybrid1.java;

public class C implements B1,B2 {

	public static void main(String[] args) {
		C c=new C();
		c.m();
		c.m1();
		c.m2();

	}

	@Override
	public void m() {
		System.out.println("It is A");
		
	}

	@Override
	public void m2() {
		System.out.println("It is B2");
		
	}

	@Override
	public void m1() {
		System.out.println("It is B1");
	}
 
}
