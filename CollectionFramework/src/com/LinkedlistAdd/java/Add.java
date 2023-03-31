package com.LinkedlistAdd.java;

import java.util.LinkedList;

public class Add {

	public static void main(String[] args) {
		LinkedList<String> l1 =new LinkedList<String>();
		l1.add("aswini");
		l1.add("sushil");
		System.out.println(l1);
		
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("sonalin");
		l2.add("arnamita");
		l2.add("lipsa");
		System.out.println(l2);
		
		l1.add(1, "nimble");
		System.out.println(l1);
		
		l1.addAll(0, l2);
		System.out.println(l1);
		
		LinkedList<String> l3=new LinkedList<String>();
		l3.add("tanmaya");
		l3.add("Lingaraj");
		System.out.println(l3);
		l2.addAll(l3);
		System.out.println(l2);
		
		l1.addAll(0, l3);
		System.out.println(l1);

	}

}
