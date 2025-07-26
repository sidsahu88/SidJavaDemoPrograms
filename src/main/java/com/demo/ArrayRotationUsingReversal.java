package com.demo;

public class ArrayRotationUsingReversal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 47;

        System.out.println("Array before rotation:");
        for (int i : arr)
            System.out.print(i + " ");

        int n = arr.length;

        if (k < 0)
            k = (k % n) + n; // normalize the k for edge cases like k < 0
        else
            k = k % n;  // normalize the k for edge cases like k > n

       if (k != 0) // No rotation required for k=0
            leftRotate(arr, k);

        System.out.println("\nArray after rotation: ");
        for (int i : arr)
            System.out.print(i + " ");
    }

    private static void leftRotate(int[] arr, int k) {
        reverseArr(arr, 0, k - 1);
        reverseArr(arr, k, arr.length - 1);
        reverseArr(arr, 0, arr.length - 1);
    }

    private static void reverseArr(int[] arr, int startIndx, int endIndx) {
        while (startIndx < endIndx) {
            int temp = arr[startIndx];
            arr[startIndx] = arr[endIndx];
            arr[endIndx] = temp;

            startIndx++;
            endIndx--;
        }
    }
}
