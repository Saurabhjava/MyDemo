package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String calculateScheme(Employee emp) {
		if((emp.getSalary()>5000 && emp.getSalary()<20000) && emp.getDesignation().equalsIgnoreCase("SystemA"))
			return "SchemeC";
		else if((emp.getSalary()>=20000 && emp.getSalary()<40000) && emp.getDesignation().equalsIgnoreCase("Programmer"))
			return "SchemeB";
		else if((emp.getSalary()>=40000) && emp.getDesignation().equalsIgnoreCase("Manager"))
			return "SchemeA";
		else
			return "No-Scheme";
	}

}
