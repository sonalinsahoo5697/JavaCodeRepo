package com.BufferedReaderInput.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubstractionOf2 {

	public static void main(String[] args)throws Exception {
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		
		int a,b,c;
		System.out.println("Enter the value of a, b  & c:");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
		System.out.println("Substraction of three number is:"+(a-b-c));
	}

}