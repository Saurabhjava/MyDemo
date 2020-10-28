package com;

class Employee {
	String name;
	public Employee(String name) {
		this.name=name;
	}
	public int hashCode() {
		return name.length();
	}
	public boolean equals(Object obj) {
		if(obj instanceof Employee && this.name  == ((Employee)obj).name)
			return true;
		else
			return false;
	}
}
public class EqualDemo {

	public static void main(String[] args) {
		Employee emp=new Employee("A");
		Employee emp1=new Employee("A");
		
		System.out.println(emp);
		System.out.println(emp1);
		
		System.out.println(emp.equals(emp1));
		
		
	}

}
