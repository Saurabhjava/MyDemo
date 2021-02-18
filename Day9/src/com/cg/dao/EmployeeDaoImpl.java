package com.cg.dao;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.cofig.EmployeeData;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> displayAllEmployee() {
		return EmployeeData.getEmpList();
	}

	@Override
	public String createEmployee(Employee emp) {
		EmployeeData.getEmpList().add(emp);
		return "Employee Added!";
	}

}
