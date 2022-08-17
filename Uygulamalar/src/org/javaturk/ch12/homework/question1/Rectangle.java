package org.javaturk.ch12.homework.question1;

public class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.print("This is a method to draw rectangle");

	}

	@Override
	double calculateArea(double lenght, double width) {
		return super.calculateArea(lenght, width);
	}

	@Override
	double calculateCircumference(double r, double d) {
		return super.calculateCircumference(r, d);
	}

}
