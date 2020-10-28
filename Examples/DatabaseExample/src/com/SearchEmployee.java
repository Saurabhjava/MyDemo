package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class SearchEmployee {

	public static void main(String[] args) {
		try {
			Properties p=new Properties();
			p.load(new FileReader("db.properties"));
			Class.forName(p.getProperty("driverClass"));
			Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("userName"),p.getProperty("password"));
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Id to Search!");
			String id=s.next();
						
			//Statement stat=con.createStatement();
			PreparedStatement ps=con.prepareStatement("select * from emp where eid=?");
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			else
				System.out.println("Employee Not Found!!!!");
				
			
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
