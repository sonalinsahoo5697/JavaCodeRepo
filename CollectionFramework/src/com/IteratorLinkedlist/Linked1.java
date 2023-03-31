package com.IteratorLinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked1 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("sushil");
		list.add("aswini");
		System.out.println(list);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}