package com.demo.searchalgo;

public class JumpSearchDemo {
	static int comp_cnt = 0;

	static int doJumpSearch(int[] arr, int srh_no) {
		int arr_size = arr.length;

		int step = (int) Math.sqrt(arr_size);

		int prev = 0;

		while (arr[Math.min(step, arr_size) - 1] < srh_no) {
			comp_cnt++;

			prev = step;

			step += (int) Math.sqrt(arr_size);

			if (prev >= arr_size)
				return -1;
		}

		comp_cnt++;

		while (arr[prev] < srh_no) {
			comp_cnt++;

			prev++;

			if (prev >= Math.min(step, arr_size))
				return -1;
		}

		comp_cnt++;

		if (arr[prev] == srh_no)
			return prev;

		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 8, 13, 21, 24, 29, 38, 44, 50, 57, 61, 65, 70, 79, 82, 85, 89, 94, 98, 100 };

		int srh_no_1 = 57;
		int srh_no_2 = 94;

		System.out.println("Array: ");
		
		for (int a : arr) {
			System.out.print(a+" ");
		}
		
		System.out.println("\nJump searching started for no.: " + srh_no_1);

		int pos = doJumpSearch(arr, srh_no_1);

		if (pos > -1) {
			System.out.println("Postion is " + (pos+1));
			System.out.println("Total Comparison: " + comp_cnt);
		} else {
			System.out.println("Not found.");
			System.out.println("Total Comparison: " + comp_cnt);
		}

		System.out.println("\nJump searching started for no.: " + srh_no_2);

		comp_cnt = 0;

		pos = doJumpSearch(arr, srh_no_2);

		if (pos > -1) {
			System.out.println("Postion is " + (pos+1));
			System.out.println("Total Comparison: " + comp_cnt);
		} else {
			System.out.println("Not found.");
			System.out.println("Total Comparison: " + comp_cnt);
		}
	}
}
