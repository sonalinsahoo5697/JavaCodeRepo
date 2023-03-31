package com.stringtoken.java;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Welcome to nimble tech");
		//System.out.println(st);

		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//System.out.println(st.nextToken(" "));
	}

}
