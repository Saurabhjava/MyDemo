package com;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo4 {

	public static void main(String[] args) {
		String str[]= {"A","D","B","C","E"};
		/*
		 * System.out.println(str); Arrays.sort(str); List<String>
		 * li=Arrays.asList(str); System.out.println(li);
		 * 
		 * System.out.println(Arrays.binarySearch(str, "E"));
		 */
		String str1[]=Arrays.copyOfRange(str,2,4);
		for(String s:str1) {
			System.out.println(s);
		}

	}

}
