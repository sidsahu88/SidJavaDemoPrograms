package com.demo;

public class ArrayReverseRecursion {

	public static void arrayReverse(int[] arr, int startIndx, int endIndx) {
		if (startIndx < endIndx) {
			int temp = arr[startIndx];
			arr[startIndx] = arr[endIndx];
			arr[endIndx] = temp;

			arrayReverse(arr, startIndx + 1, endIndx - 1);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Original Array: ");
		for (int i = 0; i <= arr.length - 1; i++)
			System.out.print(arr[i] + " ");

		arrayReverse(arr, 0, arr.length - 1);

		System.out.println();
		System.out.println("Reversed Array: ");
		for (int i = 0; i <= arr.length - 1; i++)
			System.out.print(arr[i] + " ");
	}

}
