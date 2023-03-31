package com.area_of_circle.java;
//find area of circle using call by value

public class Circle {
     double radious=7;
     double pi=3.14;
     double area=pi*radious*radious;//area=?
     void changes(double area) {
    	 area=area+20;
     }
	public static void main(String[] args) {
		 Circle ac=new  Circle();
		 ac.changes(10);
		 System.out.println(ac.radious);
		 System.out.println(ac.area);
	}

}
  