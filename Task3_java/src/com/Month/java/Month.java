package com.Month.java;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		int n;
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Input the month number:");
        n=sc.nextInt();
        
        switch(n) {
        //cases for 31 days
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          System.out.println("31 days");
          break;
          
          //cases for 30 days
        case 4:
        case 6:
        case 9:
        case 11:
        	System.out.println("30 days");
        	break;
        	//cases for 28/29 days
        case 2:
        	System.out.println("28/29 days");
        	break;
        default:
        	System.out.println("Invalid month..");	
        	break;
        }
	}

}