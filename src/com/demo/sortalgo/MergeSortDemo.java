package com.demo.sortalgo;

/*
 * Divide and Conquer Algorithm
 * 
 * It divides input array in two halves, calls itself for 
 * the two halves and then merges the two sorted halves. 
 * The merge() function is used for merging two halves.
 * 
 * Time complexity: O(nLogn)
 */

public class MergeSortDemo {

	void mergeSort(int[] arr) {
		if (arr.length < 2)
			return;

		int n = arr.length / 2;

		int[] lArr = new int[n];
		int[] rArr = new int[arr.length - n];

		for (int i = 0; i < n; i++)
			lArr[i] = arr[i];

		for (int i = n; i < arr.length; i++)
			rArr[i - n] = arr[i];

		mergeSort(lArr);
		mergeSort(rArr);

		merge(arr, lArr, rArr);
	}

	void merge(int[] arr, int[] lArr, int[] rArr) {
		int i = 0, j = 0, k = 0;

		while (i < arr.length) {

			if (j >= lArr.length) // If no element is left in left array then copy everything from right array.
				arr[i++] = rArr[k++];
			else if (k >= rArr.length) // If no element is left in right array then copy everything from left array.
				arr[i++] = lArr[j++];
			else if (lArr[j] <= rArr[k]) // If element at left array is less than or equal to element at right array,
				arr[i++] = lArr[j++]; // then insert element of left array.
			else if (lArr[j] > rArr[k]) // If element at left array is greater than element at right array,
				arr[i++] = rArr[k++]; // then insert element of right array.

		}
	}

	void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	public static void main(String[] args) {
		int arr[] = { 7, 4, 1, 6, 9, 10, 2, 5, 3, 8 };

		MergeSortDemo msd = new MergeSortDemo();

		System.out.println("Unsorted Array: ");
		msd.printArray(arr);

		msd.mergeSort(arr);

		System.out.println();
		System.out.println("\nSorted Array: ");
		msd.printArray(arr);
	}
}
