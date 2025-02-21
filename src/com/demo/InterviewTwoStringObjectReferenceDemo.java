package com.demo;

public class InterviewTwoStringObjectReferenceDemo {

	public static void main(String[] args) {

		String str = "abc";
		String str1 = str + "d";
		str += "d";
		System.out.println(str + " " + str1 + " " + (str == str1) + " " + (str.equals(str1)));

	}

}
