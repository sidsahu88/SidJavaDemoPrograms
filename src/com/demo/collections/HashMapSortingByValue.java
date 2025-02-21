package com.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMapSortingByValue {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("Siddharth", 2);
		hm.put("Sangita", 1);
		hm.put("Kanha", 4);
		hm.put("Prafulla", 3);
		hm.put("Minakshi", 5);

		System.out.println("Unsorted Map: " + hm);

		List<Map.Entry<String, Integer>> hashList = new ArrayList<>(hm.entrySet());

		Collections.sort(hashList, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				//return (o1.getValue()).compareTo(o2.getValue());
				return (o1.getValue() - o2.getValue());
			}

		});

		HashMap<String, Integer> newhm = new LinkedHashMap<>();

		for (Map.Entry<String, Integer> entry : hashList) {
			newhm.put(entry.getKey(), entry.getValue());
		}

		System.out.println("Sorted Map: " + newhm);

	}

}
