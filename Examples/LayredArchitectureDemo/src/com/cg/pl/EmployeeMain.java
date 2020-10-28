package com.cg.pl;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService es=new EmployeeService();
		Employee e=new Employee("A1009", "Rahul", 5000);
		//System.out.println(es.createEmployee(e));
		Employee e1=es.getEmployeeByID("A1007");
		if(e1==null)
			System.out.println("Invalid ID...");
		else
			System.out.println(e1.getEmpid()+"\t"+e1.getName()+"\t"+e1.getSalary());

	}

}
