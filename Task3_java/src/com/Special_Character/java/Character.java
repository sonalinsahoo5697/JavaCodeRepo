package com.Special_Character.java;
//input a character and check alphabet,digit,special character
import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		char ch;
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character:");
		ch=sc.next().charAt(0);
		

		if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')) {
			System.out.println(ch+":it is a  Alphabet");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println(ch+":it is a digit");
		}
		else if((ch=='*')||(ch=='$')||(ch=='#')||(ch=='@')) {
			System.out.println(ch+":Special character");
		}
		else
			System.out.println("There is no alphabet , digit & special character");
	}

}
