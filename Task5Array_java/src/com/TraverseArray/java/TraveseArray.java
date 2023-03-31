package com.TraverseArray.java;
//wap declare an array and traverse an array
public class TraveseArray {

	public static void main(String[] args) {
		int a[]=new int[6]; //declare array
		a[0]=10;
		a[1]=20;
		a[2]=105;
		a[3]=206;
		a[4]=29;
		a[5]=85;
		
		//traverse array
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
