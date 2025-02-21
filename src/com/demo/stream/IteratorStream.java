package com.demo.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IteratorStream {

	public static void main(String[] args) {

		List<Integer> intlist = Stream.iterate(1, n -> n + 1).limit(100).collect(Collectors.toList());

		intlist.stream().forEach(System.out::println);
		
		System.out.println("\nEven Numbers:");

		List<Integer> evenlist = intlist.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		evenlist.stream().forEach(System.out::println);

	}

}
