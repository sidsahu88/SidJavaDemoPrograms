package com.demo.datastructure;

import java.util.HashMap;

public class TrieDemo {
	
	static <T> void print(T t) {
		System.out.println(t);
	}

	private static class TrieNode {
		HashMap<Character, TrieNode> childNode;
		boolean isAWord;

		public TrieNode() {
			childNode = new HashMap<>();
			isAWord = false;
		}
	}

	public static void main(String[] args) {
		String[] words = { "apple", "ape", "pet", "ply", "plan", "plane", "ally", "alley", "alex", "bat", "ball",
				"balloon" };

		TrieNode root = new TrieNode();

		for (String word : words) {
			TrieNode currNode = root;

			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);

				currNode.childNode.putIfAbsent(ch, new TrieNode());
				currNode = currNode.childNode.get(ch);

				if (i == word.length() - 1)
					currNode.isAWord = true;
			}
		}

		for (String searchWord : new String[] { "apex", "apple", "bob", "bal", "ball", "plan", "planet" }) {
			TrieNode currSearchNode = root;
			boolean found = false;

			for (int i = 0; i < searchWord.length(); i++) {
				currSearchNode = currSearchNode.childNode.get(searchWord.charAt(i));

				if (currSearchNode == null) {
					found = false;
					break;
				}

				found = currSearchNode.isAWord;
			}

			if (found)
				print(searchWord + " -> found!");
			else
				print(searchWord + " -> not found!");
		}
	}
}
