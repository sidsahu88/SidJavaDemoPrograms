package com.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxLengthCommonWordInStrings {

	public static void main(String[] args) {
		String str1 = "This is a java program";
		String str2 = "This is not a python program";

		String[] str1Arr = str1.split(" ");
		String[] str2Arr = str2.split(" ");

		String maxLenWord = "";

		Set<String> str2Set = Stream.of(str2Arr).collect(Collectors.toSet());

        for (String word : str1Arr) {
            if (str2Set.contains(word) && maxLenWord.length() < word.length()) {
                maxLenWord = word;
            }
        }

		System.out.println("Max length word: " + maxLenWord);
		System.out.println("Max length: " + maxLenWord.length());

	}

}
