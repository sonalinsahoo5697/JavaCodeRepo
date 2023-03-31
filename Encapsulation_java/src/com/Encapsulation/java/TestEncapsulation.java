package com.Encapsulation.java;

public class TestEncapsulation {

	public static void main(String[] args) {
		Student s=new Student();
		s.setStdName("Sonalin");
		System.out.println(s.getStdName());
		s.setStdAdd("indipur,DKL");
		System.out.println(s.getStdAdd());
		s.setStdRoll(25);
		System.out.println(s.getStdRoll());
	}
}
