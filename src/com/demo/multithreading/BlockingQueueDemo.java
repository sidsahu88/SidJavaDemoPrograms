package com.demo.multithreading;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueueDemo {

	private List<Integer> queue = new LinkedList<Integer>();

	private final int limit;

	public BlockingQueueDemo(int limit) {
		this.limit = limit;
	}

	public synchronized void enqueue(int i) {
		while (queue.size() == limit) {
			try {
				System.out.println(Thread.currentThread().getName() + " waiting for dequeue as list is full.");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (queue.isEmpty()) {
			notifyAll();
		}

		System.out.println(Thread.currentThread().getName() + " adding no.: " + i);
		queue.add(i);
	}

	public synchronized int dequeue() {
		while (queue.isEmpty()) {
			try {
				System.out.println(Thread.currentThread().getName() + " waiting for enqueue as list is empty.");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (queue.size() == limit) {
			notifyAll();
		}

		return queue.remove(0);
	}

	public static void main(String[] args) {

		BlockingQueueDemo bq = new BlockingQueueDemo(5);

		Thread producer = new Thread("Producer") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " started.");

				bq.enqueue(10);
				bq.enqueue(12);
				bq.enqueue(5);
				bq.enqueue(7);
				bq.enqueue(21);
				bq.enqueue(33);
				bq.enqueue(17);

				try {
					sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				bq.enqueue(37);
				bq.enqueue(23);
				bq.enqueue(19);

				System.out.println(Thread.currentThread().getName() + " exited.");
			}
		};

		Thread consumer = new Thread("Consumer") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " started.");

				for (int i = 1; i <= 10; i++)
					System.out.println(Thread.currentThread().getName() + " removed no.: " + bq.dequeue());

				System.out.println(Thread.currentThread().getName() + " exited.");
			}
		};

		producer.start();
		consumer.start();
	}
}
