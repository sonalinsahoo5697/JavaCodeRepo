package com.nested1.java;
// find the greatest among 4 number using nested if_else statement
public class Greatest {

	public static void main(String[] args) {
		int a=10025 , b=83, c=615, d=4657; 
		if(a>b) 
		{
			if(a>c) 
			{
				if(a>d)
					System.out.println("a is greataer" +a);
				else
					System.out.println("d is greater" +d);
			}
			else {
				if(c>d)
					System.out.println("c is greater" + c);
				else
					System.out.println("d is greater" + d);
			     }
		}
		 else {
			if(b>c) {
				if(b>d)
					System.out.println(b+ " is greater");
				else
					System.out.println(d+ " is greater");
			}
		  else{
                if(c>d) 
			         System.out.println("c is greater" +c);
			     else
				     System.out.println("d is greater" +d);
		}
	  }
	}
}




