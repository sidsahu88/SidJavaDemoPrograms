package com.demo.designpattern.abstractfactory;

public class DrawShapeMain {

	public static void main(String[] args) {

		Shape triangle = ShapeFactory.getShapeFactory(new TriangleFactory(2, 3));
		Shape circle = ShapeFactory.getShapeFactory(new CircleFactory(2));
		Shape rectangle = ShapeFactory.getShapeFactory(new RectangleFactory(2, 3));

		System.out.println(triangle + " Area: " + triangle.area()+" drawn.");
		System.out.println(circle + " Area: " + circle.area()+" drawn.");
		System.out.println(rectangle + " Area: " + rectangle.area()+" drawn.");
	}

}
