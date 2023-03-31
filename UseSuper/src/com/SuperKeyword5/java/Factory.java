package com.SuperKeyword5.java;

public class Factory {
  String FactoryName;
  String FactoryLocation;
  
   Factory(String FactoryName,String FactoryLocation ){
	   this.FactoryName=FactoryName;
	   this.FactoryLocation=FactoryLocation;
   }
   void print() {
	   System.out.println("Factory name:"+FactoryName);
	   System.out.println("Factory Location:"+FactoryLocation);
   }
}