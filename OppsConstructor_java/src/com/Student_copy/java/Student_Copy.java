package com.Student_copy.java;

public class Student_Copy {
	String name;
	int roll_no,age;
	
	Student_Copy(){
		name="Priyanka Acharya";
		roll_no=25;
		age=18;
	}
	Student_Copy(Student_Copy ref){
		name=ref.name;
		roll_no=ref.roll_no;
		age=ref.age;
	}

	public static void main(String[] args) {
		Student_Copy s=new Student_Copy();
		Student_Copy s1=new Student_Copy(s);
		s1.name=s.name;
		s1.roll_no=s.roll_no;
		s1.age=s.age;
		System.out.println("Name:"+s1.name);
		System.out.println("Roll:"+s1.roll_no);
		System.out.println("Age:"+s1.age);
	}

}
