package com.call_by_reference.java;

public class Call_By_Reference {
	
	int data=60;
	
	static void change(Call_By_Reference c) {
		c.data=c.data+50;
	}

	public static void main(String[] args) {
	Call_By_Reference c=new Call_By_Reference();
	System.out.println("before changes:"+c.data);
	change(c);
	System.out.println("after changes:"+c.data);
	}
}