package com.default_constructor.java;

public class Default_Constructor {
		int a; String name;
		Default_Constructor(){
			a=50;
			name="Nitu";
		}
		void show() {
			System.out.println(a+" "+name);
		}
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		 Default_Constructor ref=new Default_Constructor();
	     ref.show();
 }
}
