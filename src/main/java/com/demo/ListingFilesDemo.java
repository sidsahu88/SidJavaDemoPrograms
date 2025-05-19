package com.demo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListingFilesDemo {

	public static void main(String[] args) {

		try (Stream<Path> walk = Files.list(Paths.get(args[0]))) {

			List<String> result = walk.map(Path::toString).filter(f -> f.endsWith(args[1]))
					.collect(Collectors.toList());

			result.forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
