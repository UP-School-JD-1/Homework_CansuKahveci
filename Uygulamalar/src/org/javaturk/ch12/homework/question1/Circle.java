package org.javaturk.ch12.homework.question1;

import java.util.Random;

public class Circle extends Shape {

	Circle(double r) {
		super(r);
	}

	@Override
	double calculateArea(double r) {
		return Math.PI * Math.pow(r, 2);
	}

	@Override
	double calculateCircumference(double r) {
		return 2 * Math.PI * r;
	}

	@Override
	public String toString() {
		String str = new String();
		str += "Circle Info : ";
		str += "r: " + length + "\n";
		return str;
	}

	@Override
	public int hashCode() {
		Random random = new Random();
		int r = random.nextInt();
		int hash = r;
		return hash;
	}

	@Override
	public boolean equals(Object o) {
		Circle c = (Circle) o;
		boolean b = false;
		if (length == c.length) {
			b = true;
		}
		return b;
	}

}
