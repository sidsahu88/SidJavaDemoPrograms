package com.demo.multithreading;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.List;

@Slf4j
public class BlockingQueueDemo {

	private final List<Integer> queue = new LinkedList<Integer>();

	private final int limit;

	public BlockingQueueDemo(int limit) {
		this.limit = limit;
	}

	public synchronized void enqueue(int i) {
		while (queue.size() == limit) {
			try {
                log.info("{} waiting for dequeue as list is full.", Thread.currentThread().getName());
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (queue.isEmpty()) {
			notifyAll();
		}

        log.info("{} adding no.: {}", Thread.currentThread().getName(), i);
		queue.add(i);
	}

	public synchronized int dequeue() {
		while (queue.isEmpty()) {
			try {
                log.info("{} waiting for enqueue as list is empty.", Thread.currentThread().getName());
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
				log.info(Thread.currentThread().getName() + " started.");

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

				log.info(Thread.currentThread().getName() + " exited.");
			}
		};

		Thread consumer = new Thread("Consumer") {
			@Override
			public void run() {
				log.info(Thread.currentThread().getName() + " started.");

				for (int i = 1; i <= 10; i++)
                    log.info("{} removed no.: {}", Thread.currentThread().getName(), bq.dequeue());

				log.info(Thread.currentThread().getName() + " exited.");
			}
		};

		producer.start();
		consumer.start();
	}
}
