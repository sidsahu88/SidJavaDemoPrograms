package com.demo.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ReverseStringStackImpl {

	public static void main(String[] args) throws IOException {

		Stack<Character> st = new Stack<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a String: ");
		String input = reader.readLine();
		reader.close();

		for (char ch:input.toCharArray())
			st.push(ch);

		StringBuilder output = new StringBuilder();

		while (!st.isEmpty())
			output.append(st.pop());

		System.out.println("Reversed String: \n" + output);

	}

}