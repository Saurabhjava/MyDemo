package com;

import java.util.HashSet;
import java.util.Set;

class Student{
	String name;
	public Student(String name){
		this.name=name;
	}
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class ListDemo {
	
	public static void main(String[] args) {
		
		Set s=new HashSet();
		s.add(new Student("Amit"));
		s.add(new String("Raj"));
		s.add(new Student("Amit"));
		s.add(new String("Raj"));
		
		System.out.println(s.size());
		System.out.println(s);
		
	}

}
