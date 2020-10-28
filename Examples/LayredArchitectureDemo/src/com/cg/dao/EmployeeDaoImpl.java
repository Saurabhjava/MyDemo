package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.cg.bean.Employee;
import com.cg.cofig.DbConnection;

public class EmployeeDaoImpl implements EmployeeDao {
	Connection con=DbConnection.getConnection();

	@Override
	public String saveEmployee(Employee emp) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
			ps.setString(1, emp.getEmpid());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getSalary());
			int a=ps.executeUpdate();
			if(a>0)
				return "Employee Created!!!!";
			else
				return "Employee Not Created!!!!";
		} catch (SQLException e) {
			return "Employee Not Created!!!!"+e;
		}
	}

	@Override
	public Employee getEmployee(String eid) {
		Employee e=null;
		try {
			PreparedStatement ps=con.prepareStatement("select * from Emp where eid=?");
			ps.setString(1, eid);
			ResultSet rs=ps.executeQuery();			
			if(rs.next()) {
				e=new Employee(rs.getString(1), rs.getString(2), rs.getInt(3));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return e;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
