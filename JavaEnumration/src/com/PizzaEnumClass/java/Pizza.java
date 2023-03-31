package com.PizzaEnumClass.java;
	
public class Pizza {
	
	enum Size 
	{
		
		SMALL,MEDIUM,LARGE,EXTRALARGE;

		static void getSize(Size p) {
			
			//System.out.println(p);
			
			switch(p)
			{
				case SMALL:
					System.out.println("You Ordered " +p+" Pizza.");
					break;
				case MEDIUM:
					System.out.println("You Ordered "+p+" Pizza.");
					break;
				case LARGE:
					System.out.println("You Ordered "+p+" Pizza.");
					break;
				case EXTRALARGE:
					System.out.println("You Ordered "+p+" Pizza.");
					break;
				default:
					System.out.println("U have choose wrong option.");
			}
			
		}
	}
	

	public static void main(String[] args) {
		Size p=Size.LARGE;
		Size.getSize(p);
	}

}
