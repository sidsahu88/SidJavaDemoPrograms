package com.demo.designpattern.abstractfactory;

public class Triangle implements Shape {

	private int base;
	private int height;

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public float area() {
		return (float) (base * height)/2;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
	
}
