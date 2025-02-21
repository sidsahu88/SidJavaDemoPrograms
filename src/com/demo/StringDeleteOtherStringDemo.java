package com.demo;

public class StringDeleteOtherStringDemo {

	private static int[] getCharCountArr(String str) {

		int[] count = new int[128];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		return count;

	}

	public static String getTrimmedString(String str, String trimStr) {

		String trimmedStr = "";

		int[] charCount = getCharCountArr(trimStr);

		for (int i = 0; i < str.length(); i++) {

			if (charCount[str.charAt(i)] <= 0)
				trimmedStr = trimmedStr + str.charAt(i);

		}

		return trimmedStr;

	}

	public static void main(String[] args) {

		String str1 = "bangalore";
		String str2 = "bc";

		System.out.println("Op1: " + getTrimmedString(str1, str2) + "\nOp2: " + getTrimmedString(str2, str1));

	}

}