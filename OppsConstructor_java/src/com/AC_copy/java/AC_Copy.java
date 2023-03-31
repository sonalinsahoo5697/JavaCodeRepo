package com.AC_copy.java;

public class AC_Copy {
	String company;
	int price;
	
	AC_Copy(){
	  company="samsung"	;
	  price=74000;
	}
	AC_Copy(AC_Copy ref){
		company=ref.company;
		price=ref.price;
	}

	public static void main(String[] args) {
		AC_Copy a=new AC_Copy();
		AC_Copy a1=new AC_Copy(a);
        a1.company=a.company;
        a1.price=a.price;
        System.out.println(a1.company+" "+a1.price);
	}

}
