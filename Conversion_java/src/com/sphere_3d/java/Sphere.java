package com.sphere_3d.java;

public class Sphere {

	public static void main(String[] args) {
		int r=2;
		double volume ,curved ;
		volume=4/3*3.14*r*r*r ;
		curved=4*3.14*r*r ;
		System.out.println("Volume of sphere is:"+volume);
		System.out.println("surface area & curved area of sphere is:"+curved);
		
		
		//=====(hemisphere)====
		double vol,CA,SA;
		vol=2/(float)3*3.14*r*r*r ;
		CA=2*3.14*r*r ;
		SA=3*3.14*r*r ;
		System.out.println("volume of hemisphere:"+vol );
		System.out.println("curved area of hemisphere is:"+CA );
		System.out.println("surface area of hemisphere is:"+SA );

	}

}
