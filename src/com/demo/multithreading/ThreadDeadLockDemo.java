package com.demo.multithreading;

public class ThreadDeadLockDemo {

	static Object lock1 = new Object();
	static Object lock2 = new Object();
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (lock1) {
					System.out.println(Thread.currentThread().getName()+" thread started and acquired lock 1.");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
					System.out.println(Thread.currentThread().getName()+" thread is waiting for lock 2...");
						
					synchronized (lock2) {
						System.out.println(Thread.currentThread().getName()+" thread acquired Lock 2 also.");
					}
				}
			}
		};
			
		Thread t2 = new Thread() {
			public void run() {
				synchronized (lock2) {
					System.out.println(Thread.currentThread().getName()+" thread started and acquired lock 2.");
						
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
							
					System.out.println(Thread.currentThread().getName()+" thread is waiting for lock 1...");
							
					synchronized (lock1) {
						System.out.println(Thread.currentThread().getName()+" thread acquired Lock 1 also.");
					}
				}			
			}
		};
				
		t1.start();
		t2.start();
	}
}
