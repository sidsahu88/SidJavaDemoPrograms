package com.demo.multithreading;

public class MainThreadDeadlockDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Thread started.");
		
		Thread.currentThread().join();
		
		System.out.println("Thread exited.");
	}

}
