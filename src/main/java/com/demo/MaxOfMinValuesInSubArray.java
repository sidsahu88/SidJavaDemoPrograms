package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MaxOfMinValuesInSubArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter subarray size:");
		final int subArrSize = sc.nextInt();

		System.out.println("Enter array size:");
		final int ArrSize = sc.nextInt();

		final Integer[] input = new Integer[ArrSize];

		System.out.println("Enter array elements:");
		IntStream.range(0, ArrSize).forEach(index -> input[index] = sc.nextInt());

		sc.close();

		List<Integer> arr = Arrays.asList(input);

		System.out.println(findMaxOfMinValInSubArray(subArrSize, arr));

	}

	private static int findMaxOfMinValInSubArray(int x, List<Integer> arr) {

		int max = 0;

		for (int i = 0; i + x <= arr.size(); i++) {

			int temp = 0, min = arr.get(i);

			for (int j = 1; j < x; j++) {
				temp = arr.get(i + j);

				if (temp < min)
					min = temp;
			}

			if (min > max)
				max = min;
		}

		return max;
	}

}
