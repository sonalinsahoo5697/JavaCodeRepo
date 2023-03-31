package com.keyword_default.java;

import java.util.Scanner;

public class Keyword_Default {
	String brand;
	int button;
	
	Keyword_Default(){
		System.out.println("Enter the keyword brand & available button:");
		Scanner sc=new Scanner(System.in);
		brand=sc.next();
		button=sc.nextInt();
	}
	void disp() {
		System.out.println("Brand:"+brand);
		System.out.println("Button:"+button);
	}
	public static void main(String[] args) {
		Keyword_Default KD=new Keyword_Default();
		KD.disp();
	}

}
