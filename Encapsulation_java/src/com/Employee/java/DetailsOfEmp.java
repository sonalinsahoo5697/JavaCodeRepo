package com.Employee.java;

public class DetailsOfEmp {

	public static void main(String[] args) {
		Employee E=new Employee();
		E.setEmpName("xyz");
		E.setEmpId(05);
		E.setEmpPosition("software devloper");
		E.setEmpSalary(900000);
		System.out.println("EmployeeName:"+E.getEmpName());
		System.out.println("Employeeid:"+E.getEmpId());
		System.out.println("Employeedesignation:"+E.getEmpPosition());
		System.out.println("Employeesalary:"+E.getEmpSalary());
	}

}
