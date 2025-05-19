package com.demo;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int k = 5;

		System.out.println("k = " + k);

		leftRotate(arr, k);

        for (int i : arr) {
            System.out.print(i + " ");
        }
	}

	private static void leftRotate(int[] arr, int k) {
		int n = arr.length;
		int j, temp, d;

		for (int i = 0; i < gcd(n, k); i++) {
			j = i;
			temp = arr[i];

			while (true) {
				d = (j + k) % n;

				if (d == i)
					break;

				arr[j] = arr[d];

				j = d;
			}

			arr[j] = temp;
		}
	}

	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

}
