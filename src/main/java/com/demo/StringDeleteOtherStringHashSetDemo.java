package com.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class StringDeleteOtherStringHashSetDemo {

	public static void main(String[] args) {

		String str1 = "abcd";
		String str2 = "bcf";

		HashSet<Character> hs1 = new LinkedHashSet<>();
		HashSet<Character> hs2 = new LinkedHashSet<>();

		for (char ch: str1.toCharArray())
			hs1.add(ch);

		for (char ch: str2.toCharArray())
			hs2.add(ch);

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
