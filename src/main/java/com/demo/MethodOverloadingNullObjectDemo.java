package com.demo;

public class MethodOverloadingNullObjectDemo {

	private static void print(Object obj) {
		System.out.println("Printing Object: " + obj);
	}

	private static void print(String str) {
		System.out.println("Printing String: " + str);
	}

	/*
	 * private static void print(Integer a) {
	 * System.out.println("Printing Integer: "+a); }
	 */

	public static void main(String[] args) {

		print(null);

	}

}
