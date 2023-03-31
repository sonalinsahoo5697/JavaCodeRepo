package com.Cm_Mm.java;

public class Cm_Mm {

	public static void main(String[] args) {
		System.out.println("centimeter to milimeter:"+Mm(4));
	}
    static int Mm(int i) {
    	if(i==0)
    		return 1;
    	else
    		return (i+(i*10)-1);
    }
}
