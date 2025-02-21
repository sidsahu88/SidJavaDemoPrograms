package com.demo;

class X {
	static int i = 10;
}

class Y extends X {
	 int i = 50;
}

public class StaticVariableAccessInInheritance {

	public static void main(String[] args) {

		Y y = new Y();

		System.out.println(y.i);
		System.out.println(X.i);

	}

}
