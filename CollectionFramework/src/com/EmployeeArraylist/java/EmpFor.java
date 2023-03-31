package com.EmployeeArraylist.java;

import java.util.ArrayList;

public class EmpFor {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("empId:02");
		list.add("empAge:25");
		list.add("empSalary:60000");
		list.add("empDesignation:Software Developer");
		list.add("empAddress:qw-9/c");
		list.add("empGender:Female");
		
		System.out.println("======for=====");
		for(String Employee:list) {             //for 
			System.out.println(Employee);
		}
		
		System.out.println("=======foreach=======");
		list.forEach(a->{
			System.out.println(a);
		});
	}

}
