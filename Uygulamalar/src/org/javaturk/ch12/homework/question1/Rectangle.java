package org.javaturk.ch12.homework.question1;

import java.util.Objects;
import java.util.Random;

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
//		random değ. sıfır geliyor, double değerr geliyor 0,12454 --> int olarak aldığımız içn 0 olarak alıyor
//		int random = (int) Math.random();
		Random random = new Random();
        int r = random.nextInt();
		int hash = (int) shortSide + (int) longSide + r;
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
