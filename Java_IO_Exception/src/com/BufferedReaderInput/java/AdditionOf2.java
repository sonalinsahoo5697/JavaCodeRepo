package com.BufferedReaderInput.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionOf2 {

	public static void main(String[] args) {//Exception
		
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = 0,b = 0;
		
		System.out.println("Enter the value of a and b:");
		
		try {
			a = Integer.parseInt(Br.readLine());// '2'=>2, 'q'=>
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		try {
			b = Integer.parseInt(Br.readLine());
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("Addition OF 2 Numbers: "+(a+b));
		
	}

}
