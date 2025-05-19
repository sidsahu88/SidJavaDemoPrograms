package com.demo;

abstract class AbstractClass {

	public String str = "This is a String inside abstract class.";

	AbstractClass() {
		System.out.println("This is a abstract class default constructor");
	}

	AbstractClass(String name) {
		System.out.println("Hi, " + name + "! this is a abstract class parameterized constructor");
	}

	abstract void printStr();
	
	abstract void printMsg(String name);	

	void concreteMethod(int age) {
		System.out.println("This is a concrete method in abstract class and your age is " + age);
	}

}
