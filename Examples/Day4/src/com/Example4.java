package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[[A-Z][0-9]]+&");
		Matcher m = p.matcher("&AAAA&");
		System.out.println(m.find());
	}

}
