package com.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GoldmanSachLongestUniformString {

	private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

	static int[] longestUniformSubstring(String input) {
		int longestStart = -1;
		int longestLength = 0;
		
		if (!input.isEmpty()) {
			int currStart = 0;
			int currLen = 1;

			for (int i = 1; i < input.length(); i++) {

				if (input.charAt(i) == input.charAt(i - 1)) {
					currLen++;
				} else {
					if (currLen > longestLength) {
						longestLength = currLen;
						longestStart = currStart;
					}
					currLen = 1;
					currStart = i;
				}
			}
			
			if (currLen > longestLength) {
				longestLength = currLen;
				longestStart = currStart;
			}
		}

		return new int[] { longestStart, longestLength };
	}

	public static void main(String[] args) {
		testCases.put("", new int[] { -1, 0 });
		testCases.put("1", new int[] { 0, 1 });
		testCases.put("12", new int[] { 0, 1 });
		testCases.put("10000111", new int[] { 1, 4 });
		testCases.put("aabbbbbCdAA", new int[] { 2, 5 });
		testCases.put("aabbbbbCdAAAAAAA", new int[] { 9, 7 });

		for (Map.Entry<String, int[]> testCase : testCases.entrySet()) {
			int[] result = longestUniformSubstring(testCase.getKey());
			if (Arrays.equals(result, testCase.getValue()))
				System.out.println("Passed!");
			else
				System.out.println("Failed!");
		}
	}

}
