package com.class_obj_tiger.java;

public class Tiger4 {
String color,Gender;
	
	Tiger4(String color,String Gender){
	   m2(this);
	}

	 void m2(Tiger4 tiger4) {
		tiger4.color=color;
		tiger4.Gender=Gender;
		System.out.println("this use to pass argument in a method class");
		
	}

	public static void main(String[] args) {
		Tiger4 t3=new Tiger4("white","female");

	}

}
