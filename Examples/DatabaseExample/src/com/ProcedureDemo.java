package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ProcedureDemo {

	public static void main(String[] args) {
		try {
			Properties p=new Properties();
			p.load(new FileReader("db.properties"));
			Class.forName(p.getProperty("driverClass"));
			Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("userName"),p.getProperty("password"));
			
			CallableStatement stmt=con.prepareCall("{call delEmployee(?)}");
			stmt.setString(1, "A1002");
			stmt.executeUpdate();
			System.out.println("===Done=====");
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
