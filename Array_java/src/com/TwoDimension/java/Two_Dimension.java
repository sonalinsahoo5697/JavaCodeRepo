package com.TwoDimension.java;

import java.util.Scanner;

public class Two_Dimension {

	public static void main(String[] args) {
		int a[][]=new int[2][4];
		System.out.println("Enter value:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=4;j++) {
				a[i][j]=sc.nextInt();
				System.out.println(a[i][j]);
			}
		}
	}
}
