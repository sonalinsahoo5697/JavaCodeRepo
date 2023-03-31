package com.instanceOf.operator;

public class B extends A{

	public static void main(String[] args) {
		A a = new A();
		A a2 = new B();
		System.out.println(a instanceof A);
		System.out.println(a2 instanceof A);
		System.out.println(a2 instanceof B);
		
		m1(a);
	}

	private static void m1(A a) {
		B b = new B();
		b = (B) a;
		
	}

}
