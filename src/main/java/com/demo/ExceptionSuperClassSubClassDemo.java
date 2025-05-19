package com.demo;

import java.io.IOException;

class SuperClass {

	public void print(String str) throws IOException {
		System.out.println("Hi " + str + ", this is SuperClass Method.");
	}

}

class SubClass extends SuperClass {

	public void print(String str) throws ArithmeticException { // throws Exception {// Exception 'Exception' will not
																// work as child class
																// cannot throw parent exception if its not thrown by
																// its parent class. Child class method can throw same
																// exception as parent class method or child exception
																// of parent class method exception or unchecked
																// exception. For above code to compile, parent class
																// print method must also throw 'Exception' or child
																// method should throw 'IOException' or unchecked
																// exception.
		System.out.println("Hi " + str + ", this is SubClass Method.");
	}

}

public class ExceptionSuperClassSubClassDemo {

	public static void main(String[] args) {

		SuperClass superklass = new SubClass();

		try {
			superklass.print("Siddharth");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
