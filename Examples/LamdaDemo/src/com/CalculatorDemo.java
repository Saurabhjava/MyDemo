package com;

/*class Add implements Calculator {

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}
class Sub implements Calculator {

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
}*/
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator cal=(x, y)->{
			System.out.println("Adding two numbers");
			return x+y;
		};
		Calculator cal1=(x,y)->{
			System.out.println("Sub two numbers");
			return x-y;
		};
		Calculator cal2=(x,y)->{
			System.out.println("Multi two Nos");
			return x*y;
		};
		System.out.println(cal.calculate(15, 10));
		System.out.println(cal1.calculate(15, 10));
		System.out.println(cal2.calculate(15, 10));

	}

}
