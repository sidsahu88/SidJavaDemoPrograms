package com.demo;

class One implements Runnable {

	@Override
	public void run() {
		System.out.print(Thread.currentThread().getName());
	}

}

class Two implements Runnable {

	@Override
	public void run() {
		new Thread(new One()).run();
		new Thread(new One(),"2").run();
		new Thread(new One(),"3").start();		
	}

}

public class InterviewThreadRunMethodCallDemo {

	public static void main(String[] args) {
		
		new Thread(new Two(),"1").start();

	}

}
