package com.demo;

public class IndexOfCorruptNoInSequence {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 7, 8, 19, 10, 11, 12, 13, 14, 15 };

		if (arr.length == 0 || arr.length == 1) {
			System.out.println("No corrupt element found. Total elements : " + arr.length);
			return;
		}

		if (arr.length > 2) {
			int i = 1;

			while (i < arr.length) {
				if (arr[i - 1] + 1 != arr[i])
					break;

				i++;
			}

			if (i == 1 && arr[i] + 1 == arr[i + 1])
					i--;

			System.out.println(
					"Array length: " + arr.length + "\nCorrupt no.: " + arr[i] + "\nIndex of the corrupt no.: " + i);
		} else
			System.out.println("Not enough element in the array. Total elements : " + arr.length);
	}

}
