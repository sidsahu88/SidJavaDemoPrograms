package com.demo;

public class LargestThreeNoInArray {

	public static void main(String[] args) {
		int[] arr = { 34, 13, 46, 69, 31, 21, 45, 89, 20 };

		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for (int j : arr) {
            if (first < j) {
                third = second;
                second = first;
                first = j;
            } else if (second < j) {
                third = second;
                second = j;
            } else if (third < j) {
                third = j;
            }
        }

		System.out.println("First Largest:" + first);
		System.out.println("Second Largest:" + second);
		System.out.println("Third Largest:" + third);

	}

}
