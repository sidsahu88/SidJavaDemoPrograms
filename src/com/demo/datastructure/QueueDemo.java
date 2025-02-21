package com.demo.datastructure;

class Queue {

	public String[] nameArr;
	public int maxSize;
	public int front = -1, tail = -1;

	public Queue(int queueSize) {

		maxSize = queueSize;
		nameArr = new String[maxSize];

	}

	public void enqueue(String name) {

		if (tail == maxSize - 1) {
			System.out.println("Queue is full.");
			return;
		}

		if (front == -1) {
			front = 0;
		}

		nameArr[++tail] = name;

		System.out.println("Added " + nameArr[tail]);

	}

	public void dequeue() {

		if ((front > tail) || (front == -1)) {
			System.out.println("Queue is empty.");
			return;
		}

		System.out.println("Removed " + nameArr[front++]);

	}
}

public class QueueDemo {

	public static void main(String[] args) {

		Queue qu = new Queue(4);

		qu.enqueue("Sid");
		qu.enqueue("Git");
		qu.enqueue("Prafulla");
		qu.enqueue("Minakshi");
		qu.enqueue("Kanha");

		qu.dequeue();
		qu.dequeue();
		qu.dequeue();
		qu.dequeue();
		qu.dequeue();

	}

}
