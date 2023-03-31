package com.BankPolymorphism.java;

public class Rate_Of_Interest {

	public static void main(String[] args) {
		RBI R;
		R=new SBI();
		R.Bank();
		
		R=new ICICI();
		R.Bank();
		
		R=new HDFC();
		R.Bank();

	}
}