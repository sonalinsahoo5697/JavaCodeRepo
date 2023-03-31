package com.cuboid_3d.java;

public class Cuboid {

	public static void main(String[] args) {
		int l,b,h ;
		l=4;b=5;h=6;
		int volume=l*b*h;
	    System.out.println("Volume of Cuboid is:\n"+volume);
	    int curved_area=2*h*(l+b);
	    System.out.println("curved surface area of cuboid is:\n"+ curved_area );
	    int Surface_area=2*(l*b+b*h+h*l);
	    System.out.println("Total Surface_area of cuboid is:\n"+Surface_area );
	    
	    //====(cube)====
	    int a=5;
	    int V=a*a*a;
	    int CA=4*a*a;
	    int SA=6*a*a;
	    System.out.println("Volume of cube is:"+V);
	    System.out.println("curved surface area of Cube is:"+CA);
	    System.out.println("Total Surface_area of cube is:"+SA);
	}
 
}
  