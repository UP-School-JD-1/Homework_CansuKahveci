package org.javaturk.ch12.homework.question1;

public class Square extends Shape {

	public Square(double length) {
		super(length);
	}

	@Override
	double calculateArea(double length) {
		return super.calculateArea(length);
	}

//	override etmemize gerek var mı? parent ile aynı metodu kullanıyor
	@Override
	double calculateCircumference(double length) {
		return super.calculateCircumference(length);
	}

	@Override
	public int hashCode() {
//		Hashcode sabit olarak 5 tanımladık. Bunu yapmak mantıksız
//		equal ve hashcode birbiri ile uyumlu olmalı. equal değilken hash kod FARKLI ÇIKMAMALI"
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
	
	@Override
	public String toString() {
		String str = new String();
		str += "Shape Info : ";
		str += "length: " + length + "\n";
		str += "width: " + width + "\n";
		return str;
	}

}
