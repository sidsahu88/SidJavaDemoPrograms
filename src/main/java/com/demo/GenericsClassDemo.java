package com.demo;

class GenericsClass<T> {

	T obj;

	public GenericsClass(T obj) {
		super();
		this.obj = obj;
	}

	public T getObject() {
		return obj;
	}

}

public class GenericsClassDemo {

	public static void main(String[] args) {

		GenericsClass<Integer> genInt = new GenericsClass<Integer>(1532);
		GenericsClass<String> genStr = new GenericsClass<String>("Siddharth");

		System.out.println("Integer: " + genInt.getObject());
		System.out.println("String: " + genStr.getObject());

	}

}
