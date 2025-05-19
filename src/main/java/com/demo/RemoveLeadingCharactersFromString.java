package com.demo;

import org.apache.commons.lang3.StringUtils;

public class RemoveLeadingCharactersFromString {

	public static void main(String[] args) {
		String str = "08096F";
		Object[] testObjArr = { str, StringUtils.stripStart(str, "0") };

		System.out.println(testObjArr[0]);
		System.out.println(testObjArr[1]);

		String str1 = "W123456789";
		str1 = StringUtils.stripStart(str1, "W");
		
		System.out.println(str1);
	}

}
