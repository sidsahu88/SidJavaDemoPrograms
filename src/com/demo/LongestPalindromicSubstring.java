package com.demo;

public class LongestPalindromicSubstring {

	public void findLongPalindromicSubstring(String str) {
		int n = str.length();

		Integer palTab[][] = new Integer[n][n]; // Create a 2-d array to store the values

		int max = 0;
		int strtIndx = 0, lastIndx = 0;

		for (int i = 0; i < n; i++) { // Loop through string
			for (int j = n - 1; j >= 0; j--) { // Loop backward through string
				int k = n - j - 1;

				if (str.charAt(i) != str.charAt(j))
					palTab[i][k] = 0;
				else {
					if ((i == 0) || (k == 0))
						palTab[i][k] = 1;
					else
						palTab[i][k] = palTab[i - 1][k - 1] + 1;
				}

				if (palTab[i][k] > max) {
					max = palTab[i][k];

					strtIndx = i + 1 - max;
					lastIndx = i;
				}
			}
		}

		while (strtIndx <= lastIndx) {
			System.out.print(str.charAt(strtIndx));
			strtIndx++;
		}

		System.out.println("\nLength: " + max);
	}

	public static void main(String[] args) {
		LongestPalindromicSubstring lps = new LongestPalindromicSubstring();

		String str = "adbscerkrecljdsaasdj";
		// String str = "cljdsdjcl";

		System.out.println("String: " + str);

		System.out.println("Palindromic Substring: ");
		lps.findLongPalindromicSubstring(str);
	}
}