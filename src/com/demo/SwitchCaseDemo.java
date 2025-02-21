package com.demo;

import java.util.Scanner;

public class SwitchCaseDemo {

	private static final String A = "axe";
	private static final String B = "bat";
	private static final String C = "cap";

	public static void main(String[] args) {
		System.out.println("Enter any string: ");

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();

		switch (input) {
		case A:
			System.out.println("A");
			break;
		case B:
			System.out.println("B");
			break;
		case C:
			System.out.println("C");
			break;
		default:
			System.out.println("Nothing found!");
			break;
		}
	}
}
