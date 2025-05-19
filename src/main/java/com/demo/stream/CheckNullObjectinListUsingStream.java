package com.demo.stream;

import java.util.ArrayList;
import java.util.List;

class A {
	String varA;
	int intA;

	public String getVarA() {
		return varA;
	}

	public void setVarA(String varA) {
		this.varA = varA;
	}

	public int getIntA() {
		return intA;
	}

	public void setIntA(int intA) {
		this.intA = intA;
	}
}

class B {
	A varB;

	public A getVarB() {
		return varB;
	}

	public void setVarB(A varB) {
		this.varB = varB;
	}
}

public class CheckNullObjectinListUsingStream {

	public static void main(String[] args) {

		A a1 = new A();
		a1.setVarA("Hi");

		B b1 = new B();
		// b1.setVarB(a1);

		B b2 = new B();
		// b2.setVarB(a1);

		List<B> bList1 = new ArrayList<B>();

		bList1.add(b1);
		bList1.add(b2);

		boolean check = bList1.stream().anyMatch(element -> element.getVarB() != null);

		System.out.println("Check 1: " + check);

		List<B> bList2 = new ArrayList<B>();
		B b3 = new B();
		b3.setVarB(a1);

		B b4 = new B();
		b4.setVarB(a1);

		bList2.add(b3);
		bList2.add(b4);

		check |= bList2.stream().anyMatch(element -> element.getVarB() != null);

		System.out.println("Check 2: " + check);

		boolean testOR = false;
		System.out.println("1. testOR: " + testOR);
		testOR |= false;
		System.out.println("2. testOR: " + testOR);
		testOR |= true;
		System.out.println("3. testOR: " + testOR);

		A a2 = new A();
		System.out.println("Uninitialized integer: " + a2.getIntA());
		System.out.println("Uninitialized string: " + (a2.getVarA() == null ? 0 : Integer.parseInt(a2.getVarA())));

		double changeInQty = (a2.getVarA() == null ? 0.0 : Double.parseDouble(a2.getVarA())) - Double.parseDouble("1.00");

		System.out.println(Double.parseDouble("1.00"));
		System.out.println("ChangeInQty: " + changeInQty);
	}

}
