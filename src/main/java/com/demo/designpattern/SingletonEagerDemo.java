package com.demo.designpattern;

import java.io.Serializable;

/*A class must ensure that only single instance should be created and 
 *single object can be used by all other classes.*/

class SingletonEagerInst implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7608286977663519481L;

	private static SingletonEagerInst instance = new SingletonEagerInst();

	private SingletonEagerInst() {
	}

	public static SingletonEagerInst getInstance() {
		return instance;
	}

	@Override
	public Object clone() throws CloneNotSupportedException { // To stop cloning of singleton class
		throw new CloneNotSupportedException();
	}

	private SingletonEagerInst readResolve() { // To stop serialization of singleton class
		return instance;
	}

}

public class SingletonEagerDemo {

	public static void main(String[] args) {

		Thread t1 = new Thread("t1") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " started.");

				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(
						Thread.currentThread().getName() + " got instance: " + SingletonEagerInst.getInstance());

				System.out.println(Thread.currentThread().getName() + " exiting.");
			}
		};

		Thread t2 = new Thread("t2") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " started.");

				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println(
						Thread.currentThread().getName() + " got instance: " + SingletonEagerInst.getInstance());

				System.out.println(Thread.currentThread().getName() + " exiting.");
			}
		};

		SingletonEagerInst si = SingletonEagerInst.getInstance();

		Thread t3 = new Thread("t3") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " started.");

				try {
					sleep(1000);

					System.out.println(Thread.currentThread().getName() + " trying to clone the instance.");
					System.out.println(
							Thread.currentThread().getName() + " got instance: " + (SingletonEagerInst) si.clone());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + " exiting.");
			}
		};

		t1.start();
		t2.start();
		t3.start();

	}

}
