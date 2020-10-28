package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class ReadProperties {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("info.properties");
			Properties p=new Properties();
			p.load(fr);
			System.out.println(p.getProperty("UserName"));
			/*
			 * p.remove("Password"); p.store(new FileWriter("info.properties"), "xxxxxxx");
			 * Set s=p.entrySet(); Iterator i=s.iterator(); while(i.hasNext()) {
			 * System.out.println(i.next()); }
			 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
