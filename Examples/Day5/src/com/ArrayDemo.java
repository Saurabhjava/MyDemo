package com;
class Animal {
	public void eat() {
		System.out.println("Animal Eat");
	}
}
class Dog extends Animal {
	public void eat() {
		System.out.println("Dog Eat");
	}
	public void bark() {
		System.out.println("Dog Bark!!!!");
	}
}
class Horse extends Animal {
	public void eat() {
		System.out.println("Horse Eat");
	}
}
public class ArrayDemo {

	public static void main(String[] args) {
		Animal obj[]= {new Animal(), new Dog(), new Horse()};
				
		for(Animal a:obj) {
			a.eat();
			if(a instanceof Dog)
				((Dog)a).bark();
		}

	}

}
