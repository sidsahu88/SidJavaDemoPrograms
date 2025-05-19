package com.demo;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

		int[] arr = { 20, 3, 5, 12, 8, 21, 4, 18, 6, 11, 2 };

		int sum = 8;

		findSubArrayWithGivenSum(arr, sum);

	}

	private static boolean findSubArrayWithGivenSum(int[] arr, int sum) {

		int start = 0, end = 1;
		int curr_sum = arr[start];
		boolean found = false;

		while (end <= arr.length - 1) {

			curr_sum += arr[end];
			
			if (curr_sum == sum) {
				found = true;
				break;
			}

			while (curr_sum > sum && start < end)
				curr_sum -= arr[start++];
			
			end++;

		}

		if (found)
			System.out.println(String.format("Subarray is within index %d and %d", start, end));
		else
			System.out.println("No Subarray found.");

		return found;
	}

}
