package com.demo;

public class LargestThreeNoInArray {

	public static void main(String[] args) {
		int[] arr = { 34, 13, 46, 69, 31, 21, 45, 89, 20 };

		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (first < arr[i]) {
				third = second;
				second = first;
				first = arr[i];
			} else if (second < arr[i]) {
				third = second;
				second = arr[i];
			} else if (third < arr[i]) {
				third = arr[i];
			}
		}

		System.out.println("First Largest:" + first);
		System.out.println("Second Largest:" + second);
		System.out.println("Third Largest:" + third);

	}

}
