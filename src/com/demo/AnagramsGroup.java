package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramsGroup {

	public static void main(String[] args) {

		String[] words = { "cat", "tar", "eagle", "tac", "listen", "rat", "act", "art", "silent", "acts" };

		HashMap<String, List<String>> map = new HashMap<>();

		for (String word : words) {
			String sorted_word = getSortedWord(word);
			List<String> l = map.computeIfAbsent(sorted_word, value -> new ArrayList<String>());
			l.add(word);
			//map.putIfAbsent(sorted_word, l);
		}

		map.forEach((key, value) -> System.out.println(value));

	}

	private static String getSortedWord(String word) {
		char[] ch = word.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}

}
