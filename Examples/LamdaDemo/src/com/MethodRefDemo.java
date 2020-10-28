package com;


@FunctionalInterface
interface Sizeable {
	public void size();
}
class MyTest {
	public void accept() {
		System.out.println("Accept called!!!");
	}
	public static void display() {
		System.out.println("Display Called!!!!!!");
	}
}
public class MethodRefDemo {

	public static void main(String[] args) {
		Sizeable s=new MyTest()::accept;
		Sizeable s1=MyTest::display;
		s1.size();

	}

}
