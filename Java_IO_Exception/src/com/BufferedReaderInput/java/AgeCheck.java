package com.BufferedReaderInput.java;

import java.util.Scanner;

public class AgeCheck {

	public static void main(String[] args)  {
		
		int age[] = new int[3];
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the 3 ages: ");
		
		try {
			for (int i = 0; i < age.length; i++) {
				age[i] = Sc.nextInt();
				ageValidator(age[i]);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	static void ageValidator(int age) throws Exception {
		if(age>=18)
			System.out.println("Eligible For Voting.");
		else
			throw new AgeNotValidateException("This is not a valid age for voting.");
	}

}
