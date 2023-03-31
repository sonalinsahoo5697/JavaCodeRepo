package com.Family_Instance_Initializer.java;

public class GrandFather {
  String grandfatherName;
  int grandfatherAge;
  String HomeAddress;
  
  //instance initializer block
  {
	  grandfatherName="Dayanidhi Sahoo";
	  grandfatherAge=90;
	  System.out.println("GrandFather name:"+grandfatherName);
	  System.out.println("GrandFather age:"+grandfatherAge);
  }
  
  //default constructor
  GrandFather(){
	 HomeAddress="at/po:Indipur,dist:Dhenkanal,pin:759025";
  }
  void disp() {
	  System.out.println("Home address:"+HomeAddress);
  }
  
  //checking the grandfather
  public static void main(String [] args) {
	  GrandFather G=new GrandFather();
  }
}