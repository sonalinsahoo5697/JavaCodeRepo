package com.nested2.java;
// find the greatest among 5 number
public class Greater {

	public static void main(String[] args) {
		int a=15, b =20, c= 25, d=35, e=30;
		if(a>b) {
			if(a>c) {
				if(a>d) {
					if(a>e)
						System.out.println("a is greater");
					else
						System.out.println(" e is greater");
				}
				else {
					if(d>e) 
						System.out.println("d is greater");
					else
						System.out.println("e is greater");
					}
				}
			else {
				if(c>b) {
					if(c>e)
					  System.out.println("c is greater");
				    else
					  System.out.println(" e is greater");
				}
				else{
					if(d>e)
						System.out.println("d is greater");
					else
						System.out.println("e is greater");
				}
			}
		}
			else {
				if(b>c)
					System.out.println("b is greater");
				else
					System.out.println("c is greater");
			
			}
	    }
	}
}