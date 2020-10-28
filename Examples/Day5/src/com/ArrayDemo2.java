package com;

public class ArrayDemo2 {

	public static void main(String[] args) {
		/*
		 * int a[][]= {{2,5,6},{7,8},{11,44,33,22},{99,66,40,30,20}};
		 * 
		 * for(int i=0; i<a.length; i++) { System.out.println(a[i]); }
		 * 
		 * 
		 * for(int i[]:a) { for(int x:i) System.out.println(x); }
		 */
		
		int a[][][]= {{{1,2,3},{5,6}},{{9,7,8},{11,10,12},{22,55,66}},{{9,0,5},{111,212,321},{7,4,2},{8,2,1}}};
		
		for(int i[][]:a) {
			for(int x[]:i) {
				for(int j:x)
					System.out.println(j);
			}
		}
		
	}

}
