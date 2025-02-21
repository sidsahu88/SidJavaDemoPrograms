package com.demo;

public class DefaultMethodInterfaceDemo implements DefaultMethodInterface {

	public static void main(String[] args) {
		DefaultMethodInterface dm = new DefaultMethodInterfaceDemo();
		
		dm.print();							  	//Calling overridden method
		dm.showName("Siddharth");             	//Calling Default Method
		DefaultMethodInterface.showAge(30);	  	//Calling Static Method
	}

	@Override
	public void print() {
		System.out.println("Hi, this is a interface default and static method demo program");
	}

}
