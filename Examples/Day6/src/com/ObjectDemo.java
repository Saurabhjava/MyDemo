package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Car implements Serializable  {
	String carName="Honda";
}
class Employee1 implements Serializable{
	String name = "Abhishek";
	int age=25;
	transient double salary=56000;
	Car c=new Car();
}
public class ObjectDemo {

	public static void main(String[] args) {
		Employee1 emp=new Employee1();
		
		try {
			/*FileOutputStream fos=new FileOutputStream("Object.txt");
			ObjectOutputStream ois=new ObjectOutputStream(fos);
			ois.writeObject(emp);
			ois.close();
			System.out.println("Object Saved!!!!");*/
			
			FileInputStream fis=new FileInputStream("Object.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee1 e=(Employee1)ois.readObject();// this is returning java.lang.Object
			System.out.println("====After DEserialization======");
			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.salary);
			System.out.println(e.c.carName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
