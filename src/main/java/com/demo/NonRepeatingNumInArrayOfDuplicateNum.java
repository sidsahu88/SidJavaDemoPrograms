package com.demo;

public class NonRepeatingNumInArrayOfDuplicateNum {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 3, 2, 4, 2, 5, 3, 6, 7, 6, 7, 4 };

		System.out.println(findNonRepeatingNum(nums));

	}

	private static int findNonRepeatingNum(int[] nums) {
		int num = 0;

		for (int i : nums)
			num ^= i;			//Bitwise XOR operation i.e. 0101 XOR 1100 = 1001

		return num;
	}

}
