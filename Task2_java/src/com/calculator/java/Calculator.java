package com.calculator.java;

import java.util.Scanner;

//WAP to create calculator using switch statement
public class Calculator {

	public static void main(String[] args) {
		int num1,num2,result,operator;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of first number:");
		num1=sc.nextInt();
		System.out.println("Enter the value of second number:");
		num2=sc.nextInt();
		System.out.println("Choose any operator: +, - , * , / , %");
		operator=sc.nextInt();
		
		switch(operator){
		   case 1:
			   result=num1+num2;
			   System.out.println("Output:"+num1+"+"+num2+"="+ result);
		       break;
		   case 2:
			   result=num1-num2;
			   System.out.println("Output:"+num1+"+"+num2+"="+ result);
			   break;
		   case 3:
			   result=num1*num2;
			   System.out.println("Output:"+num1+"+"+num2+"="+ result);
			   break;
		   case 4:
			   result=num1/num2;
			   System.out.println("Output:"+num1+"+"+num2+"="+ result);
			   break;
		   case 5:
			   result=num1%num2;
			   System.out.println("Output:"+num1+"+"+num2+"="+ result);
			   break;
		  default:
			   System.out.println("ERROR...Answer is not found!!");
			   
		}
	}

}
