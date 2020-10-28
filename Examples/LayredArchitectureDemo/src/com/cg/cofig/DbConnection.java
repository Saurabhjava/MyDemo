package com.cg.cofig;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	private static Connection con;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println("Conection Established!!!!!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection() {
		return con;
	}
}
