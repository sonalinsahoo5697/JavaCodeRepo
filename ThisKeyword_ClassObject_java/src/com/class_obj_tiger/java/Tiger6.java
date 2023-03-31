package com.class_obj_tiger.java;

public class Tiger6 {
	String color,Gender;
	
	Tiger6(String color,String Gender){
		Tiger6 t5=m3();
		System.out.println(t5.toString());
	}
	 Tiger6 m3() {
		System.out.println("this can be use to return method call");
		return this;
		}

	public static void main(String[] args) {
		Tiger6 t5=new Tiger6("white","female");
	}

}
