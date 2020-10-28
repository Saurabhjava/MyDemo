package com;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Properties;

public class TestConnection {

	public static void main(String[] args) {
		try {
			Properties p=new Properties();
			p.load(new FileReader("db.properties"));
			Class.forName(p.getProperty("driverClass"));
			Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("userName"),p.getProperty("password"));
			System.out.println("Connected!!!!!!");
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("select * from emp");
			ResultSetMetaData data=rs.getMetaData();
			System.out.println("Total Column="+data.getColumnCount());
			System.out.println(data.getColumnName(1)+"\t"+data.getColumnName(2)+"\t"+data.getColumnName(3));
			System.out.println(data.getColumnTypeName(1)+"\t"+data.getColumnTypeName(2)+"\t"+data.getColumnTypeName(3));
			while(rs.next())
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
