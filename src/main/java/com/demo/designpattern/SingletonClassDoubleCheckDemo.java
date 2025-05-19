package com.demo.designpattern;

/*A class must ensure that only single instance should be created and 
 *single object can be used by all other classes.*/

class Singleton {

	/*
	 * Without volatile modifier it's possible for another thread in Java to see
	 * half initialized state of instance variable, but with volatile variable
	 * guaranteeing happens-before relationship, all the write will happen on
	 * volatile instance before any read of instance variable.
	 */

	private static volatile Singleton instance;

	// Preventing Singleton object instantiation from outside.
	private Singleton() {
	}

	// Lazy Instantiation: creation of instance when required.
	public static Singleton getInstance() {
		if (instance == null) { 					// 1st Check
			synchronized (Singleton.class) {
				if (instance == null) { 			// 2nd Check
					instance = new Singleton();

					System.out.println(Thread.currentThread().getName() + " created singleton object: " + instance);
				}
			}
		}
		return instance;
	}
}

public class SingletonClassDoubleCheckDemo {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " started.");

				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + " got instance: " + Singleton.getInstance());

				System.out.println(Thread.currentThread().getName() + " exiting.");
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " started.");

				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + " got instance: " + Singleton.getInstance());

				System.out.println(Thread.currentThread().getName() + " exiting.");
			}
		};

		t1.start();
		t2.start();
	}
}
