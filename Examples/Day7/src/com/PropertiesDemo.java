package com;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties p=new Properties();
		p.setProperty("UserName", "Saurabh");
		p.setProperty("Email", "mbacomp@gmail.com");
		p.setProperty("Password", "abcd123");
		try {
			FileWriter fw=new FileWriter("info.properties");
			p.store(fw, "Properties file created by Saurabh Sharma");
			System.out.println("Done!!!!!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
