package com.stringcompare.java;

public class StringCompare {

	public static void main(String[] args) {
		String s1="HELLO";
		String s2="hello";
		String s3="WELCOME";
		String s4="welcome";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s4));
        System.out.println(s3.compareTo(s4));
	}

}
