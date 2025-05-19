package com.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class SwapTwoNumbersDemo {

	public static void main(String[] args) {

		AtomicInteger a = new AtomicInteger(5);
		AtomicInteger b = new AtomicInteger(10);

		System.out.println("Before Swapping: a=" + a + " b=" + b);

		swap(a, b);

		System.out.println("After Swapping: a=" + a + " b=" + b);

	}

	static void swap(AtomicInteger a, AtomicInteger b) {

		a.set(b.getAndSet(a.get()));

	}

}
