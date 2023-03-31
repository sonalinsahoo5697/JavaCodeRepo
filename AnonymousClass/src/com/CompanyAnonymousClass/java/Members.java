package com.CompanyAnonymousClass.java;

public class Members {
 int numberOfMembers=500;
 
	 public void createClass() {
	 Company c=new Company() {
	 public void disp() {
		 System.out.println("Numbers f Members are:"+numberOfMembers);
	 	}
	 };
	 c.disp();
	 }
}