package com;

public class Honda extends Car {

	@Override
	public void ftype() {
		System.out.println("CNG");
		
	}

	@Override
	public void changeGear() {
		System.out.println("Automatic");
		
	}

	@Override
	public void color() {
		System.out.println("RED");
		
	}

}
