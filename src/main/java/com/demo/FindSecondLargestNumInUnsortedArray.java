package com.demo;

public class FindSecondLargestNumInUnsortedArray {

	public static void main(String[] args) {
		int[] arr = { 10, 25, 11, 60, 34, 56 };

		int firstLar = 0;
		int secondLar = 0;
		int firstSml = Integer.MAX_VALUE;
		int secondSml = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j > firstLar) {
                secondLar = firstLar;
                firstLar = j;
            } else if (j > secondLar)
                secondLar = j;

            if (j < firstSml && j < secondSml) {
                secondSml = firstSml;
                firstSml = j;
            } else if (j > firstSml && j < secondSml)
                secondSml = j;
        }

		System.out.println("Second largest: " + secondLar);
		System.out.println("Second smallest: " + secondSml);
	}

}
