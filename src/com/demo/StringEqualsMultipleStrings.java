package com.demo;

import org.apache.commons.lang3.StringUtils;

public class StringEqualsMultipleStrings {

	public static void main(String[] args) {
		String str1 = "good";
		String str2 = "better";
		String str3 = "best";

		System.out.println("str1: " + str1 + "\nstr2: " + str2 + "\nstr3: " + str3);
		System.out.println("Test for goods: " + StringUtils.equalsAny("goods", str1, str2, str3));
		System.out.println("Test for best: " + StringUtils.equalsAny("best", str1, str2, str3));
		System.out.println("Test for better: " + StringUtils.equalsAny("better", str1, str2, str3));
		System.out.println("Test for sid: " + StringUtils.equalsAny("sid", str1, str2, str3));

	}

}
