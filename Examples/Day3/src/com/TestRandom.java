package com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestRandom {

	public static void main(String[] args) {
		/*
		 * Scanner s=new Scanner(System.in); System.out.println("Enter Name"); String
		 * name=s.next(); Double d=Math.random(); String accno=""; if(name.length()>3) {
		 * accno=name.substring(0,3)+d.toString().substring(2,7); }
		 * System.out.println("Your Acc ID="+accno);
		 */
		//System.out.println(Pattern.matches("^[A-Z][0-9]*", "Eox1"));
		
		  String input = "Eox1"; 
		  Pattern p = Pattern.compile("^[A-Z][0-9]*"); 
		  Matcher m = p.matcher(input); 
		  System.out.println(m.find());
		 /* if (!m.find()) { 
			  System.out.println("Enter code which start with upper case alphabet and end with a digit"); 
			  System.err.println("Enter code which start with upper case alphabet and end with a digit"); 
			  }*/
		 
	}

}
