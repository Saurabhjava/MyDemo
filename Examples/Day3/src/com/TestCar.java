package com;

public class TestCar {

	public static void main(String[] args) {
		Car h=new Honda();
		h.ftype();
		h.changeGear();
		h.color();
		h.displayCar();
		
		h=new Santro();
		h.ftype();
		h.changeGear();
		h.color();
		
		
	}

}
