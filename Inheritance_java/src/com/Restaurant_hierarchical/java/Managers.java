package com.Restaurant_hierarchical.java;

public class Managers extends Restaurant{
 String man_name;
 int sal;
 
 Managers(){
	 resname="njgjn";
	  add="bbsr";
	  phno=224632347;
	  man_name="jhcdk";
	  sal=250000;
	  System.out.println(resname );
		 System.out.println(add );
		 System.out.println(phno );
		 System.out.println(man_name);
		 System.out.println(sal);
 }
	public static void main(String[] args) {
		Managers M=new Managers();

	}

}
