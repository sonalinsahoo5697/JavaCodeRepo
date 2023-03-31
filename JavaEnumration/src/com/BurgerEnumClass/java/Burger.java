package com.BurgerEnumClass.java;

public class Burger {
	
	enum Size{
		SMALL,MEDIUM,LARGE;


	 static void Order(Size s) {
		
		switch(s) {
		case SMALL:
			System.out.println("Small burger");
			break;
		case MEDIUM:
			System.out.println("medium burger");
			break;
		case LARGE:
			System.out.println("large burger");
			break;
		default:
			System.out.println("Unavailable !!!");	
		}
	}
	
}
	public static void main(String[] args) {
		Size s=Size.SMALL;
		Size.Order(s);
	}

}
