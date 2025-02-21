package com.demo;

public class SameMethodInterfaceDemo implements SameMethodInterface1, SameMethodInterface2 {

	@Override
	public void print(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		SameMethodInterfaceDemo sm = new SameMethodInterfaceDemo();

		sm.print("This is same method available in two interface");
	}

}
