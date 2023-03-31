package com.keyword_parameterized.java;

public class Keyword_Parameterized {
	String brand;
	int button;
	
	Keyword_Parameterized(String brand, int button){
		this.brand=brand;
		this.button=button;
	}
	void show() {
		System.out.println("Brand:"+brand);
		System.out.println("Button:"+button);
	}

	public static void main(String[] args) {
		Keyword_Parameterized k=new Keyword_Parameterized("hp",102);
		k.show();
	}

}
