package com.demo;

public class MinSubArrayWithGivenSum {

	private static boolean findMinSubArray(int[] arr, int sum) {

		int start = 0, end = 0;
		int curr_sum = arr[0];
		boolean found = false;

		for (int i = 1; i <= arr.length - 1; i++) {
			curr_sum += arr[i];
			end = i;

			if (curr_sum == sum) {
				found = true;
				break;
			}

			if (curr_sum < sum)
				continue;

			while (curr_sum > sum)
				curr_sum -= arr[start++];

		}

		if (found) {
			System.out.println(String.format("Subarray is between index %d and %d ", start, end));
			return true;
		} else
			return false;

	}

	public static void main(String[] args) {

		int[] arr = { 20, 4, 7, 8, 53, 72, 30, 3, 6, 29, 92 };

		int sum = 39;

		findMinSubArray(arr, sum);

	}

}
