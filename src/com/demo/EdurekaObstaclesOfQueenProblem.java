package com.demo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class EdurekaObstaclesOfQueenProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int testCases = sc.nextInt();

		if (testCases < 1 || testCases > 10000) {
			System.out.println("No. of test cases cannot be less than 1 and greater than 10000.");
			System.exit(0);
		}

		final int[] sizeOfChessBrd = new int[testCases];
		final String[] queensCoordStr = new String[testCases];

		IntStream.range(0, testCases).forEach(i -> {

			sizeOfChessBrd[i] = sc.nextInt();

			if (sizeOfChessBrd[i] < 4 || sizeOfChessBrd[i] > 10000) {
				System.out.println("Size of chess board cannot be less than 4 and greater than 10000.");
				System.exit(0);
			}

			queensCoordStr[i] = sc.nextLine();

		});

		sc.close();

		final int[][] queensCoord = extractQueensCoordinates(queensCoordStr);

		IntStream.range(0, testCases).forEach(i -> {
			int totalMoves = noOfQueensMove(sizeOfChessBrd[i], queensCoord[i]);

			System.out.println(totalMoves);

			if (((queensCoord[i][0] == 1) && (queensCoord[i][1] == 1))
					|| ((queensCoord[i][0] == sizeOfChessBrd[i]) && (queensCoord[i][1] == sizeOfChessBrd[i]))) {
				totalMoves = totalMoves - 2;
			} else
				totalMoves = totalMoves - 3;

			System.out.println(totalMoves);
		});

	}

	private static int[][] extractQueensCoordinates(String[] coordStr) {

		final int[][] coord = new int[coordStr.length][2];

		IntStream.range(0, coordStr.length).forEach(i -> {

			coordStr[i] = coordStr[i].trim();
			String[] queensCoordArr = coordStr[i].substring(1, coordStr[i].length() - 1).split(",");

			coord[i][0] = Integer.parseInt(queensCoordArr[0]);
			coord[i][1] = Integer.parseInt(queensCoordArr[1]);

		});

		return coord;

	}

	private static int noOfQueensMove(int brdSize, int[] queenCoord) {

		int moveCount = 0;

		moveCount = 2 * (brdSize - 1) + Math.min(queenCoord[0] - 1, queenCoord[1] - 1)
				+ Math.min(brdSize - queenCoord[0], brdSize - queenCoord[1])
				+ Math.min(brdSize - queenCoord[0], queenCoord[1] - 1)
				+ Math.min(queenCoord[0] - 1, brdSize - queenCoord[1]);

		return moveCount;
	}

}
