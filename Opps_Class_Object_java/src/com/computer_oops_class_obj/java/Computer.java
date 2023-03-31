package com.computer_oops_class_obj.java;

public class Computer {
   String name;
   int price;
   
   void comp_input(){
	  name="dell";
	  price=50000;
   }
   void comp_disp() {
	   System.out.println("name:"+name);
	   System.out.println("price:"+price);
   }
	public static void main(String[] args) {
		Computer c=new Computer();
		c.comp_input();
		c.comp_disp();
	}

}
