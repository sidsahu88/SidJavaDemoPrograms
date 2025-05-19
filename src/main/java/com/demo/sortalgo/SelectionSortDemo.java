package com.demo.sortalgo;

/*
 * The smallest element is selected from the unsorted 
 * array and swapped with the leftmost element, and that 
 * element becomes a part of the sorted array. This process 
 * continues moving unsorted array boundary by one element 
 * to the right.
 * 
 * Time Complexity: O(n^2)
 * 
 * The good thing about selection sort is it never 
 * makes more than O(n) swaps and can be useful when 
 * memory write is a costly operation.
 */

public class SelectionSortDemo {

	void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			
			System.out.println("\n\nIteration: "+(i+1));
			
			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}

			System.out.println("Swapping between " + arr[i] + " and " + arr[min]);
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
			printArray(arr);
		}
	}

	void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	public static void main(String[] args) {
		int arr[] = { 7, 4, 1, 6, 9, 10, 2, 5, 3, 8 };

		SelectionSortDemo ssd = new SelectionSortDemo();

		System.out.println("Unsorted Array: ");
		ssd.printArray(arr);

		ssd.selectionSort(arr);

		System.out.println();
		System.out.println("\nSorted Array: ");
		ssd.printArray(arr);
	}

}
