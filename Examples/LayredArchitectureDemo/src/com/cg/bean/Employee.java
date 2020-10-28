package com.cg.bean;

public class Employee {
	private String empid;
	private String name;
	private int salary;
	public Employee() {
	}
	public Employee(String empid, String name, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
