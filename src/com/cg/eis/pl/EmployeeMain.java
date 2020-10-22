package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService es=new EmployeeServiceImpl();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ID");
		String eid=s.next();
		System.out.println("Enter Name");
		String name=s.nextLine();
		s.nextLine();
		System.out.println("Enter Salary");
		double sal=s.nextDouble();
		s.nextLine();
		System.out.println("Enter Desigation");
		String desi=s.nextLine();
		
		Employee e=new Employee(eid, name, sal, desi);
		
		String scheme=es.calculateScheme(e);
		System.out.println("Your Scheme="+scheme);

	}

}
