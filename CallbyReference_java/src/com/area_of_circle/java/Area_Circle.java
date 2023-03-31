package com.area_of_circle.java;
// find area of circle using call by reference

public class Area_Circle {
	double radious=7;
	double PI=3.14;
	double Area=PI*radious*radious;
	static void change(Area_Circle ac) {
		ac.radious=ac.radious*20;
	}

	public static void main(String[] args) {
		Area_Circle ac=new Area_Circle();
		System.out.println("before changes:"+ac.radious);
		change(ac);
		System.out.println("after changes:"+ac.radious);
		System.out.println("area of circle is:"+ac.Area );
	}

}