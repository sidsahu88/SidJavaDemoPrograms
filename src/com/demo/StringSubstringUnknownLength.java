package com.demo;

import org.apache.commons.lang3.StringUtils;

public class StringSubstringUnknownLength {

	public static void main(String[] args) {
		String str = "Siddharth Sahu";

		System.out.println(StringUtils.left(str, 10));
		System.out.println(str.substring(0, 10));

		char next = '/';

		if ((next < '0') || (next > '9' && next < 'a') || (next > 'z'))
			System.out.println("Issue with " + next);

	}

}
