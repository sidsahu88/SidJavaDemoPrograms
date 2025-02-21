package com.demo;

class A {
	public void printA() {
		System.out.println("Inside Class A printing A");
	}
}

class B extends A {
	public void printA() {
		System.out.println("Inside Class B printing A");
	}
	
	public void printB() {
		System.out.println("Inside Class B printing B");
	}
}

public class ObjectAssignmentToOtherObjectDemo {

	public static void main(String[] args) {
		
		B b = new B();
		b.printA();
		b.printB();
		
		A a = b;
		a.printA();
		
		A a1 = new B();
		a1.printA();
		//a1.printB();	//Not accessible as the reference type is of A class.
		
		A a2 = new A();
		a2.printA();

	}

}
