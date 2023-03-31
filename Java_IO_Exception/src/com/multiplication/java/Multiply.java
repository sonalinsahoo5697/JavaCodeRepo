package com.multiplication.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Multiply {

	public static void main(String[] args) throws FileNotFoundException , IOException  {
		FileOutputStream fout=new FileOutputStream("D:\\Mul.txt");
		int a=5,b=3;
		int c=a*b;
		fout.write(c);
		fout.close();
		System.out.println("Result:"+c);
	}

}
