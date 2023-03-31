package com.BookArraylistObject.java;

import java.util.ArrayList;
import java.util.Iterator;

public class BookDetails {

	public static void main(String[] args) {
		Book b1=new Book("jhsh",560);
		Book b2=new Book("bsdh",460);
		Book b3=new Book("sgsj",500);
		
		ArrayList<Book> al=new ArrayList<Book>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Book bk=(Book)itr.next();
			System.out.println(bk.name+" "+bk.price);
		
		
	}
}

}