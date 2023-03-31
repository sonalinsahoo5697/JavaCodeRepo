package com.Student_Parameterized.java;

public class Student {
	String name;
	int mark,roll;
	
	Student(String name,int mark,int roll){
		this.name=name;
		this.mark=mark;
		this.roll=roll;
	}
	
	void std_show() {
		System.out.println("student details are:");
		System.out.println("NAME:"+name);
		System.out.println("MARK:"+mark);
		System.out.println("ROLL:"+roll);
	}

	public static void main(String[] args) {
		Student A=new Student("Sushil",550,1925107038);
		A.std_show();
	}

}
