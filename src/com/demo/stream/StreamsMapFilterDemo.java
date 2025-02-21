package com.demo.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsMapFilterDemo {

	public static void main(String[] args) {

		IntStream.range(1, 11).map(i -> i * 3).filter(i -> i % 2 == 0).forEach(System.out::println);

		System.out.println();

		List<String> names = new ArrayList<>();

		names.add("Thor");
		names.add("Iron Man");
		names.add("Hulk");
		names.add("Black Widow");
		names.add("Captain America");
		names.add("Spiderman");
		names.add("Antman");

		names.stream().filter(name -> name.length() > 7).forEach(System.out::println);

		System.out.println();

		HashMap<Integer, String> hmap = new HashMap<>();

		hmap.put(1, "Black Panther");
		hmap.put(2, "Doctor Strange");
		hmap.put(3, "Gamora");
		hmap.put(4, "Star Lord");
		hmap.put(5, "Rocket");

		Map<Integer, String> resultMap = hmap.entrySet().stream().filter(map -> map.getKey().intValue() > 2)
				.filter(map -> map.getValue().length() > 6)
				.collect(Collectors.toMap(Entry<Integer, String>::getKey, Entry<Integer, String>::getValue));

		System.out.println("Result: " + resultMap);

	}

}
