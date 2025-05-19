package com.demo;

import java.lang.reflect.InvocationTargetException;

public class FinallyDemo {

	private int finallyTest() {
		try {
			return 10;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			return 20;
		}
	}

	private static void finallyExitTest() {
		try {
			System.out.println("A");
			System.exit(0);
		} finally {
			System.out.println("B");
		}
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		System.out.println(FinallyDemo.class.getDeclaredConstructor().newInstance().finallyTest());
		finallyExitTest();
	}

}
