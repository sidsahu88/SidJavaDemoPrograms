package com.demo.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running task.");
	}

}

class Task2 implements Callable<Object> {

	@Override
	public Object call() {
		System.out.println(Thread.currentThread().getName() + " is running task from call method.");
		return new String("Returned string object");
	}

}

public class ExecutorServiceDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Task task = new Task();

		int noOfCore = Runtime.getRuntime().availableProcessors();

		System.out.println("Processors: " + noOfCore);

		ExecutorService es = Executors.newFixedThreadPool(noOfCore);

		System.out.println("Fixed thread pool started: ");
		for (int i = 1; i <= noOfCore; i++)
			es.execute(task);

		es.shutdown();

		Task2 task2 = new Task2();

		ExecutorService es1 = Executors.newCachedThreadPool();

		System.out.println("Cached thread pool started: ");
		for (int i = 1; i <= 8; i++) {
			es1.execute(task);

			Future future = es1.submit(task2);
			
			System.out.println(future.get());
		}

		es1.shutdown();

		ScheduledExecutorService es2 = Executors.newScheduledThreadPool(5);

		System.out.println("Scheduled thread pool started: ");
		for (int i = 1; i <= 5; i++) {
			es2.schedule(task, 2, TimeUnit.SECONDS);

			ScheduledFuture<Object> schtaskrun = es2.schedule(new Callable<Object>() {
				@Override
				public Object call() throws Exception {
					System.out.println(Thread.currentThread().getName() + " is running task1.");
					return new Object();
				}

			}, 6, TimeUnit.SECONDS);
		}

		es2.shutdown();
	}

}