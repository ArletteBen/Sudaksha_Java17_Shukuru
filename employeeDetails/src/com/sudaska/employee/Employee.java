package com.sudaska.employee;

import com.sudaska.project.Project;

public class Employee {
private int empId;
private String empName;
private Project proj;

public Project getProj() {
	return proj;
}
public void setProj(Project proj) {
	this.proj = proj;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + "]";
}

}
