package com.sudaska.employee;

import com.sudaska.project.Project;

public class EmployeeMain {

	public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setEmpId(23);
	emp.setEmpName("shukuru");
	System.out.println(emp.getEmpId()+" "+emp.getEmpName());
	Project proj=new Project ();
	proj.setProjId(56);
	proj.setTitle("ebm");
	emp.setProj(proj);
	System.out.println(emp.getProj().getProjId()+" "+emp.getProj().getTitle());
	}

}
