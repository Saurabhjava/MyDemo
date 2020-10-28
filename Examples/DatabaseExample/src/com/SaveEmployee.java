package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import javafx.util.converter.PercentageStringConverter;

public class SaveEmployee {

	public static void main(String[] args) {
		try {
			Properties p=new Properties();
			p.load(new FileReader("db.properties"));
			Class.forName(p.getProperty("driverClass"));
			Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("userName"),p.getProperty("password"));
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Employee ID to delete");
			String id=s.next();
			/*System.out.println("Enter Employee Name");
			String name=s.next();
			System.out.println("Enter Employee Salary to Update");
			int sal=s.nextInt();*/
			
			//PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
			//PreparedStatement ps=con.prepareStatement("update emp set salary=? where eid=?");
			PreparedStatement ps=con.prepareStatement("delete emp where eid=?");
			ps.setString(1,id);
			
			int a=ps.executeUpdate();
			
			if(a>0)
				System.out.println("Employee Deleted!!!!");
			ps.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
