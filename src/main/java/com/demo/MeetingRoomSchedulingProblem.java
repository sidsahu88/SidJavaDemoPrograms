package com.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MeetingRoomSchedulingProblem {

	private static int maxMeetingSch(int[][] schedule) {

		if (schedule.length == 0)
			return 0;

		Arrays.sort(schedule, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
		});

		LinkedHashMap<Integer, Integer> meetingSch = new LinkedHashMap<>();

		meetingSch.put(schedule[0][0], schedule[0][1]);

		int k = 0;

		for (int i = 1; i < schedule.length; i++) {

			if (schedule[k][1] <= schedule[i][0]) {

				meetingSch.put(schedule[i][0], schedule[i][1]);

				k = i;

			}

		}

		for (Map.Entry<Integer, Integer> entry : meetingSch.entrySet())
			System.out.print("{" + entry.getKey() + "," + entry.getValue() + "} ");

		return meetingSch.size();

	}

	public static void main(String[] args) {

		int[][] schedule = { { 2, 3 }, { 1, 4 }, { 3, 5 }, { 3, 4 }, { 4, 7 }, { 4, 5 }, { 5, 6 }, { 5, 7 }, { 7, 8 },
				{ 6, 7 } };

		System.out.println("\nMaximum no. of meeting can be scheduled: " + maxMeetingSch(schedule));

		/*
		 * for (int i = 0; i < schedule.length; i++) { for (int j = 0; j <
		 * schedule[i].length; j++) System.out.print(schedule[i][j] + " ");
		 * 
		 * System.out.print(" "); }
		 */

	}

}
