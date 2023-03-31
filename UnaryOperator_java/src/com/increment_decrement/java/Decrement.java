package com.increment_decrement.java;

public class Decrement {

	public static void main(String[] args) {
		int a=2; 
        int y=a-- + --a  + ++a;  //  a-- means 1st assign then decrement & --a means 1st decrement then assign 
        System.out.println("result is:"+y); // show the output
	}

}
