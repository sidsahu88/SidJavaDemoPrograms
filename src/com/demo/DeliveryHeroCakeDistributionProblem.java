package com.demo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class DeliveryHeroCakeDistributionProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int testCases = sc.nextInt();

		final int[][] cakesSize = new int[testCases][];

		final int[] deliverySize = new int[testCases];

		IntStream.range(0, testCases).forEach(index -> {
			final int noOfCakes = sc.nextInt();

			cakesSize[index] = new int[noOfCakes];

			IntStream.range(0, noOfCakes).forEach(i -> {
				cakesSize[index][i] = sc.nextInt();
			});

			deliverySize[index] = sc.nextInt();
		});

		sc.close();

		IntStream.range(0, testCases).forEach(index -> {

			boolean possible = ckDeliveryPossible(cakesSize[index], cakesSize[index].length, deliverySize[index]);

			if (possible)
				System.out.println("YES");
			else
				System.out.println("NO");
		});

	}

	private static boolean ckDeliveryPossible(int[] cksArr, int totalCakes, int deliverySize) {

		if (deliverySize == 0)
			return true;

		if ((totalCakes == 0) && (deliverySize != 0))
			return false;

		if (cksArr[totalCakes - 1] > deliverySize)
			return ckDeliveryPossible(cksArr, totalCakes - 1, deliverySize);
		else
			return ckDeliveryPossible(cksArr, totalCakes - 1, deliverySize)
					|| ckDeliveryPossible(cksArr, totalCakes - 1, deliverySize - cksArr[totalCakes - 1]);

	}
}
