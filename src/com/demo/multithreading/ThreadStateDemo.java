package com.demo.multithreading;

public class ThreadStateDemo {

	public static void main(String[] args) throws InterruptedException {

		Thread th = new Thread();

		System.out.println(th.getName() + " is in state: " + th.getState());

		th.start();

		System.out.println(th.getName() + " is in state: " + th.getState());
		
		th.join();

		System.out.println(th.getName() + " is in state: " + th.getState());

	}

}
