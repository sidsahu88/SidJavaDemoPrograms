package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FPTechDimmestStar {

	static int maxDepth = 0;
	static int dimmest = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int testCases = sc.nextInt();

		final List<HashMap<Integer, List<Integer>>> starsList = new ArrayList<>();

		final int[] brightest = new int[testCases];

		IntStream.range(0, testCases).forEach((index) -> {

			int noOfStars = sc.nextInt();

			final HashMap<Integer, List<Integer>> starsPath = new HashMap<>();

			IntStream.range(0, noOfStars - 1).forEach(i -> {
				int start = sc.nextInt();
				int end = sc.nextInt();

				List<Integer> list;

				if (!starsPath.containsKey(start)) {
					list = new ArrayList<Integer>();

					list.add(end);

					starsPath.put(start, list);
				} else {
					list = starsPath.get(start);

					list.add(end);

					starsPath.put(start, list);
				}

			});

			starsList.add(starsPath);

			brightest[index] = sc.nextInt();
		});

		sc.close();

		IntStream.range(0, testCases).forEach((index) -> {

			HashMap<Integer, List<Integer>> sPath = starsList.get(index);

			System.out.println(getDimmestStar(sPath, brightest[index], 0));

			dimmest = -1;
			maxDepth = 0;

		});

	}

	private static int getDimmestStar(HashMap<Integer, List<Integer>> sPath, int idx, int depth) {
		List<Integer> stars = sPath.get(idx);
		if (stars == null) {
			if (depth > maxDepth) {
				dimmest = idx;
				maxDepth = depth;
			} else if (depth == maxDepth) {
				dimmest = Math.min(dimmest, idx);
			}
		} else {
			for (int i = 0; i < stars.size(); i++) {
				getDimmestStar(sPath, stars.get(i), depth + 1);
			}
		}

		return dimmest;
	}

}
