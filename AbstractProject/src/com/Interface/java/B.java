package com.Interface.java;

public class B implements A{

	public static void main(String[] args) {
		
		B b = new B();
		b.m1();

	}

	@Override
	public void m1() {
		System.out.println("abstract method.");
		
	}

}
