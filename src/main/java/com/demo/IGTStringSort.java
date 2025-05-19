package com.demo;

public class IGTStringSort {

	public static void main(String[] args) {

		String input = "bbccdefbbaa";

		int[] count = new int[26];

		for (int i = 0; i < input.length(); i++) {
			count[input.charAt(i) - 'a']++;
		}

		StringBuilder output = new StringBuilder();

		for (int j = 0; j < count.length; j++) {
			char ch = (char) (j + 'a');
//			System.out.println(j + 'a');

			while (count[j] > 0) {
				output.append(ch);
				count[j]--;
			}
		}

		System.out.println(output);
	}
}
