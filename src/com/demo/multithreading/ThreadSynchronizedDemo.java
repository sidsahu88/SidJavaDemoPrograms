package com.demo.multithreading;

class Counter {
	int asyncCount = 0;
	int syncCount = 0;

	public void asyncIncrement() {
		asyncCount++;
	}

	public synchronized void syncIncrement() {
		syncCount++;
	}
}

public class ThreadSynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {

		Counter cnt = new Counter();

		Thread t1 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " Started.");
			for (int i = 0; i < 1000; i++) {
				cnt.asyncIncrement();
				cnt.syncIncrement();
			}
		});

		Thread t2 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " Started.");
			for (int i = 0; i < 1000; i++) {
				cnt.asyncIncrement();
				cnt.syncIncrement();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Async Count: " + cnt.asyncCount);
		System.out.println("sync Count: " + cnt.syncCount);

	}

}
