package com.swap_by_reference.java;
// swapping two number using third variable

public class Swap_By_reference {
	int a=5, b=7,c;
	static void swap(Swap_By_reference sc) {
		sc.c=sc.a;//c=5
		sc.a=sc.b;//a=7
		sc.b=sc.c;//b=5
	}

	public static void main(String[] args) {
		Swap_By_reference sc=new Swap_By_reference();
		System.out.println("before swap:" + "a=" + sc.a +" " +"b="+sc.b);
		swap(sc);
		System.out.println("after swap:" + "a=" +sc.a +" "+"b=" +sc.b);
	}

}
