package com.demo.multithreading;

class MyThread extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName() + " Started.");
	}

}

public class MultiThreadDemo {
	public static void main(String[] args) {
		MyThread th = new MyThread();

		/* Using Anonymous Inner Class */
		Thread th1 = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " Started using Anonymous Class call.");
			}
		};

		Thread th2 = new Thread(
				() -> System.out.println(Thread.currentThread().getName() + " Started using Lambda expession call."));

		th.start();
		th1.start();
		th2.start();

	}
}
