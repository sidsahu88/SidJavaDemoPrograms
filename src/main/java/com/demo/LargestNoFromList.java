package com.demo;

import java.util.Arrays;

public class LargestNoFromList {

	static void printLargestNum(int[] arr) {

		String[] num = new String[arr.length];

		for (int i = 0; i < arr.length; i++)
			num[i] = String.valueOf(arr[i]);

//		Arrays.sort(num, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return (o2 + o1).compareTo(o1 + o2);
//			}
//		});

		Arrays.sort(num, (String o1, String o2) -> (o2 + o1).compareTo(o1 + o2));

		for (int i = 0; i < arr.length; i++)
			System.out.print(num[i]);
	}

	public static void main(String[] args) {

		int[] numList = { 120, 98, 540, 32, 11, 900, 9, 980 };

		printLargestNum(numList);

	}

}
