package com.continu.java;

public class Jump_Statement {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=100;i++)
		{
			if(i==50) {
				System.out.println("Now continue Hit");
				continue;
			}
			System.out.println(i);
		}

	}

}
