package com.Restaurant_hierarchical.java;

public class Cashier extends Restaurant {
  String cashname;
  int id_no;
  
  Cashier(){
	  resname="njgjn";
	  add="bbsr";
	  phno=224632347;
	  cashname="tfji";
	  id_no=5;
	 System.out.println(resname );
	 System.out.println(add );
	 System.out.println(phno );
	 System.out.println(cashname);
	 System.out.println(id_no );
  }
	public static void main(String[] args) {
		Cashier C=new Cashier();	

	}

}
