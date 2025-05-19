package com.demo;

public class AssertionDemo {

	public static void main(String[] args) {

		int i = 30;

		System.out.println("Asserting if " + i + " is lesser than 20");

		assert i > 20 : i + " is lesser than 20";

		i = 15;

		System.out.println("Changing value of i to " + i + " and Asserting again...");

		assert i > 20 : i + " is lesser than 20";

	}

}
