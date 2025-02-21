package com.demo.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ReverseStringStackImpl {

	public static void main(String[] args) throws IOException {

		Stack<Character> st = new Stack<Character>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a String: ");
		String input = reader.readLine();
		reader.close();

		for (int i = 0; i < input.length(); i++)
			st.push(input.charAt(i));

		String output = "";

		while (!st.isEmpty())
			output = output + st.pop();

		System.out.println("Reversed String: \n" + output);

	}

}