package com.ThreeDimension.java;

import java.util.Scanner;

public class Three_Dimension {

	public static void main(String[] args) {
		int a[][][]=new int[2][2][4];
		System.out.println("Enter value:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				for(int k=0;k<=3;k++) {
				a[i][j][k]=sc.nextInt();
				System.out.println("Elements are:"+a[i][j][k]);
				}
			}
		}
	}

}
