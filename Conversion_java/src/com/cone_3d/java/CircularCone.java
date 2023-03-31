package com.cone_3d.java;

public class CircularCone {

	public static void main(String[] args) {
	  int r,l,h;
	  double vol,curved_area,surface_area;
	  r=2;l=3;h=5;
	  vol=1/(double)3*3.14*r*r*h ; //Explicitly type casting
	  curved_area=3.14*r*l ;
	  surface_area=3.14*r*(l+r);
	  System.out.println("volume:"+vol);
	  System.out.println("curved area:"+curved_area);
	  System.out.println("surface area:"+surface_area);
	}

}
