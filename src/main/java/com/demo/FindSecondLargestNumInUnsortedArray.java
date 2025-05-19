package com.demo;

public class FindSecondLargestNumInUnsortedArray {

	public static void main(String[] args) {
		int[] arr = { 10, 25, 11, 60, 34, 56 };

		int firstLar = 0;
		int secondLar = 0;
		int firstSml = Integer.MAX_VALUE;
		int secondSml = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstLar) {
				secondLar = firstLar;
				firstLar = arr[i];
			} else if (arr[i] > secondLar)
				secondLar = arr[i];
			
			if (arr[i] < firstSml && arr[i] < secondSml) {
				secondSml = firstSml;
				firstSml = arr[i];
			} else if (arr[i] > firstSml && arr[i] < secondSml)
				secondSml = arr[i];
		}

		System.out.println("Second largest: " + secondLar);
		System.out.println("Second smallest: " + secondSml);
	}

}
