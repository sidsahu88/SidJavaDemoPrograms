package com.demo.searchalgo;

public class linearSearchDemo {
	static int comp_cnt = 0;

	static int doLinearSearchUnordered(int[] arr, int arr_size, int ser_no) {

		for (int i = 0; i < arr_size; i++) {

			if (arr[i] == ser_no) {
				++comp_cnt;
				return i;
			}

			++comp_cnt;
		}

		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 3, 15, 16, 35, 6, 22, 8, 27, 30, 19, 63 };

		int ser_no_1 = 35;
		int ser_no_2 = 13;

		System.out.println("Array: ");

		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println("\nLinear searching started for no.: " + ser_no_1);

		int pos = doLinearSearchUnordered(arr, arr.length, ser_no_1);

		if (pos > -1) {
			System.out.println("Postion is " + (pos + 1));
			System.out.println("Total Comparison: " + comp_cnt);
		} else {
			System.out.println("Not found.");
			System.out.println("Total Comparison: " + comp_cnt);
		}

		System.out.println("\nLinear searching started for no.: " + ser_no_2);

		comp_cnt = 0;

		pos = doLinearSearchUnordered(arr, arr.length, ser_no_2);

		if (pos > -1) {
			System.out.println("Postion is " + (pos + 1));
			System.out.println("Total Comparison: " + comp_cnt);
		} else {
			System.out.println("Not found.");
			System.out.println("Total Comparison: " + comp_cnt);
		}
	}
}
