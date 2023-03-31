package com.nested_dowhile.java;

public class Nested_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i=1;
      do {
    	  int j=1;
    	  do {
    		  System.out.print(i+""+j+" ");
    		  j++;
    	  }while(j<=3);
    	  i++;
    	  System.out.println();
      }while(i<=3);
	}

}
