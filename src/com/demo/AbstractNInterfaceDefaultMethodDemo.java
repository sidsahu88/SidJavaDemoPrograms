package com.demo;

abstract class AbstractDefaultMethod {

	public void defaultMethod(String str) {
		System.out.println("Inside abstract class: " + str);
	}

}

interface InterfaceDefaultMethod {

	public default void defaultMethod(String str) {
		System.out.println("Inside interface: " + str);
	}

}

public class AbstractNInterfaceDefaultMethodDemo extends AbstractDefaultMethod implements InterfaceDefaultMethod {

	public static void main(String[] args) {
		
		AbstractNInterfaceDefaultMethodDemo obj = new AbstractNInterfaceDefaultMethodDemo();
		
		obj.defaultMethod("Hi I am Siddharth.");
		
	}

}
