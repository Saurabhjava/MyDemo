package com;

public class ArrayDemo3 {
	public void display(String names[],int age) {
		for(String n:names) {
			System.out.println(n);
		}
		System.out.println("Age="+age);
	}
	public void display1(int age,String... names) {
		for(String n:names) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		ArrayDemo3 obj=new ArrayDemo3();
		String str[]= {"A","B","C","D"};
		obj.display(str,78);
		System.out.println("==============");
		obj.display1(12,"X","y","Z","I");

	}

}
