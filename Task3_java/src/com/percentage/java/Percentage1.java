package com.percentage.java;

import java.util.Scanner;

public class Percentage1 {

	public static void main(String[] args) {
		int Phy;
		int Chem;
		int Bio;
		int Math;
		int Comp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter physics mark:");
		Phy=sc.nextInt();
		System.out.println("Enter Chemisty mark:");
		Chem=sc.nextInt();
		System.out.println("Enter Biology mark:");
		Bio=sc.nextInt();
		System.out.println("Enter Mathmatics mark:");
		Math=sc.nextInt();
		System.out.println("Enter Computer mark:");
		Comp=sc.nextInt();
		int Total=Phy+Chem+Bio+Math+Comp;
		System.out.println("Result:"+Total);
		Total=sc.nextInt();
		char Grade;
	
		if(Total>=90) 
		    System.out.println(Grade='A');
		else if(Total>=80)
			System.out.println(Grade='B');
		else if(Total>=70)
			System.out.println(Grade='C');
		else if(Total>=60)
			System.out.println(Grade='D');
		else if(Total>=40)
			System.out.println(Grade='E');
		else if(Total<40)
			System.out.println("FAIL");
		else
			System.out.println('F');
	}


}
