package com.CloneObj1.java;

public class School implements Cloneable{
  String SchoolName;
  String SchoolAddress;
  
	public School(String SchoolName, String SchoolAddress) {
	 this.SchoolName=SchoolName;
	 this.SchoolAddress=SchoolAddress;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		School s=new School("xyz","X-45/w");
		School s1=(School) s.clone();
		
		System.out.println("School Name is:"+s.SchoolName);
		System.out.println("School Address is:"+s.SchoolAddress);
		System.out.println("School Name is:"+s1.SchoolName);
		System.out.println("School Address is:"+s1.SchoolAddress);
	}

}