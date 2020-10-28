package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Collection<String> li=new ArrayList<String>();
		li=new HashSet<String>();
		
		Hashtable<String, String> m=new Hashtable<String, String>();
		m.put("Amit", "xyz");
		m.put("Dinesh", "abc");
		m.put("Saurabh", "123");
		m.put("Deepak", "abc123");
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter UserName");
		String uname=s.next();
		System.out.println("Enter Password");
		String pass=s.next();
		if(m.containsKey(uname)) {
			if(m.get(uname).equals(pass)) {
				System.out.println("Welcome "+uname+"!");
			}
			else {
				System.out.println("Wrong Password!!!");
			}
		}
		else
		{
			System.out.println("Wrong UserName");
		}
		

	}

}
