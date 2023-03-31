package com.SuperKeyword2.java;

public class Company {
  String CompName;
  String CompAdd;
  
  public Company(String CompName, String CompAdd) {
	  this.CompName=CompName;
	  this.CompAdd=CompAdd;
  }
  void details() {
	  System.out.println("Company name is:"+CompName);
	  System.out.println("Company Address is:"+CompAdd);
  }
}