package com.demo;

public class PalindromeString {

	public static Boolean isPalindrome(String str) {

		int front = 0, tail = str.length() - 1;
		boolean isPalin;

		if (tail < 0)
			isPalin = false;
		else if (tail == 0)
			isPalin = true;
		else {
			isPalin = true;

			while (front < tail) {
				if (str.charAt(front) == str.charAt(tail)) {
					front++;
					tail--;
				} else {
					isPalin = false;
					break;
				}
			}
		}

		return isPalin;
	}

	public static void main(String[] args) {

		String str1 = "A";
		String str2 = "";
		String str3 = "ABCBA";
		String str4 = "ABBA";
		String str5 = "ajdadjlkjsad";

		System.out.println(str1 + " is Palindrome?: " + isPalindrome(str1));
		System.out.println(str2 + " is Palindrome?: " + isPalindrome(str2));
		System.out.println(str3 + " is Palindrome?: " + isPalindrome(str3));
		System.out.println(str4 + " is Palindrome?: " + isPalindrome(str4));
		System.out.println(str5 + " is Palindrome?: " + isPalindrome(str5));
		
	}

}
