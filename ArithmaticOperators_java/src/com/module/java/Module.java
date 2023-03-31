package com.module.java;

import java.util.Scanner;

public class Module {

	public static void main(String[] args) {
		int a, b, mod;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();
        mod=a%b;
        System.out.println("module of a%b:"+mod);
	}

}