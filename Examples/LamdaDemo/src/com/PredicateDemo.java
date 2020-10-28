package com;

import java.util.function.Predicate;

/*class Test implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		
		return t<25;
	}
	
}*/
public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> p=(x)->x<25;
		System.out.println(p.test(22));

	}

}
