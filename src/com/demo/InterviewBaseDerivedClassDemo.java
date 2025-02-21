package com.demo;

class Base {
	public void print() {
		System.out.print("base ");
	}
}

class Derived extends Base {
	public void print() {
		System.out.print("derived ");
	}
}

public class InterviewBaseDerivedClassDemo {

	public static void main(String[] args) {
		
		Base x = new Base();
		Base y = new Derived();
		Derived z = new Derived();

		getOutput(x);
		getOutput(y);
		getOutput(z);

	}

	public static void getOutput(Base o) {
		o.print();
	}
}
