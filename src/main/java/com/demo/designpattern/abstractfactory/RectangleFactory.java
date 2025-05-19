package com.demo.designpattern.abstractfactory;

public class RectangleFactory implements ShapeAbstractFactory {
	
	private int length;
	private int breadth;
	
	public RectangleFactory(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public Shape getShape() {
		return new Rectangle(length, breadth);
	}

}
