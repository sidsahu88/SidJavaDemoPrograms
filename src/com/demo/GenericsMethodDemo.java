package com.demo;

public class GenericsMethodDemo {

	private static <T> void printElement(T element) {
		System.out.println("Class:" + element.getClass() + "\nValue:" + element);
		System.out.println();
	}

	public static void main(String[] args) {

		int i = 12;

		printElement(i / 2);
		printElement(i / 2.0f);
		printElement(i / 2.0);
		printElement("Siddharth");

	}

}
