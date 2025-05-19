package com.demo;

import java.util.ArrayList;
import java.util.List;

public class DoubleValueDemo {
	public static void main(String[] args) {
		System.out.println(Double.valueOf(0) == 0.0);

		List<String> lst = new ArrayList<>();
		lst.add("1");
		lst.add("2");
		lst.add("0.2");
		lst.add("0");
		lst.add("0.0");
		lst.add("1.4");

		lst.removeIf(l -> Double.valueOf(l) == 0.0);

		lst.forEach(System.out::println);
	}
}
