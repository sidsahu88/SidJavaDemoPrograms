package com.demo.designpattern.abstractfactory;

public class Rectangle implements Shape {

	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public float area() {
		return (float) (length * breadth);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	
}
