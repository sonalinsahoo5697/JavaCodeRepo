package com.HelloWorld_IO.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
		//for write
		FileOutputStream f=new FileOutputStream("D:\\java_IO.txt");
		String s="public class HelloWorld {"  +"\n"
				+ " public static void main(String args []) {" +"\n"
				+ " System.out.println(\"Hello World....!!\");" +"\n"
				+ "}" +"\n"
				+ "}";
		byte b[]=s.getBytes();
		f.write(b);
        f.close();
        //System.out.println("Successfully print HELLO WORLD!!!");
        
        //for read
        FileInputStream in=new FileInputStream("D:\\java_IO.txt");
        int i=0;
        
        do {
        	System.out.print((char)i);
        }
        while((i=in.read())!=-1);
        
        System.out.println();
        in.close();
        //System.out.println("Read sucessfully");
	}

}
