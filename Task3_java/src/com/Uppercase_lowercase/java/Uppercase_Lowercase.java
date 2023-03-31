package com.Uppercase_lowercase.java;
//check whether a character is upper case or lower case
import java.util.Scanner;

public class Uppercase_Lowercase {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character:");
		ch=sc.next().charAt(0);
		
		if(ch >='A' && ch<='Z')
			System.out.println("The alphabet "+ch+" is Uppercase");
		else if(ch >='a' && ch<='z')
			System.out.println("The alphabet "+ch+" is Lowercase");
		else
			System.out.println("Error...");
	}

}