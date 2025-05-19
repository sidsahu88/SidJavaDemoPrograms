package com.demo;

import org.springframework.util.StringUtils;

public class StringNullEmptyDemo {

	public static void main(String[] args) {

		String str1 = null;
		String str2 = "";
		String str3 = "A";

		int len = StringUtils.isEmpty(str1) ? 0 : str1.length();

		System.out.println("String 1 length: " + len);

		try {
			runtimeExceptionTest(str1);
		} catch (Exception e) {
			System.out.println("Error " + e);
		}

		try {
			callRuntimeExceptionTestMethod(str2);
		} catch (Exception e) {
			System.out.println("Error " + e);
		}

		try {
			callRuntimeExceptionTestMethod(str3);
		} catch (Exception e) {
			System.out.println("Error " + e);
		}

		System.out.println("Hi " + (StringUtils.isEmpty(str1) ? "B" : str3));
		System.out.println("Hi " + (StringUtils.isEmpty(str2) ? "B" : str3));
		System.out.println("Hi " + (StringUtils.isEmpty(str3) ? "B" : str3));

		String str5 = str2; // str1;

		System.out.println("str2.trim(): " + str5.trim());

	}

	private static void callRuntimeExceptionTestMethod(String str) {
		runtimeExceptionTest(str);

		System.out.println("String is empty or null? " + StringUtils.isEmpty(str));
	}

	private static void runtimeExceptionTest(String str) {
		if (StringUtils.isEmpty(str)) {
			throw new RuntimeException("String is not provided");
		}

		System.out.println("String: " + str);
	}

}
