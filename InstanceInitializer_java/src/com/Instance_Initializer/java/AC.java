package com.Instance_Initializer.java;

public class AC {
    
	int temp;
	
	//instance initializer block
	{
		temp=50;
		System.out.println(temp);
	}
	//static block
	static
	{
	System.out.println("It is static block which is call 1st");	
	}
	//default constructor
	AC(){
		System.out.println("This is default constructor call after instance initializer block");
	}
	
	public static void main(String[] args) {
		AC a=new AC();

	}

}
