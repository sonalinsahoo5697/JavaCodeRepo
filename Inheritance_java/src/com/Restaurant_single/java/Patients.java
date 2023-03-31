package com.Restaurant_single.java;

public class Patients extends Doctor {
String pname;
	
	
	Patients(){
		pname="akash";
		name="hgxh";
		salary=80000;
		System.out.println(pname);
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Patients P =new Patients();
	}
}
