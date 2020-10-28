package com;

public abstract class Car {
	
	public Car() {
		System.out.println("Cons Car!!!!!");
	}
	
	public abstract void ftype();
		
	public abstract void changeGear();
	
	public abstract void color();
	
	public void displayCar() {
		System.out.println("=====Car=====");
	}

}
