package com.swapping.java;
//swap two number without using third variable
public class Swapping {
	
    static int a=5;
	int b=9;
	static void swap(Swapping ac) {
		ac.b=ac.b+a;
		Swapping.a=ac.b-a;
		ac.b=ac.b-a;
	}

	public static void main(String[] args) {
		Swapping ac=new Swapping();
		System.out.println("before changes:"+"a=" + Swapping.a + " b="+ ac.b);
	    swap(ac);
		System.out.println("results after changes:"+"a=" + Swapping.a + " b="+ ac.b);
	}

}