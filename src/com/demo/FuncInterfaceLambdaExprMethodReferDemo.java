package com.demo;

public class FuncInterfaceLambdaExprMethodReferDemo {

	static void staticPrint(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {

		String name = "Siddharth";

		FunctionalInterfaceDemo anonymousobj = new FunctionalInterfaceDemo() {

			@Override
			public void display(String name) {
				System.out.println("Hi " + name + "! this is an anonymous class call.");
			}
		};

		FunctionalInterfaceDemo lambdaexpr = s -> System.out
				.println("Hi " + s + "! this is a lambda expression for functional interface.");

		FunctionalInterfaceDemo staticmethdanonymousobj = new FunctionalInterfaceDemo() {

			@Override
			public void display(String name) {
				staticPrint("Hi " + name + "! this is an anonymous class using static method.");
			}

		};

		FunctionalInterfaceDemo staticmethdlambdaexpr = s -> staticPrint(
				"Hi " + s + "! this a lambda expression for functional interface using static method."); // Static
																											// method
																											// access

		anonymousobj.display(name);
		lambdaexpr.display(name);

		staticmethdanonymousobj.display(name);
		staticmethdlambdaexpr.display(name);

		String msg = "This is a method reference demo for functional interface";

		FunctionalInterfaceDemo staticmethodref = FuncInterfaceLambdaExprMethodReferDemo::staticPrint; // Static Method
																										// reference

		FunctionalInterfaceDemo systemmethodref = System.out::print;

		staticmethodref.display(msg);
		systemmethodref.display(msg);
	}

}
