package com.demo.sortalgo;

/*
 * Divide and Conquer Algorithm
 * 
 * It picks an element as pivot and partitions 
 * the given array around the picked pivot. 
 * Target of partitions is, given an array and 
 * an element x of array as pivot, put x at its 
 * correct position in sorted array and put all 
 * smaller elements (smaller than x) before x, 
 * and put all greater elements (greater than x) 
 * after x. All this should be done in linear time. 
 * 
 * Time complexity: In average case: O(nLogn); In worst case: O(n^2) 
 */

public class QuickSortDemo {
	void quickSort(int[] arr, int stIndx, int enIndx) {

		if (stIndx < enIndx) {

			int p = partition(arr, stIndx, enIndx);

			quickSort(arr, stIndx, p - 1);
			quickSort(arr, p + 1, enIndx);

		}
	}

	int partition(int[] arr, int stIndx, int enIndx) {

		int pivot = arr[enIndx];

		int i = stIndx;

		for (int j = stIndx; j < enIndx; j++) {
			if (arr[j] <= pivot) {				
				if(i != j) {
					int temp = arr[i];	
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
				i++;
			}
		}

		int temp = arr[i];
		arr[i] = arr[enIndx];
		arr[enIndx] = temp;

		return i;
	}

	void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	public static void main(String[] args) {

		int arr[] = { 7, 4, 1, 6, 9, 10, 2, 5, 3, 8 };

		QuickSortDemo qsd = new QuickSortDemo();

		System.out.println("Unsorted Array: ");
		qsd.printArray(arr);

		qsd.quickSort(arr, 0, arr.length - 1);

		System.out.println("\nSorted Array: ");
		qsd.printArray(arr);
	}
}
