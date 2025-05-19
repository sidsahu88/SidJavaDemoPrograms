package com.demo.multithreading;

import java.util.ArrayList;
import java.util.List;

public class ThreadGroupsDemo {

    public static void main(String[] args) {
        List<ThreadGroup> threadGroupList = new ArrayList<>();

        for (int i=0; i<10; i++) {
            ThreadGroup tg = new ThreadGroup("ThreadGroup_"+i);
            threadGroupList.add(tg);

            Thread t1 = new Thread(tg, "t1") {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+" in "+Thread.currentThread().getThreadGroup()+" is running");
                }
            };
            Thread t2 = new Thread(tg, "t2") {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+" in "+Thread.currentThread().getThreadGroup()+" is running");
                }
            };
            Thread t3 = new Thread(tg, "t3") {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+" in "+Thread.currentThread().getThreadGroup()+" is running");
                }
            };

            t1.start();
            t2.start();
            t3.start();
        }



    }
}
