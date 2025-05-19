package com.demo;

import java.util.Arrays;

public class ZeroNonZeroSwapArrayProblem {

	private static void SwapArrayZeroNonZero(int[] arr) {

		int front = 0;
		int tail = arr.length - 1;
		int swapcount = 0;

		while (front <= tail) {
			if (arr[front] == 0)
				front++;
			else if (arr[tail] != 0)
				tail--;
			else {
				int temp = arr[front];
				arr[front] = arr[tail];
				arr[tail] = temp;

				swapcount++;

				front++;
				tail--;
			}
		}

		System.out.println("\nTotal swaps: " + swapcount);
		System.out.println("Total non zero integers: " + (arr.length - tail - 1));
	}

	private static void printArray(int[] arr) {
		Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
	}

	public static void main(String[] args) {

		int[] arr = { 1, 6, 0, 5, 0, 12, 7, 0, 0, 3 };

		printArray(arr);
		SwapArrayZeroNonZero(arr);

		System.out.println();
		printArray(arr);

	}

}
