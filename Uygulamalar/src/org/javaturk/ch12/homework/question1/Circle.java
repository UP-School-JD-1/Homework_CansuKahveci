package org.javaturk.ch12.homework.question1;

import java.util.Objects;

public class Circle extends Shape {

	public double r;

	Circle(double r) {
		super(r);
	}

	@Override
	double calculateArea(double r) {
		this.r = r;
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
		str += "r: " + r + "\n";
		return str;
	}

	@Override
	public int hashCode() {
		int random = (int) Math.random();
		int hash = random + (int) Math.PI;
		return hash;
	}

	@Override
	public boolean equals(Object o) {
		Circle c = (Circle) o;
		boolean b = false;
		if (r == c.r & r == c.r)
			b = true;
		return b;
	}

}
