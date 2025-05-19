package com.demo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SGPrintPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of test cases: ");
		final int testcases = sc.nextInt();

		final int[] in = new int[testcases];

		System.out.println("Enter no. for patterns: ");
		for(int i = 0; i < testcases; i++) 
			in[i] = sc.nextInt();

		sc.close();

		IntStream.of(in).forEach(SGPrintPattern::patPrint);

	}

	private static void patPrint(int a) {

		int matLen = 2 * a - 1;

		int[][] out = new int[matLen][matLen];

		for (int i = 0; i <= matLen - 1; i++) {
			for (int j = 0; j <= matLen - 1; j++) {
				if ((i - 1 < 0) || (j - 1 < 0)) {
					out[i][j] = a;
				} else if ((i < a) && j < a) {
					out[i][j] = out[i - 1][j - 1] - 1;
				} else if (i >= a){
					out[i][j] = out[matLen - i - 1][j];
				}else if (j >= a){
					out[i][j] = out[i][matLen - j - 1];
				}
				System.out.print(out[i][j] + " ");
			}
			System.out.println();
		}

	}

}
