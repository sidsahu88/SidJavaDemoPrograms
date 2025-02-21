package com.demo.searchalgo;

public class InterpolSearchDemo {

	static int comp_cnt = 0;

	static int doInterpolSearch(int[] arr, int srh_no) {
		int start_indx = 0;
		int end_indx = arr.length - 1;

		while (start_indx <= end_indx && arr[start_indx] <= srh_no && srh_no <= arr[end_indx]) {
			
			if (arr[start_indx] == srh_no) {
				comp_cnt++;
				return start_indx;
			}
				
			if (arr[end_indx] == srh_no) {
				comp_cnt++;
				return end_indx;
			}
				
			int pos = start_indx
					+ ((srh_no - arr[start_indx]) * (end_indx - start_indx) / (arr[end_indx] - arr[start_indx]));

			if (arr[pos] == srh_no) {
				comp_cnt++;
				return pos;
			}

			if (arr[pos] < srh_no) {
				comp_cnt++;
				start_indx = pos + 1;
			}

			if (arr[pos] > srh_no) {
				comp_cnt++;
				end_indx = pos - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 8, 13, 21, 24, 29, 38, 44, 50, 57, 61, 65, 70, 79, 82, 85, 89, 94, 98, 100 };

		int srh_no_1 = 21;
		int srh_no_2 = 85;
		
		System.out.println("Array: ");
		
		for (int a : arr) {
			System.out.print(a+" ");
		}

		System.out.println("\nInterpolation searching started for no.: " + srh_no_1);

		int pos = doInterpolSearch(arr, srh_no_1);

		if (pos > -1) {
			System.out.println("Postion is " + (pos + 1));
			System.out.println("Total Comparison: " + comp_cnt);
		} else {
			System.out.println("Not found.");
			System.out.println("Total Comparison: " + comp_cnt);
		}

		System.out.println("\nJump searching started for no.: " + srh_no_2);

		comp_cnt = 0;

		pos = doInterpolSearch(arr, srh_no_2);

		if (pos > -1) {
			System.out.println("Postion is " + (pos + 1));
			System.out.println("Total Comparison: " + comp_cnt);
		} else {
			System.out.println("Not found.");
			System.out.println("Total Comparison: " + comp_cnt);
		}
	}
}
