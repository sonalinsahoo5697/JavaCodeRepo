package com.BufferedReaderInput.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication {

	public static void main(String[] args)  {
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		int a=0,b=0,c=0;
	    
	    
		System.out.println("Enter the value of a , b &c:");
		try 
		{
			a=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) 
		{
			System.out.println(e);
		} catch (IOException e) 
		{
		System.out.println(e);
		}
		
		try {
			b=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println(e);	
		} catch (IOException e) {
			System.out.println(e);	
		}
		
		try {
			c=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println(e);	
		} catch (IOException e) {
			System.out.println(e);	
		}
		
		int z=((a+b)*c);
		
		System.out.println("Result of (a+b)*c:"+z);
	}
}