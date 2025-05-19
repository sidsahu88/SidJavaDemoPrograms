package com.demo.designpattern.abstractfactory;

public class TriangleFactory implements ShapeAbstractFactory {

	private int base;
	private int height;

	public TriangleFactory(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public Shape getShape() {
		return new Triangle(base, height);
	}
}
