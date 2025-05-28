package com.demo;

import java.util.Arrays;

public class LargestNoFromList {

	public static void main(String[] args) {
		int[] numList = { 120, 98, 540, 32, 11, 900, 9, 980 };

		System.out.println(printLargestNum(numList));
	}

	private static String printLargestNum(int[] arr) {
		if (arr.length == 0)
			return "0";

		if (arr.length == 1)
			return Integer.toString(arr[0]);

		String[] nums = new String[arr.length];

		for (int i = 0; i < arr.length; i++)
			nums[i] = Integer.toString(arr[i]);

		Arrays.sort(nums, (String o1, String o2) -> (o2 + o1).compareTo(o1 + o2));

		StringBuilder sb = new StringBuilder();

		for (String num : nums)
			sb.append(num);

		return sb.toString();
	}

}
