package com.demo.multithreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class printNo implements Runnable {

    private int i = 1;

    private synchronized void print() {

        while (i <= 100) {

            if (i % 2 == 0 && "evenThread".equals(Thread.currentThread().getName()))
                log.info("{} - {}", Thread.currentThread().getName(), i++);

            if (i % 2 == 1 && "oddThread".equals(Thread.currentThread().getName()))
                log.info("{} - {}", Thread.currentThread().getName(), i++);

            notify();

            try {
                if (i <= 100)
                    wait();
            } catch (Exception e) {
                log.error(e.getLocalizedMessage());
            }
        }
    }

    @Override
    public void run() {
        print();
    }
}

public class InterThreadCommEvenOddNoPrint {

    public static void main(String[] args) {
        printNo pn = new printNo();

        Thread oddThread = new Thread(pn, "oddThread");
        Thread evenThread = new Thread(pn, "evenThread");

        evenThread.start();
        oddThread.start();
    }

}
