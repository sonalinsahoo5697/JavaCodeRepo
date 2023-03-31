package com.SuperKeyword3.java;

public class Hospital {

	String HospName;
	String HospAdd;
	
	 Hospital(String HospName, String HospAdd) {
		this.HospName=HospName;
		this.HospAdd=HospAdd;
	}
		void Disp() {
			System.out.println("Hospital name:"+HospName);
			System.out.println("Hospital address:"+HospAdd);
		}
}
