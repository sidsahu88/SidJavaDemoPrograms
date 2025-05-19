package com.demo.multithreading;

class MyRunnableThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Started.");

		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " printing no.: " + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}

	}
}

public class MultiThreadInterfaceDemo {

	public static void main(String[] args) {

		Thread th = new Thread(new MyRunnableThread(), "Normal-Child-Thread");

		/* Using Lambda Expression */
		Thread th1 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " is started using lambda experssion.");
			try {
				Thread.sleep(15000);
			} catch (Exception e) {
				e.printStackTrace(System.err);
			}
		}, "Lambda-Child-Thread");

		th.start();
		th1.start();

		try {
			while (th.isAlive()) {
				System.out.println(Thread.currentThread().getName() + " is sleeping as child thread " + th.getName()
						+ " is alive.");
				Thread.sleep(2000);
			}

			System.out.println(th1.getName() + " is alive before join()? " + th1.isAlive());

			th1.join();

			System.out.println(th1.getName() + " is alive after join()? " + th1.isAlive());
			
			if (!th.isAlive() && !th1.isAlive()) {
				System.out.println("Both child threads "+th.getName()+" and "+th1.getName()+" are ended.");
			}

		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

}
