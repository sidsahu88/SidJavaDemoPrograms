package com.demo.designpattern.abstractfactory;

/* Abstract Factory Pattern says that just define an interface or abstract class for 
 * creating families of related (or dependent) objects but without specifying their 
 * concrete sub-classes.That means Abstract Factory lets a class returns a factory of 
 * classes. So, this is the reason that Abstract Factory Pattern is one level higher 
 * than the Factory Pattern.*/

public class ShapeFactory {
	
	public static Shape getShapeFactory(ShapeAbstractFactory saf) {
		return saf.getShape();
	}
}
