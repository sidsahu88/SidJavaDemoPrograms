package com.demo.designpattern.factorypattern;

public class DrawShapeMain {

	public static void main(String[] args) {
		
		Shape sp = ShapeFactory.getShape("Triangle");
		sp.draw();
		
		Shape sp1 = ShapeFactory.getShape("Rectangle");
		sp1.draw();
		
		Shape sp2 = ShapeFactory.getShape("anything");
		sp2.draw();
	}

}
