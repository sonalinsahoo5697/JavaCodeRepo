package com.sum_mul.java;

import java.util.Scanner;

public class SumMul {

	public static void main(String[] args) {
		int s,c,q;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of s:");
		s=sc.nextInt();
		System.out.println("Enter the value of c:");
		c=sc.nextInt();
		System.out.println("Enter the value of q:");
		q=sc.nextInt();
       int z= (s*s*s*s*s)+(c*c)+q;
      System.out.println("Output of s^5+c^2+q is:\n"+z);
	}

}