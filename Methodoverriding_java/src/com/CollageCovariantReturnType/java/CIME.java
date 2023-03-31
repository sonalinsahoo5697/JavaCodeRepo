package com.CollageCovariantReturnType.java;

public class CIME extends BPUT {

	CIME gets() {
		return this;
	}
	void input() {
		location="bhubaneswar";
		Price=102503;
	}
	void display() {
		System.out.println("Clg location:"+location);
		System.out.println("clg price:"+Price);
	}
}
