package com.BufferedReaderInput.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		int a,b;
		System.out.println("Enter the value of a & b:");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		int z=(a/b);
		System.out.println("Result:"+z);
	}

}