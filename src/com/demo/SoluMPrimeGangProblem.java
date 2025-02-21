package com.demo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SoluMPrimeGangProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int testCases = sc.nextInt();

		final int[][][] grid = new int[testCases][][];

		IntStream.range(0, testCases).forEach((index) -> {

			int gridRow = sc.nextInt();
			int gridColumn = sc.nextInt();

			grid[index] = new int[gridRow][gridColumn];

			IntStream.range(0, gridRow).forEach(i -> {
				IntStream.range(0, gridColumn).forEach(j -> {
					grid[index][i][j] = isPrime(sc.nextInt());
				});
			});
		});

		sc.close();

		IntStream.range(0, testCases).forEach((index) -> {

			int[] gangCount = { 0 };

			IntStream.range(0, grid[index].length).forEach(i -> {

				IntStream.range(0, grid[index][i].length).forEach(j -> {

					if (grid[index][i][j] == 1) {
						if ((grid[index][i - 1][j] == -1) && (grid[index][i][j - 1] == -1))
							gangCount[0]++;
						else if ((grid[index][i - 1][j] == 1) && (grid[index][i][j - 1] == 1)) {
							grid[index][i][j] = 0;
							gangCount[0]--;
						} else if ((grid[index][i - 1][j] == 1) || (grid[index][i][j - 1] == 1))
							grid[index][i][j] = 0;
					}
				});
			});

			System.out.println(gangCount[0]);

		});

	}

	private static int isPrime(int n) {

		if ((n == 0) || (n == 1))
			return -1;

		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				return -1;
		}

		return 1;
	}

}
