package com.Parameterized_Constructor.java;

public class Parameterized_Constructor {
	int x; String name;
	Parameterized_Constructor(int a, String Name){
		x=a; 
		name=Name;
	}
	void display() {
		System.out.println(x);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized_Constructor sc=new Parameterized_Constructor(500, "Sonalin");
		sc.display();
	}

}
