package com.demo;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.LongStream;

public class CalculateNeutronsDemo {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		final int testCases = sc.nextInt();

		final long[] input = new long[testCases];

		LongStream.range(0, testCases).forEach(index -> input[(int) index] = sc.nextInt());

		sc.close();

		LongStream.of(input).forEach(CalculateNeutronsDemo::calculateNeutrons);

	}

	private static void calculateNeutrons(long input) {

		System.out.println(3 * input - (input - 1));

	}
}
