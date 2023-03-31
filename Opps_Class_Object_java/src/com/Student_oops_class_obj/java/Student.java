package com.Student_oops_class_obj.java;

public class Student {
	String name,address;
	int roll;
	
	void std_Input() {
		name="sonalin sahoo";
		address="dhenkanal";
		roll=38;
	}
	void std_Display() {
		System.out.println("student name:"+name);
		System.out.println("student address:"+address);
		System.out.println("student roll:"+roll);
	}

	public static void main(String[] args) {
		 Student s=new  Student();
		 s.std_Input();
         s.std_Display();
	}

}
