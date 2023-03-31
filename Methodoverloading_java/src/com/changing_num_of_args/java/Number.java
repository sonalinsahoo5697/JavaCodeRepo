package com.changing_num_of_args.java;
//by changing number of arguments
public class Number {
	 static int nm(int i, int j) {
		return (i+j);
	}
	 
	 static int nm(int i, int j, int k) {
			return (i+j+k);
		}
	 

	public static void main(String[] args) {
		System.out.println(Number.nm(5,6));
		System.out.println(Number.nm(8,5,4));

	}

}
