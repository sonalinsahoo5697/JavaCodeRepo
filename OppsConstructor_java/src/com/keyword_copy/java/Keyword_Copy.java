package com.keyword_copy.java;

class Keyword_Copy {
	String brand;
	int button;
	
	Keyword_Copy(String brand, int button){
		this.brand=brand;
		this.button=button;
	}
	Keyword_Copy(Keyword_Copy ref){
		brand=ref.brand;
		button=ref.button;
	}

	public static void main(String[] args) {
		Keyword_Copy k=new Keyword_Copy("hp",102);
		Keyword_Copy k1=new Keyword_Copy(k);
		k1.brand=k.brand;
		k1.button=k.button;
		System.out.println("Brand:"+k1.brand);
		System.out.println("Button:"+k1.button);
	}

}
