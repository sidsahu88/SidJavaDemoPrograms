package com.demo;

public class OuterClassInnerClassDemo {

	class NonStaticInnerClass {
		void print(String str) {
			System.out.println(str);
		}
	}

	static class StaticInnerClass {

		void print(String str) {
			System.out.println(str);
		}

	}

	public static void main(String[] args) {

		OuterClassInnerClassDemo outer = new OuterClassInnerClassDemo();

		NonStaticInnerClass nsinner = outer.new NonStaticInnerClass();

		nsinner.print("Non Static Inner Class");

		OuterClassInnerClassDemo.StaticInnerClass sinner = new OuterClassInnerClassDemo.StaticInnerClass();

		sinner.print("Static Inner Class");

	}

}
