package com.static_nonstatic.java;

public class Static_Nonstatic {
	
	int x=0;//non-static
	static int y = 0; //Static
	
	void nonStaticImplement() {
		x++;//x=x+1
		System.out.println(x);
	}
	void StaticImplement() {
		y++;//y=y+1
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		Static_Nonstatic I= new Static_Nonstatic();
		I.StaticImplement();
		Static_Nonstatic I2= new Static_Nonstatic();
		I2.StaticImplement();
		Static_Nonstatic I3= new Static_Nonstatic();
		I3.StaticImplement();
		
		Static_Nonstatic I4=new Static_Nonstatic();
		I4.nonStaticImplement();
		Static_Nonstatic I5=new Static_Nonstatic();
		I5.nonStaticImplement();
	}
} 