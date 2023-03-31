package com.SingleTonLogin.java;

public class Login {
	
	private static Login logObject;
	
	private Login() {
		System.out.println("Requesting For Login.................");
	}
	
	public static Login getInstance() {
		if(logObject == null)
		{
			logObject = new Login();
			System.out.println("Verifying..............");
		}
		return logObject;
		
	}
	
	public void LoginSuccess() {
		System.out.println("Login Successful..");
	}
	
	public static void main(String args[]) {
		Login L = Login.getInstance();
		L.LoginSuccess();
	}

}
