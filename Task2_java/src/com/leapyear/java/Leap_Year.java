 package com.leapyear.java;

import java.util.Scanner;

//WAP to check for leap year
public class Leap_Year {

	public static void main(String[] args) {
		int year;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		year=sc.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println(year+" this is leap year");
				}
				else {
					System.out.println(year+" this is not leap year");
				}
			}
			else {
				System.out.println("this year is "+year +" leap year");
			}
		}
		else {
			System.out.println("this year is "+ year +" not leap year");
		}
	}

}
