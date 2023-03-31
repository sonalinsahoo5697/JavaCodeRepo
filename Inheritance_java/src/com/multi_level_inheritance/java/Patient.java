package com.multi_level_inheritance.java;

public class Patient extends Doctor{
	String pat_nm;
	int age;
	
	Patient(){
		pat_nm="bipin rout";
		age=60;
		System.out.println("patient name:"+pat_nm);
		System.out.println("patient age:"+age);
	}

	public static void main(String[] args) {
		Patient p=new Patient();
   }

}
