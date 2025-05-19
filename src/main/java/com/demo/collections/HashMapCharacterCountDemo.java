package com.demo.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapCharacterCountDemo {

	public static void main(String[] args) {

		String str = "ahsadajaasd";

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (hm.containsKey(str.charAt(i))) {
				hm.replace(str.charAt(i), hm.get(str.charAt(i)) + 1);
			} else
				hm.put(str.charAt(i), 1);

		}

		Iterator<Map.Entry<Character, Integer>> itr = hm.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<Character, Integer> entry = itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
