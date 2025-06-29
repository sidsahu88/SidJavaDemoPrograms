package com.demo;

public class IGTLargestClusterProblem2 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1, 4, 2, 2}, {1, 2, 4, 4}, {2, 1, 1, 1}, {3, 3, 3, 3}};
        int[][] arr2 = new int[][]{{}};
        int[][] arr3 = new int[][]{{2}};
        int[][] arr4 = new int[][]{{2}, {3}, {3}};
        int[][] arr5 = new int[][]{{1, 4, 2, 2}, {1, 2, 4, 4}, {3, 4, 1, 1}, {3, 4, 3, 3}};
        int[][] arr6 = new int[][]{{1, 4, 2, 2}, {1, 2, 4, 3}, {1, 4, 3, 1}, {3, 3, 3, 3}};

        System.out.println("TestCase 1: " + solution(arr1));
        System.out.println("TestCase 2: " + solution(arr2));
        System.out.println("TestCase 3: " + solution(arr3));
        System.out.println("TestCase 4: " + solution(arr4));
        System.out.println("TestCase 5: " + solution(arr5));
        System.out.println("TestCase 6: " + solution(arr6));
    }

    private static int solution(int[][] arr) {
        if (arr[0].length == 0)
            return -1;

        if (arr.length == 1 && arr[0].length == 1)
            return arr[0][0];

        int maxSize = 0;
        int cluster = -1;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == -1)
                    continue;

                int currNum = arr[row][col];
                int currClusSize = getClusSize(arr, row, col, currNum);

                if (currClusSize > maxSize) {
                    maxSize = currClusSize;
                    cluster = currNum;
                }
            }
        }

        return cluster;
    }

    private static int getClusSize(int[][] arr, int row, int col, int num) {
        if (row < 0 || col < 0 || row >= arr.length || col >= arr[0].length
                || arr[row][col] != num || arr[row][col] == -1)
            return 0;

        arr[row][col] = -1;
        int clusSize = 1;

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {1, 1}, {-1, 1}, {1, -1}};

        for (int[] move : directions) {
            clusSize = clusSize + getClusSize(arr, row + move[0], col + move[1], num);
        }

        return clusSize;
    }
}
