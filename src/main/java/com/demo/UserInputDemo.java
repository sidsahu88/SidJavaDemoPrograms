package com.demo;

import java.io.IOException;
import java.util.Scanner;

public class UserInputDemo {
	public static void main(String[] args) throws IOException {
		Scanner r = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int x = r.nextInt();

		System.out.println("Enter the multiplier: ");
		int y = r.nextInt();

		r.close();

		System.out.println("Multiplication result : " + (x * y));
	}

}