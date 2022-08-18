package org.javaturk.ch12.homework.question1;

import java.util.Objects;

public class Square extends Shape {

	double side;

	public Square() {

	}

	public Square(double side) {
		this.side = side;
	};

	@Override
	double calculateArea(double side) {
		return super.calculateArea(side);
	}

	@Override
	double calculateCircumference(double side) {
		return super.calculateCircumference(side);
	}

	@Override
	public int hashCode() {
//		int random = (int) Math.random();
//		int hash = random;
		int hash = 5;
		return hash;
	}

	@Override
	public boolean equals(Object o) {
		Square s = (Square) o;
		boolean b = false;
		if (length == s.length & width == s.width)
			b = true;
		return b;
	}

	
	
}
