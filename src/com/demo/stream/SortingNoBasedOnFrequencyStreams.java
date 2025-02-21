package com.demo.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class SortingNoBasedOnFrequencyStreams {

	public static void main(String[] args) {

		Integer[] num = { 2, 3, 3, 2, 1, 6, 2, 1, 3, 16, 3, 4, 3, 4 };

		/*
		 * Stream.of(num).collect(Collectors.toMap(i -> i, i -> 1, (v1, v2) -> v1 +
		 * v2)).entrySet().stream() .sorted((e1, e2) -> {
		 * 
		 * int result = e2.getValue().compareTo(e1.getValue());
		 * 
		 * if (result == 0) {
		 * 
		 * result = e1.getKey().compareTo(e2.getKey()); }
		 * 
		 * return result;
		 * 
		 * }).forEach(entry -> {
		 * 
		 * for (int i = 1; i <= entry.getValue(); i++) {
		 * 
		 * System.out.print(entry.getKey() + " "); }
		 * 
		 * });
		 */

		HashMap<Integer, Integer> map = new HashMap<>();

		for (Integer i : num) {
			map.merge(i, 1, (v1, v2) -> v1 + 1);
			/*
			 * Integer count = 0;
			 * 
			 * if (map.containsKey(i)) count = map.get(i);
			 * 
			 * map.put(i, count + 1);
			 */
		}

		TreeSet<Map.Entry<Integer, Integer>> entryTree = new TreeSet<>((e1, e2) -> {
			int result = e2.getValue().compareTo(e1.getValue());

			if (result == 0) {

				result = e1.getKey().compareTo(e2.getKey());
			}

			return result;
		});

		entryTree.addAll(map.entrySet());

		entryTree.stream().forEach(entry -> {
			for (int i = 1; i <= entry.getValue(); i++)
				System.out.print(entry.getKey() + " ");
		});

		/*
		 * List<Map.Entry<Integer, Integer>> entryList = new
		 * ArrayList<>(map.entrySet());
		 *
		 * Collections.sort(entryList, (Map.Entry<Integer, Integer> e1,
		 * Map.Entry<Integer, Integer> e2) -> {
		 * 
		 * int result = e2.getValue().compareTo(e1.getValue());
		 * 
		 * if (result == 0) {
		 * 
		 * result = e1.getKey().compareTo(e2.getKey()); }
		 * 
		 * return result; });
		 * 
		 * for (Map.Entry<Integer, Integer> entry : entryList) { for (int j = 1; j <=
		 * entry.getValue(); j++) System.out.print(entry.getKey() + " "); }
		 */

	}

}
