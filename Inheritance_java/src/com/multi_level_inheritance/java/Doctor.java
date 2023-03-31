package com.multi_level_inheritance.java;

public class Doctor extends Hospital {
	String prf,dept_doc;
	int sal_doc;
	
	Doctor(){
		hosp_nm="AIIMS";
		address="Khandagiri,bbsr";
		prf="Oncology";
		dept_doc="hematology";
		sal_doc=860000;
		System.out.println("Hospital name:"+hosp_nm);
		System.out.println("Hospital address:"+address);
		System.out.println("professor:"+prf);
		System.out.println("DEpartment of dector:"+dept_doc);
		System.out.println("doctors salary:"+sal_doc);
	}

	public static void main(String[] args) {
		Doctor d=new Doctor();
	}

}
