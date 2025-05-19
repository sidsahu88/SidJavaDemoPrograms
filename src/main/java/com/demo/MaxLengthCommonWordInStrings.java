package com.demo;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxLengthCommonWordInStrings {

	public static void main(String[] args) {
		String str1 = "This is a java program";
		String str2 = "This is not a python program";

		String[] str1Arr = str1.split(" ");
		String[] str2Arr = str2.split(" ");

		String maxLenWord = "";

		HashSet<String> str2Set = (HashSet<String>) Stream.of(str2Arr).collect(Collectors.toSet());

		for (int i = 0; i < str1Arr.length; i++) {
			if (str2Set.contains(str1Arr[i]) && maxLenWord.length() < str1Arr[i].length()) {
				maxLenWord = str1Arr[i];
			} else
				continue;
		}

		System.out.println("Max length word: " + maxLenWord);
		System.out.println("Max length: " + maxLenWord.length());

	}

}
