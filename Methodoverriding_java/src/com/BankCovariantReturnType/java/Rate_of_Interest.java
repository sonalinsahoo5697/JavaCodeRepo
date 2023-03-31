package com.BankCovariantReturnType.java;

public class Rate_of_Interest {

	public static void main(String[] args) {
		RBI r=new RBI();
		r.gets().disp();
		
		SBI s= new SBI();
		((SBI)s.gets()).disp();
		
		ICICI i=new ICICI();
		i.gets().disp();
		
		HDFC h= new HDFC();
		h.gets().disp();

	}

}
