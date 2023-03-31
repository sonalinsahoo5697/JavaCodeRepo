package com.CloneObj2.java;

public class Hospital implements Cloneable{
  String HospName;
  String HospLocation;
  
	public Hospital(String HospName, String HospLocation) {
	this.HospName=HospName;
	this.HospLocation=HospLocation;
}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Hospital h=new Hospital("aiims","bbsr");
		Hospital h1=(Hospital) h.clone();
		System.out.println(h.HospName+" "+h.HospLocation);
		System.out.println(h1.HospName+" "+h1.HospLocation);
	}

}
