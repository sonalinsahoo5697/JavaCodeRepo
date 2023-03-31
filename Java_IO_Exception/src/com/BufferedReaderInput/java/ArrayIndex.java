package com.BufferedReaderInput.java;

public class ArrayIndex {

	public static void main(String[] args) {
		
		try {
			int a[] = new int[6];
			
			a[0] = 89;
			a[1] = 10;
			a[2] = 23;
			a[3] = 45;
			a[4] = 67;
			a[5] = 98;
			a[6] = 76;
			
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
				
	}

}
