package com.Mobile.java;

public class Mobile {

	 class Model{
		 String phnModel="Real me";
	 }
	public static void main(String[] args) {
		Mobile m=new Mobile();
		Model m1=m.new Model();
		System.out.println("Mobile model name:"+m1.phnModel);
	}

}