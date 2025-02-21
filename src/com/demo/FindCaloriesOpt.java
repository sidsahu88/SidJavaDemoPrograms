package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FindCaloriesOpt {

	public static void main(String[] args) {

		FindCaloriesOpt obj = new FindCaloriesOpt();

		final int[][] localInputs = obj.readInputs();

		IntStream.range(0, localInputs.length).forEach(index -> {
			IntStream.range(0, localInputs[index].length).forEach(idx -> {
				System.out.print(localInputs[index][idx] + " ");
			});
			System.out.println();
		});

		final int[] outputs = obj.process(localInputs);

		IntStream.range(0, outputs.length).forEach(index -> {
			System.out.println(outputs[index]);
		});
	}

	private int[][] readInputs() {
		int[][] localInputs = null;
		try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr)) {

			final String noOfTestCasesTxt = br.readLine();

			final int noOfTestCases = Integer.parseInt(noOfTestCasesTxt);

			final int[][] inputs = new int[noOfTestCases][];

			IntStream.range(0, noOfTestCases).forEach(index -> {
				try {
					final String daysLenTxt = br.readLine();

					final int daysLen = Integer.parseInt(daysLenTxt);

					inputs[index] = new int[daysLen];

					final String daysCalTxt = br.readLine();
					final String[] daysCals = daysCalTxt.split(" ");

					IntStream.range(0, daysLen).forEach(days -> {
						inputs[index][days] = Integer.parseInt(daysCals[days]);
					});

				} catch (IOException e) {
					e.printStackTrace();
				}
			});

			localInputs = inputs;

		} catch (IOException e) {
			e.printStackTrace();
		}

		return localInputs;
	}

	public int[] process(int[][] localInputs) {
		final int inputsLen = localInputs.length;
		final int outputs[] = new int[inputsLen];

		IntStream.range(0, inputsLen).forEach(index -> {
			outputs[index] = calculate(localInputs[index]);
		});

		return outputs;
	}

	public int calculate(int[] inputs) {
		Arrays.sort(inputs);
		int calories = 0;
		int kms = 0;

		for (int index = inputs.length - 1; index >= 0; index--) {
			calories += 2 * kms + inputs[index];
			kms += inputs[index];
		}

		return calories;
	}

}