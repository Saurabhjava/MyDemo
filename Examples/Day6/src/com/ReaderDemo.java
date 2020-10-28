package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;

public class ReaderDemo {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("Hello.txt");
			/*int x=0;
			while((x=fr.read())!=-1)
				System.out.println((char)x);*/
			BufferedReader br=new BufferedReader(fr);
			LineNumberReader lr=new LineNumberReader(br);
			String str="";
			while((str=lr.readLine())!=null)
					System.out.println(lr.getLineNumber()+str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
