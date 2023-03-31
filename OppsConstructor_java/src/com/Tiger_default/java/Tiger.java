package com.Tiger_default.java;

import java.util.Scanner;

public class Tiger {
	String color,Gender;
	int leg,weight;
	Tiger(){
		System.out.println("Enter the tiger color, Gender, how many legs, weight:");
		Scanner sc=new Scanner(System.in);
		color=sc.next();
		Gender=sc.next();
		leg=sc.nextInt();
		weight=sc.nextInt();
		}
	void display() {
		System.out.println("About Tiger:");
		System.out.println("Color:"+color);
		System.out.println("Gender:"+Gender);
		System.out.println("Leg:"+leg);
		System.out.println("Weight:"+weight);
	}

	public static void main(String[] args) {
      Tiger T=new Tiger();
      T.display();
      }

}
