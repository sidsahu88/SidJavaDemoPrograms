package com.demo.multithreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class PrintConsecNo implements Runnable {

	int i = 1;
	int numThreads;

	PrintConsecNo(int numThreads) {
		this.numThreads = numThreads;
	}

	private synchronized void printNo() {
		while (i <= 100) {
			if ((i % numThreads == Integer.parseInt(Thread.currentThread().getName()))
					|| (i % numThreads + numThreads == Integer.parseInt(Thread.currentThread().getName()))) {
                log.info("Thread {} printed: {}", Thread.currentThread().getName(), i++);

				notifyAll();
			} else {
				try {
					if (i <= 100)
						wait();
					else
						break;
				} catch (Exception e) {
					log.error(e.getLocalizedMessage());
				}
			}

		}
	}

	@Override
	public void run() {
		printNo();
	}
}

@Slf4j
public class MultipleThreadsPrintConsecutiveNo {

	public static void main(String[] args) {
		PrintConsecNo pcn = new PrintConsecNo(5);

		Thread t1 = new Thread(pcn, "1");
		Thread t2 = new Thread(pcn, "2");
		Thread t3 = new Thread(pcn, "3");
		Thread t4 = new Thread(pcn, "4");
		Thread t5 = new Thread(pcn, "5");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		log.info("Main thread");
	}

}
