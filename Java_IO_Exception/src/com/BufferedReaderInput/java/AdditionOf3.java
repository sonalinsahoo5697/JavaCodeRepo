package com.BufferedReaderInput.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionOf3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		int a,b,c;
		System.out.println("Enter the value of a , b &c:");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
		System.out.println("Addition of a , b & c is:"+(a+b+c));
	}

}
