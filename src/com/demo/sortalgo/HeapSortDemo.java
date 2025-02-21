package com.demo.sortalgo;

/*
 * Heap sort is a comparison based sorting technique based on Binary Heap data structure.
 * It is similar to selection sort where we first find the maximum element and place the 
 * maximum element at the end. We repeat the same process for remaining element. A Binary 
 * Heap is a Complete Binary Tree where items are stored in a special order such that value 
 * in a parent node is greater(or smaller) than the values in its two children nodes.
 * 
 * Time Complexity: O(nLogn)
 */

public class HeapSortDemo {

	void heapSort(int[] arr) {

		int n = arr.length;

		for (int i = n / 2 - 1; i >= 0; i--)
			maxHeapify(arr, i, n); // Build a Max Heap starting from n/2-1 node of tress

		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Swapping between " + arr[0] + " and " + arr[n - i - 1] + " and removing " + arr[0]
					+ " from the heap tree.");

			int temp = arr[0]; // Swap the largest element at first node with last leaf.
			arr[0] = arr[n - i - 1];
			arr[n - i - 1] = temp;

			maxHeapify(arr, 0, n - i - 1); // Rebuild a max heap removing the last element which is swapped.
		}

	}

	void maxHeapify(int[] arr, int firstIndx, int lastIndx) {

		int left = 2 * firstIndx + 1;
		int right = 2 * firstIndx + 2;
		int largest = firstIndx;

		if (left < lastIndx && arr[left] > arr[largest])
			largest = left;

		if (right < lastIndx && arr[right] > arr[largest])
			largest = right;

		if (largest != firstIndx) {

			System.out.println("\nSwapping betweeen " + arr[firstIndx] + " and " + arr[largest]);

			int temp = arr[firstIndx];
			arr[firstIndx] = arr[largest];
			arr[largest] = temp;

			printArray(arr);

			maxHeapify(arr, largest, lastIndx);
		}

	}

	void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	public static void main(String[] args) {

		int arr[] = { 7, 4, 1, 6, 9, 10, 2, 5, 3, 8 };

		HeapSortDemo heap = new HeapSortDemo();

		System.out.println("Unsorted Array: ");
		heap.printArray(arr);

		heap.heapSort(arr);

		System.out.println();
		System.out.println("\nSorted Array: ");
		heap.printArray(arr);

	}

}
