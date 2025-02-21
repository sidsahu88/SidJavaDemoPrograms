package com.demo.multithreading;

import java.util.LinkedList;
import java.util.List;

public class SynchronousQueueDemo {

	private static List<Integer> queue = new LinkedList<Integer>();

	public synchronized void enqueue(int i) {
		while (queue.size() == 1) {
			try {
				System.out.println(Thread.currentThread().getName() + " waiting for dequeue as list is full.");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (queue.size() == 0) {
			notifyAll();
		}

		System.out.println(Thread.currentThread().getName() + " adding no.: " + i);
		queue.add(i);
	}

	public synchronized int dequeue() {
		while (queue.size() == 0) {
			try {
				System.out.println(Thread.currentThread().getName() + " waiting for enqueue as list is empty.");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (queue.size() == 1) {
			notifyAll();
		}

		return queue.remove(0);
	}

	public static void main(String[] args) {

		SynchronousQueueDemo bq = new SynchronousQueueDemo();

		Thread producer = new Thread("Producer") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " started.");

				bq.enqueue(10);
				bq.enqueue(12);
				bq.enqueue(5);

				try {
					sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
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

				for (int i = 1; i <= 6; i++)
					System.out.println(Thread.currentThread().getName() + " removed no.: " + bq.dequeue());

				System.out.println(Thread.currentThread().getName() + " exited.");
			}
		};

		producer.start();
		consumer.start();
	}
}
