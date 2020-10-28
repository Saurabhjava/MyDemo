package com;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class SystemPropertiesDemo {

	public static void main(String[] args) {
		Properties p=System.getProperties();
		p.setProperty("Name", "===========Saurabh============");
		Set s=p.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{			
			System.out.println(i.next());
		}

	}

}
