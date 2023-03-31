package com.Restaurant_single.java;

public class Customer extends Waiters {
	String cname;
	int tabno;
	
	Customer(){
		cname="akash";
		tabno=2;
		id=11;
		name="waiter_hgxh";
		System.out.println(cname);
		System.out.println(tabno);
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Customer C =new Customer();
	}

}