package com.demo.multithreading;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class MyTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " running the task.");
	}
}

class MyTask2 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " running the task2.");
	}
}

public class ThreadPoolExecutorDemo {

	public static void main(String[] args) {
		int threadPoolSize = Runtime.getRuntime().availableProcessors();

		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, threadPoolSize, 10, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<>());

		MyTask myTask = new MyTask();
		MyTask2 myTask2 = new MyTask2();

		for (int i = 5; i > 0; i--) {
			threadPoolExecutor.execute(myTask);
			threadPoolExecutor.execute(myTask2);
		}
	}

}
