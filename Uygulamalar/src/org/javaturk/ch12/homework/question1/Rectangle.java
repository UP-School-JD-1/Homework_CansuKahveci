package org.javaturk.ch12.homework.question1;

import java.util.Objects;

public class Rectangle extends Shape {

	public double shortSide;
	public double longSide;

	Rectangle(double shortSide, double longSide) {
		super(shortSide, longSide);
	};

	@Override
	void draw() {
		System.out.print("This is a method to draw rectangle");

	}

	@Override
	double calculateArea(double shortSide, double longSide) {
		this.longSide = longSide;
		this.shortSide = shortSide;
		return super.calculateArea(shortSide, longSide);
	}

	@Override
	double calculateCircumference(double r, double d) {
		return super.calculateCircumference(r, d);
	}

	@Override
	public String toString() {
		String str = new String();
		str += "Rectangle Info : ";
		str += "shortSide: " + shortSide + "\n";
		str += "longSide: " + longSide + "\n";
		return str;
	}

	@Override
	public int hashCode() {
		int random = (int) Math.random();
		int hash = (int) shortSide + (int) longSide + random;
		return hash;
	}

	@Override
	public boolean equals(Object o) {
		Rectangle r = (Rectangle) o;
		boolean b = false;
		if (longSide == r.longSide & shortSide == r.shortSide)
			b = true;
		return b;
	}

	

}
