package com.SwitchCase.java;
//Switch case
public class Switch_case {

	public static void main(String[] args) {
		int n=14;
		switch(n%2) {  // 0 or 1 
		case 1:
			System.out.println("number is even:"+n);
			break;
		case 2:
			System.out.println("number is odd:"+n);
			break;
	    default:
	    	System.out.println("the number not exist");
		}
	}

}
