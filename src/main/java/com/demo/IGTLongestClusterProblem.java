package com.demo;

/*
Given a 2D array, return the number with longest cluster. A cluster is the same number in adjacent horizontal, 
vertical, or diagonal direction. If the number of cluster is identical return the lower number. Content of 
the cells are guaranteed to be positive.

Input: {{1,4,2,2},
        {1,2,4,4},
        {2,1,1,1},
        {3,3,3,3}}  
Output: 1

Input: {{1,4,2,2},
        {1,2,4,4},
        {3,4,1,1},
        {3,4,3,3}}
Output: 4

Input: {{1,4,2,2},
        {1,2,4,4},
        {1,4,1,1},
        {3,3,3,3}}
Output: 3
*/

public class IGTLongestClusterProblem {

	static <T> void print(T t) {
		System.out.println(t);
	}

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 4, 2, 2 }, { 1, 2, 4, 4 }, { 2, 1, 1, 1 }, { 3, 3, 3, 3 } };
		int[][] arr1 = new int[][] { {} };
		int[][] arr2 = new int[][] { { 2 } };
		int[][] arr3 = new int[][] { { 1, 4, 2, 2 }, { 1, 2, 4, 4 }, { 3, 4, 1, 1 }, { 3, 4, 3, 3 } };
		int[][] arr4 = new int[][] { { 1, 4, 2, 2 }, { 1, 2, 4, 4 }, { 1, 4, 1, 1 }, { 3, 3, 3, 3 } };

		print("TestCase 1: " + solution(arr));
		print("TestCase 2: " + solution(arr1));
		print("TestCase 3: " + solution(arr2));
		print("TestCase 4: " + solution(arr3));
		print("TestCase 5: " + solution(arr4));

	}

	private static int solution(int[][] arr) {
		int maxClusNum = -999;

		if (arr[0].length < 1) {
			return maxClusNum;
		} else if (arr.length == 1 && arr[0].length == 1) {
			maxClusNum = arr[0][0];
		} else {
			int maxClusSize = 1;
			maxClusNum = arr[0][0];

			for (int row = 0; row < arr.length; row++) {
				for (int column = 0; column < arr[0].length; column++) {
					if(arr[row][column] < 0)
						continue;
					
					int currClusNum = arr[row][column];
					int currClusSize = getClusSize(arr, row, column, currClusNum);

					if (currClusSize > maxClusSize) {
						maxClusSize = currClusSize;
						maxClusNum = currClusNum;
					} else if (currClusSize == maxClusNum && maxClusNum > currClusNum)
						maxClusNum = currClusNum;
				}
			}
		}

		return maxClusNum;
	}

	private static int getClusSize(int[][] arr, int row, int column, int num) {
		if (row < 0 || column < 0 || row >= arr.length || column >= arr[0].length)
			return 0;
		if (arr[row][column] < 0 || arr[row][column] != num)
			return 0;

		arr[row][column] = -num;
		int clusSize = 1;

		for (int r = row - 1; r <= row + 1; r++) {
			for (int c = column - 1; c <= column + 1; c++) {
				if (r != row || c != column) {
					clusSize += getClusSize(arr, r, c, num);
				}
			}
		}

		return clusSize;
	}

}
