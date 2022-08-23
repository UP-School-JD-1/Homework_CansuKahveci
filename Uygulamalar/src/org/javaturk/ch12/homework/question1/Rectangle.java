package org.javaturk.ch12.homework.question1;

import java.util.Random;

public class Rectangle extends Shape {

	Rectangle(double length, double width) {
		super(length, width);
	};

	@Override
	void draw() {
		System.out.print("This is a method to draw rectangle");

	}

	@Override
	double calculateArea(double length, double width) {
		return super.calculateArea(length, width);
	}

	@Override
	double calculateCircumference(double length, double width) {
		return super.calculateCircumference(length, width);
	}

	@Override
	public String toString() {
		String str = new String();
		str += "Rectangle Info : ";
		str += "length: " + length + "\n";
		str += "width: " + width + "\n";
		return str;
	}

	@Override
	public int hashCode() {
//		random değ. sıfır geliyor, double değerr geliyor 0,12454 --> int olarak aldığımız içn 0 olarak alıyor
//		int random = (int) Math.random();
		Random random = new Random();
		int r = random.nextInt();
		int hash = ((int) length + (int) width) * r;
		return hash;
	}

	@Override
	public boolean equals(Object o) {
		Rectangle r = (Rectangle) o;
		boolean b = false;
		if (length == r.length & width == r.width)
			b = true;
		return b;
	}

}
