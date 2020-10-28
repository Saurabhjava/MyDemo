package main;
enum Gender{
	M,F;
}
class Employee {
	private String name;
	private int age;
	private Gender gender;
	
	public Employee(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String toString() {
		return name;
	}
}

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee e=new Employee("Nancy", 21, Gender.F);
		
		System.out.println(e);
		
	}

}
