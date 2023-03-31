package com.nested_while.java;

public class Nested_While {

	public static void main(String[] args) {
		int i=1;
        while(i<=3 )
        {
        	int j=1;
        	while(j<=4) {
        		System.out.print(i+""+j+" ");
        		j++;
        	}
        	System.out.println();
        	i++;
        }
	}

}
