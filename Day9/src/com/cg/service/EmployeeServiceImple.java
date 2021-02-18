package com.cg.service;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDao;
import com.cg.dao.EmployeeDaoImpl;

public class EmployeeServiceImple implements EmployeeService {
	
	EmployeeDao eDao=new EmployeeDaoImpl();
	@Override
	public List<Employee> printAllEmployee() {
		
		return eDao.displayAllEmployee();
	}

	@Override
	public String register(Employee e) {
		if(e.getName().isEmpty() || e.getSalary()<0 ||e.getDomain().isEmpty())
			return "Invalid Data!";
		else
			return eDao.createEmployee(e);
		
	}

}
