package com.class_obj_tiger.java;

public class Tiger {
	String color,Gender;

	Tiger(String color,String Gender){
		this.color=color;
		this.Gender=Gender;
		System.out.println(color+" "+Gender);
	}

	public static void main(String[] args) {
		Tiger t=new Tiger("white","female");	

	}

}
