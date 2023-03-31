package com.addition.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Addition {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileOutputStream f=new FileOutputStream("D:\\java_add.txt");
		int a=15,b=60;
		int c=a+b;
		f.write(c);
		f.close();
		System.out.println("Result:"+c);
	}

}