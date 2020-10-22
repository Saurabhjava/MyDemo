package com;
class Calculator {
	int total;
	public double calculate(int a, int b) {
		total=a+b;
		return total;
	}
}
public class HelloWorld {
	
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int result=(int)cal.calculate(12, 10);
		System.out.println(result);
	}

}
