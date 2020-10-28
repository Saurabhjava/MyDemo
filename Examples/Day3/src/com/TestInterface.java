package com;

interface Soundable {
	int num=10;
	void play();
	void pause();
	void stop();
}
interface Sizeable {
	void size();
}
abstract class Computer  {}

class Laptop extends Computer implements Soundable,Sizeable {

	@Override
	public void play() {
		System.out.println("Play Sound for Laptop  "+num);
		
	}

	@Override
	public void pause() {
		System.out.println("Pause Sound for Laptop");
		
	}

	@Override
	public void stop() {
		System.out.println("stop Sound for Laptop");
		
	}

	@Override
	public void size() {
		System.out.println("14 in size");
	}
	
}

public class TestInterface {

	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.pause();
		l.play();
		l.stop();

	}

}
