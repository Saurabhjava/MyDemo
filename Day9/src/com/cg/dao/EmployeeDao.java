package com.cg.dao;

import java.util.List;

import com.cg.bean.Employee;

public interface EmployeeDao {
	List<Employee> displayAllEmployee();
	String createEmployee(Employee emp);
}
