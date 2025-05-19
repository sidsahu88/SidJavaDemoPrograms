package com.demo.multithreading;

class printNo implements Runnable {

	int i = 1;

	private synchronized void print() {

		while (i <= 100) {
			
			if (i % 2 == 0 && "evenThread".equals(Thread.currentThread().getName()))
				System.out.println(Thread.currentThread().getName() + " printed: " + i++);

			if (i % 2 == 1 && "oddThread".equals(Thread.currentThread().getName()))
				System.out.println(Thread.currentThread().getName() + " printed: " + i++);

			notify();
			
			try {
				if (i <= 100)
					wait();
				else
					break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		print();
	}
}

public class InterThreadCommEvenOddNoPrint {

	public static void main(String[] args) {
		printNo pn = new printNo();

		Thread oddThread = new Thread(pn, "oddThread");
		Thread evenThread = new Thread(pn, "evenThread");

		evenThread.start();
		oddThread.start();
	}

}
