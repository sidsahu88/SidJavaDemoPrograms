package com.demo.sortalgo;

/* 
 * Simple sorting algorithm that works the way we sort playing 
 * cards in our hands. An element which is to be 'insert'ed in 
 * this sorted sub-list, has to find its appropriate place and 
 * then it has to be inserted there. Hence the name, insertion 
 * sort.
 * 
 * Time Complexity: O(n^2)
 * 
 * Uses: Insertion sort is used when number of elements is small. 
 * 		 It can also be useful when input array is almost sorted, 
 * 		 only few elements are misplaced in complete big array.
 */

public class InsertionSortDemo {

	void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {

			System.out.println("\n\nIteration: " + i);

			int key = i;
			int temp = arr[key];

			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > temp) {

					System.out.println("Inserting " + arr[j] + " at index " + key);
					arr[key] = arr[j];
					key = j;

				}
			}
			
			if (key < i) {
				System.out.println("Inserting " + temp + " at index " + key);
				arr[key] = temp;
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

		InsertionSortDemo isd = new InsertionSortDemo();

		System.out.println("Unsorted Array: ");
		isd.printArray(arr);

		isd.insertionSort(arr);

		System.out.println();
		System.out.println("\nSorted Array: ");
		isd.printArray(arr);
	}

}
