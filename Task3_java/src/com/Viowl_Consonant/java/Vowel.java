package com.Viowl_Consonant.java;
//enter a character and check vowel or consonant
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		char vowel;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the alphabet:");
		vowel=sc.next().charAt(0);
		
		  if((vowel=='a')|| (vowel=='e')||(vowel=='i')||(vowel=='o')||(vowel=='u')||
				  (vowel=='A')|| (vowel=='E')||(vowel=='I')||(vowel=='O')||(vowel=='U')){
			  System.out.println("It is a viowel");
		  }
		  else {
			  System.out.println("It is a consonant");
		  }

	}

}
