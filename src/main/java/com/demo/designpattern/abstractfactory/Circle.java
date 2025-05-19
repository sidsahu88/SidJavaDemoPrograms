package com.demo.designpattern.abstractfactory;

public class Circle implements Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public float area() {
		return (float) (3.14 * radius * radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
