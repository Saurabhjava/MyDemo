package com;

import java.util.ArrayList;
import java.util.List;

class Animal {}
class Dog extends Animal {}
class Puppy extends Dog{}
public class MyGen {
	public void diplay(List<Object> li) {
		System.out.println("Display Works!!!!!");
	}
	public static void main(String[] args) {
		MyGen obj=new MyGen();
		obj.diplay(new ArrayList<Object>());
		
	}

}
