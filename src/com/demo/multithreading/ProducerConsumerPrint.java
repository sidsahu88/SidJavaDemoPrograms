package com.demo.multithreading;

class PrintText implements Runnable {

	int counter = 5;
	boolean hiPrinted = false;

	private synchronized void printHiBye() {

		while (counter > 0) {
			if (hiPrinted && Thread.currentThread().getName().equals("consumer")) {
				System.out.println("Bye");
				hiPrinted = false;
				counter--;
			}
			else {
				System.out.println("Hi");
				hiPrinted = true;
			}
			notifyAll();

			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}

	@Override
	public void run() {
		printHiBye();
	}
}

public class ProducerConsumerPrint {

	public static void main(String[] args) {
		
		PrintText prtxt = new PrintText();
		
		Thread producer = new Thread(prtxt, "producer");
		Thread consumer = new Thread(prtxt, "consumer");
		
		producer.start();
		consumer.start();

	}

}
