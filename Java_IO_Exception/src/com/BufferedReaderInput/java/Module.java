package com.BufferedReaderInput.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Module {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		System.out.println("Enter the value a & b:");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		System.out.println((a%b));
	}
}