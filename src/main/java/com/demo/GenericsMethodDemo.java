package com.demo;

import java.util.function.Function;

public class GenericsMethodDemo {

	private static <T> void printElement(T element) {
		System.out.println("Class:" + element.getClass() + "\nValue:" + element);
		System.out.println();
	}

	private static <I,O> O convertValue(I element, Function<I, O> converter) {
		return converter.apply(element);
	}

	public static void main(String[] args) {

		int i = 12;

		printElement(i / 2);
		printElement(i / 2.0f);
		printElement(i / 2.0);
		printElement("Siddharth");

		printElement(convertValue(i, String::valueOf));

	}

}
