package com.demo;

public interface DefaultMethodInterface {

	public void print();
	
	default void showName(String name) {
		System.out.println("Name: "+name);
	}
	
	static void showAge(int age) {
		System.out.println("Age: "+age);
	}
	
}
