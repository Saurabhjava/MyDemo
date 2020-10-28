package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class WrapperDemo {

	public static void main(String[] args) throws ParseException {
		Date curDate=new Date();
		System.out.println("Current Date="+curDate);
		long cdate=curDate.getTime();
		System.out.println(cdate);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter DOB");
		String str=s.next();
		Date userDate=sdf.parse(str);
		long dob=userDate.getTime();
		
		System.out.println("User Date="+userDate);
		System.out.println("Difference="+(cdate-dob));
		
	}

}
