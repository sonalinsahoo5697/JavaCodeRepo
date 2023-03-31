package com.SuperKeyword4.java;

public class Employee extends Bank{
	
	public Employee() {
		super("SBI","dkl",89564237);
		super.Display();
	}

	public static void main(String[] args) {
		Employee E=new Employee();
	}

}
