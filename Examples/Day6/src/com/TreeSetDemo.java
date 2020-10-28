package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*class SortByName implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}	
}
class SortByAge implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.age.compareTo(o2.age);
	}	
}*/
class Employee  {
	String name;
	Integer age;
	public Employee(String name, Integer age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+"\t"+age;
	}
	
}
public class TreeSetDemo {

	public static void main(String[] args) {
		Comparator<Employee> sortByName=(e,e1)->e.name.compareTo(e1.name);
		Comparator<Employee> sortByAge=(e,e1)->e.age.compareTo(e1.age);
		Set<Employee> s=new TreeSet<Employee>(sortByAge);
		
		//List<Employee> s=new ArrayList<Employee>();
		s.add(new Employee("B",22));
		s.add(new Employee("D",21));
		s.add(new Employee("A",34));
		s.add(new Employee("C",25));
		s.add(new Employee("X",32));
		//Collections.sort(s);
		System.out.println(s);

	}

}
