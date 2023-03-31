package com.FamilyInterface.java;

public class Child implements A1,A2 {

	public static void main(String[] args) {
		Child c=new Child();
        c.m1();
        c.m2();
	}

	@Override
	public void m2() {
		System.out.println("Parent A2");
		
	}

	@Override
	public void m1() {
		System.out.println("Parent A1");
		
	}

}