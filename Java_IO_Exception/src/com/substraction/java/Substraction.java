package com.substraction.java;

import java.io.FileOutputStream;
import java.io.IOException;

public class Substraction {

	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("D:\\java_sub.txt");
		int a=12,b=6;
		int c=a-b;
		f.write(c);
		f.close();
		System.out.println("result:"+c);
	}

}
