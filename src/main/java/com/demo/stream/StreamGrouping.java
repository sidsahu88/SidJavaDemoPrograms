package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamGrouping {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Amy");

        names.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)))
                .forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
