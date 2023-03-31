package com.Division.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Division {

	public static void main(String[] args) throws FileNotFoundException  ,IOException{
		FileOutputStream fout=new FileOutputStream("D:\\Div.txt");
		int a=15,b=3;
        int c=a/b;
        fout.write(c);
        fout.close();
        System.out.println("Result:"+c);
	}

}
