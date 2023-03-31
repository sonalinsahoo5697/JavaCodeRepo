package com.FileOutput.java;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		//for write
		FileOutputStream f=new FileOutputStream("D:\\javaio.txt");
          int a=65;
          f.write(a);
          f.close();
          System.out.println("success.....");//write
       
          //for read
          FileInputStream in=new FileInputStream("D:\\javaio.txt");
          int i=in.read();//Read
          System.out.println((char)i);//convert byte to char
          in.close();
          System.out.println("FILE READING SUCCESSFUL");
          
          //for write
          FileOutputStream fout=new FileOutputStream("D:\\javaio2.txt");
          String s="Hello world";
          byte b[]=s.getBytes();
          fout.write(b);
          fout.close();
          System.out.println("SUCCESS!!!");
          
          //for read
          FileInputStream in2=new FileInputStream("D:\\javaio2.txt");
          int i2=0;
          while((i2=in2.read())!=-1) {
        	  System.out.println((char)i2);
          }
          System.out.println();
          in2.close();
          System.out.println("File reading successfully...");
	}
}