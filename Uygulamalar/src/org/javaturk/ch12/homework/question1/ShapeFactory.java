package org.javaturk.ch12.homework.question1;

public class ShapeFactory {

	public Shape createShape() {
		Shape shape = new Shape();
		System.out.println("ShapeFactory class");
		return shape;
	}
}
