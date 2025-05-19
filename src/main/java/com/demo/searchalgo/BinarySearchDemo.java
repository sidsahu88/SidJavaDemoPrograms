package com.demo.searchalgo;

public class BinarySearchDemo {
	static int comp_cnt = 0;

	static int doBinarySearch(int[] arr, int start_indx, int end_indx, int srh_no) {

		if (start_indx <= end_indx) {

			int mid = (start_indx + end_indx) / 2;

			if (srh_no == arr[mid]) {
				++comp_cnt;
				return mid;
			}

			if (arr[mid] > srh_no) {
				++comp_cnt;
				return doBinarySearch(arr, start_indx, mid - 1, srh_no);
			}

			if (arr[mid] < srh_no) {
				++comp_cnt;
				return doBinarySearch(arr, mid + 1, end_indx, srh_no);
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 8, 13, 21, 24, 29, 38, 44, 50, 57, 61, 65, 70, 79, 82, 85, 89, 94, 98, 100 };

		int srh_no_1 = 100;
		int srh_no_2 = 61;

		System.out.println("Array: ");

		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println("\nBinary searching started for no.: " + srh_no_1);

		int pos = doBinarySearch(arr, 0, arr.length - 1, srh_no_1);

		if (pos > -1) {
			System.out.println("Postion is " + (pos + 1));
			System.out.println("Total Comparison: " + comp_cnt);
		} else {
			System.out.println("Not found.");
			System.out.println("Total Comparison: " + comp_cnt);
		}

		System.out.println("\nBinary searching started for no.: " + srh_no_2);

		comp_cnt = 0;

		pos = doBinarySearch(arr, 0, arr.length - 1, srh_no_2);

		if (pos > -1) {
			System.out.println("Postion is " + (pos + 1));
			System.out.println("Total Comparison: " + comp_cnt);
		} else {
			System.out.println("Not found.");
			System.out.println("Total Comparison: " + comp_cnt);
		}
	}
}
