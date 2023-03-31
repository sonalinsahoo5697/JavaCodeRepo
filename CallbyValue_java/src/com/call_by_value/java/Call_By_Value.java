package com.call_by_value.java;

public class Call_By_Value {
	
	int data=90;
	
	void change(int d) {
		d=d+50;
	}

	public static void main(String[] args) {
     Call_By_Value C=new Call_By_Value();
     C.change(10);
     System.out.println(C.data);
	}

}
