package com.EmployeeArraylist.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class EmpIterator {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("empId:02");
		list.add("empAge:25");
		list.add("empSalary:60000");
		list.add("empDesignation:Software Developer");
		list.add("empAddress:qw-9/c");
		list.add("empGender:Female");
		
		//ListIterator<String> itr=list.listIterator(); // list Iterator
		Iterator<String> itr=list.iterator(); // iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
