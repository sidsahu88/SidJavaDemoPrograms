package com.demo.searchalgo;

import java.util.Arrays;

public class ExponentialSearchDemo {

	static int doExponentialSearch(int[] arr, int srh_no) {

		if (arr[0] == srh_no)
			return 0;

		int i = 1;

		while (i < arr.length && arr[i] <= srh_no) {

			if (arr[i] == srh_no)
				return i;

			i = i * 2;
		}

		return Arrays.binarySearch(arr, i / 2, Math.min(i, arr.length), srh_no);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 8, 13, 21, 24, 29, 38, 44, 50, 57, 61, 65, 70, 79, 82, 85, 89, 94, 98, 100 };

		int srh_no_1 = 8;
		int srh_no_2 = 94;

		System.out.println("Exponential searching started for no.: " + srh_no_1);

		int pos = doExponentialSearch(arr, srh_no_1);

		if (pos > -1) {
			System.out.println("Postion is " + (pos + 1));
		} else {
			System.out.println("Not found.");
		}

		System.out.println("\nExponential searching started for no.: " + srh_no_2);

		pos = doExponentialSearch(arr, srh_no_2);

		if (pos > -1) {
			System.out.println("Postion is " + (pos + 1));
		} else {
			System.out.println("Not found.");
		}
	}
}
