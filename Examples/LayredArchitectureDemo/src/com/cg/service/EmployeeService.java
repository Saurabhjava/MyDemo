package com.cg.service;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDao;
import com.cg.dao.EmployeeDaoImpl;

public class EmployeeService {
	EmployeeDao edao=new EmployeeDaoImpl();
	public String createEmployee(Employee emp) {
		if(emp.getName().length()<3 || emp.getSalary()<0)
			return "Invalid Data:";
		else
			return edao.saveEmployee(emp);
	}
	public Employee getEmployeeByID(String id) {
		if(id.length()<5)
			return null;
		else
			return edao.getEmployee(id);
	}
}
