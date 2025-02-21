package com.demo.collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		/* HashMap<HashMapDemo, String> hm = new HashMap<>(); */

		HashMap<String, Integer> map = new HashMap<>();

		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = "abc";

		System.out.println((s1 == s2) + " " + (s1.equals(s2)));
		System.out.println((s1 == s3) + " " + (s1.equals(s3)));
		System.out.println((s3 == s4) + " " + (s3.equals(s4)));

		System.out.println(s1 + " " + s1.hashCode());
		System.out.println(s2 + " " + s2.hashCode());
		System.out.println(s3 + " " + s3.hashCode());
		System.out.println(s4 + " " + s4.hashCode());

		map.put(s1, 1);
		map.put(s2, 2);
		map.put(s3, 3);

		System.out.println(map);
		map.entrySet().forEach(System.out::println);

		/*
		 * HashMapDemo h1 = new HashMapDemo(); HashMapDemo h2 = new HashMapDemo();
		 * HashMapDemo h3 = new HashMapDemo(); HashMapDemo h4 = new HashMapDemo();
		 * 
		 * hm.put(h1, h1.toString()); hm.put(h2, h2.toString()); hm.put(h3,
		 * h3.toString()); hm.put(h4, h4.toString());
		 * 
		 * System.out.println(hm.entrySet()); System.out.println();
		 * hm.entrySet().forEach(System.out::println);
		 */
	}

}
