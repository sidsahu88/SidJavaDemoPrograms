package com.demo.multithreading;

class LocalThread extends Thread {

	private static int number = 2;
	private static int noThreadLocal;

	/*
	 * ThreadLocal class provides thread local variable. These variables differ from
	 * their normal counterparts in that each thread that accesses one (via its get
	 * or set method) has its own, independently initialized copy of the variable.
	 */
	private static ThreadLocal<Integer> counter = new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {
			return number--;
		}
	};

	LocalThread(String name, int noThreadLocal) {
		super(name);
		this.noThreadLocal = noThreadLocal;
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			noThreadLocal--;
			System.out.println(getName() + " value: " + counter.get());
			System.out.println(getName() + " non-threadlocal value: " + noThreadLocal);
		}
	}
}

public class ThreadLocalDemo {

	public static void main(String[] args) {
		LocalThread lt1 = new LocalThread("Thread1", 2);
		LocalThread lt2 = new LocalThread("Thread2", 3);

		lt1.start();
		lt2.start();
	}

}
