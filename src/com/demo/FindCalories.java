package com.demo;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindCalories {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int testCase = Integer.parseInt(sc.nextLine());

		int[] calories = new int[testCase];
		
		for (int i = 0; i < testCase; i++) {
			
			int numDays = Integer.parseInt(sc.nextLine());

			String[] runKmDays = new String[numDays]; 
			
			runKmDays = sc.nextLine().split(" ");
			
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			
			for(int j = 0; j < numDays; j++)
				pq.add(Integer.parseInt(runKmDays[j]));
			
			int prevRun = 0, currRun=0;
			
			calories[i] = 0;
			
			while(!pq.isEmpty()) {
				currRun = pq.poll();
				
				calories[i] = (2*prevRun+currRun)+calories[i];
				
				prevRun += currRun;
			}
		}
	
		for (int i = 0; i < testCase; i++) {
			System.out.println(calories[i]);
		}
	}
}