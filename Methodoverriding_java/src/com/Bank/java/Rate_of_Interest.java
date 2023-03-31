package com.Bank.java;

public class Rate_of_Interest {

	public static void main(String[] args) {
		SBI S = new SBI();
		System.out.println("Rate Of Interest At SBI: "+S.get_rate_of_interest());
		ICICI I = new ICICI();
		System.out.println("Rate Of Interest At ICICI: "+I.get_rate_of_interest());
		HDFC H = new HDFC();
		System.out.println("Rate Of Interest At HDFC: "+H.get_rate_of_interest());
	}
}
