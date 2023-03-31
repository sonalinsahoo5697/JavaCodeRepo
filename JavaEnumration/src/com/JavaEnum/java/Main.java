 package com.JavaEnum.java;

public class Main {
	
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALARGE
	}

	enum Month {
		JAN, FEB, MAR, APRIL
	}
	
	public static void main(String[] args) {
		System.out.println(Size.SMALL);
		System.out.println(Size.MEDIUM);
		System.out.println(Month.MAR);
		
		//called as return enum string
		System.out.println(Size.SMALL.toString());
		System.out.println(Size.MEDIUM.name());

	}

}