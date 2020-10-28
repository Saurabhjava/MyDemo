package com;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("Hello.txt",true);
			fw.write("\nWelcome To Capg!!");
			//fw.flush();
			fw.close();
			System.out.println("Done!!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
