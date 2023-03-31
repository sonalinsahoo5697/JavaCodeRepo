package com.stringclass.java;

public class StringClass {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Sonalin");
		sb.append("Nitu");
		System.out.println(sb);
		
		sb.replace(7, 8, "sital");
		System.out.println(sb);
		
		sb.delete(6, 11);
		System.out.println(sb);
	}

}
