package com;

public interface MyInterface {
	void m1();
	default void m2() {
		System.out.println("Default Method!!!!");
	}
	static void m3() {
		System.out.println("static Method!!!!!");
	}
}
