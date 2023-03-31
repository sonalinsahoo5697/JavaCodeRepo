package com.Arraylistcollection.java;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionFramework {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("nitu");
		list.add("sona");
		list.add("sital");
		System.out.println(list);
		
		System.out.println("====Iterator=====");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
		  System.out.println(itr.next());
		}
			
		System.out.println("=====For-each====");
			list.forEach(a->{
				System.out.println(a);
			});
		
		
	}

}
