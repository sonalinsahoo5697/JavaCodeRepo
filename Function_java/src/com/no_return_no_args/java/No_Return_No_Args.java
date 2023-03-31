package com.no_return_no_args.java;

import java.util.Scanner;

public class No_Return_No_Args {
	
	@SuppressWarnings("resource")
	static void  sum( ) {
 	 Scanner sc =new Scanner(System.in);  
 	 
 	 int x,y;
 	 System.out.println("Enter the value of x and y");
 	 x=sc.nextInt();
 	 y=sc.nextInt();
 	 System.out.println("sum: "+(x+y));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sum();
	}

}
