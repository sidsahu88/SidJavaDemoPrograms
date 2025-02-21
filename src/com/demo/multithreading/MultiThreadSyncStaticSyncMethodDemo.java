package com.demo.multithreading;

class MultiThreads {

    static synchronized void method1() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is inside static synchronised method 1 and sleeping for 10 secs.");

        Thread.sleep(10000);

        System.out.println(Thread.currentThread().getName() + " is exiting method 1.");
    }

    public static void method2() throws InterruptedException {
        synchronized (MultiThreads.class) {
            System.out.println(Thread.currentThread().getName() + " is inside static synchronised method 2 and sleeping for 10 secs.");

            Thread.sleep(10000);

            System.out.println(Thread.currentThread().getName() + " is exiting method 2.");
        }
    }

    synchronized void method3() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is inside synchronised method 3 and sleeping for 10 secs.");

        Thread.sleep(10000);

        System.out.println(Thread.currentThread().getName() + " is exiting method 3.");
    }

    synchronized void method4() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is inside synchronised method 4 and sleeping for 10 secs.");

        Thread.sleep(10000);

        System.out.println(Thread.currentThread().getName() + " is exiting method 4.");
    }

    void method5() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is inside method 5 and sleeping for 10 secs.");

        Thread.sleep(10000);

        System.out.println(Thread.currentThread().getName() + " is exiting method 5.");
    }

    void method6() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is inside method 6 and sleeping for 10 secs.");

        Thread.sleep(10000);

        System.out.println(Thread.currentThread().getName() + " is exiting method 6.");
    }

}

public class MultiThreadSyncStaticSyncMethodDemo {

    public static void main(String[] args) {

        MultiThreads mt = new MultiThreads();

        Thread t1 = new Thread("Thread-1") {
            public void run() {
                try {
                    MultiThreads.method1();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread("Thread-2") {
            public void run() {
                try {
                    MultiThreads.method2();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Thread t3 = new Thread("Thread-3") {
            public void run() {
                try {
                    mt.method3();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Thread t4 = new Thread("Thread-4") {
            public void run() {
                try {
                    mt.method4();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Thread t5 = new Thread("Thread-5") {
            public void run() {
                try {
                    mt.method5();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Thread t6 = new Thread("Thread-6") {
            public void run() {
                try {
                    mt.method6();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        t1.start();
        t2.start();
        t5.start();
        t6.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t5.join();
            t6.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
