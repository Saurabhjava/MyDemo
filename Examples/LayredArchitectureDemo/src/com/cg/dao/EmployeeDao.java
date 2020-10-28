package com.cg.dao;

import java.util.List;

import com.cg.bean.Employee;

public interface EmployeeDao {
	public String saveEmployee(Employee emp);
	public Employee getEmployee(String eid);
	public List<Employee> getAllEmployee();
}
