package com.Aggregation.java;

public class Restaurant {
	String ResName;
	String Address;
	int contact_no;
	Emplyoee E; //aggregation
	Cashier C;//aggregation

	public Restaurant(String ResName, String Address, int contact_no,Emplyoee E,Cashier C) {
		this.ResName=ResName;
		this.Address=Address;
		this.contact_no=contact_no;
		this.E=E;
	    this.C=C;
	}
	void Details() {
		System.out.println("Resaurant Name:"+ResName);
		System.out.println("Restaurant Address:"+Address);
		System.out.println("Restaurant contact no:"+contact_no);
		System.out.println("Employee Name:"+E.EmpName);
		System.out.println("Employee Id:"+E.EmpId);
		System.out.println("Employee salary:"+E.EmpSal);
		String name = "Akash";
		int id_no=1;
		System.out.println("Cashier name:"+name+" "+","+"ID_NO:"+id_no);
	}

	public static void main(String[] args) {
		Emplyoee E1=new Emplyoee("Rahul",25,260000);
		
		Cashier C1=new Cashier("Akash",1);
		
		Restaurant R1=new Restaurant("Tandoori wala","Patia",914356786,E1,C1);
		R1.Details();

	}

}
