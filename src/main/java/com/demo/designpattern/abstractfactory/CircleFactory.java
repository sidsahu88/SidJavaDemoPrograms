package com.demo.designpattern.abstractfactory;

public class CircleFactory implements ShapeAbstractFactory{

	private int radius;

	public CircleFactory(int radius) {
		this.radius = radius;
	}
	
	@Override
	public Shape getShape() {
		return new Circle(radius);
	}

}
