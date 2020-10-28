package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class TransactionDemo {

	public static void main(String[] args) {
		try {
			Properties p=new Properties();
			p.load(new FileReader("db.properties"));
			Class.forName(p.getProperty("driverClass"));
			Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("userName"),p.getProperty("password"));
			con.setAutoCommit(false);
			
			PreparedStatement ps=con.prepareStatement("insert into A values(?,?)");
			PreparedStatement ps1=con.prepareStatement("insert into B values(?,?)");
			
			ps.setString(1, "A1003");
			ps.setString(2, "Suman");
			
			ps1.setString(1, "A1003");
			ps1.setString(2, "Suman");
			
			ps.executeUpdate();
			ps1.executeUpdate();
			
			ps.close();
			ps1.close();
			con.close();
			
			con.commit();
			System.out.println("Data stored in both table");
			
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

