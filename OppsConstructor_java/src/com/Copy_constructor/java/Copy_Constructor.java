package com.Copy_constructor.java;
//copy constructor using default constructor
public class Copy_Constructor {
	int a; String b;
	
	Copy_Constructor (){
		a=10;
		b="Coding";
		System.out.println(a+" "+b);
	}
	Copy_Constructor (Copy_Constructor ref)//copy constructor
	{
		a=ref.a;
		b=ref.b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy_Constructor R=new Copy_Constructor();
		Copy_Constructor R1=new Copy_Constructor(R);
		R1.a=R.a;
		R1.b=R.b;
		System.out.println(R1.a);
		System.out.println(R1.b);
	}

}
