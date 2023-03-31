package com.SuperKeyword4.java;

public class Bank {
 String BankName;
 String BankAdd;
 int BankPhn;
 
 public Bank(String BankName,String BankAdd,int BankPhn) {
	 this.BankName=BankName;
	 this.BankAdd=BankAdd;
	 this.BankPhn=BankPhn;
 }
 
void Display() {
	System.out.println("Bank name:"+BankName);
	System.out.println("Banl Address:"+BankAdd);
	System.out.println("Bank contact number:"+BankPhn);
}
}
