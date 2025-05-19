package com.demo;

public class AbstractClassDemo extends AbstractClass {

	AbstractClassDemo() {
		// super("Siddharth"); //Uncomment it to call parameterized abstract class
		// constructor.
		System.out.println("This is a child class constructor.");
	}

	public static void main(String[] args) {

		AbstractClassDemo ac = new AbstractClassDemo(); // Calling abstract class constructor

		ac.printMsg("Siddharth"); // Calling overridden method
		ac.printStr();

		ac.concreteMethod(30); // calling concrete method of abstract class

		System.out.println(ac.str); // Printing abstract class variable

	}

	@Override
	void printMsg(String name) {
		System.out.println("Hi " + name + ", this overridden method.");

	}

	@Override
	void printStr() {
		System.out.println(
				"Even this is overriden method. All the abstract methods needs to be implemented by subclass.");
	}

}
