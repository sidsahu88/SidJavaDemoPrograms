package com.demo;

public class FibonacciChecker {

	static <T> void print(T t) {
		System.out.println(t);
	}

	public static void main(String[] args) {
		print("Testcase 1: " + fibonacciNumCheck(1));
		print("Testcase 2: " + fibonacciNumCheck(2));
		print("Testcase 3: " + fibonacciNumCheck(0));
		print("Testcase 4: " + fibonacciNumCheck(9));
		print("Testcase 5: " + fibonacciNumCheck(-10));
		print("Testcase 6: " + fibonacciNumCheck(Integer.MAX_VALUE));
	}

	static boolean fibonacciNumCheck(int num) {
		if (num == 0)
			return true;

		if (num == 1)
			return true;

		int num1 = 0, num2 = 1, sum = 0;
		
		while (sum < num) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}

        return num == sum;
	}

}
