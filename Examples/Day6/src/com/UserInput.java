package com;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class UserInput {

	public static void main(String[] args) {
		File f=new File("E://mp3");
		try {
			String str[]=f.list();
			for(String s:str) {
				File f1=new File(f,s);
				if(f1.isFile())
				{
					System.out.println(s+" is File");
				}
				else
				{
					System.out.println(s +" is Dir");
					f1.delete();
				}
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
