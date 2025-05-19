package com.demo.designpattern;

class BillPughSingletonClass {

	private BillPughSingletonClass() {
	}

	private static class Helper {
		private static final BillPughSingletonClass INSTANCE = new BillPughSingletonClass();
	}

	public static BillPughSingletonClass getInstance() {
		return Helper.INSTANCE;
	}

}

public class SingletonBillPugh {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
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
						Thread.currentThread().getName() + " got instance: " + BillPughSingletonClass.getInstance());

				System.out.println(Thread.currentThread().getName() + " exiting.");
			}
		};

		Thread t2 = new Thread() {
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
						Thread.currentThread().getName() + " got instance: " + BillPughSingletonClass.getInstance());

				System.out.println(Thread.currentThread().getName() + " exiting.");
			}
		};

		t1.start();
		t2.start();
	}

}
