package com.demo.sortalgo;

/* 
 * Simplest sorting algorithm that works by repeatedly 
 * swapping the adjacent elements if they are in wrong order.
 * 
 * Time Complexity: O(n^2) even if the array is sorted. 
 * 					It can be optimized by stopping the 
 * 					algorithm if inner loop didn’t cause any 
 * 					swap.
 */

public class BubbleSortDemo {

	void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			
			System.out.println("\n\nIteration: " + (i+1));
			
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {		//If left element is greater then right element, then swap the nos.
					
					System.out.println("Swapping between "+arr[j]+" and "+arr[j+1]);
					
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			
			printArray(arr);
		}
	}

	void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	public static void main(String[] args) {

		int arr[] = { 7, 4, 1, 6, 9, 10, 2, 5, 3, 8 };

		BubbleSortDemo bsd = new BubbleSortDemo();

		System.out.println("Unsorted Array: ");
		bsd.printArray(arr);

		bsd.bubbleSort(arr);

		System.out.println();
		System.out.println("\nSorted Array: ");
		bsd.printArray(arr);
	}
}
