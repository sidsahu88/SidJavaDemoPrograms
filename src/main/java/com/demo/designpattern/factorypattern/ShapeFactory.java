package com.demo.designpattern.factorypattern;

/*In Factory pattern, we create object without exposing the creation logic 
 * to the client and refer to newly created object using a common interface.*/

public class ShapeFactory {

	public static Shape getShape(String type) {
		if ("Rectangle".equals(type))
			return new Rectangle();
		else if ("Triangle".equals(type))
			return new Triangle();
		else
			return new Circle();
	}

}
