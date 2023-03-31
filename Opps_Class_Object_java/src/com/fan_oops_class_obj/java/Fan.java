 package com.fan_oops_class_obj.java;

import java.util.Scanner;

public class Fan {
	int blade;
	String Colour;
	
	void Fan_input() {
		System.out.println("Enter value of blade & colour:");
		Scanner sc=new Scanner(System.in);
		blade =sc.nextInt();
		Colour=sc.next();
	}
    void Fan_Display() {
    	System.out.println("blade:"+blade);
    	System.out.println("colour:"+Colour);
    	
    }
	public static void main(String[] args) {
		Fan f=new Fan();
		f.Fan_input();
		f.Fan_Display();
	}

}
