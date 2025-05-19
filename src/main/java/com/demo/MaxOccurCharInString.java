package com.demo;

public class MaxOccurCharInString {

	public static void main(String[] args) {

		String str = "this is a test string";

		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
			

		int max = -1;
		char result = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		System.out.println("Maximum occuring character: " + result);
	}

}
