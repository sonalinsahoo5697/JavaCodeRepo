package com.CovariantReturnType2.java;

public class Covariantxample {

	public static void main(String[] args) {
		
		A1 a1 = new A1();
		
		a1.get().print();
		
		A2 a2 = new A2();
		((A2)a2.get()).print();
		
		A3 a3 = new A3();
		((A3)a3.get()).print();

	}

}
