package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class IODemo {

	public static void main(String[] args)  {
		byte b[]=new byte[4636672];
		try {
			FileInputStream fis=new FileInputStream("E://mp3//A.mp3");
			fis.read(b);
			fis.close();
			FileOutputStream fos=new FileOutputStream("E://mp3//NewFile.mp3",true);
			fos.write(b,1000000,1000000);
			fos.flush();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done!!!!!");

	}

}
