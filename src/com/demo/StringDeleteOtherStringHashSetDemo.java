package com.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class StringDeleteOtherStringHashSetDemo {

	public static void main(String[] args) {

		String str1 = "abcd";
		String str2 = "bcf";

		HashSet<Character> hs1 = new LinkedHashSet<>();
		HashSet<Character> hs2 = new LinkedHashSet<>();

		for (int i = 0; i < str1.length(); i++)
			hs1.add(str1.charAt(i));

		for (int i = 0; i < str2.length(); i++)
			hs2.add(str2.charAt(i));

		System.out.println("Op1: ");
		hs1.forEach(s -> {
			if (!hs2.contains(s))
				System.out.print(s);
		});

		System.out.println("\nOp2: ");
		hs2.forEach(s -> {
			if (!hs1.contains(s))
				System.out.print(s);
		});

	}

}
